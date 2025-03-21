package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators
    private By checkoutButton = By.id("checkout");
    private By removeButton = By.xpath("//button[contains(text(),'Remove')]");
    private By cartItem = By.className("cart_item");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void removeItem() {
        driver.findElement(removeButton).click();
    }

    public boolean isCartEmpty() {
        return driver.findElements(cartItem).isEmpty();
    }
}
