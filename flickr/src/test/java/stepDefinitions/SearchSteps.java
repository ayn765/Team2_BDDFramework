package stepDefinitions;
import common.BaseAPI;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import searchScreen.SearchScreen;

import java.util.List;

public class SearchSteps extends BaseAPI {

    SearchScreen searchScreen;

    @Before
    public void setUp() {

        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);

    }

    @Given("User is on Search Screen$")
    public void userIsOnSearchScreen()  {
        searchScreen = new SearchScreen();
        driver.get("https://flickr.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        searchScreen.waitForSearchScreen();
    }

    @When("User Search for a text in Search Screen")
    public void userSearchForATextInSearchScreen(String searchText) {
        searchScreen = new SearchScreen();
        searchScreen.searchForImagesByKeyword(searchText);
    }

    @Then("Search results should display for search criteria")
    public void searchResultsShouldDisplayForSearchCriteria(String searchText) {
        searchScreen = new SearchScreen();
        List<String> searchResponse = getSearchScreen(searchText);
        Assert.assertTrue(searchScreen.getSearchResults(searchText).equals(searchResponse));
    }


}