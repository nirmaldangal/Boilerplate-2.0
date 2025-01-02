

package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import java.time.Duration;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.AdminReportIssuePage;
import PageObjects.BankHolidayCalenderPage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserReportIssuePage;

public class BankHolidayCalenderTest extends BaseTest {
	
	@Test
	public void TC001_Admin_can_able_to_click_on_the_navigation_Bank_Holiday() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
		BankHolidayCalenderPage bhc = new BankHolidayCalenderPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
      js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
      Thread.sleep(3000);

      
      wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
      
      Actions actions = new Actions(driver);
      actions.doubleClick( bhc.clickBankHolidaysNavigation).perform();
    //  bhc.clickBankHolidaysNavigation.click();
      
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(bhc.textBankHolidayOverview));
      
      String textBankHolidayOverview = bhc.textBankHolidayOverview.getText();
      assertTrue (textBankHolidayOverview.contains("Bank holidays Overview"));
        
  
	}
	
	@Test
	public void TC002_Admin_can_able_to_verify_the_column_name_of_Bank_Holiday() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
		BankHolidayCalenderPage bhc = new BankHolidayCalenderPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
      js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
      Thread.sleep(3000);

      
      wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
      
      Actions actions = new Actions(driver);
      actions.doubleClick( bhc.clickBankHolidaysNavigation).perform();
    //  bhc.clickBankHolidaysNavigation.click();
      
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(bhc.textBankHolidayOverview));
      
      String textBankHolidayOverview = bhc.textBankHolidayOverview.getText();
      assertTrue (textBankHolidayOverview.contains("Bank holidays Overview"));
        
        
        String textTitle = bhc.titleText.getText();
        assertTrue (textTitle.contains("Title"));
        
        String textDate = bhc.dateText.getText();
        assertTrue (textDate.contains("Date"));
        
        String textCountry = bhc.countryText.getText();
        assertTrue (textCountry.contains("Country"));
        
        String textDescription = bhc.descriptionText.getText();
        assertTrue (textDescription.contains("Description"));
        
  
	}
	
	@Test
	public void TC003_Admin_can_able_to_switch_into_the_Calender_View_for_Bank_Holiday() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
		BankHolidayCalenderPage bhc = new BankHolidayCalenderPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
      
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
        js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
        Thread.sleep(3000);

        
        wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
        
        Actions actions = new Actions(driver);
        actions.doubleClick( bhc.clickBankHolidaysNavigation).perform();
      //  bhc.clickBankHolidaysNavigation.click();
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(bhc.textBankHolidayOverview));
        
        String textBankHolidayOverview = bhc.textBankHolidayOverview.getText();
        assertTrue (textBankHolidayOverview.contains("Bank holidays Overview"));
        
        
//        if {
//        	bhc.toggleCalenderViewandDataGridView.isEnabled();
//        }
//        else {
//        bhc.toggleCalenderViewandDataGridView.click();
//        Thread.sleep(3000);
//        
//        String textday = bhc.textDayCalender.getText();
//        assertTrue(textday.contains("day"));
//        
//        String textmonth = bhc.textMonthCalender.getText();
//        assertTrue(textmonth.contains("year"));
//        
//        String textweek = bhc.textWeekCalender.getText();
//        assertTrue(textweek.contains("week"));
//        }
        
        Thread.sleep(3000);
        if (bhc.toggleCalenderViewandDataGridView.isEnabled()) {
            // Perform click action if the element is NOT enabled
            bhc.toggleCalenderViewandDataGridView.click();
            Thread.sleep(3000);

            // Validate day view
            String textDay = bhc.textDayCalender.getText();
            assertTrue(textDay.contains("day"), "Text does not contain 'day'");

            // Validate month view
            String textMonth = bhc.textMonthCalender.getText();
            assertTrue(textMonth.contains("month"), "Text does not contain 'month'");

            // Validate week view
            String textWeek = bhc.textWeekCalender.getText();
            assertTrue(textWeek.contains("week"), "Text does not contain 'week'");
        } else {
            System.out.println("The toggleCalenderViewandDataGridView is already enabled.");
        }

        
        
        
  
}
	
	@Test
	public void TC004_Admin_can_able_to_Create_the_Bank_Bank_Holiday_For_Portugal() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		UserReportIssuePage uri = new UserReportIssuePage(driver);
		AdminReportIssuePage ari = new AdminReportIssuePage(driver);
		BankHolidayCalenderPage bhc = new BankHolidayCalenderPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

      
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        ari.clickHamburguerbutton.click();
      
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
        js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
        Thread.sleep(3000);

        
        wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
        
        Actions actions = new Actions(driver);
        actions.doubleClick( bhc.clickBankHolidaysNavigation).perform();
      //  bhc.clickBankHolidaysNavigation.click();
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(bhc.textBankHolidayOverview));
        
        String textBankHolidayOverview = bhc.textBankHolidayOverview.getText();
        assertTrue (textBankHolidayOverview.contains("Bank holidays Overview"));
        
        bhc.createHolidayClick.click();
        Thread.sleep(2000);
        bhc.titleTypeClickHolidayEdit.sendKeys("Portugal Holiday Title");
        bhc.dateSelectHolidayEdit.sendKeys("24/12/2024");
        bhc.countrySelectClick.click();
        //Thread.sleep(5000);
        
        bhc.selectFrance.click();
        //bhc.selectPortugal.click();
        
//        Select.selectByVisibleText("France");
//        Webelement selectedOption = select.getselectfirstElement();
        
//         selectByValue("France").click();
//        bhc.selectFrance.click();
        Thread.sleep(2000);
        
        bhc.descriptionBankHolidayType.sendKeys("This is the bank holiday Description");
        bhc.calenderColorSelectorType.sendKeys("#3B4251");
        Thread.sleep(5000);
        bhc.createClickSave.click();
	
}
}