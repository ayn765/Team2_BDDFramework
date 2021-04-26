package internetPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static internetPage.AttInternetLocators.*;
public class AttInternetPage extends BaseAPI {
    public AttInternetPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WebElementAttInternet)
    public WebElement attInternet;
    @FindBy(xpath = WebElementFeedbackButton)
    public WebElement feedbackButton;
    @FindBy(xpath = WebElementGoodFeedback)
    public WebElement goodFeedBack;
    @FindBy(xpath = WebElementSelectTopicFeedback)
    WebElement selectTopicFeedBack;
    @FindBy(xpath = WebElementSubmitFeedback)
    public WebElement submitFeedback;
    @FindBy(xpath = WebElementCloseFeedback)
    public WebElement closeFeedback;
    @FindBy(xpath = WebElementFavorite)
    public WebElement favorite;
    @FindBy(css = WebElementStartShopping)
    public WebElement startShopping;
    @FindBy(xpath = WebElementPhone)
    public WebElement phone;
    @FindBy(css = WebElementPhoneColor)
    public WebElement phoneColor;
    @FindBy(css = WebElementPhoneCapacity)
    public WebElement phoneCapacity;
    @FindBy(xpath = WebElementPhoneAvlInStore)
    public WebElement phoneAvailable;
    @FindBy(xpath = WebElementPickTheStore)
    public WebElement pickTheStore;
    @FindBy(xpath = WebElementChat)
    public WebElement chat;
    @FindBy(css = WebElementChatInput)
    public WebElement chatInput;
    @FindBy(css = WebElementChatSend)
    public WebElement chatSend;
    @FindBy(css = WebElementAutomaticAnswer)
    public WebElement answer;
    @FindBy(xpath = WebElementSearchBar)
    public WebElement searchBar;
    @FindBy(xpath = WebElementSearchIcon)
    public WebElement searchIcon;
    @FindBy(xpath = WebElementLearnMore)
    public WebElement learnMore;


    public void navigateToInternet() {
        clickElement(attInternet);
    }
    public void feedbackExplore() {
        waitUntilWebElementVisible(feedbackButton);
        Actions action = new Actions(driver);
        action.moveToElement(feedbackButton).click().build().perform();
    }
    public void selectTopicForFeedback() {
        Select select = new Select(selectTopicFeedBack);
        select.selectByValue("Customer Service");
    }
    public void selectPhone() {
        try {

            scrollToElementJScript(phone);
        } catch (Exception E) {
            System.out.println("no such element");
        }
        clickElement(phone);
    }

    public void navigateChat() {
        waitUntilWebElementVisible(chat);
        clickElement(chat);
    }

    public void inputChat() {
        chatInput.sendKeys("I have a question about my previous bill");
    }
    public void inputQuestion(String search) {
        searchBar.sendKeys(search);
    }
    public String getTitle(String pageTitle) {
        String getTheTitle = driver.getTitle();
        return getTheTitle;
    }
}