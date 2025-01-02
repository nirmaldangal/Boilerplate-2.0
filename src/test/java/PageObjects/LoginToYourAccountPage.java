
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class LoginToYourAccountPage extends BasePage {
        //WebDriver driver;
        public LoginToYourAccountPage (WebDriver driver)
        {
            super(driver);
        }
    
        //Backoffice loginscreen
    
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement emailInput;
       
        @FindBy(xpath="//input[contains(@id, 'Web_Login.textBox2')]")
        public WebElement passwordInput;

        @FindBy(xpath="//button[contains(@data-button-id, 'Web_Login.actionButton1')]")
        public WebElement loginButton;
        
        @FindBy(xpath="//div[contains(@class, 'toast-message')]")
        public WebElement errorMessage;

        @FindBy(xpath="//h2[contains(@class, 'mx-name-heading2')]")
        public WebElement textloginscreen;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text5')]")
        public WebElement userfullname;   
       
        
        
        
        // Webclient LoginScreen
        
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement emailInputWebClient;
        
        @FindBy(xpath ="//input[contains(@id, 'textBox2')]")
        public WebElement passwordInputWebClent;
        
        @FindBy(xpath="//button[contains(@data-button-id, 'actionButton1')]")
        public WebElement loginButtonWebClient;
        
        @FindBy(xpath="//div[contains(@class, 'toast-message')]")
        public WebElement errorMessageWebClient;
        
        @FindBy(xpath="//a[contains(@class, 'mx-name-actionButton2')]")
        public WebElement signUpButtonWebClient;
        
        @FindBy(xpath="//h2[contains(@class, 'mx-name-heading2')]")
        public WebElement textLoginWebClient;

        @FindBy(xpath= "//a[contains(@class, 'mx-name-navigationTree1-10')]")
        public WebElement Signoutbutton;
        
        
        //Webclient Registrationscreen
        
        @FindBy(xpath="//h2[contains(@class,'mx-name-heading2 form-heading')]")
        public WebElement textRegisterWebclient;
        
        @FindBy(xpath="//input[contains(@id, 'WebClient_Registration.textBox1')]")
        public WebElement nameInputRegisterWebclient;
        
        @FindBy(xpath="//input[contains(@id, 'WebClient_Registration.textBox2')]")
        public WebElement emailInputRegisterWebclient;
        
        @FindBy(xpath="//input[contains(@id, 'WebClient_Registration.textBox3')]")
        public WebElement passwordInputRegisterWebclient;
        
        
        @FindBy(xpath="//input[contains(@id, 'WebClient_Registration.checkBox1')]")
        public WebElement checkboxNameRegisterEmailWebclient;

        @FindBy(xpath= "//input[contains(@id, 'WebClient_Registration.checkBox2')]")
        public WebElement checkboxRegisterCharacterWebClient;
        
        @FindBy(xpath= "//input[contains(@id, 'WebClient_Registration.checkBox3')]")
        public WebElement checkboxRegisterSymbolNumberWebClient;
        
        @FindBy(xpath= "//button[contains(@class, 'mx-name-actionButton1')]")
        public WebElement signupButtonRegisterWebClient;
        
        @FindBy(xpath= "//h2[contains(@class, 'mx-name-heading2')]")
        public WebElement textAccountCreatedWebClient;
        
        @FindBy(xpath= "//button[contains(@data-button-id, 'WebClient_RegisterConfirmAccount.actionButton1')]")
        public WebElement loginButtonAccountCreatedWebClient;
        
        		
        @FindBy(xpath= "//div[contains(@id, 'WebClient_Registration.textBox2')]")
        public WebElement emailErrorValidationWebClient;

		

		
        
		
        
        
        
        
        
    
       
        }
