

package TestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
import PageObjects.LoginToYourAccountPage;
import PageObjects.NavigationPage;
import PageObjects.StaffOverviewPage;

public class StaffOverviewTest extends BaseTest {

    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    
   @Test
    public void TC001_BO_user_can_able_to_verify_the_staffoverview_screen_context(){
    	
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        StaffOverviewPage sp= new StaffOverviewPage(driver);
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        
        
        //initialize the staffoverview page object
        
        wait.until(ExpectedConditions.visibilityOf(sp.textPhoto));
        String  photoLabel =sp.textPhoto.getText().trim();
        assertEquals("Photo", photoLabel);

        String  emailLabel =sp.textEmail.getText();
        assertEquals("E-mail", emailLabel);

        String  roleLabel =sp.textRole.getText();
        assertEquals("Role", roleLabel);

        String  accstausLabel =sp.textAccStatus.getText();
        assertEquals("Acc. Status", accstausLabel);

        String  activeLabel =sp.textActive.getText();
        assertEquals("Active", activeLabel);

        String  actionsLabel =sp.textActions.getText();
        assertEquals("Actions", actionsLabel);

        /* String  photoLabel =sp.textPhoto.getText();
        assertEquals("Photo", photoLabel);

        String  photoLabel =sp.textPhoto.getText();
        assertEquals("Photo", photoLabel); */
    }
    
    @Test
    public void TC002_Admin_can_able_to_invite_the_staff(){

        //LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
    	
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        StaffOverviewPage sp= new StaffOverviewPage(driver);
        NavigationPage np = new NavigationPage(driver);
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(sp.clickInvitestaff));
        
        np.clickHamburguerbutton.click();
        np.clickStaffNavigation.click();
        
        sp.clickInvitestaff.click();
        
        sp.nameInvitestaff.sendKeys("Friday Demo");
        
    
        sp.emailInvitestaff.sendKeys("fridaydemo@gmail.com");
       // Select roleDropdown = new Select (sp.clickListRole);
        sp.clickListRole.click();
        sp.clickStaffRole.click();
        sp.clickSendInvite.click();
       

        /*Actions actions = new Actions(driver);
        actions.doubleClick(sp.selectAdminRole).perform();
        sp.selectAdminRole.click();
        sp.selectStaffRole.click(); */
        
        /* wait.until(ExpectedConditions.visibilityOf(sp.clickSendInvite));
        sp.clickSendInvite.click(); */
       /*  String nameInlist = sp.nameInlistall.getText();
        assetEquals("nirmal dangal", nameInlist); */

    
        int i;
        

        for ( i=1; i<=15; i++){
            String completeXpath =sp.nameInlistBaseXpath+i+sp.nameInlistLastXpath;

            WebElement element = driver.findElement(By.xpath(completeXpath));
            String elementtext = element.getText();
            if (elementtext.equals("Friday Demo")){
                assertEquals("Friday Demo", elementtext);
                break; }}
            
    }
        
    @Test
    public void TC003_Admin_can_able_to_invite_the_admin(){
    	
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        StaffOverviewPage sp= new StaffOverviewPage(driver);
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();

        //LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        
        boolean exists = sp.clickInvitestaff.isDisplayed();
if (exists) {
    
    sp.clickInvitestaff.click();
    sp.nameInvitestaff.sendKeys("nirmal dangal");
    sp.emailInvitestaff.click();
    sp.emailInvitestaff.sendKeys("nirmal@gmail.com");
    sp.clickListRole.click();

    Actions actions = new Actions(driver);
    actions.doubleClick(sp.selectStaffRole).perform();


    
    
    sp.clickCancel.click();
    /*String successInvite = sp.textsuccessToast.getText();
    assertEquals("successfully send", successInvite); */
} else 
System.out.println("false");
    
    }

    @Test
    public void TC004_Admin_can_able_to_invite_otherAdmin() throws InterruptedException{
    	
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        StaffOverviewPage sp= new StaffOverviewPage(driver);
        NavigationPage np = new NavigationPage(driver);
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();
       // wait.until(ExpectedConditions.visibilityOf(sp.clickInvitestaff));
        

        
        np.clickHamburguerbutton.click();
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver);
        actions.doubleClick( np.clickStaffNavigation).perform();
        Thread.sleep(3000);
       
        
        sp.clickInvitestaff.click();
        Thread.sleep(3000);
        
        sp.nameInvitestaff.sendKeys("Friday Admin");
        
    
        sp.emailInvitestaff.sendKeys("fridayAdmin@gmail.com");
       // Select roleDropdown = new Select (sp.clickListRole);
        sp.clickListRole.click();
        sp.clickAdminRole.click();
        sp.clickSendInvite.click();

       // String allnamelist = sp.nameInlistall.getText();
       // assertEquals("nirmal dangal", allnamelist);

    }
    }

