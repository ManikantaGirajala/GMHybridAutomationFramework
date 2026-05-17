package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ProductsPage {

    WebDriver driver;

    By productTitle = By.className("title");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public ProductsPage(WebDriver driver){

    this.driver = driver;

   }

   public boolean isProductsTitleDisplayed(){
       WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle)).isDisplayed();
   }

   public void clickAddToCart(){

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();


   }


}
