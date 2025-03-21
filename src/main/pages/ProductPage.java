package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    // Locators
    private By firstProductAddToCart = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    private By cartIcon = By.className("shopping_cart_link");

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void addFirstProductToCart() {
        driver.findElement(firstProductAddToCart).click();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
}
