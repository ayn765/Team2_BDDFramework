package stepDefinitions;

import common.BaseAPI;
import expediaHomePage.ExpediaHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class HomePageTest extends BaseAPI {

    ExpediaHomePage expediaHomePage;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Demo1"); // ... and embed it in the report.
        }
    }

    @Given("User is at Expedia home page")
    public void i_am_at_expedia_home_page() throws IOException {
        driver.get("https://www.expedia.com/");

    }
    @When("User clicks on stay Button")
    public void i_click_on_stay_button() {
        expediaHomePage.stayWeb();
    }
    @Then("User selects the location value NewYork")
    public void i_enter_value_on_the_going_to_search_box() {
        expediaHomePage.goingToSearch();
        expediaHomePage.goingTo();
    }
    @When("User enters value on the going to search box")
    public void i_select_the_location_value_new_york() {
        expediaHomePage.selectLocation();
    }

    @Then("User clicks on search")
    public void i_click_on_search() {
        expediaHomePage.searchButton();

    }
    @Then("User enters value on the leaving from search box")
    public void i_enter_value_on_the_leaving_from_search_box() {

    }
    @When("User clicks on Cruise button")
    public void i_click_on_cruise_button() {
        expediaHomePage.cruiseWeb();
    }

    @Then("User clicks on Going To box")
    public void i_click_on_going_to_box() {
        expediaHomePage.searchGoingWeb();
    }
    @When("User clicks More Travel")
    public void i_click_more_travel() {
        expediaHomePage.moreTravel();
    }

    @Then("User selects Packages")
    public void i_select_packages() {
        expediaHomePage.packages();
    }

}
