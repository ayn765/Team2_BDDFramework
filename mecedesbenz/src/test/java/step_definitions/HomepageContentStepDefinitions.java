package step_definitions;

import homepage.MercedesBenzHomepage;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class HomepageContentStepDefinitions {

    MercedesBenzHomepage mercedesBenzHomepage;

    @Given("user clicks the play to view the video")
    public void user_clicks_the_play_to_view_the_video() throws Exception {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.playVideo();
    }
    @Then("video is playing")
    public void video_is_playing(){
        mercedesBenzHomepage = new MercedesBenzHomepage();
        String expectedAttribute = "playing";
        Assert.assertEquals("The video is not playing or cannot be found.", expectedAttribute, mercedesBenzHomepage.videoControl.getAttribute("data-play-state"));
    }
    @Then("video is paused")
    public void video_is_paused() throws Exception {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        String expectedAttribute = "paused";
        mercedesBenzHomepage.pauseVideo();
        Assert.assertEquals("The video is not paused or cannot be found.", expectedAttribute, mercedesBenzHomepage.videoControl.getAttribute("data-play-state"));
    }
    @Given("user clicks on account button and register")
    public void user_clicks_on_account_button_and_register() {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.register();
    }
    @When("user enters {string} into email address field")
    public void user_enters_into_email_address_field(String emailAddress) {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.enterEmailAddress(emailAddress);
    }
    @When("user enters {string} into first name field")
    public void user_enters_into_first_name_field(String firstName) {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.enterFirstName(firstName);
    }
    @When("user enters {string} into last name field")
    public void user_enters_into_last_name_field(String lastName) {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.enterLastName(lastName);
    }
    @When("user enters {string} into password field")
    public void user_enters_into_password_field(String password) {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.enterPassword(password);
    }
    @When("user check terms checkbox and clicks Create Account")
    public void user_check_terms_checkbox_and_clicks_create_account() {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        mercedesBenzHomepage.agreeToTermsAndSubmit();
    }
    @Then("users {string} is displayed in the body of the confirmation message")
    public void users_is_displayed_in_the_body_of_the_confirmation_message(String emailAddress) {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        Assert.assertTrue(mercedesBenzHomepage.messageEmailSignUp.getText().contains(emailAddress));
    }
    @Then("user clicks each links in Shopping Tools Section and lands on the correct page for each link")
    public void user_clicks_each_links_in_shopping_tools_section_and_lands_on_the_correct_page_for_each_link() throws Exception {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        Assert.assertTrue("The tiles of the pages are displayed incorrectly.", mercedesBenzHomepage.verifyLinksTitles());
    }

    @Then("titles of the articles in Spotlight Section are displayed correctly")
    public void titles_of_the_articles_in_Spotlight_Section_are_displayed_correctly() throws Exception {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        Assert.assertTrue("The titles of the articles are displayed incorrectly.", mercedesBenzHomepage.verifyHeadersSpotlight());
    }

    @Then("text of the articles in Spotlight Section are displayed correctly")
    public void text_of_the_articles_in_Spotlight_Section_are_displayed_correctly() throws Exception {
        mercedesBenzHomepage = new MercedesBenzHomepage();
        Assert.assertTrue("The titles of the articles are displayed incorrectly.", mercedesBenzHomepage.verifyTextSpotLight());
    }
}
