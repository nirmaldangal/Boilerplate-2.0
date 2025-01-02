package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaffOverviewPage extends BasePage {
    public StaffOverviewPage (WebDriver driver)
    {
        super(driver);
    }
    
    @FindBy(xpath= "//a[contains(@class, 'mx-name-navigationTree1-10')]")
    public WebElement textAccountOVerview;
    
    @FindBy(xpath= "//a[contains(@class, 'mx-name-navigationTree1-10')]")
    public WebElement searchAction;
    
    @FindBy(xpath= "//a[contains(@class, 'mx-name-navigationTree1-10')]")
    public WebElement textUsername;
    
    @FindBy(xpath= "//button[contains(@data-button-id, 'BO_CompanyAccount_Overview.actionButton4')]")
    public WebElement clickInvitestaff;
    
    @FindBy(xpath= "//input[contains(@id, 'BO_Account_InvitationNewEdit.textBox3')]")
    public WebElement nameInvitestaff;
    
    @FindBy(xpath= "//input[contains(@id, 'BO_Account_InvitationNewEdit.textBox2')]")
    public WebElement emailInvitestaff;
    
    @FindBy(xpath= "//option[contains(@value, '25895697857380859')]")
    public WebElement clickAdminRole;
    
    @FindBy(xpath= "//option[contains(@value, '25895697857380523')]")
    public WebElement clickStaffRole;
    
    @FindBy(xpath= "//select[contains(@id, 'BO_Account_InvitationNewEdit.referenceSelector1')]")
    public WebElement clickListRole;
    
    @FindBy(xpath= "//option[contains(@value, 'mx-name-navigationTree1-10')]")
    public WebElement clickSuperAdminRole;
    
    @FindBy(xpath= "//button[contains(@data-button-id, 'BO_Account_InvitationNewEdit.actionButton1')]")
    public WebElement clickSendInvitee;



    @FindBy (css =".mx-text.mx-name-text41.spacing-outer-bottom-medium.text-detail")
    public WebElement textAccountOVervieww;

    @FindBy (css="input[id='38.AccountManagement.BO_Account_Overview.textBox1_joe_6']")
    public WebElement searchActionn;

    @FindBy (css=".mx-text.mx-name-text5.UserName.spacing-outer-left")
    public WebElement textUsernamee;

    @FindBy (xpath="(//button[normalize-space()='Invite Staff'])[1]")
    public WebElement clickInvitestafff;

    @FindBy(xpath = "//span[text()='Name']/following::input[1]")
    public WebElement nameInvitestafff;

    @FindBy(xpath="//span[text()='E-mail']/following::input[2]")
    public WebElement emailInvitestafff;

    @FindBy(xpath="//span[text()='Role']/following::input[3]")
    public WebElement clickListRolee;

    @FindBy(css = "//span[text()='Role']/following::input[3]")
    public WebElement clickListRoles;


    @FindBy(css="td[title='Admin']")
    public WebElement selectAdminRole;

    @FindBy(css="td[title='Anonymous']")
    public WebElement selectAnonymousRole;

    @FindBy(css="td[title='Staff']")
    public WebElement selectStaffRole;

    @FindBy(css="td[title='SuperAdministrator']")
    public WebElement selectSuperAdminRole;

    @FindBy(css="td[title='User']")
    public WebElement selectUserRole;

    @FindBy(css="button[title='close']")
    public WebElement clickCross;

    @FindBy(xpath="//button[normalize-space()='Cancel']")
    public WebElement clickCancel;

    @FindBy(xpath="//button[normalize-space()='Send Invite']")
    public WebElement clickSendInvite;

    @FindBy (css="div[aria-label='Photo'] span")
    public WebElement textPhotoo;

    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textPhoto;

    

    @FindBy (css="div[aria-label='E-mail'] span")
    public WebElement textEmaill;
    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textEmail;


    @FindBy(css="div[aria-label='Role'] span")
    public WebElement textRolee;
    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textRole;


    @FindBy(css="div[aria-label='Acc. Status'] span")
    public WebElement textAccStatuss;
    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textAccStatus;


    @FindBy(css="div[aria-label='Active'] span")
    public WebElement textActivee;
    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textActive;


    @FindBy (css="div[aria-label='Actions'] span")
    public WebElement textActionss;
    @FindBy(xpath ="//div[contains(@data-column-id,'0')]")
    public WebElement textActions;


    @FindBy(className="checked")
    public WebElement toggleActiveConfirm;

    @FindBy(className ="un-checked")
    public WebElement toggleActivePending;

    @FindBy(xpath="(//a[@role='button'])[7]")
    public WebElement editActions;

    @FindBy(xpath= "(//a[@role='button'])[4]")
    public WebElement deleteActions;

    @FindBy(css= "#mxui_widget_SidebarToggleButton_0")
    public WebElement clickHamber;

    @FindBy(css="(//span[@class='mx-text mx-name-text3'][normalize-space()='Admin'])[1]")
    public WebElement textAdmin;

    @FindBy(xpath="//a[normalize-space()='SignOut']")
    public WebElement buttonLogout;

    public String nameInlistBaseXpath = "//*[@id='mxui_widget_Wrapper_4']/div/div[1]/div[2]/div/div[";
    /*@FindBy(xpath="//*[@id=\\\"mxui_widget_Wrapper_4\\\"]/div/div[1]/div[2]/div/div[")
    public WebElement nameInlistBaseXpath;*/
    public String nameInlistLastXpath = "]/div[2]";
   /*  @FindBy(xpath="]/div[2]")
    public WebElement nameInlistLastXpath; */

    

    @FindBy(xpath="//div[contains(@class, 'alert-danger') and contains(text(), 'Email already exists')]")
    public WebElement errorEmailtext;

    @FindBy(xpath ="//div[contains(text(), 'Email already exists')]")
    public WebElement erroremailtext;

}
