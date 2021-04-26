package step_definition;

import chaseHomePage.ChaseHomePage;
import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class ChaseHomePageStepDefinition extends BaseAPI {
    ChaseHomePage chaseHomePage;


    @Given("User is on Chase website")
    public void user_is_on_chase_website() {
        System.out.println("navigate to chase website");
    }


    //Chase Coupon
    @When("User clicks on Open an account")
    public void user_clicks_on_open_an_account() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.openAccount);

    }

    @When("User input {string} in email box")
    public void user_input_in_email_box(String email) {
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.inputEmailAddress(email);
    }

    @When("User clicks on email account")
    public void user_clicks_on_email_account() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.coupon);
    }

    @Then("User should see a text to verify his email")
    public void user_should_see_a_text_to_verify_his_email() {
        chaseHomePage = new ChaseHomePage();
        String actualText = getTextFromElement(chaseHomePage.message);
        Assert.assertEquals(actualText, "");
    }

    @Then("User clicks on close button")
    public void user_clicks_on_close_button() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.close);
    }

    @Then("User navigate back t the home page")
    public void user_navigate_back_t_the_home_page() {
        chaseHomePage = new ChaseHomePage();
        driver.navigate().back();
        driver.navigate().refresh();
    }
    //Find Advisor
    @When("User clicks on ATM&Branch")
    public void user_clicks_on_atm_branch() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.atmLink);
    }
    @When("User clicks on Find advisor link")
    public void user_clicks_on_find_advisor_link() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.findAdvisor);
    }
    @When("User input {string} in search bar")
    public void user_input_in_search_bar(String advisorName) {
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.inputAdvisor(advisorName);
    }
    @When("User clicks on search")
    public void user_clicks_on_search() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.searchButton);
    }
    @Then("User will have the list of  all the advisors")
    public void user_will_have_the_list_of_all_the_advisors(String expectedName) {
        chaseHomePage = new ChaseHomePage();
        String actual=chaseHomePage.advisor.getText();
        Assert.assertEquals(actual,expectedName,"names do not match");
    }

  //Connect with advisor
    @When("User clicks on Connect with Advisor link")
    public void user_clicks_on_connect_with_advisor_link() {
    chaseHomePage = new ChaseHomePage();
    clickElement(chaseHomePage.connectWithAdvisor);
}
    @When("User input {string} in search box")
    public void user_input_in_search_box(String key) {
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.inputSearch(key);
    }
    @When("User clicks on amount drop down")
    public void user_clicks_on_amount_drop_down() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.rangeDropDown);
    }
    @When("User clicks range in Amount range drop down")
    public void user_clicks_range_in_amount_range_drop_down() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.range);
    }
    @When("User clicks on next button")
    public void user_clicks_on_next_button() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.nextButton);
    }
    @Then("User should navigate to all done window")
    public void user_should_navigate_to_all_done_window(String expectedText) {
        chaseHomePage = new ChaseHomePage();
        String actual=chaseHomePage.finishedProcess.getText();
        Assert.assertEquals(actual,expectedText);
    }

    //Content Chase home page
     //Scenario1
    @When("User hover over open an account")
    public void user_hover_over_open_an_account() {
    chaseHomePage = new ChaseHomePage();
    hoverOverElement(chaseHomePage.openAnAccount);
}
    @Then("User should access all the links")
    public void User_should_access_all_the_links() {
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.getAllLinksTitle();
    }
    //Scenario2
    @When("User clicks on see all")
    public void user_clicks_on_see_all() {
        chaseHomePage = new ChaseHomePage();
        waitUntilWebElementInvisible(chaseHomePage.seeAll);
        clickElement(chaseHomePage.seeAll);}

    @Then("User navigate to a new page that has all the links and details")
    public void user_navigate_to_a_new_page_that_has_all_the_links_and_details() {
        chaseHomePage = new ChaseHomePage();
        Assert.assertEquals(chaseHomePage.headerPage.getText(),"Chase.com sitemap");
    }
    //Scenario3
    @When("User clicks on Language tab English")
    public void user_clicks_on_language_tab_english() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.englishTab);
    }
    @When("User clicks on tab Espanol")
    public void user_clicks_on_tab_espanol() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.spanishTab);
    }
    @Then("User should see all the page in Spanish")
    public void user_should_see_all_the_page_in_spanish() {
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.checkTheLanguage();
    }
   //Scenario4
   @When("User clicks on Linkedin Icon")
   public void user_clicks_on_linkedin_icon() {
       chaseHomePage = new ChaseHomePage();
       clickElement(chaseHomePage.linkedInIcon);
   }
    @When("User clicks on Proceed button")
    public void user_clicks_on_proceed_button() {
        chaseHomePage = new ChaseHomePage();
        clickElement(chaseHomePage.proceedButton);
    }
    @When("User switch to a new window")
    public void user_switch_to_a_new_window(){
        chaseHomePage = new ChaseHomePage();
        chaseHomePage.switchToNewWindow();
    }
    @Then("User should navigate to LinkedIn website")
    public void user_should_navigate_to_LinkedIn_website() {
        chaseHomePage = new ChaseHomePage();
        String actual=chaseHomePage.getCurrentPageUrl();
        Assert.assertEquals(actual,"https://www.linkedin.com/company/chase?trk=company_logo");
    }


}