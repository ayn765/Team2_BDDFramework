package wirelessPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static wirelessPage.ATTWirelessPageLocators.*;

public class ATTWirelessPage extends BaseAPI {

    public ATTWirelessPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_BUTTON_PROFILE)
    public WebElement buttonProfile;

    @FindBy(css = WEB_ELEMENT_IMG_LOGO)
    public WebElement imgLogo;

    @FindBy(css = WEB_ELEMENT_INPUT_USER_ID)
    public WebElement inputUserID;

    @FindBy(css = WEB_ELEMENT_INPUT_PASSWORD)
    public WebElement inputPassword;

    @FindBy(css = WEB_ELEMENT_BUTTON_SIGH_IN)
    public WebElement buttonSignIn;

    @FindBy(css = WEB_ELEMENT_BUTTON_CONFIRM_SIGN_IN)
    public WebElement buttonConfirmSignIn;

    @FindBy(css = WEB_ELEMENT_ERROR_MESSAGE_SIGN_IN)
    public WebElement errorMessageSignIn;

    @FindBy(css = WEB_ELEMENT_ERROR_BAD_REQUEST)
    public WebElement errorBadRequest;

    @FindBy(css = WEB_ELEMENT_BUTTON_SHOP_IPHONE12)
    public WebElement buttonShopIPhone12;

    @FindBy(css = WEB_ELEMENT_RADIOBUTTON_SILVER)
    public WebElement radiobuttonSilver;

    @FindBy(css = WEB_ELEMENT_RADIOBUTTON_GOLD)
    public WebElement radiobuttonGold;

    @FindBy(css = WEB_ELEMENT_RADIOBUTTON_GRAPHITE)
    public WebElement radiobuttonGraphite;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_INSTALLMENT_PLAN)
    public WebElement buttonInstallmentPlan;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_FULL_PRICE)
    public WebElement buttonFullPrice;

    @FindBy(css = WEB_ELEMENT_BUTTON_CONTINUE_WITH_IPHONE12)
    public WebElement buttonContinueWithIPhone12;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_STORAGE_256)
    public WebElement buttonStorage256;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_ADD_LINE)
    public WebElement buttonAddLine;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_UPGRADE_DEVICE)
    public WebElement buttonUpgradeDevice;

//    @FindBy(css = )
//    public WebElement

    public void signIn() {
    clickElement(buttonProfile);
    clickElement(buttonSignIn);
    }

    public void enterUserID(String userID){
        implicitWait();
        inputUserID.sendKeys("fjklsdf");
    }

    public void enterPassword(String password){
        waitUntilWebElementVisible(inputPassword);
     sendKeysToElement(inputPassword, password);
    }

    public void doSignIn(){
        clickElement(buttonConfirmSignIn);
    }
}
