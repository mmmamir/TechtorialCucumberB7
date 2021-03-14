package pages.com.duckduckgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DuckDuckGoSearchResultPage {

    public DuckDuckGoSearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='result__a']")
    public List<WebElement> listOfSelenium;

}
