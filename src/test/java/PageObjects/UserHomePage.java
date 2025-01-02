package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class UserHomePage extends BasePage {
        //WebDriver driver;
        public UserHomePage (WebDriver driver)
        {
            super(driver);
        }
    
        @FindBy(xpath ="//h3(contains[@class,'mx-name-text1 pageheader-title')]")
        public WebElement textUserHomePage;
    
        @FindBy(xpath="//input[contains(@id, 'WebClient_Registration.checkBox1')]")
        public WebElement checkboxNameRegisterEmailWebclient;

    
       

    
       
        }