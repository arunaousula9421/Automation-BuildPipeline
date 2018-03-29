package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arun on 29/03/2018.
 */
public class HomePage extends PageObject {

    @FindBy(xpath = "//ul[@class='linkbar']/li/a[text()='For Sale']")
    private WebElement salesCategory;

    public HomePage(WebDriver driver){
        super(driver);
        open();
    }

    public void tapSalesCategory(){
        salesCategory.click();
    }

}
