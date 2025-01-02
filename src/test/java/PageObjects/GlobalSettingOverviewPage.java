package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalSettingOverviewPage extends BasePage {

    public GlobalSettingOverviewPage(WebDriver driver) {
        super(driver);
        
    }
    
    @FindBy(xpath ="//a[contains(@class, 'mx-name-navigationTree1-9')]")
    public WebElement navigationClickSetting;
    
    @FindBy(xpath ="//h4[contains(@class, 'mx-name-text41')]")
    public WebElement textSetting;
    
    @FindBy(xpath ="//a[contains(@class, 'mx-name-tabPage1')]")
    public WebElement globalSettingTabClick;
    
    @FindBy(xpath ="//a[contains(@class, 'mx-name-tabPage2')]")
    public WebElement notificationSettingTabClick;
    
    @FindBy(xpath ="//h3[contains(@class, 'mx-name-text5')]")
    public WebElement textLanguageSetting;
    
    @FindBy(xpath ="//h3[contains(@class, 'mx-name-text6')]")
    public WebElement textTimeZoneSetting;
    
    @FindBy(xpath ="//h3[contains(@class, 'mx-name-text7')]")
    public WebElement textCurrencySetting;
    
    @FindBy(xpath ="//select[contains(@id, 'GlobalSettings.referenceSelector1')]")
    public WebElement languageSelectClick;
    
    @FindBy(xpath ="//option[contains(@value, '17451448556060884')]")
    public WebElement optionSelectEnglishClick;
    
    @FindBy(xpath ="//option[contains(@value, '17451448556061023')]")
    public WebElement optionSelectPortugueseClick;
    
    @FindBy(xpath ="//select[contains(@id, 'GlobalSettings.referenceSelector2')]")
    public WebElement timezoneSelectClick;
    
    @FindBy(xpath ="//option[contains(@value, '11258999068478822')]")
    public WebElement optionSelectLisbonTimeZoneClick;
    
    @FindBy(xpath ="//option[contains(@value, '17451448556060884')]")
    public WebElement optionSelectPakistanTimeZoneClick;
    
    @FindBy(xpath ="//select[contains(@id, 'GlobalSettings.referenceSelector3')]")
    public WebElement currencySelectClick;
    
    
    @FindBy(xpath ="//option[contains(@value, '23080948090275143')]")
    public WebElement optionCurrencySEKSelectClick;
    
    @FindBy(xpath ="//button[contains(@data-button-id, 'GlobalSettings.saveButton1')]")
    public WebElement saveChangesSettingClick;
    
    @FindBy(xpath ="//select[contains(@id, 'GlobalSettings.referenceSelector3')]")
    public WebElement currencySelectClickk;

    
   

    
}
