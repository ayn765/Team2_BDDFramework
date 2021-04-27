package step_definition;

import collegePage.CollegePage;
import common.BaseAPI;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CollegePageStepsDefinition extends BaseAPI {

    CollegePage collegePage;

    //Background
    @Given("user is on college page")
    public void user_is_on_college_page() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickBetterMoneyTab();
        collegePage.navigateToCollegePage();

    }


   /**Feature file 1************************************------------------*****************************************
    * Scenario 1: verifying dept tab
   1-select financial assistance
   2-click paying back loan
 */
    @When("user hovers over dept tab")
    public void user_hovers_over_dept_tab() {
        CollegePage collegePage = new CollegePage();
        collegePage.hoverOverDepthTab();
    }

    @When("user selects finantial assistance from dept dropdown")
    public void user_selects_finantial_assistance_from_dept_dropdown() {
        CollegePage collegePage = new CollegePage();
        collegePage.selectFinancialAssistanceFromDeptDropDown();

    }

    @When("user selects paying off dept on finantial assistance page")
    public void user_selects_paying_back_loan_on_finantial_assistance_page() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickPayOffDept();
    }

    @Then("user is navigated to paying off dept information page")
    public void user_is_navigated_to_paying_off_dept_information_page() {
        CollegePage collegePage = new CollegePage();

        String actualAttributeValue = collegePage.payingOffDeptHeader.getAttribute("text");
        String expectedAttributeValue = "Learn how to manage debt, including credit cards";
//        System.out.println(actualAttributeValue);
//        System.out.println(expectedAttributeValue);

        org.testng.Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"Texts do not match");

    }
    /**Scenario 2
        hovers over home ownership tab
        selects home equity from home ownership dropdown
        clicks on mortgage basics tab
    */


    @When("user hovers over home ownership tab")
    public void user_hovers_over_home_ownership_tab() {
        CollegePage collegePage = new CollegePage();
        collegePage.hoverOverHomeOwnershipTab();
    }

    @When("user selects home equity from home ownership dropdown")
    public void user_selects_home_equity_from_home_ownership_dropdown() {
        CollegePage collegePage = new CollegePage();
        collegePage.homeEquityOption();
    }

    @When("user clicks on mortgage basics tab")
    public void user_clicks_on_mortgage_basics_tab() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickMortgageBasics();
    }

    @Then("user is navigated to mortgage options and tips page")
    public void user_is_navigated_to_mortgage_options_and_tips_page() {
        CollegePage collegePage = new CollegePage();

    }

    /* Scenario 3
    Auto loan tab
    1-select buying car
    2-click auto loan tips in buying car page
    */

    @When("user hovers over auto tab")
    public void user_hovers_over_auto_tab() {
        CollegePage collegePage = new CollegePage();
        collegePage.hoverOverAutoTab();

    }

    @When("user selects buying car from auto dropdown")
    public void user_selects_buying_car_from_auto_dropdown() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickBuyingCar();
    }

    @When("user clicks on auto loan tips")
    public void user_clicks_on_auto_loan_tips() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickAutoLoanTips();
    }

    @Then("user is navigated to auto loan tips page")
    public void user_is_navigated_to_auto_loan_tips_page() {
        CollegePage collegePage = new CollegePage();
        collegePage.clickAutoLoanTips();
        String expectedText="From interest rates to incentives, these factors c";
        String actualText=collegePage.autoLoanTipsHeader.getText();

        Assert.assertEquals(actualText,expectedText,"Texts do not much");

    }


    /** Feature file 2*******************************--------------------*************************************
     * Search for services
     *Scenario 1 // input bill pay
     */
    @When("user clicks on search Tab")
    public void user_clicks_on_search_tab() {
        CollegePage collegePage = new CollegePage();
      javaScriptExecutorClickOnElement(collegePage.searchTab);
    }

    @When("user input  bill pay in search bar")
    public void user_input_bill_pay_in_search_bar() {
        CollegePage collegePage = new CollegePage();
        sendKeysToElement(collegePage.searchBar, "bill pay");

    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        CollegePage collegePage = new CollegePage();
        collegePage.searchButton.click();
    }

    @Then("user is able to access payment options")
    public void user_is_able_to_access_payment_options() {
        CollegePage collegePage = new CollegePage();

        String actualAttributeValue = collegePage.billPaymentSearchResult.getAttribute("name");
        String expectedAttributeValue = "Search Module - Search Results - Result 1";
        System.out.println(actualAttributeValue);
        System.out.println(expectedAttributeValue);

        org.testng.Assert.assertEquals(actualAttributeValue,expectedAttributeValue,"Names do not match");

    }

    /**
     * Scenario 2
     * input open an account
     */

    @When("user input  open an account in search bar")
    public void user_input_open_an_account_in_search_bar() {
        CollegePage collegePage = new CollegePage();
        sendKeysToElement(collegePage.searchBar, "open an account");

    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        CollegePage collegePage = new CollegePage();
        mouseHoverJScript(collegePage.searchButton);
    }

    @Then("user is able to access process of opening an account")
    public void user_is_able_to_access_process_of_opening_an_account() {
        CollegePage collegePage = new CollegePage();
        Assert.assertTrue(isElementPresent(collegePage.openAnAccountResult));
    }

    /**
     * Scenario 3
     * select routing number from search drop down
     */

    @When("user selects routing number from search bar drop down")
    public void user_selects_routing_number_from_search_bar_drop_down() {
        CollegePage collegePage = new CollegePage();
       mouseHoverJScript(collegePage.selectRoutingNumber);
    }

    @Then("user is able to access routing number field")
    public void user_is_able_to_access_routing_number_field() {
        CollegePage collegePage = new CollegePage();

        String expectedText="Routing Numbers";
        String actualText= collegePage.routingResult.getText();
        Assert.assertEquals(expectedText,actualText,"Texts do not match");

    }


    /**
     * Scenario 4
     * select billing dispute from search drop down
     */
    @When("user selects billing dispute from search bar drop down")
    public void user_selects_billing_dispute_from_search_bar_drop_down() {
        CollegePage collegePage = new CollegePage();
        clickElement(collegePage.selectBillingDisputeFromSearchDropDown);
    }

    @Then("user is able to access billing dispute field")
    public void user_is_able_to_access_billing_dispute_field() {
        CollegePage collegePage = new CollegePage();
        Assert.assertTrue(isElementPresent(collegePage.billingDisputeHeader));



    }


    /**
     * Scenario 5
     * select erica from search drop down
     */

    @When("user selects erica from search bar drop down")
    public void user_selects_erica_from_search_bar_drop_down() {
        CollegePage collegePage = new CollegePage();
        clickElement(collegePage.selectEricaFromSearchDropDown);
    }

    @Then("user is able to access erica field")
    public void user_is_able_to_access_erica_field() {
        CollegePage collegePage = new CollegePage();
        String expectedText="Meet Erica, your virtual financial assistant.";
        String actualText= collegePage.ericaSearchResult.getText();
        Assert.assertEquals(expectedText,actualText,"Texts do not match");
    }
}
