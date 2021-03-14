package steps.com.epaySteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.com.ebaypages.EbayHomePage;
import pages.com.ebaypages.EbaySearchResultsPage;
import utils.ConfigReader;
import utils.Driver;

import static utils.Driver.getDriver;

public class EbaySearchSteps {
    WebDriver driver;
    EbayHomePage ebayHomePage;
    EbaySearchResultsPage ebaySearchResultsPage;

    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() {
        driver = Driver.getDriver();
        getDriver().get("https://ebay.com");
    }

    @When("user searches for iMac 2020")
    public void user_searches_for_i_mac() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.searchBox.sendKeys(ConfigReader.getProperty("searchValue"));
        ebayHomePage.searchButton.click();

    }

    @Then("user sees result about iMac only")
    public void user_sees_result_about_i_mac_only() {
        ebaySearchResultsPage = new EbaySearchResultsPage(driver);
        for (WebElement link: ebaySearchResultsPage.listOfLinks){
            System.out.println(link.getText());
        }
    }

    @Then("there are more than 3 pages of results")
    public void there_are_more_than_pages_of_results() {
        ebaySearchResultsPage = new EbaySearchResultsPage(driver);
        int actualPageNumber = ebaySearchResultsPage.pages.size();
        Assert.assertTrue(actualPageNumber > 3);
    }

}
