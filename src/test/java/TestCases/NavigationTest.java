

package TestCases;




import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginToYourAccountPage;
import PageObjects.NavigationPage;

public class NavigationTest extends BaseTest {

  

    private Object env;

	@Test(groups = {"backoffice"})
    @Parameters({"env"})
    public void TC001_SuperAdmin_can_able_to_click_and_check_text_in_the_navigatio(){
		if (env.equals("backoffice")) {
		
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        lp.emailInput.sendKeys("admintest@gmail.com");
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");
        lp.loginButton.click();

        NavigationPage np = new NavigationPage(driver);
        np.clickHamburguerbutton.click();
        np.clickHomeNavigation.click();
        String textHome = np.clickHomeNavigation.getText();
        assertEquals("Home", textHome);

        np.clickStaffNavigation.click();
        String textStaff = np.clickStaffNavigation.getText();
        assertEquals("Staff", textStaff);

        np.clickUsersNavigation.click();
        String textUsers = np.clickUsersNavigation.getText();
        assertEquals("Users", textUsers);

        np.clickSuperAdminSessionNavigation.click();
        String textSession = np.clickSuperAdminSessionNavigation.getText();
        assertEquals("Sessions", textSession);

        np.clickSuperAdminNotificationNavigation.click();
        String textNotification = np.clickSuperAdminNotificationNavigation.getText();
        assertEquals("Notifications", textNotification);

       /*  np.clickSuperAdminCurrencies.click();
        String textCurrencies = np.clickSuperAdminCurrencies.getText();
        assertEquals("Currencies", textCurrencies); */

        np.clickSuperAdminUserRoleNavigation.click();
        String textuserroles= np.clickSuperAdminUserRoleNavigation.getText();
        assertEquals("UserRoles", textuserroles);
        
        np.clickSuperAdminSettingNavigation.click();
        String textSetting = np.clickSuperAdminSettingNavigation.getText();
        assertEquals("Settings", textSetting);

        

        System.out.println("Navigation is available and working"); }
        

    }
}


