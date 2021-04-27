package step_definition;

import common.BaseAPI;
import homeLoansPage.HomeLoansPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeLoansDefinitionSteps extends BaseAPI{
    HomeLoansPage homeLoansPage=new HomeLoansPage();
    @When("user click on button HomeLoans")
    public void user_click_on_button_home_loans() {
homeLoansPage.clickHomeLoansButton();
    }
    @When("user click on Home loans button")
    public void user_click_on_home_loans_button() {
homeLoansPage.clickAtmBranchButton();
    }
    @When("user inputs {string} in input location in the search zipCodeBox")
    public void user_inputs_in_input_location_in_the_search_zip_code_box(String  ZipCode) {
homeLoansPage.sendKeysToZipCodeBox( ZipCode);
    }
    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {
        homeLoansPage.clickSearchButton();

    }
    @Then("user should get the all the adress of ATM nearBy.")
    public void user_should_get_the_all_the_adress_of_atm_near_by() {
homeLoansPage.getTextExpected();
Assert.assertEquals(homeLoansPage.getTextExpected(),"Find a Chase ATM or branch near you");
    }



}
