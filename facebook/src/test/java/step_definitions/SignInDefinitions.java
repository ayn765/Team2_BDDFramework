package step_definitions;

import common.BaseAPI;
import facebookSignInPage.FacebookSignIn;
import io.cucumber.java.en.*;

public class SignInDefinitions extends BaseAPI{

    FacebookSignIn facebookSignIn;

    @Given("User navigates to FACEBOOK.COM")
    public void user_navigates_to_facebook_com() {
        driver.get("https://facebook.com/");

    }
    @When("user enters email as {string} and Password {string}")
    public void user_enters_email_as_and_password(String email, String password) {
       facebookSignIn = new FacebookSignIn();
       facebookSignIn.clickEmail();
       facebookSignIn.EmailButton.sendKeys(email);

       facebookSignIn.clickPassword();
       facebookSignIn.PasswordButton.sendKeys(password);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        facebookSignIn = new FacebookSignIn();
        facebookSignIn.clickLogin();
    }
    @Then("login should be successful")
    public void login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

