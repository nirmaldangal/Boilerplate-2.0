package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmYourAccountPage extends BasePage {
    //WebDriver driver;
    public ConfirmYourAccountPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(id="lemail")
    public WebElement emailInput;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(css="button[type='submit'] span")
    public WebElement loginButton;

    @FindBy(xpath="//button[normalize-space()='Forgot Password?']")
    public WebElement forgotPasswordlink;

    @FindBy(id="....")
    public WebElement userNameLabel;

   
    }

