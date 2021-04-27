package carsPage;

import common.BaseAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static carsPage.CarsPageLocators.*;
import static carsPage.CarsPageLocators.WEB_ELEMENT_DROP_DOWN_DEPARTURE_TIME;

public class CarsPage extends BaseAPI {
    @FindBy(css=WEB_ELEMENT_BUTTON_CARS )
    public WebElement buttonCars;

    @FindBy(css=WEB_ELEMENT_BUTTON_RENTAL_CAR )
    public  WebElement buttonRentalCars;

    @FindBy(xpath=WEB_ELEMENT_BUTTON_AIRPORT_TRANSPORTATION)
    public   WebElement buttonAirportTransportation;

    @FindBy(css=WEB_ELEMENT_EXPECTED_IMAGE_CARS_PAGE )
    public  WebElement expectedImageCarsPage;

    @FindBy(css=WEB_ELEMENT_INPUT_PICK_UP_BOX )
    public  WebElement inputPickUpBOX;

    @FindBy(xpath=WEB_ELEMENT_INPUT_SAME_AS_PICK_UP_BOX )
    public  WebElement inputSameAsPickUpBOX;

    @FindBy(css=WEB_ELEMENT_INPUT_PICK_UP_DATE_BOX  )
    public  WebElement inputPickUpDateBox;

    @FindBy(css=WEB_ELEMENT_INPUT_DROP_OFF_BOX)
    public  WebElement inputDropOffDateBox;

    @FindBy(css=WEB_ELEMENT_DROP_DOWN_TIME_TO_PICK_UP )
    public  WebElement dropDownTimeToPickUp;


    @FindBy(css=WEB_ELEMENT_DROP_DOWN_TIME_TO_DROP_OFF )
    public  WebElement dropDownTimeToDropOff;

    @FindBy(css=WEB_ELEMENT_BUTTON_SEARCH  )
    public  WebElement buttonSearch;

    @FindBy(css=WEB_ELEMENT_BUTTON_I_HAVE_CODE  )
    public  WebElement buttonIHaveTHeCode;

    @FindBy(css=WEB_ELEMENT_DROP_DOWN_RENTAL_CAR_COMPANY )
    public  WebElement dropDownRentalCompany;

    @FindBy(css=WEB_ELEMENT_INPUT_AIRPORT_BOX)
    public  WebElement inputAirPortBox;

    @FindBy(xpath=WEB_ELEMENT_INPUT_HOTEL_NAME_BOX)
    public  WebElement inputHotelNameBox;

    @FindBy(xpath=WEB_ELEMENT_FLIGHT_ARRIVAL_DATE )
    public  WebElement flightArrivalDate;

    @FindBy(css=WEB_ELEMENT_DROP_DOWN_ARRIVAL_TIME)
    public  WebElement dropDownArrivalTime;

    @FindBy(css=WEB_ELEMENT_BUTTON_ROUND_TRIP)
    public  WebElement buttonRoundTrip;

    @FindBy(css=WEB_ELEMENT_FLIGHT_DEPARTURE_DATE)
    public  WebElement flightDepartureDate;

    @FindBy(css=WEB_ELEMENT_DROP_DOWN_DEPARTURE_TIME)
    public  WebElement dropDownDepartureTime ;

    @FindBy(xpath=WEB_ELEMENT_GetText_FromSerache)
    public  WebElement textAfterSearcheButton ;

    @FindBy(xpath=WEB_ELEMENT_BUTTON_SEARCH_AIRPORT_TRANSPORTATION)
    public  WebElement buttonSearchAirportTansportation ;


    public CarsPage(){
        PageFactory.initElements(driver, this);}
    public void navigateToCARSPage(){
        clickElement(buttonCars);
    }

    public String ValidatePage(){
        String phrase="";
        getTextFromElement(expectedImageCarsPage);

        return phrase;
    }

    public void sendKeysINPUT_PICK_UP_BOX(String searchKeys){
        navigateToCARSPage();
        sendKeysToElement(inputPickUpBOX,(searchKeys));
    }
    public void sendKeysINPUT_SAME_AS_PICK_UP_BOX(String searchKeys){
        navigateToCARSPage();
        sendKeysToElement(inputSameAsPickUpBOX,(searchKeys));
    }

    public   void selectDateJS(WebDriver driver, WebElement element, String dateVal){
        JavascriptExecutor js=((JavascriptExecutor)driver);

        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
    }

    public void clickONDropDownTimeToPickUp(String juk){
        navigateToCARSPage();
        selectElement(dropDownTimeToPickUp);
        Select time = new Select(dropDownTimeToPickUp);
        time .selectByValue(juk);
    }

    public void clickONDropDownTimeToDropOff(String juk){
        navigateToCARSPage();
        selectElement(dropDownTimeToDropOff);
        Select time = new Select(dropDownTimeToDropOff);
        time .selectByValue(juk);
    }




    public void clickOnSeacheButton(){
        clickElement(buttonSearch);
    }
    public void getTextfromPage(){
        getTextFromElement(textAfterSearcheButton);
        System.out.println("the txtx is,,,,,,,,lkj: "+getTextFromElement(textAfterSearcheButton));
    }


    /////airport transportation
    public void navigateToAirportTransportationPage(){
        navigateToCARSPage();
        clickElement(buttonAirportTransportation);}

    public void sendKeysINPUtAirPortBox(String searchKeys){
        navigateToAirportTransportationPage();
        sendKeysToElement(inputAirPortBox,(searchKeys));
    }


    public void sendKeysINPUtHotelNameBox(String searchKeys){
        navigateToAirportTransportationPage();
        sendKeysToElement(inputHotelNameBox,(searchKeys));
    }

    public   void selectDateJS1(WebDriver driver,WebElement element,String dateVal){
        JavascriptExecutor js=((JavascriptExecutor)driver);

        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
    }
    public void clickButtonSearchArport(){
        clickElement(buttonSearchAirportTansportation);
    }
}
