
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
import PageObjects.UserFAQPage;
import PageObjects.UserReportIssuePage;

public class UserFAQTest extends BaseTest {
	
	@Test
	public void TC001_User_can_able_to_verify_the_category_to_each_FAQ() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		UserFAQPage ufaq = new UserFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(ufaq.linkClickFAQ));
        ufaq.linkClickFAQ.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.textFAQ));
        ufaq.categoryAClick.click();
        String textcategoryA = ufaq.categoryAClick.getText();
        assertTrue(textcategoryA.contains("Category"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 450)", " ");
        String textcategoryB = ufaq.categoryBClick.getText();
        assertTrue(textcategoryB.contains("Category"));
        
        
	}
	
	@Test
	public void TC002_User_can_able_to_verify_the_reportIssue_and_BookMark_Button_in_FAQ() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		UserFAQPage ufaq = new UserFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(ufaq.linkClickFAQ));
        ufaq.linkClickFAQ.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.textFAQ));
        ufaq.categoryAClick.click();
        String textcategoryA = ufaq.categoryAClick.getText();
        assertTrue(textcategoryA.contains("Category"));
        
//        String textcategoryB = ufaq.categoryBClick.getText();
//        assertTrue(textcategoryB.contains("Category"));
        
        ufaq.questionExpand1.click();
        
        ufaq.questionExpand1.click();
        ufaq.questionExpand1.click();
        ufaq.reportFAQThreeDotClick.click();
        Thread.sleep(3000);
        
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js1.executeScript("window.scrollBy(0, 600)", " ");
        
        Thread.sleep(2000);
       // ufaq.iconClickBookmark.click();
        ufaq.bookmarkClick.click();
        Thread.sleep(3000);
//        String bookmarkside = ufaq.bookmarkDisplay.getText();
//        assertTrue(bookmarkside.contains("Category"));
//        ufaq.reportFAQThreeDotClick.click();
//        Thread.sleep(3000);
        //ufaq.iconClickBookmark.click();
        
        ufaq.questionExpand1.click();
        ufaq.questionExpand1.click();
        ufaq.reportFAQThreeDotClick.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(ufaq.bookmarkRemoveClick));
        ufaq.bookmarkRemoveClick.click();
        Thread.sleep(3000);
        ufaq.questionExpand1.click();
        ufaq.questionExpand1.click();
        ufaq.reportFAQThreeDotClick.click();
        Thread.sleep(3000);
        ufaq.reportIssueFAQClick.click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(ufaq.reportIssueQuestionText));
       // ufaq.reportIssueQuestionText.click();
        String textQuestionFAQ = ufaq.reportIssueQuestionText.getText();
        assertTrue (textQuestionFAQ.contains("Question"));
        String textAnswerFAQ = ufaq.reportIssueAnswerText.getText();
        assertTrue (textAnswerFAQ.contains("Answer"));
        
	}
	@Test
	public void TC003_User_can_able_to_verify_that_FAQ_reportIssue_can_able_to_send() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		UserFAQPage ufaq = new UserFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(ufaq.linkClickFAQ));
        ufaq.linkClickFAQ.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.textFAQ));
        ufaq.categoryAClick.click();
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)", " ");
//        String textcategoryB = ufaq.categoryBClick.getText();
//        assertTrue(textcategoryB.contains("Category"));
        
        ufaq.questionExpand1.click();
        
        ufaq.questionExpand1.click();
        ufaq.questionExpand1.click();
        
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0, 1000)", " ");
       // ufaq.iconClickBookmark.click();
//        ufaq.bookmarkClick.click();
//        String bookmarkside = ufaq.bookmarkDisplay.getText();
//        assertTrue(bookmarkside.contains("Category"));
//        ufaq.bookmarkRemoveClick.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.reportFAQThreeDotClick));
        ufaq.reportFAQThreeDotClick.click();
        
//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js1.executeScript("window.scrollBy(0, 650)", " ");
        
        wait.until(ExpectedConditions.visibilityOf(ufaq.reportIssueFAQClick));
        ufaq.reportIssueFAQClick.click();
        Thread.sleep(3000);
        
//        wait.until(ExpectedConditions.visibilityOf(ufaq.reportIssueQuestionText));
//        String textQuestionFAQ = ufaq.reportIssueQuestionText.getText();
//        assertTrue (textQuestionFAQ.contains("Question"));
//        String textAnswerFAQ = ufaq.reportIssueAnswerText.getText();
//        assertTrue (textAnswerFAQ.contains("Answer"));
        
        ufaq.reportIssueFAQSend.click();
        Thread.sleep(2000);
        String errorFAQDescription = ufaq.reportIssueFAQDescriptionError.getText();
        assertTrue(errorFAQDescription.contains("You cannot submit empty description"));
        ufaq.reportIssueFAQDescriptionType.click();
        
        ufaq.reportIssueFAQDescriptionType.sendKeys("please change something which is not fine here");
        ufaq.reportIssueFAQSend.click();
        
        
}
	@Test
	public void TC004_User_can_able_to_verify_that_like_and_dislike_the_FAQ() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		UserFAQPage ufaq = new UserFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("fridayclient@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(ufaq.linkClickFAQ));
        ufaq.linkClickFAQ.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.textFAQ));
        ufaq.categoryAClick.click();
        String textcategoryA = ufaq.categoryAClick.getText();
        assertTrue(textcategoryA.contains("Category"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 450)", " ");
//        String textcategoryB = ufaq.categoryBClick.getText();
//        assertTrue(textcategoryB.contains("Category"));
        
        ufaq.questionExpand1.click();
        
        ufaq.questionExpand1.click();
        ufaq.questionExpand1.click();
        //ufaq.iconClickBookmark.click();
        
        ufaq.likethumbClick.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.likeafterthumbClick));
        String likeimage = ufaq.likeafterthumbClick.getAttribute("src");
        assertTrue(likeimage.contains("https://boilerplate115-sandbox.mxapps.io/img/DesignSystem$BoilerPlate_Image_Collection_Accounts_web$like_svgrepo_com.svg?638682212729811949"));
        ufaq.dislikethumbClick.click();
        wait.until(ExpectedConditions.visibilityOf(ufaq.dislikethumbClick));
        String dislikeimage = ufaq.dislikeafterthumbClick.getAttribute("src");
        assertTrue(dislikeimage.contains("https://boilerplate115-sandbox.mxapps.io/img/DesignSystem$BoilerPlate_Image_Collection_Accounts_web$dislike_svgrepo_com.svg?638682212729811949"));
    
        ufaq.dislikethumbClick.click();
        System.out.println("Like and Dislike is done");
        

	}
}