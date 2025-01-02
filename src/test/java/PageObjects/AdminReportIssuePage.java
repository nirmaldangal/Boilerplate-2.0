

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class AdminReportIssuePage extends BasePage {
        //WebDriver driver;
        public AdminReportIssuePage (WebDriver driver)
        {
            super(driver);
        }
    
        //Backoffice loginscreen
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-sidebarToggle1')]")
        public WebElement clickHamburguerbutton;
        
        @FindBy(xpath ="//a[contains(@class, 'mx-name-navigationTree1-7')]")
        public WebElement clickIssueReportNavigation;
        
        @FindBy(xpath ="//h4[contains(@class, 'mx-name-text41')]")
        public WebElement textIssueReportOverview;
        
        @FindBy(xpath ="//div[contains(@data-position, '1,0')]")
        public WebElement clickDoubleIssueReport;
    
        @FindBy(xpath ="//h5[contains(@class, 'mx-name-text3')]")
        public WebElement issueTypeText;
       
        @FindBy(xpath="//div[contains(@class, 'mx-name-textBox2 mx-textbox')]")
        public WebElement emailText;
        
        @FindBy(xpath="//h5[contains(@class, 'mx-name-text17')]")
        public WebElement descriptionText;

        @FindBy(xpath="//div[contains(@class, 'mx-name-textBox1 mx-textbox')]")
        public WebElement nameText;
        
        @FindBy(xpath="//select[contains(@id, 'ReportIssue.IssueReport_View.dropDown1')]")
        public WebElement clickStatusReport;
        
        @FindBy(xpath="//option[contains(@value, '_New')]")
        public WebElement selectNew;
        
        @FindBy(xpath="//option[contains(@value, 'In_Progress')]")
        public WebElement selectInProgress;
        
        @FindBy(xpath="//option[contains(@value, 'Resolved')]")
        public WebElement selectResolved;
        
        @FindBy(xpath="//textarea[contains(@id, 'ReportIssue.IssueReport_View.textArea2')]")
        public WebElement commentType;
        
        @FindBy(xpath="//button[contains(@data-button-id, 'ReportIssue.IssueReport_View.actionButton1')]")
        public WebElement clickUpdateSend;
        
        @FindBy(xpath="//div[contains(@class, 'toast-message')]")
        public WebElement sendSuccessfullytext;
        
        @FindBy(xpath="//div[contains(@id, 'ReportIssue.IssueReport_View.textArea2')]")
        public WebElement commentErrorMessage;
        
    }