package wirelessPage;

import common.BaseAPI;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static wirelessPage.ATTWirelessPageLocators.*;

public class ATTWirelessPage extends BaseAPI {

    public ATTWirelessPage() {
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

    @FindBy(css = WEB_ELEMENT_INPUT_EMAIL)
    public WebElement inputEmail;

    @FindBy(css = WEB_ELEMENT_BUTTON_SIGN_UP)
    public WebElement buttonSighUp;

    @FindBy(css = WEB_ELEMENT_MESSAGE_EMAIL_CONFIRMATION)
    public WebElement messageEmailConfirmation;

    @FindBy(css = WEB_ELEMENT_IFRAME_SHOP_ACCESSORIES)
    public WebElement iFrameShopAccessories;

    @FindBy(css = WEB_ELEMENT_BUTTON_SHOP_ACCESSORIES)
    public WebElement shopAllAccessories;

    @FindBy(xpath = WEB_ELEMENT_HOVER_OVER_DETAILS_CHARGING_PAD)
    public WebElement hoverOverDetailsChargingPad;

    @FindBy(css = WEB_ELEMENT_BUTTON_WHITE_CHARGING_PAD)
    public WebElement buttonWhiteChargingPad;

    @FindBy(css = WEB_ELEMENT_BUTTON_BLACK_CHARGING_PAD)
    public WebElement buttonBlackChargingPad;

    @FindBy(css = WEB_ELEMENT_IMAGE_CHARGING_PAD)
    public WebElement imageChargingPad;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_QUANTITY_CHARGING_PAD)
    public WebElement dropdownQuantityChargingPad;

    @FindBy(css = WEB_ELEMENT_BUTTON_ADD_TO_CART)
    public WebElement buttonAddToCart;

    @FindBy(css = WEB_ELEMENT_DROPDOWN_VIEW_VIDEO)
    public WebElement dropdownViewVideo;

    @FindBy(css = WEB_ELEMENT_BUTTON_PLAY_VIDEO)
    public WebElement buttonPlayVideo;

    @FindBy(css = WEB_ELEMENT_TIME_TRACKER_VIDEO)
    public WebElement timeTrackerVideo;

    @FindBy(css = WEB_ELEMENT_SLIDER_VIDEO)
    public WebElement sliderVideo;

    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement
    //    @FindBy(css = )
//    public WebElement

    public void signIn() {
        clickElement(buttonProfile);
        clickElement(buttonSignIn);
    }

    public void enterUserID(String userID) {
        implicitWait();
        inputUserID.sendKeys(userID);
    }

    public void enterPassword(String password) {
        waitUntilWebElementVisible(inputPassword);
        sendKeysToElement(inputPassword, password);
    }

    public void doSignIn() {
        clickElement(buttonConfirmSignIn);
    }

    public void clickOnShopAllAccessories() throws InterruptedException {

        implicitWait();
        jsScrollIntoView(shopAllAccessories);
        javaScriptExecutorClickOnElement(shopAllAccessories);
    }

    public void hoverOverAndClickChargingPadDetails() {
        clickElement(hoverOverDetailsChargingPad);
    }

    public void chooseWhiteColor() {
        clickElement(buttonWhiteChargingPad);
    }

    public void chooseBlackColor() {
        clickElement(buttonBlackChargingPad);
    }
    public void clickToViewVideo(){
        clickElement(dropdownViewVideo);
        playEmbeddedVideo(buttonPlayVideo);
    }
    public String getAttributePlayButton(){
        String actualTitle;
        return actualTitle = getAttributeFromElement(buttonPlayVideo, "title");
    }

    public void pauseVideo(){
        clickElement(buttonPlayVideo);
    }

    int timeBeforeSkip;
    int timeAfterSkip;
    public void skipPartOfVideo(){
        timeBeforeSkip = Integer.parseInt(getTextFromElement(timeTrackerVideo));
        sliderBarAction(sliderVideo);
        timeAfterSkip = Integer.parseInt(getTextFromElement(sliderVideo));
    }
    public boolean isVideoSkipped(){
        return timeAfterSkip > timeBeforeSkip;
    }

}
