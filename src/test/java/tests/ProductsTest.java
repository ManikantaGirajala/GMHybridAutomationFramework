package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsTest {
    @Test
    public void productsTest(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user","secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);

        boolean status = productsPage.isProductsTitleDisplayed();

        System.out.println("Product Title Displayed - " + status);

        driver.quit();

    }


}
