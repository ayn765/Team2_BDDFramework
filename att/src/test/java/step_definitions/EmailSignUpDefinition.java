package step_definitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wirelessPage.ATTWirelessPage;

public class EmailSignUpDefinition extends BaseAPI {

    ATTWirelessPage attWirelessPage = new ATTWirelessPage();

    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
        implicitWait();

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

    @After
    public static void tearDown() {
        driver.close();
//        driver.quit();
    }

}
