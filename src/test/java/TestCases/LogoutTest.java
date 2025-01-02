

package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginToYourAccountPage;

public class LogoutTest extends BaseTest {
    

    @Test
    public void Log_out(){

        
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        lp.Signoutbutton.click();
    }
    
}