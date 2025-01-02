

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class UserReportIssuePage extends BasePage {
        //WebDriver driver;
        public UserReportIssuePage (WebDriver driver)
        {
            super(driver);
        }
    
        //Backoffice loginscreen
    
        @FindBy(xpath ="//a[contains(@data-button-id, 'Backoffice.SNIP_Footer.actionButton2')]")
        public WebElement reportIssueLink;
       
        @FindBy(xpath="//select[contains(@id, 'Web_Report_Issue.referenceSelector1')]")
        public WebElement selectIssueType;

        @FindBy(xpath="//option[contains(@value, '34058472181990141')]")
        public WebElement selectBrokenLink;
        
        @FindBy(xpath="//option[contains(@value, '34058472181989920')]")
        public WebElement selectIncorrectInformation;

        @FindBy(xpath="//option[contains(@value, '34058472181990248')]")
        public WebElement selectTechnicalProblem;
        
        @FindBy(xpath="//option[contains(@value, '34058472181990586')]")
        public WebElement selectOthers;
        
        @FindBy(xpath="//textarea[contains(@id, 'Web_Report_Issue.textArea1')]")
        public WebElement typeDescription;
        
        @FindBy(xpath="//div[contains(@class, 'filedropper__dropzone')]")
        public WebElement browseImageorFile;
        
        @FindBy(xpath="//input[contains(@id, 'Web_Report_Issue.textBox1')]")
        public WebElement typeNameField;
        
        @FindBy(xpath="//input[contains(@id, 'Web_Report_Issue.textBox2')]")
        public WebElement typeEmailField;
        
        @FindBy(xpath="//input[contains(@id, 'Web_Report_Issue.checkBox1')]")
        public WebElement checkBoxWish;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text7')]")
        public WebElement nameemailUserDetails;
        
        @FindBy(xpath="//button[contains(@data-button-id, 'Web_Report_Issue.actionButton2')]")
        public WebElement backClick;
        
        @FindBy(xpath="//button[contains(@data-button-id, 'Web_Report_Issue.actionButton1')]")
        public WebElement sendReportClick;
        
        @FindBy(xpath="//div[contains(@id, 'Web_Report_Issue.referenceSelector1')]")
        public WebElement issueReportTypeerrorRequiredField;
        
        @FindBy(xpath="//div[contains(@id, 'Web_Report_Issue.textArea1')]")
        public WebElement descriptionerrorRequiredField;
        
        @FindBy(xpath="//div[contains(@class, 'toast-message')]")
        public WebElement sendSuccessfulMessage;
        
        @FindBy(xpath="//button[contains(@class, 'close')]")
        public WebElement cancelCross;
        
    }