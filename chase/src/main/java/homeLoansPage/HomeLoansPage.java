package homeLoansPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homeLoansPage.HomeLoansPageLocators.*;

public class HomeLoansPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUTTON_HOME_LOANS_PAGE)
    public WebElement buttonHomeLoansPage;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_ATM_BRANCH)
    public WebElement buttonAtm_branch;

    @FindBy(xpath = WEB_ELEMENT_INPUT_SEARCH_BAR_ZIP_CODE)
    public WebElement InputSearchBar;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_SEARCH)
    public WebElement buttonSearch;

    @FindBy(xpath = WEB_ELEMENT_EXPECTED_TEXT_ZIP_CODE)
    public WebElement expectedTextZipCode;


    public HomeLoansPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickHomeLoansButton(){
        clickElement(buttonHomeLoansPage);
    }

    public void clickAtmBranchButton(){
        clickElement(buttonAtm_branch);
    }
    public void sendKeysToZipCodeBox(String Zip){
        sendKeysToElement(InputSearchBar,Zip);

    }
    public void clickSearchButton(){
        clickElement(buttonSearch);
    }
    public String getTextExpected(){

        System.out.println(expectedTextZipCode.getText());
        return expectedTextZipCode.getText();
    }



        }