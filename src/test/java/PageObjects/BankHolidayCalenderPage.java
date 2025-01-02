
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    

    
    

    public class BankHolidayCalenderPage extends BasePage {
        //WebDriver driver;
        public BankHolidayCalenderPage (WebDriver driver)
        {
            super(driver);
        }
    
        //Backoffice loginscreen
        
        @FindBy(xpath="//span[contains(@class, 'mx-name-sidebarToggle1')]")
        public WebElement clickHamburguerbutton;
        
        @FindBy(xpath ="//a[contains(@class, 'mx-name-navigationTree1-12')]")
        public WebElement clickBankHolidaysNavigation;
        
        @FindBy(xpath ="//div[contains(@class, 'mx-scrollcontainer-wrapper')]")
        public WebElement scrollSideBar;
        
        
        
        @FindBy(xpath ="//h1[contains(@class, 'mx-name-pageTitle1')]")
        public WebElement textBankHolidayOverview;
        
        @FindBy(xpath ="//div[contains(@id, 'DataGrid32-column0')]")
        public WebElement titleText;
    
        @FindBy(xpath ="//h5[contains(@class, 'DataGrid32-column1')]")
        public WebElement dateText;
        
        @FindBy(xpath ="//div[contains(@id, 'DataGrid32-column2')]")
        public WebElement countryText;
    
        @FindBy(xpath ="//h5[contains(@class, 'DataGrid32-column3')]")
        public WebElement descriptionText;
        
        @FindBy(xpath ="//div[contains(@id, 'BankHoliday_Overview.switch1')]")
        public WebElement toggleCalenderViewandDataGridView;
    
        @FindBy(xpath ="//select[contains(@id, 'BankHoliday_Overview.dropDown1')]")
        public WebElement filterCountryClickDropDown;
        
        @FindBy(xpath ="//div[contains(@class, 'ant-picker-input-active')]")
        public WebElement startDateClick;
    
        @FindBy(xpath ="//div[contains(@class, 'ant-picker-input')]")
        public WebElement endDateClick;
        
        @FindBy(xpath ="//button[contains(@class, 'toolbar-btn-day')]")
        public WebElement textDayCalender;
        
        @FindBy(xpath ="//button[contains(@class, 'toolbar-btn-week')]")
        public WebElement textWeekCalender;
        
        @FindBy(xpath ="//button[contains(@class, 'toolbar-btn-month')]")
        public WebElement textMonthCalender;
        
        // Create Holiday 
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'BankHoliday_Overview.actionButton4')]")
        public WebElement createHolidayClick;
    
        @FindBy(xpath ="//input[contains(@id, 'BankHoliday_NewEdit.textBox1')]")
        public WebElement titleTypeClickHolidayEdit;
        
        @FindBy(xpath ="//input[contains(@id, 'BankHoliday_NewEdit.datePicker1')]")
        public WebElement dateSelectHolidayEdit;
    
        @FindBy(xpath ="//select[contains(@id, 'BankHoliday_NewEdit.dropDown1')]")
        public WebElement countrySelectClick;
        
        @FindBy(xpath="//option[contains(@value, 'Portugal')]")
        public WebElement selectPortugal;
        
        @FindBy(xpath="//option[contains(@value, 'France')]")
        public WebElement selectFrance;
        
        @FindBy(xpath ="//textarea[contains(@id, 'BankHoliday_NewEdit.textArea1')]")
        public WebElement descriptionBankHolidayType;
        
        @FindBy(xpath ="//input[contains(@class, 'form-control')]")
        public WebElement calenderColorSelectorType;
        
        @FindBy(xpath ="//button[contains(@data-button-id, 'BankHoliday_NewEdit.actionButton2')]")
        public WebElement createClickSave;
    
        @FindBy(xpath ="//button[contains(@data-button-id, 'BankHoliday_NewEdit.actionButton1')]")
        public WebElement cancelClickBack;
        
        @FindBy(xpath ="//a[contains(@data-button-id, 'BankHoliday_Overview.actionButton2')]")
        public WebElement editActionClick;
    
        @FindBy(xpath ="//a[contains(@data-button-id, 'BankHoliday_Overview.actionButton3')]")
        public WebElement deleteActionClick;
    }
    
        
        
        
        
        
        
        
        
        
        