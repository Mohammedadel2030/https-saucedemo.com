package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.stream.Collectors;

public class InventoryPage {
    private WebDriver driver;

    // Locators
    private By productTitles = By.className("inventory_item_name");
    private By sortDropdown = By.className("product_sort_container");

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public List<String> getAllProductNames() {
        return driver.findElements(productTitles)
                .stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }

    public void selectSortOption(String option) {
        driver.findElement(sortDropdown).sendKeys(option);
    }
}
