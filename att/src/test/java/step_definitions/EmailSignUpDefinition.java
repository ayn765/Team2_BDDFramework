package step_definitions;

import common.BaseAPI;
import io.cucumber.java.en.*;
import org.junit.Assert;
import wirelessPage.ATTWirelessPage;

public class EmailSignUpDefinition extends BaseAPI {

    ATTWirelessPage attWirelessPage = new ATTWirelessPage();


    @Given("user is on AT&T wireless page")
    public void user_is_on_the_main_page() {

        driver.get("https://www.att.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @When("user enters {string} into input field")
    public void user_enters_into_input_field(String string) {
        attWirelessPage = new ATTWirelessPage();
        sendKeysToElement(attWirelessPage.inputEmail, string);

    }

    @When("user clicks Sign me up")
    public void user_clicks_Sign_me_up() {
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.buttonSighUp);
    }

    @Then("confirmation message is displayed indicating that user is successfully signed up")
    public void confirmation_message_is_displayed_indicating_that_user_is_successfully_signed_up() {
        String expectedMessage = "Thank you! Your email has been successfully submitted.";
        Assert.assertEquals("The message is incorrect or is not displayed.", expectedMessage, attWirelessPage.messageEmailConfirmation.getText());
    }

    @When("user clicks on Account tab")
    public void user_clicks_on_account_tab() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.signIn();
    }

    @When("user enters {string}")
    public void user_enters(String string) {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.enterUserID(string);
    }

    @When("user enters invalid {string}")
    public void user_enters_invalid(String string) {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.enterPassword(string);
    }

    @When("user clicks Sign In")
    public void user_clicks_sign_in() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.doSignIn();
    }

    @Then("user is not allowed to sign in and the error message is displayed")
    public void user_is_not_allowed_to_sign_in_and_the_error_message_is_displayed() {
        attWirelessPage = new ATTWirelessPage();
        waitUntilWebElementVisible(attWirelessPage.errorMessageSignIn);
        String expectedMessage = "Double check your ID and password, and try again. If you haven't set up your account, tap the 'Create one now' link.";
        org.testng.Assert.assertEquals(expectedMessage, attWirelessPage.errorMessageSignIn.getText(), "The error message is not displayed correctly.");
    }

}
