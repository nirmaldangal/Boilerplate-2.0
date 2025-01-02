
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class SessionOverviewPage extends BasePage {
        public SessionOverviewPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

    
        //Backoffice loginscreen
    
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement textUsername;
        
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement textLastActive;
        
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement textEndSession;
        
        @FindBy(xpath ="//input[contains(@id, 'textBox1')]")
        public WebElement searchButton;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'BO_Sessions_Overview.actionButton2')]")
        public WebElement terminateButtonFirst;
        
        @FindBy(xpath ="//button[contains(@class, 'btn-primary')]")
        public WebElement confirmationOkButton;
        
        @FindBy(xpath ="//button[contains(@class, 'btn')]")
        public WebElement confirmationCancelButton;
        
        @FindBy(xpath ="//div[contains(@data-position, '2,2')]")
        public WebElement terminateButtonSecond;
        
        
        
    }