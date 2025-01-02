

package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.AdminReportIssuePage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserReportIssuePage;

public class AdminReportIssueTest extends BaseTest {
	
	@Test
	public void TC001_Admin_can_able_to_click_on_the_navigation_issue_report() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
        wait.until(ExpectedConditions.visibilityOf(ari.clickIssueReportNavigation));
        
        
        ari.clickIssueReportNavigation.click();
        wait.until(ExpectedConditions.visibilityOf(ari.textIssueReportOverview));
        
        Actions actions = new Actions(driver);
        actions.doubleClick(ari.clickDoubleIssueReport).perform();
       

		
	}
	
	@Test
	public void TC002_Admin_can_able_to_open_the_Reported_issue() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
        //wait.until(ExpectedConditions.visibilityOf(ari.clickIssueReportNavigation));
        
        wait.until(ExpectedConditions.visibilityOf(ari.clickIssueReportNavigation));
        ari.clickIssueReportNavigation.click();
        wait.until(ExpectedConditions.visibilityOf(ari.textIssueReportOverview));
        
        Actions actions = new Actions(driver);
        actions.doubleClick(ari.clickDoubleIssueReport).perform();
        
        String issueType = ari.issueTypeText.getText();
      //  assertTrue(issueType.contains("Broken Link"));

        if (issueType.equals("Broken Link")) {
            System.out.println("Broken link");
        } else if (issueType.equals("Others")) {
            System.out.println("Others");
        } else if (issueType.equals("Incorrect Information")) {
            System.out.println("Incorrect Information");
        } else if (issueType.equals("Technical Problem")) {
            System.out.println("Technical Problem");
        } else {
            System.out.println("Unknown issue type");
        }
        
        String textemail = ari.emailText.getText();
        assertTrue(textemail.contains("@gmail.com"));
        String textname =ari.nameText.getText();
        assertTrue(textname.contains(" "));
        

        	}
			

	
	@Test
	public void TC003_Admin_can_able_to_respond_the_reported_issue_into_Inprogress() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        ari.clickHamburguerbutton.click();
        ari.clickIssueReportNavigation.click();
        wait.until(ExpectedConditions.visibilityOf(ari.textIssueReportOverview));
        
        Actions actions = new Actions(driver);
        actions.doubleClick(ari.clickDoubleIssueReport).perform();
        wait.until(ExpectedConditions.visibilityOf(ari.descriptionText));
        ari.clickStatusReport.click();
        ari.selectInProgress.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)", " ");
        ari.commentType.click();
        ari.commentType.sendKeys("We are in progression your reported issue");
        ari.clickUpdateSend.click();
        
        String successsendmessage = ari.sendSuccessfullytext.getText();
        assertTrue(successsendmessage.contains("Issue Report Updated"));

		
	}
	@Test
	public void TC004_Admin_can_able_to_respond_the_reported_issue_into_Resolved() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        ari.clickHamburguerbutton.click();
        ari.clickIssueReportNavigation.click();
        wait.until(ExpectedConditions.visibilityOf(ari.textIssueReportOverview));
        
        Actions actions = new Actions(driver);
        actions.doubleClick(ari.clickDoubleIssueReport).perform();
        
        wait.until(ExpectedConditions.visibilityOf(ari.descriptionText));
        ari.clickStatusReport.click();
        ari.selectResolved.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)", " ");
        ari.commentType.click();
        ari.commentType.sendKeys("We are resolved your reported issue");
        ari.clickUpdateSend.click();
        
        String successsendmessage = ari.sendSuccessfullytext.getText();
        assertTrue(successsendmessage.contains("Issue Report Updated"));
}
	@Test
	public void TC005_Admin_cannot_able_to_respond_the_reported_issue_without_comment() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        ari.clickHamburguerbutton.click();
        ari.clickIssueReportNavigation.click();
        wait.until(ExpectedConditions.visibilityOf(ari.textIssueReportOverview));
        
        Actions actions = new Actions(driver);
        actions.doubleClick(ari.clickDoubleIssueReport).perform();
        
        wait.until(ExpectedConditions.visibilityOf(ari.descriptionText));
        ari.clickStatusReport.click();
        ari.selectResolved.click();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 350)", " ");
       // ari.commentType.click();
       // ari.commentType.sendKeys("We are resolved your reported issue");
        ari.clickUpdateSend.click();
        
        String errortoleavecomment = ari.commentErrorMessage.getText();
        assertTrue(errortoleavecomment.contains("Please leave a comment"));
}
}