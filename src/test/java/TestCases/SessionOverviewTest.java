package TestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.LoginToYourAccountPage;
import PageObjects.NavigationPage;
import PageObjects.SessionOverviewPage;

public class SessionOverviewTest extends BaseTest {
	
	@Test(groups={"backoffice"})
	@Parameters({"env"})
	
	public void TC001_Verify_that_admin_can_able_to_terminate_the_Session(String env) {
		if (env.equals("backoffice")) {
		SessionOverviewPage sessionpage = new SessionOverviewPage(driver);
		
		LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		
		NavigationPage np = new NavigationPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        // For email input
       // lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("admintest@gmail.com");
       
        // For Password Input
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");

        // Click login button
        lp.loginButton.click();
        np.clickHamburguerbutton.click();
        
		np.clickSuperAdminSessionNavigation.click();
		
		
		String textlastactive = sessionpage.textLastActive.getText();
		assertEquals("Last active", textlastactive);
		
		String textendsession = sessionpage.textEndSession.getText();
		assertEquals("End Session", textendsession);
		
		sessionpage.terminateButtonFirst.click();
		sessionpage.confirmationCancelButton.click();
		sessionpage.confirmationOkButton.click();
		
		
	
	} 
	}
}
	
