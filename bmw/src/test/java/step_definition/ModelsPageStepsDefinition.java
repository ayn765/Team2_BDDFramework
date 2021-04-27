package step_definition;

import common.BaseAPI;
import io.cucumber.java.en.*;
import modelsPage.ModelsPage;
import org.junit.Assert;

public class ModelsPageStepsDefinition extends BaseAPI {


    /**
     * Features1 : Access Inventory From Models Page
     * Scenario: 1
     */

    ModelsPage modelsPage;

    @Given("user is on models page")
    public void user_is_on_models_page() {
        modelsPage = new ModelsPage();
        modelsPage.navigateToModelsPage();
    }

    @When("user clicks on all models tab")
    public void user_clicks_on_all_models_tab() {
        modelsPage = new ModelsPage();
        modelsPage.clickOnAllModelsTab();
    }

    @When("user chooses model x3")
    public void user_chooses_model_x3() {
        modelsPage = new ModelsPage();
        modelsPage.chooseModelsX3();
    }

    @When("user can click on shp by inventory tab")
    public void user_can_click_on_shp_by_inventory_tab() {
        modelsPage = new ModelsPage();
        modelsPage.clickShopInventoryTabOnFilterPage();
    }

    @When("user is navigated to inventory page to enter {string}")
    public void user_is_navigated_to_inventory_page_to_enter(String zipcode) {
        modelsPage = new ModelsPage();
        modelsPage.inputZipCodeToSearchBar(zipcode);
    }

    @When("user clicks on shop now button")
    public void user_clicks_on_shop_now_button() {
        modelsPage = new ModelsPage();
        clickJScript(modelsPage.shopNowButton);
    }

    @Then("user is navigated to search offers available in the chosen area")
    public void user_is_navigated_to_search_offers_available_in_the_chosen_area() {
        modelsPage = new ModelsPage();
        Assert.assertTrue(isElementPresent(modelsPage.contactDealerHeader));
    }
    /**Feature 1
     * Scenario 2
     * access shop inventory from models page
     */




    @When("user clicks on shop by inventory tab on the left upper corner of the models page")
    public void user_clicks_on_shop_by_inventory_tab_on_the_left_upper_corner_of_the_models_page() {
        modelsPage = new ModelsPage();
        modelsPage.shopInventoryFromModelPage();
    }

    @Then("user is navigated to offers available in his area by default")
    public void user_is_navigated_to_offers_available_in_his_area_by_default() {
    Assert.assertTrue(isElementPresent(modelsPage.inventoryResult));
    }


    /************************************-------------*********************************************************
     * Feature 2: Shop BMW By Model
     * Scenario Outline
     */
    @When("user clicks on sedan tab")
    public void user_clicks_on_sedan_tab() {
        modelsPage = new ModelsPage();
        modelsPage.clickSedanTab();
    }

    @When("user selects sedan model {string}")
    public void user_selects_sedan_model(String model) {
        modelsPage = new ModelsPage();
        modelsPage.shopByModel(model);
    }
    @Then("user is navigated to search result page")
    public void user_is_navigated_to_search_result_page() {
        Assert.assertTrue(isElementPresent(modelsPage.testDriveHeader));
    }




}
