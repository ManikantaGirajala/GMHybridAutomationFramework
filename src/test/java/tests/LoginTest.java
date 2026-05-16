package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void loginTest() {

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Configure Chrome browser settings
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver(options);

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to SauceDemo application
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        // Validate login button visibility
        boolean loginStatus = loginPage.isLoginButtonDisplayed();
        System.out.println("Login Button Displayed - " + loginStatus);

        // Validate login button enabled state
        boolean loginButton = loginPage.isLoginButtonEnabled();
        System.out.println("Login Button Enabled - " + loginButton);

        // Perform login using valid credentials
        loginPage.login("standard_user", "secret_sauce");

        // Close browser after test execution
        driver.quit();
    }
}