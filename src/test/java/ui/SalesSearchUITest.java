package ui;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;
import steps.HomePageUISteps;
import steps.SearchPageUISteps;

/**
 * Created by arun on 29/03/2018.
 */
@RunWith(SerenityRunner.class)
public class SalesSearchUITest {

    @Managed
    WebDriver driver;

    @Steps
    HomePageUISteps homePageUISteps;
    SearchPage searchPage;


    @Test
    @WithTag(type = "type", name ="UI")
    public void validateSearchPage(){

        homePageUISteps.clickSalesCategory();

        Assert.assertEquals("Properties for Sale in Ireland", searchPage.getPageTitle());


    }
}
