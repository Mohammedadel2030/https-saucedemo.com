package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.BaseTest;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart("Sauce Labs Backpack");

        CartPage cartPage = new CartPage(driver);
        cartPage.goToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutDetails("John", "Doe", "12345");
        checkoutPage.completeCheckout();

        Assert.assertTrue(checkoutPage.isOrderSuccessful(), "Order was not successful!");
    }
}
