package findHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static findHomePage.FindHomeLocators.*;
public class FindHomePage extends BaseAPI {

    public FindHomePage(){
        PageFactory.initElements(driver,this); }

    @FindBy (xpath= WEB_ELEMENT_FIND_HOME)
    WebElement findHomeTab;
    @FindBy (xpath=WEB_ELEMENT_HOUSES_NEAR_HEADER)
    public WebElement nearHousesHeader;
    @FindBy (css=WEB_ELEMENT_INPUT_SEARCH_BOX)
    public WebElement inputSearchBar;
    @FindBy(xpath= WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;
    @FindBy(xpath=WEB_ELEMENT_19525_SEARCH_HEADER)
    public WebElement zipcodeSearchHeader;
    @FindBy(xpath= WEB_ELEMENT_PHILADELPHIA_SEARCH_HEADER)
    public WebElement townStateSearchHeader;

    @FindBy (xpath=WEB_ELEMENT_ALL_BEDS_DROP_DOWN)
    public WebElement allBedsDropDownButton;
    @FindBy (xpath=WEB_ELEMENT_ALL_BEDS_OPTIONS)
    public List<WebElement> allBedsOptions;
    @FindBy (css=WEB_ELEMENT_SORT_RESULT)
    public WebElement sortResult;





   public void navigateToFindFindHomePage() {
       clickElement(findHomeTab); }


   public void inputZipcode(String zipcode){
       sendKeysToElement(inputSearchBar,String.valueOf(zipcode));

   }
    public void inputTownInSearchBar(String town){

        sendKeysToElement(inputSearchBar,town);
    }


    public void inputStateInSearchBar( String state){

       sendKeysToElement(inputSearchBar,state);
   }

   public void clickSearchButton(){
       clickJScript(searchButton);
   }


   //all beds
    public void clickAllBedsDropdown(){
       clickJScript(allBedsDropDownButton);
    }

    public void selectNumberOfBedrooms(String numBedrooms) {
        ArrayList<String> allCategories = new ArrayList<>();
        waitUntilWebElementListVisible(allBedsOptions);
        for (int i = 0; i < allBedsOptions.size(); i++) {
            allBedsOptions.get(i).click();
        }


    }


}
