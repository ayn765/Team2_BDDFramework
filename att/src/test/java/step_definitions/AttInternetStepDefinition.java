package step_definitions;

import common.BaseAPI;
import internetPage.AttInternetPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class AttInternetStepDefinition extends BaseAPI {
   AttInternetPage attInternetPage;



    @Given("User is on ATT website")
    public void user_is_on_att_website() {
        System.out.println("navigate to att website");
    }
    @When("User clicks on Internet")
    public void user_clicks_on_internet() {
        attInternetPage=new AttInternetPage();
        attInternetPage.navigateToInternet();
    }


    //AttFeedback
    @When("User clicks on Feedback Button")
    public void user_clicks_on_feedback_button() {
        attInternetPage=new AttInternetPage();
        attInternetPage.feedbackExplore();
    }
    @When("User switch to a new tab")
    public void user_switch_to_a_new_tab() {
        attInternetPage=new AttInternetPage();
        attInternetPage.switchToNewTab(1);
    }
    @When("User clicks on rate experience")
    public void user_clicks_on_rate_experience() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.goodFeedBack);
    }
    @When("User select Topic to rate")
    public void user_select_topic_to_rate() {
        attInternetPage=new AttInternetPage();
        attInternetPage.selectTopicForFeedback();
    }
    @When("User clicks on submit FeedBack")
    public void user_clicks_on_submit_feed_back() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.submitFeedback);
    }
    @Then("User close the tab")
    public void user_close_the_tab() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.closeFeedback);
    }


  //Shop for phone
  @When("User clicks on Favorite Icon")
  public void user_clicks_on_favorite_icon() {
      attInternetPage=new AttInternetPage();
      clickElement(attInternetPage.favorite);
  }
    @When("User clicks on Start Shopping")
    public void user_clicks_on_start_shopping() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.startShopping);
    }
    @When("User select a Phone")
    public void user_select_a_phone() {
        attInternetPage=new AttInternetPage();
        attInternetPage.selectPhone();
    }
    @When("User select color for the phone")
    public void user_select_color_for_the_phone() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.phoneColor);
    }
    @When("User select capacity for the phone")
    public void user_select_capacity_for_the_phone() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.phoneCapacity);
    }
    @When("User clicks on availability in store")
    public void user_clicks_on_availability_in_store() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.phoneAvailable);
    }
    @Then("user select a store")
    public void user_select_a_store() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.pickTheStore);
    }
// Chat with Agent

@When("User clicks on chat icon")
public void user_clicks_on_chat_icon() {
    attInternetPage=new AttInternetPage();
    attInternetPage.navigateChat();
}
    @When("User input a question in input box")
    public void user_input_a_question_in_input_box() {
        attInternetPage=new AttInternetPage();
        attInternetPage.inputChat();
    }
    @When("User clicks on send Chat")
    public void user_clicks_on_send_chat() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.chatSend);
    }
    @Then("User receive an answer from agent")
    public void user_receive_an_answer_from_agent() {
        attInternetPage=new AttInternetPage();
        String expectedAnswer="AT&T: Sure thing! So I can get you to the right place, tell me what you’d like help with.";
        String actual=attInternetPage.answer.getText();
        Assert.assertEquals(actual,expectedAnswer);
    }

//Search Internet question


    @When("User input {string} in Search bar")
    public void user_input_in_search_bar(String search) {
        attInternetPage=new AttInternetPage();
        attInternetPage.inputQuestion(search);
    }
    @When("User clicks on search icon")
    public void user_clicks_on_search_icon() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.searchIcon);
    }
    @When("user clicks on Learn More")
    public void user_clicks_on_learn_more() {
        attInternetPage=new AttInternetPage();
        clickElement(attInternetPage.learnMore);
    }
    @Then("User should navigate to {string} page")
    public void user_should_navigate_to_page(String expectedTitle) {
        attInternetPage=new AttInternetPage();
        String actualTitle=attInternetPage.getTitle(expectedTitle);
        Assert.assertEquals(actualTitle,expectedTitle,"Titles do not match");
    }

}
