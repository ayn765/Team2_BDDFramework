package step_definitions;

import becomehost.BecomeHostPage;
import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.Assert;



public class BecomeHostStepDefinition extends BaseAPI{
    BecomeHostPage becomeHostPage;

    @Given("User is on airbnb website")
    public void user_is_on_airbnb_website() {
        System.out.println("navigate to airbnb website");
    }
    @When("user clicks on become a host button")
    public void user_clicks_on_become_a_host_button() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.clickOnbecomeHostButton();
    }


    //SignUp
    @When("user clicks on Get Started button")
    public void user_clicks_on_get_started_button() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.clickOnGetStartedButton();
    }
    @When("user input {String} in country code input")
    public void user_input_country_in_country_code_input(String country) {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.selectCountry(country);
    }
    @When("user input {String} in phone number box")
    public void user_input_in_phone_number_box(int phoneNumber) {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.phoneInput(phoneNumber);
    }
    @When("user clicks on continue")
    public void user_clicks_on_continue() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.clickOnContinueToSignUp();
    }

  //NotificationAirbnb
    @When("user input {string} in email box")
    public void user_input_in_email_box(String email) {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.inputEmail(email);
    }
    @When("user input\"{int}\" in phone box")
    public void user_input_in_phone_box(int phoneNumber) {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.phoneNumberToSend(phoneNumber);
    }
    @When("user clicks on check box")
    public void user_clicks_on_check_box() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.checkTheBoxForNotification();
    }
    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.continueToSignUp();
    }
    @Then("a Thank you message displays")
    public void a_thank_you_message_displays() {
        becomeHostPage=new BecomeHostPage();
        boolean actual=becomeHostPage.notificationMessage.isDisplayed();
        String expected="Thanks! We’ll be in touch soon about hosting.";
        Assert.assertEquals(expected,actual,"Message is not displayed");
    }


  //Review Article
  @When("User clicks on the link {string}")
  public void user_clicks_on_the_link(String string) {
      becomeHostPage=new BecomeHostPage();
      becomeHostPage.protectedHostLink();
  }
    @When("User switch to a new window")
    public void user_switch_to_a_new_window() {
        becomeHostPage=new BecomeHostPage();
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
    @Then("User clicks on Thumb up Icon")
    public void user_clicks_on_thumb_up_icon() {
        becomeHostPage=new BecomeHostPage();
       clickElement(becomeHostPage.helpfulArticle);
    }

//Register For Webinar

@When("User clicks on the link Learn From A Real Host")
public void user_clicks_on_the_link_learn_from_a_real_host() {
    becomeHostPage=new BecomeHostPage();
    clickElement(becomeHostPage.learnFromArealHost);
}
    @When("User Select a Date")
    public void user_select_a_date() {
        becomeHostPage=new BecomeHostPage();
        clickElement(becomeHostPage.datePickedForWebinar);
    }
    @When("User switch to a new tab")
    public void user_switch_to_a_new_tab() {
        switchToNewTab(1);
    }

    @When("User clicks on Claim Seat")
    public void user_clicks_on_claim_seat() {
        becomeHostPage=new BecomeHostPage();
        clickElement(becomeHostPage.claimSeat);
    }
    @Then("user should see message Changed your mind? Release your seat")
    public void user_should_see_message_changed_your_mind_release_your_seat() {
        becomeHostPage=new BecomeHostPage();
        String actualMessage=getTextFromElement(becomeHostPage.message);
        Assert.assertEquals("Release your seat",actualMessage,"message do not match");
    }

    //Guests Room

    @When("User select Room Type")
    public void user_select_room_type() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.chooseRoomOption();
    }
    @When("User select how many Guests in the room")
    public void user_select_how_many_guests_in_the_room() {
        becomeHostPage=new BecomeHostPage();
        becomeHostPage.howManyGuests();
    }
    @When("User select the location")
    public void user_select_the_location() {
        becomeHostPage=new BecomeHostPage();
       clickElement(becomeHostPage.location);
    }
    @Then("User will see how much he will earn in a month")
    public void user_will_see_how_much_he_will_earn_in_a_month() {
        becomeHostPage=new BecomeHostPage();
        String expected="$2,343";
        String actual=becomeHostPage.moneyEarned.getText();
        Assert.assertEquals(expected,actual);
    }


}
