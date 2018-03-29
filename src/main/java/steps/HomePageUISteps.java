package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

/**
 * Created by arun on 29/03/2018.
 */
public class HomePageUISteps  {

    public HomePage homePage;

    @Step
    public void clickSalesCategory(){
        homePage.tapSalesCategory();
    }
}
