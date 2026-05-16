package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage {

    WebDriver driver;

    By productTitle = By.className("title");

    public ProductsPage(WebDriver driver){

    this.driver = driver;

   }

   public boolean isProductsTitleDisplayed(){
      return driver.findElement(productTitle).isDisplayed();
   }


}
