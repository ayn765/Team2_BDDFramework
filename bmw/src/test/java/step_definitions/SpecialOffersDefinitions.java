package step_definitions;

import common.BaseAPI;
import financialServicesPage.BMWFinancialServicesPage;
import homepage.BMWHomepage;
import io.cucumber.java.en.*;
import org.junit.Assert;



public class SpecialOffersDefinitions extends BaseAPI {

    BMWHomepage bmwHomepage;
    BMWFinancialServicesPage bmwFinancialServicesPage;

    @Given("user is on BMW Financial Services Page")
    public void user_is_on_bmw_financial_services_page() {
        bmwHomepage = new BMWHomepage();
        bmwHomepage.navigateToFinancialServicesPage();
    }

    @When("user clicks Special Offers button under Leasing Section")
    public void user_clicks_special_offers_button_under_leasing_section() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.navigateToSpecialOffers();
    }

    @When("user enters {string} into the input field")
    public void user_enters_zipcode_into_the_input_field(String zipcode) {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.enterZipcode(zipcode);

    }
    @Then("user is able to view current offers in specified zipcode location")
    public void user_is_able_to_view_current_offers_in_specified_zipcode_location() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        waitUntilWebElementVisible(bmwFinancialServicesPage.headerCurrentOffers);
        Assert.assertTrue("The Current Offers are not displayed.", bmwFinancialServicesPage.headerCurrentOffers.isDisplayed());
    }

    @When("user selects {string} from the dropdown")
    public void user_selects_type_of_the_vehicle_from_the_dropdown(String typeOfVehicle) {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.selectTypeOfVehicleFromDropdown(typeOfVehicle);
    }
    @When("user picks {string} from the dropdown")
    public void user_picks_body_style_from_the_dropdown(String bodyStyle) {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.selectBodyTypeFromDropdown(bodyStyle);
    }
    @When("user chooses {string} from the dropdown")
    public void user_chooses_model_year_from_the_dropdown(String modelYear) {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.selectModelYearFromDropDown(modelYear);
    }
    @When("user selects fuel type from the dropdown")
    public void user_selects_fuel_type_from_the_dropdown() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.selectFuelTypeFromDropdown(1);
    }
    @Then("search result populates {string}")
    public void search_result_populates_correct_vehicle(String correctVehicle) {
        Assert.assertEquals(correctVehicle, bmwFinancialServicesPage.resultDetailedSearch.getText());

    }

}
