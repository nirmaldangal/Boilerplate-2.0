package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class AdminFAQPage extends BasePage {
        //WebDriver driver;
        public AdminFAQPage (WebDriver driver)
        {
            super(driver);
        }
    
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-sidebarToggle1')]")
        public WebElement clickHamburguerbutton;
        
        @FindBy(xpath ="//a[contains(@title, 'FAQ Management')]")
        public WebElement linkClickNavigationFAQ;
        
        @FindBy(xpath ="//a[contains(@class, 'mx-name-navigationTree1-9')]")
        public WebElement linkClickSetting;
        
        //Overview
        
        
        @FindBy(xpath ="//h4[contains(@class, 'mx-name-text41')]")
        public WebElement faqText;
        
        @FindBy(xpath ="//input[contains(@id, 'BO_Category_Management.textBox1')]")
        public WebElement faqSearchClick;
        
        @FindBy(xpath ="//button[contains(@class, 'mx-name-actionButton6')]")
        public WebElement newCategoryAddClick;
       
        @FindBy(xpath="//a[contains(@class, 'mx-name-tabPage1')]")
        public WebElement overviewTextTabClick;
        
        @FindBy(xpath="//a[contains(@class, 'mx-name-tabPage2')]")
        public WebElement faqAnalyticsTextTabClick;
        
        @FindBy(xpath="//a[contains(@class, 'mx-name-tabPage3')]")
        public WebElement faqIssueReportTextTabClick;
        
        @FindBy(xpath="//input[contains(@id, 'Category_NewEdit.textBox6')]")
        public WebElement categoryClickType;
        
        @FindBy(xpath="//input[contains(@id, 'Category_NewEdit.textBox7')]")
        public WebElement descriptionCategoryClickType;
        
        
        
        @FindBy(xpath ="//input[contains(@id, 'BO_Category_Management.textBox1')]")
        public WebElement categoryFAQText;
        
        @FindBy(xpath ="//input[contains(@id, 'BO_Category_Management.textBox1')]")
        public WebElement descriptionFAQText;
        
        @FindBy(xpath ="//button[contains(@class, 'mx-name-actionButton2')]")
        public WebElement cancelFAQCategory;
        
        @FindBy(xpath ="//button[contains(@class, 'mx-name-actionButton1')]")
        public WebElement saveFAQCategory;
        
        @FindBy(xpath ="//button[contains(@class, 'close')]")
        public WebElement closeFAQCategory;
        
        @FindBy(xpath ="//div[contains(@data-position, '0,0')]")
        public WebElement categoryfirstClick;
        
        @FindBy(xpath ="//div[contains(@data-position, '0,1')]")
        public WebElement categorysecondClick;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'BO_Category_Management.actionButton9')]")
        public WebElement editActionCategoryClick;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'BO_Category_Management.actionButton10')]")
        public WebElement deleteActionCategoryClick;
        
        @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
        public WebElement deleteOKConfirmationCategoryClick;
        
        @FindBy(xpath ="//button[contains(@class, 'btn')]")
        public WebElement deleteCancelConfirmationCategoryClick;
        
        // Add Question and Answers in FAQ
        
        @FindBy(xpath ="//span[contains(text(), 'Question')]")
        public WebElement questionCategoryText;
        
        @FindBy(xpath ="//div[contains(@id, 'DataGrid18-column0')]")
        public WebElement questionCategoryText1;
        
        @FindBy(xpath ="//div[contains(@id, 'DataGrid18-column1')]")
        public WebElement answerCategoryText;
        
        @FindBy(xpath ="//div[contains(@data-position, '4,0')]")
        public WebElement categoryNextQuestionFirstClick;
        
        @FindBy(xpath ="//div[contains(@data-position, '4,1')]")
        public WebElement categoryNextQuestionSecondClick;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'FAQManagement.BO_FAQ_Management.actionButton2')]")
        public WebElement editActionQuestionAnswerCategoryClick;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'FAQManagement.BO_FAQ_Management.actionButton3')]")
        public WebElement deleteActionQuestionAnswerCategoryClick;
        
        @FindBy(xpath ="//button[contains(@class, 'btn btn-primary')]")
        public WebElement deleteOKConfirmationQuestionAnswerCategoryClick;
        
        @FindBy(xpath ="//button[contains(@class, 'btn')]")
        public WebElement deleteCancelQuestionAnswerConfirmationCategoryClick;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'FAQManagement.BO_FAQ_Management.actionButton6')]")
        public WebElement addNewQuestionClick;
        
        @FindBy(xpath ="//textarea[contains(@id, 'FAQ_NewEdit.textArea1')]")
        public WebElement questionFAQType;
        
        @FindBy(xpath ="//textarea[contains(@id, 'FAQ_NewEdit.textArea2')]")
        public WebElement answerFAQType;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'FAQManagement.FAQ_NewEdit.actionButton8')]")
        public WebElement saveQuestionAnswerClick;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'FAQManagement.FAQ_NewEdit.actionButton7')]")
        public WebElement cancelQuestionAnswerClick;
        
        @FindBy(xpath ="//span[contains(@class, 'mx-icon-lined mx-icon-chevron-left')]")
        public WebElement backbuttonQuestionAnswerClick;
        
        @FindBy(xpath ="//textarea[contains(@id, 'FAQ_NewEdit.textArea1')]")
        public WebElement questionAlreadyEditFAQType;
        
        @FindBy(xpath ="//textarea[contains(@id, 'FAQ_NewEdit.textArea2')]")
        public WebElement answerAlreadyEditFAQType;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'FAQManagement.FAQ_NewEdit.actionButton8')]")
        public WebElement saveAlreadyQuestionAnswerClick;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'FAQManagement.FAQ_NewEdit.actionButton7')]")
        public WebElement cancelAlreadyQuestionAnswerClick;
        
        @FindBy(xpath ="//div[contains(@class, 'mx-scrollcontainer-wrapper')]")
        public WebElement scrollableDiv;
        
        
        
        
        
        
    }
