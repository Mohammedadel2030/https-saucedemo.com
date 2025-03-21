package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {
    private WebDriver driver;

    // Locators
    private By confirmationMessage = By.className("complete-header");

    // Constructor
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
