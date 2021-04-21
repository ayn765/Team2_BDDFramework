package financialServicesPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

import static financialServicesPage.BMWFinancialServicesPageLocators.*;

public class BMWFinancialServicesPage extends BaseAPI {

    public BMWFinancialServicesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_LINK_SPECIAL_OFFERS)
    public WebElement linkSpecialOffers;

    @FindBy(css = WEB_ELEMENT_INPUT_ZIPCODE)
    public WebElement inputZipcode;

    @FindBy(css = WEB_ELEMENT_BUTTON_ZIPCODE_SUBMIT)
    public WebElement buttonZipcodeSubmit;

    @FindBy(css = WEB_ELEMENT_HEADER_CURRENT_OFFERS)
    public WebElement headerCurrentOffers;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_VEHICLES)
    public WebElement dropdownVehicles;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_BODY_STILES)
    public WebElement dropdownBodyStyle;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_MODEL_YEAR)
    public WebElement dropdownModelYear;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_FUEL_TYPE)
    public WebElement dropdownFuelType;

    @FindBy(xpath = WEB_ELEMENT_RESULT_DETAILED_SEARCH)
    public WebElement resultDetailedSearch;

    @FindBy(css = WEB_ELEMENTS_HOVER_HELP_BOX)
    public List<WebElement> hoverHelpBoxes;

//    @FindBy(css = )
//    public WebElement
//
//    @FindBy(css = )
//    public WebElement


   static ArrayList<String> attributeValues = new ArrayList<>();
   static ArrayList<String> allHelpText = new ArrayList<>();

    public void navigateToSpecialOffers() {
        clickElement(linkSpecialOffers);
    }

    public void enterZipcode(String string) {
        sendKeysToElement(inputZipcode, string);
    }

    public void selectTypeOfVehicleFromDropdown(int index) {
        selectFromDropDownByIndex(dropdownVehicles, index);
    }

    public void selectBodyTypeFromDropdown(String bodyType) {
        selectFromDropDownByVisibleText(dropdownBodyStyle, bodyType);
    }

    public void selectModelYearFromDropDown(String modelYear) {
        selectFromDropDownByValue(dropdownModelYear, modelYear);
    }

    public void selectFuelTypeFromDropdown(int indexFuelType) {
        selectFromDropDownByIndex(dropdownFuelType, indexFuelType);
    }

    public void hoverOverHelpBoxAndGetAttributeValue() throws InterruptedException {

        attributeValues.clear();
//        attributeValues = hoverOverHelpBoxAndGetAttributeValue(hoverHelpBoxes,"aria-expanded");

        waitUntilWebElementListVisible(hoverHelpBoxes);
        for (WebElement singleHelpBox : hoverHelpBoxes) {
            hoverOverElement(singleHelpBox);
            String singleAttributeValue = getAttributeFromElement(singleHelpBox, "aria-expanded");
            attributeValues.add(singleAttributeValue);
            System.out.println("***The attribute value if the current help box is: " + singleAttributeValue);

        }
    }
    public void hoverOverHelpBoxAndGetText(){
                allHelpText.clear();
                allHelpText = hoverOverHelpBoxAndGetAttributeValue(hoverHelpBoxes,"data-tippy-content");
    }

    public boolean verifyHelpBoxesAreDisplayed() {
        String expectedAttributeValue = "true";
        boolean flag = false;
        int count = 0;
        for (String singleAttributeValue : attributeValues) {
            if (singleAttributeValue.equals(expectedAttributeValue)) {
                flag = true;
            }else{
                flag = false;
                count++;
            }
        }if(count>0){
            flag = false;
        }
        return flag;
    }

    public boolean verifyTextHelpBoxes() throws Exception {
        return compareListStringsToExcelDoc(allHelpText, pathFromUserDir + "/src/test/resources/BMWTestData.xlsx", "HelpBoxText");
    }

}
