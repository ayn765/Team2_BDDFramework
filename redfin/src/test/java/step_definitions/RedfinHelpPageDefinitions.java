package step_definitions;

import common.BaseAPI;
import helpPage.RedfinHelpPage;
import homepage.RedfinHomepage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RedfinHelpPageDefinitions extends BaseAPI {

    RedfinHomepage redfinHomepage;
    RedfinHelpPage redfinHelpPage;

    @Given("user is on Redfin Help Page")
    public void user_is_on_Redfin_Help_Page() {
        redfinHomepage = new RedfinHomepage();
        redfinHelpPage = redfinHomepage.navigateToHelpPage();
    }

    @When("user types in {string} and press Enter")
    public void user_types_in_and_press_enter(String searchRequest) throws Exception {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.sendSearchRequest(searchRequest);
    }

    @Then("user receives accurate search result that correspond to {string}")
    public void user_receives_accurate_search_result_that_correspond_to(String searchRequest) {
        redfinHelpPage = new RedfinHelpPage();
        waitUntilWebElementVisible(redfinHelpPage.titleSearchResult);
        Assert.assertTrue(redfinHelpPage.titleSearchResult.getText().contains(searchRequest));
    }

    @Then("user clicks on each link and navigates to accurate page")
    public void user_clicks_on_each_link_and_navigates_to_accurate_page() throws Exception {
        redfinHelpPage = new RedfinHelpPage();
        Assert.assertTrue("User landed on a wrong page or the page title is incorrect.", redfinHelpPage.verifyPageTitles());
    }

    @When("user clicks on Submit A Request button")
    public void user_clicks_on_submit_a_request_button() {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.clickSubmitRequest();
    }

    @When("user chooses topic of request from dropdown menu")
    public void user_chooses_from_dropdown_menu() throws Exception {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.selectTopicOfRequest();
    }

    @When("user enters {string} into Your Email Address input field")
    public void user_enters_into_your_email_address_input_field(String emailAddress) {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.sendEmailAddress(emailAddress);
    }

    @When("user enters {string} into Subject field")
    public void user_enters_into_subject_field(String subject) {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.sendSubjectOfRequest(subject);
    }

    @When("user enters {string} into Description field")
    public void user_enters_test_description_into_description_field(String description) {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.sendDescriptionOfRequest(description);
    }

    @When("user add an attachment")
    public void user_add_an_attachment() {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.uploadFile();
    }

    @When("user submits the request")
    public void user_submits_the_request() {
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.submitCompletedRequest();
    }

    @Then("correct request confirmation is displayed")
    public void correct_request_confirmation_is_displayed() {
        redfinHelpPage = new RedfinHelpPage();
        waitUntilWebElementVisible(redfinHelpPage.requestConfirmation);
        Assert.assertTrue("The request was not submitted correctly.", redfinHelpPage.requestConfirmation.getText().contains("Your request was successfully submitted."));
    }
    @When("user types in {string} and selects on of the populated prompts")
    public void user_types_in_and_selects_on_of_the_populated_prompts(String request){
        redfinHelpPage = new RedfinHelpPage();
        redfinHelpPage.typeRequestAndSelectAPrompt(request);
    }


}
