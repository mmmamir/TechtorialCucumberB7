package steps.com.duckduckgoSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.com.duckduckgopages.DuckDuckGoHomePage;
import pages.com.duckduckgopages.DuckDuckGoSearchResultPage;
import utils.Driver;

public class DuckDuckGoSearchSteps {

    WebDriver driver;
    DuckDuckGoHomePage duckDuckGoHomePage;
    DuckDuckGoSearchResultPage duckDuckGoSearchResultPage;

    @Given("user is on duckduckgo home page")
    public void user_is_on_duckduckgo_home_page() {
        driver = Driver.getDriver();
        driver.get("http://www.DuckDuckGo.com");
    }

    @When("user searches for selenium")
    public void user_searches_for_selenium() {
        duckDuckGoHomePage = new DuckDuckGoHomePage(driver);
        duckDuckGoHomePage.searchBox1.sendKeys("Selenium");
        duckDuckGoHomePage.searchButton1.click();
    }

    @Then("user sees result about selenium only")
    public void user_sees_result_about_selenium_only() {
        duckDuckGoSearchResultPage = new DuckDuckGoSearchResultPage(driver);
        for(WebElement links: duckDuckGoSearchResultPage.listOfSelenium){
            String listOfLink = links.getText();
            System.out.println(listOfLink);
            Assert.assertTrue(listOfLink.contains("Selenium")||listOfLink.contains("SELENIUM"));
        }
    }
}
