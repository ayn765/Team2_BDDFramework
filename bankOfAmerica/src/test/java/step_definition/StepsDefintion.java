package step_definition;

import homePageBankOfAmerica.HomePageBankOfAmerica;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class StepsDefintion {
    HomePageBankOfAmerica homePageBankOfAmerica=new HomePageBankOfAmerica();
//****SingIn.feature****//////
    @Given("user is at Bank Of  America home page")
    public void user_is_at_bank_of_america_home_page() {

    }

    @When("user click on input bar")
    public void user_click_on_input_bar() {
        homePageBankOfAmerica.clickOnInputbox();


    }

    @When("user inputs {string} in input box Online ID")
    public void user_inputs_in_input_box_online_id(String string) {
        homePageBankOfAmerica.sendKeysIDBox("kjjhg@");

    }

    @When("user inputs {string} in input box PassCode")
    public void user_inputs_in_input_box_pass_code(String string) {
       homePageBankOfAmerica.sendKeysPasswordBox("lkkoi");
    }

    @When("user clicks on Sing in button")
    public void user_clicks_on_sing_in_button() {
        homePageBankOfAmerica. clickSingInButton();

    }

    @Then("user should have an error message")
    public void user_should_have_an_error_message() {
        homePageBankOfAmerica.getError();
    }


    /////////*******location.feature***//////
@When("user click on Find Atm button")
public void user_click_on_find_atm_button() {
homePageBankOfAmerica.navigateToLocation();
}

    @When("user inputs {string} in input location box")
    public void user_inputs_in_input_location_box(String string) {
homePageBankOfAmerica.sendKeysToLocationBar("18074");
    }

    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {
        homePageBankOfAmerica.clickOnSearchButton();

    }

    @Then("user should get the adress")
    public void user_should_get_the_adress() {
        homePageBankOfAmerica.getTheLocation();

    }
//******credit Card option******
   @When("user click on Credit Card button")
   public void user_click_on_credit_card_button() {
homePageBankOfAmerica.navigateToCridtCardPage();
}

    @When("user click point Reward card button")
    public void user_click_point_reward_card_button() {
homePageBankOfAmerica.clickRewardCard();
    }

    @Then("user should get the option to get the point")
    public void user_should_get_the_option_to_get_the_point() {
homePageBankOfAmerica.getExpectedTextRewrdCard();
    }

    @When("user click  student card")
    public void user_click_student_card() {
homePageBankOfAmerica.clickStudentCard();
    }

    @Then("user get all credit card option for students")
    public void user_get_all_credit_card_option_for_students() {
homePageBankOfAmerica.getExpectedTextStudentCard();
    }

    @When("user click lower Interest card")
    public void user_click_lower_interest_card() {
        homePageBankOfAmerica.clickLowerInterstCard();

    }

    @Then("user get all the option of the lower interest card")
    public void user_get_all_the_option_of_the_lower_interest_card() {
homePageBankOfAmerica.getExpectedTextLowerInterstCard();
    }







}
