package step_definition;

import carsPage.CarsPage;
import common.BaseAPI;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class CarsPageStpesDefinition extends BaseAPI {
    CarsPage carsPage = new CarsPage();

    @When("user click on Cras Button")
    public void user_click_on_cras_button() {
        carsPage.navigateToCARSPage();

;
    }

    @Then("user should navigate to the Cars page")
    public void user_should_navigate_to_the_cars_page() {
        carsPage.ValidatePage();
        Assert.assertEquals(carsPage.ValidatePage(), "");

    }
    /////SendKeysCarsRental>feature
    @When("User input  {string} in the search box pick up")
    public void user_input_in_the_search_box_pick_up(String pickUpLocation) {
        carsPage.sendKeysINPUT_PICK_UP_BOX(pickUpLocation);

    }



    @When("user inputs {string} in input box Same as pick Up")
    public void user_inputs_in_input_box_same_as_pick_up(String DropOffLocation ) {
carsPage.sendKeysINPUT_SAME_AS_PICK_UP_BOX(DropOffLocation);
    }
    @When("user select {string} in the DropDown Calender Pick up")
    public void user_select_in_the_drop_down_calender_pick_up(String dateForPickUp) {
carsPage.selectDateJS(driver,carsPage.inputPickUpBOX,dateForPickUp);
    }
    @When("user select\"May {int}\" in the DropDown Calender Drop off")
    public void user_select_may_in_the_drop_down_calender_drop_off(String dateForDropOff  ) {
        carsPage.selectDateJS(driver,carsPage.inputDropOffDateBox,dateForDropOff);

    }
    @When("user select {string} in the DropDown time Pick up")
    public void user_select_in_the_drop_down_time_pick_up(String pickUpTime) {
carsPage.clickONDropDownTimeToPickUp(pickUpTime);

    }
    @When("user select {string} in the DropDown time  drop Off")
    public void user_select_in_the_drop_down_time_drop_off(String dropOffTime) {
carsPage.clickONDropDownTimeToDropOff(dropOffTime);
    }
    @When("the User cliCk on the button search button")
    public void the_user_cli_ck_on_the_button_search_button() {
        carsPage. clickOnSeacheButton();
        }


    @Then("the user navigate to {string}")
    public void the_user_navigate_to(String string) {
carsPage.getTextfromPage();
    }

    //////airport transportation

    @When("click on button Airport Transportation")
    public void click_on_button_airport_transportation() {
        carsPage.navigateToAirportTransportationPage();

    }
    @When("User input  {string} in the Airport search box")
    public void user_input_in_the_airport_search_box(String  airportName) {
carsPage.sendKeysINPUtAirPortBox( airportName);
    }
    @When("user inputs {string} in input hotel box")
    public void user_inputs_in_input_hotel_box(String hotel   ) {
        carsPage.sendKeysINPUtHotelNameBox(hotel);

    }
    @When("user select\"\"{int}-{int}-{int}\"\" in the DropDown Calender")
    public void user_select_in_the_drop_down_calender(String date) {
        carsPage.selectDateJS1(driver,carsPage.flightArrivalDate,date);

    }
    @When("the User cliCk on the button search in the airport transportation  page")
    public void the_user_cli_ck_on_the_button_search_in_the_airport_transportation_page() {
carsPage.clickButtonSearchArport();

    }
    @Then("the user navigate to \"\"in the airport transportation  page")
    public void the_user_navigate_to_in_the_airport_transportation_page() {

    }




}