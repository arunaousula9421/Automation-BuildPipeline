package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arun on 29/03/2018.
 */
public class SearchPage extends PageObject {

    @FindBy(id = "search-title")
    private WebElement searchPageTitle;

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public String getPageTitle(){
        return searchPageTitle.getText();
    }

}
