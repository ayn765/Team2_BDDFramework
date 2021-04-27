package step_definition;

import common.BaseAPI;
import findHomePage.FindHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindHomeStepDefinition extends BaseAPI {

    FindHomePage findHomePage;

    @Given("user is on find home page")
    public void user_is_on_find_home_page() {
        findHomePage = new FindHomePage();
        findHomePage.navigateToFindFindHomePage();
   }

    @When("user types in town {string}")
    public void user_types_in_town(String town) {
        findHomePage = new FindHomePage();
       findHomePage.inputTownInSearchBar(town);
    }
    @When("user types in state {string}")
    public void user_types_in_state(String state) {
        findHomePage = new FindHomePage();
       findHomePage.inputStateInSearchBar(state);

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        findHomePage = new FindHomePage();
        findHomePage.clickSearchButton();
    }
    @Then("user is navigated to homes search result")
    public void user_is_navigated_to_homes_search_result() {
        findHomePage = new FindHomePage();
        String expectedText="Philadelphia, PA Homes For Sale & Real Estate";
        String actualText=findHomePage.townStateSearchHeader.getText();
        Assert.assertEquals(expectedText,actualText);
    }


    @When("user types in zipcode {string} bar")
    public void user_types_in_zipcode_bar(String zipcode) {
        findHomePage = new FindHomePage();
        findHomePage.inputZipcode(zipcode);
    }

    @Then("user is navigated to search homes result page")
    public void user_is_navigated_to_search_homes_result_page() {
        findHomePage = new FindHomePage();
        String expectedText = "Homes For Sale & Real Estate in 19525";
        String actualText = findHomePage.zipcodeSearchHeader.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    /**************************************--------------------*********************************************************************************
     * Search number of rooms
     * Feature 2
     *
     */

    @When("user clicks on all beds dropdown")
    public void user_clicks_on_all_beds_dropdown() {
        findHomePage = new FindHomePage();
        findHomePage.clickAllBedsDropdown();

    }

    @When("user selects the number of bedrooms {string} in the house")
    public void user_selects_the_number_of_bedrooms_in_the_house( String numBedrooms) {
                findHomePage = new FindHomePage();
                findHomePage.selectNumberOfBedrooms(numBedrooms);

    }

    @Then("user is lands in  search homes result page")
    public void user_is_lands_in_search_homes_result_page() {
        findHomePage = new FindHomePage();
        Assert.assertTrue(isElementPresent(findHomePage.sortResult));


    }



}
