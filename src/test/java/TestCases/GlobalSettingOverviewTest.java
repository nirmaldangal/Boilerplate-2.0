

package TestCases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjects.AdminReportIssuePage;
import PageObjects.BankHolidayCalenderPage;
import PageObjects.GlobalSettingOverviewPage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserReportIssuePage;

public class GlobalSettingOverviewTest extends BaseTest {
	
	@Test
	public void TC001_Admin_can_able_to_click_or_Navigate_to_Setting_overviewPage() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
      actions.doubleClick( gso.navigationClickSetting).perform();
    //  bhc.clickBankHolidaysNavigation.click();
      
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
      
      String textsetting = gso.textSetting.getText();
      assertTrue (textsetting.contains("Setting"));
        
  
	}
	
	@Test
	public void TC002_Admin_can_able_to_select_the_language_English() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
      actions.doubleClick( gso.navigationClickSetting).perform();
    //  bhc.clickBankHolidaysNavigation.click();
      
      Thread.sleep(3000);
      wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
      
      String textsetting = gso.textSetting.getText();
      assertTrue (textsetting.contains("Setting"));
      gso.globalSettingTabClick.click();
      gso.languageSelectClick.click();
      gso.optionSelectEnglishClick.click();
      gso.saveChangesSettingClick.click();
      
    
      
      String textenglish = gso.languageSelectClick.getText();
      assertTrue (textenglish.contains("English"));
  
	}
	
	@Test
	public void TC003_Admin_can_able_to_select_the_language_Portuguese() throws InterruptedException {
	
	
	
	LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
//  js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
    js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
    Thread.sleep(3000);

  
  wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
  
  Actions actions = new Actions(driver);
  actions.doubleClick(gso.navigationClickSetting).perform();
//  bhc.clickBankHolidaysNavigation.click();
  
  Thread.sleep(3000);
  wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
  
  String textsetting = gso.textSetting.getText();
  assertTrue (textsetting.contains("Setting"));
  
 

  gso.globalSettingTabClick.click();
  gso.languageSelectClick.click();
  gso.optionSelectPortugueseClick.click();
  gso.saveChangesSettingClick.click();
  
  
  String textportugal = gso.languageSelectClick.getText();
  assertTrue (textportugal.contains("Portuguese"));
    

}
	@Test
	public void TC004_Admin_can_able_to_select_the_TimeZone() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
	//  js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
	    js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
	    Thread.sleep(3000);

	  
	  wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
	  
	  Actions actions = new Actions(driver);
	  actions.doubleClick(gso.navigationClickSetting).perform();
	//  bhc.clickBankHolidaysNavigation.click();
	  
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
	  
	  String textsetting = gso.textSetting.getText();
	  assertTrue (textsetting.contains("Setting"));
	  
	 
	  gso.globalSettingTabClick.click();
	  
	  gso.timezoneSelectClick.click();
	  gso.optionSelectLisbonTimeZoneClick.click();
	  Thread.sleep(3000);
	  gso.saveChangesSettingClick.click();
	  
	  String texttimezonelisbon = gso.timezoneSelectClick.getText();
	  assertTrue (texttimezonelisbon.contains("Lisbon"));
	  
	  
  
    
}
	@Test
	public void TC005_Admin_can_able_to_select_the_Currency() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
	//  js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
	    js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
	    Thread.sleep(3000);

	  
	  wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
	  
	  Actions actions = new Actions(driver);
	  actions.doubleClick(gso.navigationClickSetting).perform();
	//  bhc.clickBankHolidaysNavigation.click();
	  
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
	  
	  String textsetting = gso.textSetting.getText();
	  assertTrue (textsetting.contains("Setting"));
	  
	 
	  gso.globalSettingTabClick.click();
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("window.scrollBy(0, 450)", " ");
      
      Thread.sleep(3000);
      gso.currencySelectClick.click();
      gso.optionCurrencySEKSelectClick.click();
      gso.saveChangesSettingClick.click();
      
      Thread.sleep(3000);
      String textcurrency = gso.currencySelectClick.getText();
	  assertTrue (textcurrency.contains("SEK"));
	  Thread.sleep(3000);
      
      
      
	  
	}
	
	@Test
	public void TC006_Admin_can_able_to_click_on_the_NotificationTab() throws InterruptedException {
		
		
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		GlobalSettingOverviewPage gso = new GlobalSettingOverviewPage(driver);
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
	//  js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + 650;", bhc.scrollSideBar);
	    js.executeScript("arguments[0].scrollTop = arguments[1];", bhc.scrollSideBar, 600);
	    Thread.sleep(3000);

	  
	  wait.until(ExpectedConditions.visibilityOf(bhc.clickBankHolidaysNavigation));
	  
	  Actions actions = new Actions(driver);
	  actions.doubleClick(gso.navigationClickSetting).perform();
	//  bhc.clickBankHolidaysNavigation.click();
	  
	  Thread.sleep(3000);
	  wait.until(ExpectedConditions.visibilityOf(gso.textSetting));
	  
	  String textsetting = gso.textSetting.getText();
	  assertTrue (textsetting.contains("Setting"));
	  
	  gso.notificationSettingTabClick.click();
	  Thread.sleep(3000);
}
}
	