package step_definitions;

import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.asserts.SoftAssert;
import wirelessPage.ATTWirelessPage;


public class IPhone12DetailsDefinitions extends BaseAPI {

    ATTWirelessPage attWirelessPage;


    @When("user clicks on iPhone 12 Max to navigate to details")
    public void user_clicks_on_i_phone_12_max_to_navigate_to_details() {
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.buttonShopIPhone12);
    }

    @When("user clicks on radio button to select a color")
    public void user_clicks_on_radio_button_to_select_a_color() {
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.radiobuttonGold);
    }

    @When("user selects capacity")
    public void user_selects_capacity() {
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.buttonStorage256);

    }

    @When("user selects pricing option")
    public void user_selects_pricing_option(){
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.buttonFullPrice);
    }

    @When("user clicks continue to proceed to purchase")
    public void user_clicks_continue_to_proceed_to_purchase() {
        attWirelessPage = new ATTWirelessPage();
        clickElement(attWirelessPage.buttonContinueWithIPhone12);
    }

    @Then("user is given options to upgrade account or add a line")
    public void user_is_given_options_to_upgrade_account_or_add_a_line() {
        attWirelessPage = new ATTWirelessPage();
        SoftAssert softAssert = new SoftAssert();
        implicitWait();
        softAssert.assertTrue(attWirelessPage.buttonAddLine.isDisplayed());
        softAssert.assertTrue(attWirelessPage.buttonUpgradeDevice.isDisplayed());
        softAssert.assertAll();

    }
}
