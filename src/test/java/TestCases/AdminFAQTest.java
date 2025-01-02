
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
import PageObjects.AdminFAQPage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserFAQPage;
import PageObjects.UserReportIssuePage;

public class AdminFAQTest extends BaseTest {
	
	@Test
	public void TC001_Admin_can_able_to_Create_the_New_Category() throws InterruptedException {
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        //Enter screen
        afaq.clickHamburguerbutton.click();
      
        afaq.linkClickSetting.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 350;", afaq.scrollableDiv);
        Thread.sleep(3000);
        System.out.println(afaq.linkClickNavigationFAQ.isDisplayed());
        
        Actions actions = new Actions(driver);
        actions.doubleClick(afaq.linkClickNavigationFAQ).perform();
        Thread.sleep(3000);

        
        wait.until(ExpectedConditions.visibilityOf(afaq.faqText));       
        System.out.println(afaq.faqText.isDisplayed());
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        Thread.sleep(3000);
        // Till here
        
        afaq.newCategoryAddClick.click();
        wait.until(ExpectedConditions.visibilityOf(afaq.categoryClickType));
        afaq.categoryClickType.click();
        afaq.categoryClickType.sendKeys("Testing Category 1");
        afaq.descriptionCategoryClickType.click();
        afaq.descriptionCategoryClickType.sendKeys("This is only for testing purpose ignore it");
        afaq.saveFAQCategory.click();
        
        

        
        
	}
	
	@Test
	public void TC002_Admin_can_able_to_Create_the_Question_and_Answer_of_the_Category() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        afaq.clickHamburguerbutton.click();
        
        afaq.linkClickSetting.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 350;", afaq.scrollableDiv);
        Thread.sleep(3000);
        System.out.println(afaq.linkClickNavigationFAQ.isDisplayed());
        
        Actions actions = new Actions(driver);
        actions.doubleClick(afaq.linkClickNavigationFAQ).perform();
        Thread.sleep(5000);

        
        wait.until(ExpectedConditions.visibilityOf(afaq.faqText));       
        System.out.println(afaq.faqText.isDisplayed());
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        Thread.sleep(5000);
        
        
     
        
//        String overviewtext = afaq.overviewTextTabClick.getText();
//        assertTrue(overviewtext.contains("Overview"));
        
        Actions actions1 = new Actions(driver);
        actions1.doubleClick(afaq.categoryfirstClick).perform();
        Thread.sleep(5000);
        
        
        
        wait.until(ExpectedConditions.visibilityOf(afaq.questionCategoryText));
        String categorytext1 = afaq.questionCategoryText.getText();
        assertTrue(categorytext1.contains("Question"));
        
        String addnewquestion = afaq.addNewQuestionClick.getText();
        assertTrue(addnewquestion.contains("New Question"));
        
        afaq.addNewQuestionClick.click();
        wait.until(ExpectedConditions.visibilityOf(afaq.questionFAQType));
        afaq.questionFAQType.click();
        afaq.questionFAQType.sendKeys("Is this the question for Category for the purpose to test");
        afaq.answerFAQType.click();
        afaq.answerFAQType.sendKeys("Yes this is the answer for the testing purpose");
        afaq.saveQuestionAnswerClick.click();
        
        
        
        


        
        
	}
	
	@Test
	public void TC003_Admin_can_able_to_Edit_and_Delete_the_existing_Category() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        afaq.clickHamburguerbutton.click();
        
        afaq.linkClickSetting.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 350;", afaq.scrollableDiv);
        Thread.sleep(3000);
        System.out.println(afaq.linkClickNavigationFAQ.isDisplayed());
        
        Actions actions = new Actions(driver);
        actions.doubleClick(afaq.linkClickNavigationFAQ).perform();
        Thread.sleep(5000);
 
        wait.until(ExpectedConditions.visibilityOf(afaq.faqText));       
        System.out.println(afaq.faqText.isDisplayed());
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        Thread.sleep(5000);
        
        afaq.editActionCategoryClick.click();
        afaq.categoryClickType.click();
        afaq.categoryClickType.sendKeys("Category A Edited");
        afaq.descriptionCategoryClickType.click();
        afaq.descriptionCategoryClickType.sendKeys("This is the first phase testing category Edited");
        afaq.saveFAQCategory.click();
        wait.until(ExpectedConditions.visibilityOf(afaq.overviewTextTabClick));
        
        //afaq.deleteActionCategoryClick.click();
        //afaq.deleteCancelConfirmationCategoryClick.click();
       // afaq.deleteOKConfirmationCategoryClick.click();
        
        
       
        
        
	}
	
	@Test
	public void TC004_Admin_can_able_to_Edit_and_Delete_the_Question_and_Answer_of_the_Category() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        afaq.clickHamburguerbutton.click();
        
        afaq.linkClickSetting.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 350;", afaq.scrollableDiv);
        Thread.sleep(3000);
        System.out.println(afaq.linkClickNavigationFAQ.isDisplayed());
        
        Actions actions = new Actions(driver);
        actions.doubleClick(afaq.linkClickNavigationFAQ).perform();
        Thread.sleep(5000);
 
        wait.until(ExpectedConditions.visibilityOf(afaq.faqText));    
        System.out.println(afaq.faqText.isDisplayed());
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        Thread.sleep(5000);
        
        
        
        Actions actions1 = new Actions(driver);
        actions1.doubleClick(afaq.categoryfirstClick).perform();
        Thread.sleep(5000);
        
        wait.until(ExpectedConditions.visibilityOf(afaq.questionCategoryText));
        String categorytext1 = afaq.questionCategoryText.getText();
        assertTrue(categorytext1.contains("Question"));
        
        String addnewquestion = afaq.addNewQuestionClick.getText();
        assertTrue(addnewquestion.contains("New Question"));
        

        afaq.editActionQuestionAnswerCategoryClick.click();
        afaq.questionAlreadyEditFAQType.click();
        afaq.questionAlreadyEditFAQType.clear();
        afaq.questionAlreadyEditFAQType.sendKeys("How to upload the image in profile setting ? Edited");
        
       afaq.answerAlreadyEditFAQType.click();
       afaq.answerAlreadyEditFAQType.clear();
       afaq.answerAlreadyEditFAQType.sendKeys("To upload the image in the profile,. thank you so much");
       afaq.cancelAlreadyQuestionAnswerClick.click();
      //afaq.saveAlreadyQuestionAnswerClick.click();
       Thread.sleep(5000);
       String addnewquestion1 = afaq.addNewQuestionClick.getText();
       assertTrue(addnewquestion1.contains("New Question"));
       
       afaq.backbuttonQuestionAnswerClick.click();
       Thread.sleep(5000);
       
       wait.until(ExpectedConditions.visibilityOf(afaq.faqText));
       
       String textfaq1 = afaq.faqText.getText();
       assertTrue(textfaq1.contains("Frequently Asked Questions"));
       
    
	}
	
	@Test
	public void TC005_Admin_can_able_to_Verify_the_each_tab() {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        afaq.clickHamburguerbutton.click();
        wait.until(ExpectedConditions.visibilityOf(afaq.linkClickNavigationFAQ));
        afaq.linkClickNavigationFAQ.click();
        
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        
        afaq.overviewTextTabClick.click();
        String overviewtext = afaq.overviewTextTabClick.getText();
        assertTrue(overviewtext.contains("Overview"));
        
        afaq.overviewTextTabClick.click();
        String faqanalyticstext = afaq.faqIssueReportTextTabClick.getText();
        assertTrue(faqanalyticstext.contains("Analytics"));
       
        
        afaq.overviewTextTabClick.click();
        String faqreportissuetext = afaq.faqIssueReportTextTabClick.getText();
        assertTrue(faqreportissuetext.contains("Issue Report"));
        
        
       
       
	
	}
	
	@Test
	public void TC006_Admin_can_able_to_Search_the_Category() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		AdminFAQPage afaq = new AdminFAQPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        afaq.clickHamburguerbutton.click();
        
        
        
        
        afaq.linkClickSetting.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 350;", afaq.scrollableDiv);
        Thread.sleep(5000);
        System.out.println(afaq.linkClickNavigationFAQ.isDisplayed());
        
        Actions actions = new Actions(driver);
        actions.doubleClick(afaq.linkClickNavigationFAQ).perform();
        Thread.sleep(5000);
//        wait.until(ExpectedConditions.visibilityOf(afaq.linkClickNavigationFAQ));
//        afaq.linkClickNavigationFAQ.click();
        
        wait.until(ExpectedConditions.visibilityOf(afaq.faqText));
        
        System.out.println(afaq.faqText.isDisplayed());
        
        
        String textfaq = afaq.faqText.getText();
        assertTrue(textfaq.contains("Frequently Asked Questions"));
        Thread.sleep(5000);
        
        
        afaq.overviewTextTabClick.click();
        
        System.out.println(afaq.overviewTextTabClick.isDisplayed());
        String overviewtext = afaq.overviewTextTabClick.getText();
        assertTrue(overviewtext.contains("Overview"));
        Thread.sleep(5000);
        
        afaq.faqAnalyticsTextTabClick.click();
        
        System.out.println(afaq.faqAnalyticsTextTabClick.isDisplayed());
        String faqanalyticstext = afaq.faqAnalyticsTextTabClick.getText();
        assertTrue(faqanalyticstext.contains("FAQ Analytics"));
        Thread.sleep(5000);
       
        
        afaq.faqIssueReportTextTabClick.click();
        System.out.println(afaq.faqIssueReportTextTabClick.isDisplayed());
        String faqreportissuetext = afaq.faqIssueReportTextTabClick.getText();
        assertTrue(faqreportissuetext.contains("FAQ Issue Report"));
        Thread.sleep(5000);
	
	
}
}




