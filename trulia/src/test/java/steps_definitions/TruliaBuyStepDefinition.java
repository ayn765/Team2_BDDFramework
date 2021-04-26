package steps_definitions;

import common.BaseAPI;

import io.cucumber.java.en.*;
import org.testng.Assert;
import truliaBuyPage.TruliaBuyPage;

import java.util.List;

public class TruliaBuyStepDefinition extends BaseAPI {
    TruliaBuyPage truliaBuyPage;

    @Given("user is on Trulia website")
    public void user_is_on_trulia_website() {
        System.out.println("user navigate to trulia website");
    }
    @When("user mouse hover Buy")
    public void user_mouse_hover_buy() {
        truliaBuyPage=new TruliaBuyPage();
        truliaBuyPage.hoverTruliaBuy();}

        //Scenario 1
    @When("user clicks on homes for sale")
    public void user_clicks_on_homes_for_sale() {
        truliaBuyPage=new TruliaBuyPage();
        clickElement(truliaBuyPage.houseForSale);
    }
    @When("user can clicks on Agents Listings")
    public void user_can_clicks_on_agents_listings() {
        truliaBuyPage=new TruliaBuyPage();
        clickElement(truliaBuyPage.agentListings);
    }
    @When("user clicks on Price")
    public void user_clicks_on_price() {
        truliaBuyPage=new TruliaBuyPage();
        clickElement(truliaBuyPage.price);
    }

    @When("user select \"{int} in min price drop down")
    public void user_select_in_min_price_drop_down(int minPrice) {
        truliaBuyPage=new TruliaBuyPage();
        truliaBuyPage.selectMinPrice(minPrice);
    }

    @When("user select \"{int} in max price drop down")
    public void user_select_in_max_price_drop_down(int maxPrice) {
        truliaBuyPage=new TruliaBuyPage();
        truliaBuyPage.selectMaxPrice(maxPrice);
    }

    @When("user select {string} in All home type dropdown")
    public void user_select_in_all_home_type_dropdown(String homeType) {
        truliaBuyPage=new TruliaBuyPage();
        truliaBuyPage.selectHomeType(homeType);
    }
    @Then("user should see Homes for sale available")
    public void user_should_homes_for_sale_available() {
        truliaBuyPage=new TruliaBuyPage();
       truliaBuyPage.homeForSellResult.getText();
    }
    //Scenario 2

    @When("user clicks on Open house link")
    public void user_clicks_on_open_house_link() {
        truliaBuyPage=new TruliaBuyPage();
        clickElement(truliaBuyPage.openHouseLink);
    }
    @Then("user should navigate to open houses page")
    public void user_should_navigate_to_open_houses_page() {
        truliaBuyPage=new TruliaBuyPage();
        Assert.assertEquals(truliaBuyPage.openHouseResult.getText(),"74 homes available on Trulia");
    }

    //Scenario 3
    @When("user clicks on New listings house")
    public void user_clicks_on_new_listings_house() {
        truliaBuyPage=new TruliaBuyPage();
        clickElement(truliaBuyPage.newListings);
    }
    @Then("user navigate to all the newest houses on the market")
    public void user_navigate_to_all_the_newest_houses_on_the_market() {
        truliaBuyPage=new TruliaBuyPage();
        truliaBuyPage.nameOfAllNewListings();
    }


}
