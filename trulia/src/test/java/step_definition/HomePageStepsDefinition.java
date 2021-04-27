package step_definition;

import common.BaseAPI;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import truliaHomePage.TruliaHomePage;

public class HomePageStepsDefinition extends BaseAPI {
    TruliaHomePage truliaHomePage=new TruliaHomePage();

    @Given("user is at trulia home page")
    public void user_is_at_trulia_home_page() {


    }
    @When("user clair the search keys in side the search bar")
    public void user_clair_the_search_keys_in_side_the_search_bar() {
        truliaHomePage.clearInputFieldAndSendKeysToElement();
    }

    @When("User input  {string} in the  search box")
    public void user_input_in_the_search_box(String city ) {
truliaHomePage.sendKeySearchBox(city);
    }





    @When("the User cliCk on the button search.")
    public void the_user_cli_ck_on_the_button_search() {
        truliaHomePage.clickSearchButton();
    }

    @Then("the user navigate to \"\"in this page")
    public void the_user_navigate_to_in_this_page(String pageTitle){
String a=truliaHomePage.getText();
        Assert.assertEquals(a,pageTitle);
        System.out.println("this is the page title must beeeeeeeeee  "+pageTitle);
    }

    @When("user click on rent Button above the search bar")
    public void user_click_on_rent_button_above_the_search_bar() {
        truliaHomePage.clickRentButton();

    }

    @When("user click on sold Button above the search bar")
    public void user_click_on_sold_button_above_the_search_bar() {
        truliaHomePage.clickSoldButton();

    }



}
