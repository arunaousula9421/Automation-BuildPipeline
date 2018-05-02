package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arun on 29/03/2018.
 */
public class SearchPage extends PageObject {

    @FindBy(xpath = "//*[@id='search-title']")
    private WebElement searchPageTitle;


    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchBtn;

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public String getPageTitle(){
        String pageTitle = searchPageTitle.getText();
        return pageTitle;
    }


    public void clickSearchBtn(){
        searchBtn.click();
    }



}
