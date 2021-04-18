package step_definitions;

import common.BaseAPI;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import wirelessPage.ATTWirelessPage;

public class SignInDefinitions extends BaseAPI {

    ATTWirelessPage attWirelessPage = new ATTWirelessPage();

    @Before
    public void setUp() {

        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);

    }

    @Given("user is on AT&T wireless page")
    public void user_is_on_the_main_page() {

        driver.get("https://att.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
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
        Assert.assertEquals(expectedMessage, attWirelessPage.errorMessageSignIn.getText(), "The error message is not displayed correctly.");
    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

}
