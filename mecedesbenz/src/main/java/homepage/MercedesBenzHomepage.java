package homepage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

import static homepage.MercedesBenzHomepageLocators.*;

public class MercedesBenzHomepage extends BaseAPI {

    ConnectToSqlDB connectToSqlDB;

    public MercedesBenzHomepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_VIDEO_CONTROL)
    public WebElement videoControl;

    @FindBy(css = WEB_ELEMENT_RADIO_BUTTON_SWITCH_TO_VIDEO)
    public WebElement radioButtonSwitchToVideo;

    @FindBy(css = WEB_ELEMENT_PLAY_VIDEO)
    public WebElement playVideo;

    @FindBy(css = WEB_ELEMENT_PAUSE_VIDEO)
    public WebElement pauseVideo;

    @FindBy(css = WEB_ELEMENT_BUTTON_MY_ACCOUNT)
    public WebElement buttonMyAccount;

    @FindBy(css = WEB_ELEMENT_BUTTON_REGISTER)
    public WebElement buttonRegister;

    @FindBy(css = WEB_ELEMENT_INPUT_EMAIL_ADDRESS)
    public WebElement inputEmailAddress;

    @FindBy(css = WEB_ELEMENT_INPUT_FIRST_NAME)
    public WebElement inputFirstName;

    @FindBy(css = WEB_ELEMENT_INPUT_LAST_NAME)
    public WebElement inputLastName;

    @FindBy(css = WEB_ELEMENT_INPUT_PASSWORD)
    public WebElement inputPassword;

    @FindBy(css = WEB_ELEMENT_CHECKBOX_TERMS)
    public WebElement checkboxTerms;

    @FindBy(css = WEB_ELEMENT_BUTTON_CREATE_ACCOUNT)
    public WebElement buttonCreateAccount;

    @FindBy(css = WEB_ELEMENT_MESSAGE_EMAIL_SIGN_UP)
    public WebElement messageEmailSignUp;

    @FindBy(css = WEB_ELEMENTS_LINKS_SHOPPING_TOOLS)
    public List<WebElement> linksShoppingTools;

    @FindBy(css = WEB_ELEMENTS_HEADERS_IN_SPOTLIGHT)
    public List<WebElement> headersInSpotlight;

    @FindBy(css = WEB_ELEMENTS_PARAGRAPHS_IN_SPOTLIGHT)
    public List<WebElement> paragraphsInSpotlight;
//
//    @FindBy(css = )
//    public WebElement


    public void playVideo() throws InterruptedException {
        clickElement(radioButtonSwitchToVideo);
        Thread.sleep(1000);
        waitUntilWebElementVisible(videoControl);
    }

    public void pauseVideo() throws InterruptedException {
        clickElement(pauseVideo);
        Thread.sleep(1000);
    }

    public void register() {
        clickElement(buttonMyAccount);
        clickElement(buttonRegister);
    }

    public void enterEmailAddress(String emailAddress) {
        sendKeysToElement(inputEmailAddress, emailAddress);
    }

    public void enterFirstName(String firstName) {
        sendKeysToElement(inputFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeysToElement(inputLastName, lastName);
    }

    public void enterPassword(String password) {
        sendKeysToElement(inputPassword, password);
    }

    public void agreeToTermsAndSubmit() {
        checkboxTerms.click();
        clickElement(buttonCreateAccount);
        waitUntilWebElementVisible(messageEmailSignUp);
    }

    public boolean verifyLinksTitles() throws Exception {
        return getUrlsAndTitlesFromListWebElementAndCompareToExcelDoc(linksShoppingTools, "href", pathFromUserDir + "/src/test/resources/MercedesBenzTestData.xlsx", "ShoppingToolsLinksTitles");
    }

    public boolean verifyHeadersSpotlight() throws Exception {
        ArrayList<String> headers = getTextFromListWebElement(headersInSpotlight);
        connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.insertStringArrayListToSqlTable(headers,"mercedes_test1", "headers" );
        ArrayList<String> expectedHeaders = connectToSqlDB.readDataBase("mercedes_test1", "headers");
        System.out.println(expectedHeaders);
        return compareTwoArrayListsString(expectedHeaders, headers);
    }

    public boolean verifyTextSpotLight() throws Exception {
        ArrayList<String> paragraphs = getTextFromListWebElement(paragraphsInSpotlight);
        connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.insertWebElementTextArrayListToSqlTable(paragraphsInSpotlight, "mercedes_test2", "text_spotlight");
        ArrayList<String> expectedParagraphs = connectToSqlDB.readDataBase("mercedes_test2", "text_spotlight");
        return compareTwoArrayListsString(expectedParagraphs, paragraphs);
    }

}
