package steps_definitions;

import common.BaseAPI;
import espnHomePage.EspnHomePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class EspnHomePageStepDefinition extends BaseAPI{
    EspnHomePage espnHomePage;

    @Given("User is on Espn website")
    public void user_is_on_espn_website() {
        System.out.println("user navigated to Espn website");
    }

    //Subscribe Espn
    @When("user clicks on subscribe now")
    public void user_clicks_on_subscribe_now() {
       espnHomePage=new EspnHomePage();
       clickElement(espnHomePage.signUpLink);
    }
    @When("user input {string} in first name box")
    public void user_input_in_first_name_box(String firstName) {
        espnHomePage=new EspnHomePage();
        espnHomePage.inputFname(firstName);
    }
    @When("User input {string} in last name box")
    public void user_input_in_last_name_box(String lastName) {
        espnHomePage=new EspnHomePage();
        espnHomePage.inputLname(lastName);
    }
    @When("user input {string} in email box")
    public void user_input_in_email_box(String email) {
        espnHomePage=new EspnHomePage();
        espnHomePage.inputEmail(email);
    }
    @When("user input {string} in password box")
    public void user_input_password_in_password_box(String password) {
        espnHomePage=new EspnHomePage();
        espnHomePage.inputPassword(password);
    }
    @When("user clicks on show password check box")
    public void user_clicks_on_show_password_check_box() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.showPassword);
    }

    @When("user clicks on ESPN, ESPN+ and The Walt Disney Family of Companies")
    public void user_clicks_on_espn_espn_and_the_walt_disney_family_of_companies() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.disneyCheckBox);
    }
    @When("user clicks on sign up")
    public void user_clicks_on_sign_up() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.signUpButton);
    }
    @Then("user navigate to payment page")
    public void user_navigate_to_payment_page(String expectedPage) {
        espnHomePage=new EspnHomePage();
        Assert.assertEquals(driver.getCurrentUrl(),expectedPage);
    }
  //AccountDropDown Features

    //Scenario 1
    @When("user clicks on Account dropdown")
    public void user_clicks_on_account_dropdown() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.accountDropDown);
    }

    @When("user click on add favorite")
  public void user_click_on_add_favorite() {
      espnHomePage=new EspnHomePage();
      clickElement(espnHomePage.favoriteButton);
  }
    @When("user switch to a new tab")
    public void user_switch_to_a_new_tab() {
        espnHomePage=new EspnHomePage();
        espnHomePage.switchToNewTab(1);
    }
    @When("select a {string} to follow in the list of Suggested teams")
    public void select_a_to_follow_in_the_list_of_suggested_teams(String team) {
        espnHomePage=new EspnHomePage();
        espnHomePage.suggestedTeamsList(team);
    }
    @Then("user should see the followed teams on Favorites on the right of the page")
    public void user_should_see_the_followed_teams_on_favorites_on_the_right_of_the_page() {
        espnHomePage=new EspnHomePage();
        Assert.assertTrue(espnHomePage.followedTeams.isDisplayed(),"Teams do not displays");
    }
      //Scenario 2
      @When("User clicks on video settings")
      public void user_clicks_on_video_settings() {
          espnHomePage=new EspnHomePage();
          clickElement(espnHomePage.videoSettings);
      }
    @When("user clicks on auto play button")
    public void user_clicks_on_auto_play_button() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.videoAutoPlay);
    }
    @Then("user should navigate to all the videos page")
    public void user_should_navigate_to_all_the_videos_page(String expectedPage) {
        espnHomePage=new EspnHomePage();
        Assert.assertEquals(driver.getCurrentUrl(),expectedPage);
    }
    //Scenario3
    @When("user clicks on Tv provider")
    public void user_clicks_on_tv_provider() {
        espnHomePage=new EspnHomePage();
        clickElement(espnHomePage.tvProvider);
    }
    @When("user switch to a new window")
    public void user_switch_to_a_new_window() {
        espnHomePage=new EspnHomePage();
        espnHomePage.switchToNewTab(1);
    }
    @When("user select {string} from the list of providers")
    public void user_select_from_the_list_of_providers(String string) {
        espnHomePage=new EspnHomePage();
        espnHomePage.selectFromListTv();

    }
    @Then("user should navigate to {string} page")
    public void user_should_navigate_to_page(String expectedPageTitle) {
        espnHomePage=new EspnHomePage();
        Assert.assertEquals(driver.getTitle(),expectedPageTitle);
    }

}
