package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BasePage {

    public NavigationPage(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    @FindBy(xpath="//span[contains(@class, 'mx-name-sidebarToggle1')]")
   public WebElement clickHamburguerbutton;

   @FindBy(xpath="//a[contains(@class, 'navigationTree1-0')]")
   public WebElement clickHomeNavigation;

   @FindBy(xpath="//a[contains(@class, 'navigationTree1-1')]")
   public WebElement clickStaffNavigation;

   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-2')]")
   public WebElement clickUsersNavigation;

   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-3')]")
   public WebElement clickSuperAdminSessionNavigation;


   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-4')]")
   public WebElement clickSuperAdminNotificationNavigation;

   @FindBy(xpath ="//a[contains(@class, 'navigationTree1-5')]")
   public WebElement clickSuperAdminCurrencies;

   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-6')]")
   public WebElement clickSuperAdminUserRoleNavigation;
   
   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-7')]")
   public WebElement clickSuperAdminSettingNavigation;

   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-10')]")
   public WebElement clickSuperAdminSignoutNavigation;
   
   @FindBy(xpath= "//a[contains(@class, 'navigationTree1-9')]")
   public WebElement clickSuperAdminUserRoles;


    
}