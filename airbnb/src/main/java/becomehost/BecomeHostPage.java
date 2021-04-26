package becomehost;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static becomehost.BecomeHostLocators.*;
public class BecomeHostPage extends BaseAPI {
    public BecomeHostPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WebElementBecomeHost)
    public WebElement becomeHostButton;
    @FindBy(xpath = WebElementGetStartedButton)
    public WebElement getStartedButton;
    @FindBy(xpath = WebElementCountryDropDown)
    public WebElement countryDropDown;
    @FindBy(css = WebElementInputPhoneNumber)
    public WebElement inputPhoneNumber;
    @FindBy(xpath = WebElementContinueClick)
    public WebElement clickOnContinue;
    @FindBy(css = WebElementEmail)
    WebElement emailAddress;
    @FindBy(css = WebElementPhoneNumber)
    WebElement phoneNumberForNotification;
    @FindBy(css = WebElementEmailNotCheckBox)
    WebElement emailNotCheckBox;
    @FindBy(xpath = WebElementContinue)
    WebElement continueButton;
    @FindBy(xpath = WebElementNotificationMessage)
    public WebElement notificationMessage;
    @FindBy(xpath = WebElementProtectWhileHosting)
    WebElement protectHost;
    @FindBy(css = WebElementHelpfulThumb)
    public WebElement helpfulArticle;
    @FindBy(xpath=WebElementLearnFromArealHost)
    public  WebElement learnFromArealHost;
    @FindBy(xpath=WebElementDatePickedForWebinar)
    public  WebElement datePickedForWebinar;
    @FindBy(className=WebElementClaimSeatButton)
    public WebElement claimSeat;
    @FindBy(xpath=WebElementMessageAfterRegister)
    public WebElement message;
    @FindBy(xpath = WebElementEntirePlaceDropDown)
    WebElement entirePlace;
    @FindBy(xpath = WebElementEntirePlaceChoice)
    WebElement entirePlaceChoice;
    @FindBy(xpath = WebElementPrivateRoomChoice)
    WebElement privateRoomChoice;
    @FindBy(xpath = WebElementSharedRoomChoice)
    WebElement sharedRoomChoice;
    @FindBy(xpath = WebElementGuestCapacity)
    WebElement guestCapacity;
    @FindBy(xpath =WebElementLocation)
    public WebElement location;
    @FindBy(xpath =WebElementMoneyEarned)
    public WebElement moneyEarned;



    public void clickOnbecomeHostButton() {
        clickElement(becomeHostButton);
    }

    public void clickOnGetStartedButton() {
        clickElement(getStartedButton);
    }

    public void selectCountry(String country) {
        Select select = new Select(countryDropDown);
        select.selectByVisibleText(country);
    }

    public void phoneInput(int phoneNumber) {
        inputPhoneNumber.sendKeys(String.valueOf(phoneNumber));
    }

    public void clickOnContinueToSignUp() {
        clickElement(clickOnContinue);
    }

    public void inputEmail(String email) {
      emailAddress.sendKeys(email);
    }

    public void phoneNumberToSend(int phoneNumber) {
     phoneNumberForNotification.sendKeys(String.valueOf(phoneNumber));
    }

    public void checkTheBoxForNotification() {
        clickElement(emailNotCheckBox);
    }

    public void continueToSignUp() {
        clickElement(continueButton);
    }

    public void protectedHostLink() {
        clickElement(protectHost);
    }

    public void chooseRoomOption() {
        clickElement(entirePlace);
        roomOption("Entire place");
    }

    public void clickOnEntirePlaceMark() {
       clickElement(entirePlaceChoice); }

    public void clickOnPrivateRoomMark() {
        clickElement(privateRoomChoice);
    }

    public void clickOnSharedRoomMark() {
        clickElement(sharedRoomChoice);
    }
    public void roomOption(String option) {
        switch (option) {
            case "Entire place":
                clickOnEntirePlaceMark();
                break;
            case "Private Room":
                clickOnPrivateRoomMark();
                break;
            case "Shared Room":
                clickOnSharedRoomMark();
                break;
        }
    }

    public void selectNumberOfGuests(int numGuests) {
        List<WebElement> guests = driver.findElements(By.xpath("//div[@aria-labelledby='capacity-dropdown']"));
        int s = guests.size();
        for (WebElement element : guests) {
            System.out.println(element.getText());
        }}
        public void howManyGuests() {
            selectNumberOfGuests(2);;
            clickElement(guestCapacity);
        }


}