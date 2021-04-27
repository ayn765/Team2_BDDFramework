package homePageBankOfAmerica;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homePageBankOfAmerica.HomePagBankOfAmericaLocators.*;

public class HomePageBankOfAmerica extends BaseAPI {

    @FindBy(css = WEB_ELEMENT_INPUT_ONLINE_ID_BOX)
    WebElement inputOnlineIdBox;

    @FindBy(css = WEB_ELEMENT_INPUT_PASSCODE_BOX)
    WebElement inputPassCodeBox;

    @FindBy(css = WEB_ELEMENT_BUTTON_SING_IN)
    WebElement buttonSingIn;

    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_LOG_IN)
    WebElement TextAfterLogIn;

    @FindBy(css = WEB_ELEMENT_BUTTON_LOCATION_BANK_ATM)
    WebElement buttonFindYourClosestBankATM;
    @FindBy(css = WEB_ELEMENT_INPUT_SEARCH_LOCATION_BOX)
    WebElement inputSearchLocationBox;
    @FindBy(css = WEB_ELEMENT_BUTTON_SEARCH_LOCATION)
    WebElement buttonSearchLocation;

    @FindBy(css = WEB_ELEMENT_BUTTON_FILTER_LOCATION)
    WebElement buttonFilterLocation;

    @FindBy(css = WEB_ELEMENT_EXPECTED_RESULT_LOCATION)
    WebElement expectedResultLocation;

    @FindBy(css = WEB_ELEMENT_BUTTON_ASK_ERICA)
    WebElement buttonAskErica;

    @FindBy(xpath = WEB_ELEMENT_VIDEO_TIMER)

    WebElement videoTimer;
    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_VIDEO)
    WebElement expectedTextVideo;

    @FindBy(css = WEB_ELEMENT_BUTTON_CRIDIT_CARD)
    WebElement buttonCriditCard;

    @FindBy(css = WEB_ELEMENT_BUTTON_REWARDS_CARD)
    WebElement buttonRewardCard;

    @FindBy(css = WEB_ELEMENT_BUTTON_APPLY_NOW)
    WebElement buttonApplyNow;

    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_CRDIT_CARD)
    WebElement expectedTextCriditCard;

    @FindBy(xpath = WEB_ELEMENT_IMAGE_IN_HOME_PAGE)
    public WebElement imageHomepage;


    @FindBy(css = WEB_ELEMENT_IMAGE_ASK_ERICA)
    public WebElement imageAskErica;

    @FindBy(css = WEB_ELEMENT_LINK_IMAGE_CASH_REWARD)
    public WebElement linkImageCashReward;

    @FindBy(css = WEB_ELEMENT_BUTTON_HOME_LOANS)
    public WebElement buttonHomeloan;

    @FindBy(css = WEB_ELEMENT_BUTTON_MORTGAGES)
    public WebElement buttonMortgages;

    @FindBy(xpath = WEB_ELEMENT_INPUT_PURCHASE_PRICE_BOX)
    public WebElement inputPurchasePrice_box;

    @FindBy(xpath = WEB_ELEMENT_INPUT_DOWN_PAYMENT_BOX)
    public WebElement inputDownPaymentBox;

    @FindBy(xpath = WEB_ELEMENT_INPUT_ZIP_CODE_BOX)
    public WebElement inputZipCodeBox;

    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_HOME_LOAN)
    public WebElement expectedTextHomeLoan;

    @FindBy(css = WEB_ELEMENT_INPUT_SEARCH_HELP_BOX)
    public WebElement inputSearchHelpBox;

    @FindBy(css = WEB_ELEMENT_BUTTON_SEARCH_HELP)
    public WebElement buttonSearchHelp;

    @FindBy(css = WEB_ELEMENT_BUTTON_VIEW_ALL_RESULT)
    public WebElement buttonViewAllResult;


    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_HELP_PAGE)
    public WebElement expectedTextHelpPage;

    @FindBy(css = WEB_ELEMENT_BUTTON_CHECKING)
    public WebElement button_checking;

    @FindBy(css = WEB_ELEMENT_BUTTON_ADVANTAGEBANKING)
    public WebElement buttonAdvantageBanking;

    @FindBy(css = WEB_ELEMENT_EXPECTED_IMAGE_CHECKING)
    public WebElement expectedImageChecking;

    @FindBy(css = WEB_ELEMENT_BUTTON_SAVINGS)
    public WebElement buttonSavings;

    @FindBy(css = WEB_ELEMENT_BUTTON_CHILD_SAVINGS)
    public WebElement buttonChildSavings;

    @FindBy(css = WEB_ELEMENT_EXPECTED_TEXT_SAVING)
    public WebElement expectedTextSavings;

    @FindBy(css = WEB_ELEMENT_BUTTON_AUTO_LOANS)
    public WebElement buttonAutoLoan;

    @FindBy(css = WEB_ELEMENT_BUTTON_LEARN_MORE_AUTO_LOANS)
    public WebElement buttonLearnMoreAutoLoan;

    @FindBy(css = WEB_ELEMENT_EXPECTED_HEADER_AUTO_LOAN)
    public WebElement expectedHeaderAutoLoan;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_CARD_FOR_STUDENT)
    public WebElement buttonCardStudent;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_CARD_LOWER_INTEREST_CARD)
    public WebElement buttonCardLowInterst;

    @FindBy(xpath = WEB_ELEMENT_Expected_text_Student_CARD)
    public WebElement expectedTextStudentCard;

    @FindBy(xpath = WEB_ELEMENT_EXPECTED_tEXT_LOWER_INTEREST_CARD)
    public WebElement expectedTextLowerInterestCard;

    public HomePageBankOfAmerica() {

        PageFactory.initElements(driver, this);
    }
    public void clickOnInputbox() {
        clickElement(inputOnlineIdBox);
    }

    public void sendKeysIDBox(String email) {
        sendKeysToElement(inputOnlineIdBox, (email));
    }


    public void sendKeysPasswordBox(String passWord) {

        sendKeysToElement(inputPassCodeBox, (passWord));
    }


        public void clickSingInButton() {
        clickElement(buttonSingIn);
    }
        public void getError(){
    getTextFromElement(TextAfterLogIn);
}
///////location Methode.
        public void navigateToLocation () {
        clickElement(buttonFindYourClosestBankATM);
}

         public void sendKeysToLocationBar (String searchKeys ){
         sendKeysToElement(inputSearchLocationBox, searchKeys);}

        public void clickOnSearchButton(){
            clickElement(buttonSearchLocation);
        }

        public void getTheLocation(){
    getTextFromElement(expectedResultLocation);
    }


    //credit card :
        public void navigateToCridtCardPage () {
        clickElement(buttonCriditCard);}

         public void clickRewardCard(){
            clickElement(buttonRewardCard);
        }
        public void getExpectedTextRewrdCard(){
        getTextFromElement(expectedTextCriditCard);
        }
        public void clickStudentCard(){
        clickElement(buttonCardStudent);
        }

         public void getExpectedTextStudentCard(){
        clickElement(expectedTextStudentCard);
    }
         public void clickLowerInterstCard(){
        clickElement(buttonCardLowInterst);
         }

    public void getExpectedTextLowerInterstCard(){
        getTextFromElement(expectedTextStudentCard);
    }

}

