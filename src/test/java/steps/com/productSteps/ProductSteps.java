package steps.com.productSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.com.productPages.ProductLoginPage;
import pages.com.productPages.ProductOrderPage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;

public class ProductSteps {

    WebDriver driver;
    ProductLoginPage productLoginPage;
    ProductOrderPage productOrderPage;

    @Given("the user navigates product website home page")
    public void the_user_navigates_product_website_home_page() {
        driver = Driver.getDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        productLoginPage = new ProductLoginPage(driver);
        productLoginPage.login(ConfigReader.getProperty("productUsername"),ConfigReader.getProperty("productPassword"));
    }
    @When("the user enter the product info {string} and {string}")
    public void the_user_enter_the_product_info_and(String productName, String quantity) {
        productOrderPage = new ProductOrderPage(driver);
        productOrderPage.clickOrder();
        productOrderPage.sendProductInfo(productName, quantity);
    }
    @When("the user enters the address info {string}, {string}, {string}, {string}, {string}")
    public void the_user_enters_the_address_info(String customerName, String street, String city, String state, String zipcode) {
        productOrderPage.sendAddressInfo(customerName, street, city, state, zipcode);
    }
    @When("the user enter the card info {string}, {string}, {string}")
    public void the_user_enter_the_card_info(String cardType, String cardNumber, String expireDate) {
        productOrderPage.sendPaymentInfo(cardType, cardNumber, expireDate);
        productOrderPage.clickProcess();
    }
    @When("the user validate success message")
    public void the_user_validate_success_message() {
        String actualMessage = productOrderPage.getMessageText();
        Assert.assertEquals("New order has been successfully added.",actualMessage);
    }

    @Then("the user validate product details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_validate_product_details(String productName, String quantity, String name, String street, String city, String state, String zipcode, String cardType, String cardNumber, String expireDate) {
        productOrderPage.clickAllOrder();
        List<WebElement> detail = productOrderPage.productInfo;
        Assert.assertEquals(detail.get(1).getText().trim(), name);
        Assert.assertEquals(detail.get(2).getText().trim(), productName);
        Assert.assertEquals(detail.get(3).getText().trim(), quantity);
        Assert.assertEquals(detail.get(5).getText().trim(), street);
        Assert.assertEquals(detail.get(6).getText().trim(), city);
        Assert.assertEquals(detail.get(7).getText().trim(), state);
        Assert.assertEquals(detail.get(8).getText().trim(), zipcode);
        Assert.assertEquals(detail.get(9).getText().trim(), cardType);
        Assert.assertEquals(detail.get(10).getText().trim(), cardNumber);
        Assert.assertEquals(detail.get(11).getText().trim(), expireDate);

    }


}
