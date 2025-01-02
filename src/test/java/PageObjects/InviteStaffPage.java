package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class InviteStaffPage extends BasePage {
        //WebDriver driver;
        public InviteStaffPage (WebDriver driver)
        {
            super(driver);
        }
    
        @FindBy(css =".mx-text.mx-name-text5.UserName.spacing-outer-left")
        public WebElement userfullname;
    
        @FindBy(xpath="(//input[@id='31.AccountManagement.Login_BO.textBox1_ihe_5'])[1]")
        public WebElement passwordInput;
    
        @FindBy(xpath="(//button[normalize-space()='Login'])[1]")
        public WebElement loginButton;
    
        @FindBy(xpath="(//h2[normalize-space()='Login to your account'])[1]")
        public WebElement textlogintoyouraccount;

        @FindBy(xpath="//a[normalize-space()='SignOut']")
        public WebElement buttonLogout;
    
        /*@FindBy(id="....")
        public WebElement userNameLabel;*/

    
       
        }