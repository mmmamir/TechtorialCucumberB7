package pages.com.duckduckgopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckGoHomePage {

    public DuckDuckGoHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "search_form_input_homepage")
    public WebElement searchBox1;

    @FindBy(id = "search_button_homepage")
    public WebElement searchButton1;

}
