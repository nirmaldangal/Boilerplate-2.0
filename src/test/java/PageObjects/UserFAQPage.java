

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class UserFAQPage extends BasePage {
        //WebDriver driver;
        public UserFAQPage (WebDriver driver)
        {
            super(driver);
        }
    
        //Backoffice loginscreen
        
        @FindBy(xpath ="//a[contains(@class, 'mx-name-actionButton1')]")
        public WebElement linkClickFAQ;
        
        
        @FindBy(xpath ="//h4[contains(@class, 'mx-name-text41')]")
        public WebElement textFAQ;
       
        @FindBy(xpath="//img[contains(@class, 'mx-name-staticImage15')]")
        public WebElement iconClickBookmark;
        
        @FindBy(xpath="//li[contains(@class, 'mx-name-index-0')]")
        public WebElement categoryAClick;

        @FindBy(xpath="//li[contains(@class, 'mx-name-index-1')]")
        public WebElement categoryBClick;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text12')]")
        public WebElement questionExpand1;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text-9')]")
        public WebElement answerExpand1Click;

        @FindBy(xpath="//div[contains(@class, 'mx-name-container48')]")
        public WebElement likethumbClick;
        
        @FindBy(xpath="//img[contains(@class, 'mx-image mx-name-staticImage7 img-responsive')]")
        public WebElement likeafterthumbClick;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container63')]")
        public WebElement dislikethumbClick;
        
        @FindBy(xpath="//img[contains(@class, 'mx-image mx-name-staticImage9 img-responsive')]")
        public WebElement dislikeafterthumbClick;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container21')]")
        public WebElement closeFAQClick;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container54')]")
        public WebElement reportFAQThreeDotClick;
        
        @FindBy(xpath="//a[contains(@class, 'mx-name-actionButton16')]")
        public WebElement reportIssueFAQClick;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container11')]")
        public WebElement reportIssueQuestionText;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container18')]")
        public WebElement reportIssueAnswerText;
        
        @FindBy(xpath="//textarea[contains(@id, 'FAQ_UserReport.textArea1')]")
        public WebElement reportIssueFAQDescriptionType;
        
        @FindBy(xpath="//button[contains(@class, 'mx-name-actionButton1')]")
        public WebElement reportIssueFAQSend;
        
        @FindBy(xpath="//button[contains(@class, 'mx-name-actionButton2')]")
        public WebElement reportIssueFAQDescriptionError;
        
       
        @FindBy(xpath="//a[contains(@data-button-id, 'FAQManagement.User_FAQ_Overview.actionButton14')]")
        public WebElement bookmarkClick;
        
        
        
        @FindBy(xpath="//span[contains(@class, 'mx-icon-filled mx-icon-bookmark')]")
        public WebElement bookmarkClick1;
        
        
        @FindBy(xpath="//a[contains(@data-button-id, 'FAQManagement.User_FAQ_Overview.actionButton15')]")
        public WebElement bookmarkRemoveClick;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container68')]")
        public WebElement bookmarkDisplay;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text20')]")
        public WebElement textMybookmark;
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-text8')]")
        public WebElement textBookMarkdisplayAfter;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-container12')]")
        public WebElement filterByCategory1Click;
        
        @FindBy(xpath="//div[contains(@class, 'mx-name-text7')]")
        public WebElement filterClearCategory1;
        
    }