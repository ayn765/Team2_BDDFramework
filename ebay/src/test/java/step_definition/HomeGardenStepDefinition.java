package step_definition;

import common.BaseAPI;
import homeGarden.HomeGardenPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomeGardenStepDefinition extends BaseAPI {
  HomeGardenPage homeGardenPage;


    @Given("User is on Ebay website")
    public void user_is_on_ebay_website() {
        System.out.println("navigated to ebay website");
    }
    @When("User clicks on Home&Garden page")
    public void user_clicks_on_home_garden_page() {
     homeGardenPage=new HomeGardenPage();
     clickElement(homeGardenPage.homeGardenButton);
    }


    //Access Fashion from HomeGarden
    @When("User clicks on shopByCategory drop down")
    public void user_clicks_on_shop_by_category_drop_down() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.shopHomeGardenCategory);
    }
    @When("User mouse hover fashion")
    public void user_mouse_hover_fashion() {
        homeGardenPage=new HomeGardenPage();
        Actions action=new Actions(driver);
        action.moveToElement(homeGardenPage.fashionMenu).build().perform();
    }
    @When("User  clicks on women")
    public void user_clicks_on_women() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.fashionWomenClothing);
    }
    @Then("User should navigate to women fashion page")
    public void user_should_navigate_to_women_fashion_page() {
        homeGardenPage=new HomeGardenPage();
        String actualLink=homeGardenPage.getCurrentPageUrl();
        Assert.assertEquals(actualLink,"https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
    }
  //ShopDinnerWare
  @When("user clicks on dinnerware")
  public void user_clicks_on_dinnerware() {
      homeGardenPage=new HomeGardenPage();
      clickElement(homeGardenPage.dinnerwareLink);
  }
    @When("User select filter from {string} drop down")
    public void user_select_filter_from_drop_down(String sortBy) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.sortBy(sortBy);
    }
    @When("user select {string} from all colors")
    public void user_select_from_all_colors(String color) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.selectColor(color);
    }
    @When("user select {string} from Brand category")
    public void user_select_from_brand_category(String brand) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.selectBrand(brand);
    }
    @When("User inputs {String} in min price  box")
    public void user_inputs_in_min_price_box(int minPrice) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.inputMinPrice(minPrice);
    }

    @When("user inputs {String} in max price box")
    public void user_inputs_in_max_price_box(int maxPrice) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.inputMaxPrice(maxPrice);
    }
    @Then("user should be navigated to {string} page")
    public void user_should_be_navigated_to_page(String expectedTitle) {
        homeGardenPage=new HomeGardenPage();
        Assert.assertEquals(driver.getTitle(),expectedTitle,"titles do not match");
    }

    //ShopSmartTv
    @When("user clicks on Smart Home")
    public void user_clicks_on_smart_home() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.smartHome);
    }
    @When("User clicks on Smart tv's")
    public void user_clicks_on_smart_tv_s() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.smartTv);
    }
    @When("select the {string} in shop by brand")
    public void select_the_in_shop_by_brand(String tvBrand) {
        homeGardenPage=new HomeGardenPage();
        homeGardenPage.selectTvBrand(tvBrand);
    }
    @Then("user should navigate to {string} page")
    public void user_should_navigate_to_page(String expectedPage) {
        homeGardenPage=new HomeGardenPage();
       Assert.assertEquals(driver.getTitle(),expectedPage);
    }

   //Add Tv to the cart
   @When("User clicks on the arrow button till the end to see all the Tv brands")
   public void user_clicks_on_the_arrow_button_till_the_end_to_see_all_the_tv_brands() {
       homeGardenPage=new HomeGardenPage();
       clickElement(homeGardenPage.shopByBrandArrow);
   }
    @When("User select a Sony Brand")
    public void user_select_a_sony_brand() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.shopByBrandSony);
    }
    @When("User select Sony Tv")
    public void user_select_sony_tv() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.selectedTvInSonyBrand);
    }
    @When("User clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.addTvToTheCart);
    }
    @When("User switch to a new tab")
    public void user_switch_to_a_new_tab() {
        homeGardenPage=new HomeGardenPage();
       homeGardenPage.switchToNewTab(1);
    }
    @When("user clicks No thanks to decline protection plan")
    public void user_clicks_no_thanks_to_decline_protection_plan() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.doNotAddWarranty);
    }
    @When("user clicks save for Later")
    public void user_clicks_save_for_later() {
        homeGardenPage=new HomeGardenPage();
        clickElement(homeGardenPage.saveForLater);
    }
    @Then("user should navigate to sign in page")
    public void user_should_navigate_to_sign_in_page(String expectedURL) {
        homeGardenPage=new HomeGardenPage();
       Assert.assertEquals(driver.getCurrentUrl(),expectedURL,"URL's do not match");
    }

}
