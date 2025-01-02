package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class AccountOverviewPage extends BasePage {
        //WebDriver driver;
        public AccountOverviewPage (WebDriver driver)
        {
            super(driver);
        }
    
        @FindBy(xpath="//span[contains(@class, 'mx-name-text5')]")
        public WebElement userfullname;
        
        @FindBy(xpath= "//a[contains(@class, 'navigationTree1-9')]")
        public WebElement Signoutbuttonnn;
    
        
        }
      //  .mx-text.mx-name-text1.pageheader-title.spacing-outer-bottom

