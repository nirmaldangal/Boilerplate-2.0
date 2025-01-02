

package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import PageObjects.LoginToYourAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    private Properties properties;

    // Method to load properties from the configuration file
    public void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to load configuration properties file.");
        }
    }

    // Method to get URL based on the environment
    public String getURL(String environment) {
        String url = properties.getProperty(environment + ".url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("URL not found for environment: " + environment);
        }
    }

    @BeforeMethod
    @Parameters("env")
    public void setup(@Optional("client") String environment) {
        loadProperties();

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = getURL(environment);
        System.out.println("Navigating to URL: " + url);
        driver.get(url);

        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
