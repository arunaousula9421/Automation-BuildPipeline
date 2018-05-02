package steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.SearchPage;



/**
 * Created by arun on 29/03/2018.
 */
public class SearchPageUISteps {


    public SearchPage searchPage;


    @Step
    public void verifySearchPageHeader(){
        Assert.assertEquals("Properties for Sale in Ireland", searchPage.getPageTitle());
    }

    @Step
    public void clickSearchBtn(){
        searchPage.clickSearchBtn();
    }
}
