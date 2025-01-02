package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserReportIssuePage;

public class UserReportIssueTest extends BaseTest {
	
	@Test
	public void TC001_User_can_able_to_send_Issue_report_with_user_details() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(uri.reportIssueLink));
        uri.reportIssueLink.click();
        wait.until(ExpectedConditions.visibilityOf(uri.selectIssueType));
        
        uri.selectIssueType.click();
        //uri.selectBrokenLink.click();
        uri.selectIncorrectInformation.click();
        uri.typeDescription.sendKeys("this is hthe demo type thanks for understanding");
//        uri.browseImageorFile.click();
//        uri.browseImageorFile.sendKeys("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
        //uri.checkBoxWish.isEnabled();
        
        File file = new File("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
//        if (file.exists()) {
            uri.browseImageorFile.sendKeys(file.getAbsolutePath());
//        } else {
//            System.out.println("File not found!");
//        }
        
        uri.checkBoxWish.isEnabled();
        
        String nameandEmail = uri.nameemailUserDetails.getText();
        assertTrue(nameandEmail.contains("@gmail.com"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)", " ");
        uri.sendReportClick.click();
        

		
	}
	@Test	
	public void TC002_User_can_able_to_send_Issue_report_Anonymously() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(uri.reportIssueLink));
        uri.reportIssueLink.click();
        wait.until(ExpectedConditions.visibilityOf(uri.selectIssueType));
        
        uri.selectIssueType.click();
        //uri.selectBrokenLink.click();
        uri.selectIncorrectInformation.click();
        uri.typeDescription.sendKeys("this is hthe demo type thanks for understanding");
//        uri.browseImageorFile.click();
//        uri.browseImageorFile.sendKeys("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
        //uri.checkBoxWish.isEnabled();
        
        File file = new File("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
//        if (file.exists()) {
            uri.browseImageorFile.sendKeys(file.getAbsolutePath());
//        } else {
//            System.out.println("File not found!");
//        }
        uri.checkBoxWish.click();
        uri.checkBoxWish.isDisplayed();
        uri.sendReportClick.click();

	}
	
	@Test
	public void TC003_User_cannot_able_to_send_Issue_report_without_type_of_Issue_and_Description() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(uri.reportIssueLink));
        uri.reportIssueLink.click();
        wait.until(ExpectedConditions.visibilityOf(uri.selectIssueType));
        
        //uri.selectIssueType.click();
        //uri.selectBrokenLink.click();
//        uri.selectIncorrectInformation.click();
//        uri.typeDescription.sendKeys(" ");
//        uri.browseImageorFile.click();
//        uri.browseImageorFile.sendKeys("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
        //uri.checkBoxWish.isEnabled();
        
        File file = new File("C:\\Users\\phyne\\eclipse-workspace\\webportalboilerplate\\src\\resources\\notuserfriednly.png");
//        if (file.exists()) {
            uri.browseImageorFile.sendKeys(file.getAbsolutePath());
//        } else {
//            System.out.println("File not found!");
//        }
        //uri.checkBoxWish.click();
        uri.checkBoxWish.isDisplayed();
        uri.sendReportClick.click();
        
        String errorIssueType = uri.issueReportTypeerrorRequiredField.getText();
        assertTrue(errorIssueType.contains("This field is required"));
        
        String errorDescription = uri.descriptionerrorRequiredField.getText();
        assertTrue(errorDescription.contains("This field is required"));
        uri.cancelCross.click();
        
        System.out.println("This is done");
        
        
	}

}
