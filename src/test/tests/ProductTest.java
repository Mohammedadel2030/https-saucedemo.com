package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import utils.BaseTest;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductDetails() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isProductDisplayed("Sauce Labs Backpack"), "Product not found!");
    }
}
