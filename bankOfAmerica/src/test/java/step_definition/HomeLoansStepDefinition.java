package step_definition;

import common.BaseAPI;
import homeLoansPage.HomeLoansPage;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class HomeLoansStepDefinition extends BaseAPI {
    HomeLoansPage homeLoansPage;


    @Given("User is on BankOfAmerica page")
    public void user_is_on_bank_of_america_page() {
        System.out.println("navigate to bankOfAmerica website");
    }
    @When("User clicks on HomeLoans")
    public void user_clicks_on_home_loans() {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.navigateToHomeLoans();
    }


    //Search New Construction
    @When("User clicks on Find Home Links")
    public void user_clicks_on_find_home_links() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.findHome);
    }
    @When("User clicks on New Construction")
    public void user_clicks_on_new_construction() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.newConstruction);
    }
    @When("User switch to a new window")
    public void user_switch_to_a_new_window() {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.switchToNewWindow();
    }
    @When("user clicks on Ohio")
    public void user_clicks_on_ohio() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.homeOhio);
    }
    @When("User clicks Columbus")
    public void user_clicks_columbus() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.homeOhioColumbus);
    }
    @When("User select to filter houses by price")
    public void user_select_to_filter_houses_by_price() {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.filterSearch();
    }
    @Then("User can find how many new construction Houses")
    public void user_can_find_how_many_new_construction_houses() {
        homeLoansPage=new HomeLoansPage();
        String actual=homeLoansPage.resultSearch.getText();
        Assert.assertEquals(actual,"6 new home communities found");
    }


    //Search Houses By Value
    @When("User clicks on Value tab")
    public void user_clicks_on_value_tab() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.buttonValue);
    }

    @When("User input {string} in search box")
    public void user_input_in_search_box(String address) {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.searchAddressHouse(address);
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        homeLoansPage=new HomeLoansPage();
        javaScriptExecutorClickOnElement(homeLoansPage.searchButton);
    }
    @Then("user should see {string} to the left of the house picture")
    public void user_should_see_to_the_left_of_the_house_picture(String expectedAddress) {
        homeLoansPage=new HomeLoansPage();
        String actualAddress=homeLoansPage.getFullAddress();
        Assert.assertEquals(actualAddress,expectedAddress.toUpperCase(),"Address do not match");
    }

    //Search Houses By zip Code
    @Then("User should see {string} in filter tag next to search bar in the new open window")
    public void user_should_see_in_filter_tag_next_to_search_bar_in_the_new_open_window(String search) {
        homeLoansPage=new HomeLoansPage();
        String actualZipFilter=homeLoansPage.zipResult.getText();
        Assert.assertEquals(actualZipFilter,search,"Zip Code do not match");
    }
    //Appointment
    @When("User clicks on Schedule appointment link")
    public void user_clicks_on_schedule_appointment_link() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.scheduleAppt);
    }
    @When("User clicks on Learn more about scheduling link")
    public void user_clicks_on_learn_more_about_scheduling_link() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.stepsAppt);
    }
    @When("User switch to a new tab")
    public void user_switch_to_a_new_tab() {
        homeLoansPage=new HomeLoansPage();
        homeLoansPage.switchToNewTab(1);
    }
    @When("User clicks on continue button on the tab")
    public void user_clicks_on_continue_button_on_the_tab() {
        homeLoansPage=new HomeLoansPage();
        clickElement(homeLoansPage.continueButton);
    }
    @Then("User can access and watch steps to schedule video")
    public void user_can_access_and_watch_steps_to_schedule_video() {
        homeLoansPage=new HomeLoansPage();
       boolean actual=homeLoansPage.isVideoDisplayed();
       Assert.assertEquals(actual,true);
    }

}
