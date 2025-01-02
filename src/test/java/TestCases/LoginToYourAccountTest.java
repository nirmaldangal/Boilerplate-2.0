

package TestCases;

import static org.testng.Assert.assertEquals;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.LoginToYourAccountPage;
import PageObjects.UserHomePage;
//import s4digital.PageObjects.StaffOverviewPage;

public class LoginToYourAccountTest extends BaseTest {
     

    // Backoffice LoginScreen testcases
	
	@Test(groups = {"backoffice"})
    @Parameters({"env"})
    public void TC001_Admin_User_should_able_to_login_with_valid_email_and_password(String env) throws InterruptedException {
        // Initialize the LoginToYourAccountPage object
		if (env.equals("backoffice")) {
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        // For email input
       // lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("admintest@gmail.com");
       
        // For Password Input
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");

        // Click login button
        lp.loginButton.click();

        // Initialize the AccountOverviewPage object
        AccountOverviewPage ap = new AccountOverviewPage(driver);

        // Wait until the username label is visible
        wait.until(ExpectedConditions.visibilityOf(ap.userfullname));

        // Get the actual username displayed on the dashboard
        String actualUserNameLabel = ap.userfullname.getText();

        // Assert that the displayed username matches the expected username
        assertEquals("admin test", actualUserNameLabel);
        lp.Signoutbutton.click();
       //Logout logout= new Logout();
       //logout.Log_out();
        

        System.out.println("Congratulations, for admin user login steps executed successfully!");
		}
        
        
    }
	@Test(groups = {"backoffice"})
    @Parameters({"env"})
    //public LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
    public void TC002_Backoffice_User_should_unable_to_login_with_invalid_email_and_valid_password(String env) throws InterruptedException {
        // Initialize the LoginToYourAccountPage object
		if (env.equals("backoffice")) {
         LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        //Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Thread.sleep(4000);
        
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        // For email input
        lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("fff@gm.com");
       
        // For Password Input
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456789@");

        // Click login button
        lp.loginButton.click();

        // Initialize the AccountOverviewPage object
        //AccountOverviewPage ap = new AccountOverviewPage(driver);

        // Wait until the username label is visible
        wait.until(ExpectedConditions.visibilityOf(lp.errorMessage));
        

        // Get the actual username displayed on the dashboard
        String errorMessagee = lp.errorMessage.getText();

        // Assert that the displayed username matches the expected username
        assertEquals("Please verify your email and password", errorMessagee);
        

        System.out.println("Sorry, email is incorrect !");

}   
	}


	@Test(groups = {"backoffice"})
    @Parameters({"env"})
    public void TC003_Backoffice_User_should_able_to_login_with_valid_email_and_invalid_password(String env) {
    // Initialize the LoginToYourAccountPage object
		if (env.equals("backoffice")) {
    LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
   
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    //Thread.sleep(4000);

    wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
    
    // For email input
    lp.emailInput.clear(); // Make sure to clear before entering text
    lp.emailInput.sendKeys("admintest@gmail.com");
   
    // For Password Input
    lp.passwordInput.click();
    lp.passwordInput.sendKeys("Test123456789@@");

    // Click login button
    lp.loginButton.click();

    // Initialize the AccountOverviewPage object
    //AccountOverviewPage ap = new AccountOverviewPage(driver);

    wait.until(ExpectedConditions.visibilityOf(lp.errorMessage));
        

        // Get the actual username displayed on the dashboard
        String errorMessagee = lp.errorMessage.getText();

        // Assert that the displayed username matches the expected username
        assertEquals("Please verify your email and password", errorMessagee);      

        System.out.println("Sorry, Password is incorrect !");
    }
	}

	@Test(groups = {"backoffice"})
    @Parameters({"env"})
    public void TC004_BackOffice_User_should_able_to_login_with_invalid_email_and_password(String env) throws InterruptedException {
        // Initialize the LoginToYourAccountPage object
		if (env.equals("backoffice")) {
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
        
        // For email input
        lp.emailInput.clear(); // Make sure to clear before entering text
        lp.emailInput.sendKeys("testthree@g.com");
       
        // For Password Input
        lp.passwordInput.click();
        lp.passwordInput.sendKeys("Test123456");

        // Click login button
        lp.loginButton.click();

        // Initialize the AccountOverviewPage object
        wait.until(ExpectedConditions.visibilityOf(lp.errorMessage));
        

        // Get the actual username displayed on the dashboard
        String errorMessagee = lp.errorMessage.getText();

        // Assert that the displayed username matches the expected username
        assertEquals("Please verify your email and password", errorMessagee);
        

        System.out.println("Sorry, email and Password is incorrect !");

}
	}
	
	
	
	//WebClient Signin screen all test cases
	
	@Test(groups = {"client"})
    @Parameters({"env"})
    public void TC005_Webclient_User_should_able_to_SignUp_the_WebClent(String env) throws InterruptedException {
        // Initialize the LoginToYourAccountPage object
		if (env.equals("client")) {
        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        Thread.sleep(4000);
        wait.until(ExpectedConditions.visibilityOf(lp.signUpButtonWebClient));
        
        // For email input
       // lp.emailInput.clear(); // Make sure to clear before entering text
        lp.signUpButtonWebClient.click();
        
        //String register = lp.textRegisterWebclient.getText();
       // assertEquals("Register", register);
        
        
        
        lp.nameInputRegisterWebclient.sendKeys("Jhoney Dal");
        lp.emailInputRegisterWebclient.clear();
        lp.emailInputRegisterWebclient.sendKeys("jhoneyrr@gmail.com");
        lp.passwordInputWebClent.clear();
        lp.passwordInputRegisterWebclient.sendKeys("Test123456789@");
        
        lp.checkboxNameRegisterEmailWebclient.isEnabled();
        lp.checkboxRegisterCharacterWebClient.isEnabled();
        lp.checkboxRegisterSymbolNumberWebClient.isEnabled();
        
        // Click login button
        lp.signupButtonRegisterWebClient.click();
        
        lp.loginButtonAccountCreatedWebClient.click();

        String logintext = lp.textLoginWebClient.getText();
        assertEquals("Login", logintext);

        System.out.println("Congratulations, Register process of the client successful");
		}
	}
        
		
		
		@Test(groups = {"client"})
	    @Parameters({"env"})
	    public void TC006_Webclient_User_should_able_to_login_with_valid_email_and_password(String env) throws InterruptedException {
	        // Initialize the LoginToYourAccountPage object
			if (env.equals("client")) {
	        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	        UserHomePage uhp = new UserHomePage(driver);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	        Thread.sleep(4000);
	        wait.until(ExpectedConditions.visibilityOf(lp.emailInputWebClient));
	        
	        // For email input
	       // lp.emailInput.clear(); // Make sure to clear before entering text
	        lp.emailInputWebClient.sendKeys("fridayclient@gmail.com");
	       
	        // For Password Input
	        lp.passwordInputWebClent.click();
	        lp.passwordInputWebClent.sendKeys("Test123456789@");

	        // Click login button
	        lp.loginButtonWebClient.click();
	        
	        String textuserhome= uhp.textUserHomePage.getText();
	        assertEquals("Home", textuserhome);
	        

	        System.out.println("Congratulations, for admin user login steps executed successfully!");
			}
		}
	        
	        
	    
		@Test(groups = {"client"})
	    @Parameters({"env"})
	    //public LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	    public void TC007_WebClient_User_should_unable_to_login_with_invalid_email_and_valid_password(String env) throws InterruptedException {
	        // Initialize the LoginToYourAccountPage object
			if (env.equals("client")) {
	         LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	        //Thread.sleep(2000);

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        //Thread.sleep(4000);
	        
	        wait.until(ExpectedConditions.visibilityOf(lp.emailInputWebClient));
	        
	        // For email input
	        lp.emailInputWebClient.clear(); // Make sure to clear before entering text
	        lp.emailInputWebClient.sendKeys("fff@gm.com");
	       
	        // For Password Input
	        lp.passwordInputWebClent.click();
	        lp.passwordInputWebClent.sendKeys("Test123456789@");

	        // Click login button
	        lp.loginButtonWebClient.click();

	        // Initialize the AccountOverviewPage object
	        //AccountOverviewPage ap = new AccountOverviewPage(driver);

	        // Wait until the username label is visible
	        wait.until(ExpectedConditions.visibilityOf(lp.errorMessage));
	        

	        // Get the actual username displayed on the dashboard
	        String errorMessagee = lp.errorMessageWebClient.getText();

	        // Assert that the displayed username matches the expected username
	        assertEquals("Please verify your email and password", errorMessagee);
	        

	        System.out.println("Sorry, email is incorrect !");

	}   
		}
		


		@Test(groups = {"client"})
	    @Parameters({"env"})
	    public void TC008_WebClient_User_should_able_to_login_with_valid_email_and_invalid_password(String env) {
	    // Initialize the LoginToYourAccountPage object
			if (env.equals("client")) {
	    LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	   
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	    //Thread.sleep(4000);

	    wait.until(ExpectedConditions.visibilityOf(lp.emailInputWebClient));
	    
	    // For email input
	    lp.emailInputWebClient.clear(); // Make sure to clear before entering text
	    lp.emailInputWebClient.sendKeys("admintest@gmail.com");
	   
	    // For Password Input
	    lp.passwordInputWebClent.click();
	    lp.passwordInputWebClent.sendKeys("Test123456789@@");

	    // Click login button
	    lp.loginButtonWebClient.click();

	    // Initialize the AccountOverviewPage object
	    //AccountOverviewPage ap = new AccountOverviewPage(driver);

	    wait.until(ExpectedConditions.visibilityOf(lp.errorMessageWebClient));
	        

	        // Get the actual username displayed on the dashboard
	        String errorMessagee = lp.errorMessage.getText();

	        // Assert that the displayed username matches the expected username
	        assertEquals("Please verify your email and password", errorMessagee);      

	        System.out.println("Sorry, Password is incorrect !");
	    }
		}
		

		@Test(groups = {"client"})
	    @Parameters({"env"})
	    public void TC009_Webclient_User_should_able_to_login_with_invalid_email_and_password(String env) throws InterruptedException {
	        // Initialize the LoginToYourAccountPage object
			if (env.equals("client")) {
	        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
	        Thread.sleep(2000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        //Thread.sleep(4000);
	        wait.until(ExpectedConditions.visibilityOf(lp.emailInput));
	        
	        // For email input
	        lp.emailInputWebClient.clear(); // Make sure to clear before entering text
	        lp.emailInputWebClient.sendKeys("testthree@g.com");
	       
	        // For Password Input
	        lp.passwordInputWebClent.click();
	        lp.passwordInputWebClent.sendKeys("Test123456");

	        // Click login button
	        lp.loginButtonWebClient.click();

	        // Initialize the AccountOverviewPage object
	        wait.until(ExpectedConditions.visibilityOf(lp.errorMessage));
	        

	        // Get the actual username displayed on the dashboard
	        String errorMessagee = lp.errorMessageWebClient.getText();

	        // Assert that the displayed username matches the expected username
	        assertEquals("Please verify your email and password", errorMessagee);
	        

	        System.out.println("Sorry, email and Password is incorrect !");
			}
		}
			
			@Test(groups = {"client"})
		    @Parameters({"env"})
		    public void TC0010_Webclient_Validate_exiting_user_cannot_able_to_register(String env) throws InterruptedException {
		        // Initialize the LoginToYourAccountPage object
				if (env.equals("client")) {
		        LoginToYourAccountPage lp = new LoginToYourAccountPage(driver);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		        Thread.sleep(4000);
		        wait.until(ExpectedConditions.visibilityOf(lp.signUpButtonWebClient));
		        
		        // For email input
		       // lp.emailInput.clear(); // Make sure to clear before entering text
		        lp.signUpButtonWebClient.click();
		        
		        //String register = lp.textRegisterWebclient.getText();
		       // assertEquals("Register", register);
		        
		        
		        
		        lp.nameInputRegisterWebclient.sendKeys("Jhoney Dal");
		        lp.emailInputRegisterWebclient.clear();
		        lp.emailInputRegisterWebclient.sendKeys("jhoneyr@gmail.com");
		        lp.passwordInputWebClent.clear();
		        lp.passwordInputRegisterWebclient.sendKeys("Test123456789@");
		        
		        lp.checkboxNameRegisterEmailWebclient.isEnabled();
		        lp.checkboxRegisterCharacterWebClient.isEnabled();
		        lp.checkboxRegisterSymbolNumberWebClient.isEnabled();
		        
		        // Click login button
		        lp.signupButtonRegisterWebClient.click();
		        
		      

		        String emailValidateError = lp.emailErrorValidationWebClient.getText();
		        assertEquals("This email already exists", emailValidateError);

		        System.out.println("Congratulations, Already registered email can not register again");
				}
			}
		
		}
