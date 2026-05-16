package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    // Shared WebDriver instance for browser interactions
    WebDriver driver;

    // Login page locators
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    // Initialise LoginPage with shared WebDriver instance
    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    public void enterUsername(String username) {

        driver.findElement(usernameField).sendKeys(username);

    }

    public void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);

    }

    public void clickLoginButton() {

        driver.findElement(loginButton).click();

    }

    // Perform complete login action
    public void login(String username, String password) {

        enterUsername(username);

        enterPassword(password);

        clickLoginButton();

    }

    // Validate login button visibility
    public boolean isLoginButtonDisplayed() {

        return driver.findElement(loginButton).isDisplayed();

    }

    // Validate login button enabled state
    public boolean isLoginButtonEnabled() {

        return driver.findElement(loginButton).isEnabled();

    }

}