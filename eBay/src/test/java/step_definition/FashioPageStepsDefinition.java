package step_definition;

import common.BaseAPI;
import fashionPage.FashionPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FashioPageStepsDefinition extends BaseAPI {
    FashionPage fashionPage;

    @Given("user is on fashion Page page")
    public void user_is_on_fashion_page_page() {
        fashionPage = new FashionPage();
        fashionPage.navigateToFashionPage();
    }

    @When("user clicks on all categories drop down")
    public void user_clicks_on_all_categories_drop_down() {
        fashionPage = new FashionPage();
        fashionPage.clickOnAllCategoriesDropDown();
    }

    @When("user select by {string}  from all categories dropdown")
    public void user_select_by_from_all_categories_dropdown(String option) {
        fashionPage = new FashionPage();
        fashionPage.selectOptionFromDropDown(option);
    }

    @Then("user can view current offers")
    public void user_can_view_current_offers() {
        fashionPage = new FashionPage();
        String actualText = "Welcome to eBay Art";
        String expectedText = fashionPage.artPageTitle.getText();
        Assert.assertEquals(expectedText, actualText, "Test do not match");
    }


        /********************************-----------********************************************************
         * Women Clothing Feature
         */

        /**
         * Scenario 1
         *
         */

        @Given("user is on fashion page")
        public void user_is_on_fashion_page() {
            fashionPage = new FashionPage();
            fashionPage.navigateToFashionPage();
        }

    @When("user clicks on Women Clothing")
    public void user_clicks_on_women_clothing() {
        fashionPage = new FashionPage();
        clickJScript(fashionPage.womenClothingTab);
    }

    @When("user selects shop women clothing")
    public void user_selects_shop_women_clothing() {
        fashionPage = new FashionPage();
        mouseHoverJScript(fashionPage.shopForWomenClothing);
    }

    @When("user clicks dresses")
    public void user_clicks_dresses() {
        fashionPage = new FashionPage();
        mouseHoverJScript(fashionPage.dressesTab);
    }


    @When("user brand able to  pick brand {string}")
    public void user_brand_able_to_pick_brand(String dressBrand) {
        fashionPage = new FashionPage();
        fashionPage.selectBrand(dressBrand);
    }

    @When("user brand able to pick size {string}")
    public void user_brand_able_to_pick_size(String dressSize) {
        fashionPage = new FashionPage();
        fashionPage.selectSize(dressSize);
    }

    @When("user brand able to  pick type {string}")
    public void user_brand_able_to_pick_type(String dressType) {
        fashionPage = new FashionPage();
        fashionPage.selectType(dressType);
    }

    @When("user clicks activewear")
    public void user_clicks_activewear() {
        fashionPage = new FashionPage();
        mouseHoverJScript(fashionPage.activewearTab);
    }


    @When("user should be able to pick {string}")
    public void user_should_be_able_to_pick(String activewearCategory) {
        fashionPage = new FashionPage();
        fashionPage.selectCategory(activewearCategory);
    }

//    @When("user should be able to pick {string}")
//    public void user_should_be_able_to_pick_top_brands(String activewearTopBrands) {
//        fashionPage = new FashionPage();
//        fashionPage.selectTopBrandsActivewear(activewearTopBrands);
//    }






}










