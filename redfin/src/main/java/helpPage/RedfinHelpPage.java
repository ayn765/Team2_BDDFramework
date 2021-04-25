package helpPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;


import static helpPage.RedfinHelpPageLocators.*;

public class RedfinHelpPage extends BaseAPI {
    public RedfinHelpPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_INPUT_SEARCH)
    public WebElement inputSearch;

    @FindBy(css = WEB_ELEMENT_TITLE_SEARCH_RESULT)
    public WebElement titleSearchResult;

    @FindBy(css = WEB_ELEMENTS_LINKS_HELP_PAGE_MENU)
    public List<WebElement> linksHelpPageMenu;

    @FindBy(css = WEB_ELEMENT_BUTTON_SUBMIT_A_REQUEST)
    public WebElement buttonSubmitARequest;

    @FindBy(xpath = WEB_ELEMENT_DROPDOWN_SELECT_TYPE_REQUEST)
    public WebElement dropdownSelectTypeRequest;

    @FindBy(css = WEB_ELEMENT_INPUT_EMAIL_ADDRESS)
    public WebElement inputEmailAddress;

    @FindBy(css = WEB_ELEMENT_INPUT_REQUEST_SUBJECT)
    public WebElement inputRequestSubject;

    @FindBy(css = WEB_ELEMENT_INPUT_REQUEST_DESCRIPTION)
    public WebElement inputRequestDescription;

    @FindBy(css = WEB_ELEMENT_INPUT_REQUEST_ATTACHMENT)
    public WebElement inputRequestAttachment;

    @FindBy(css = WEB_ELEMENT_BUTTON_SUBMIT)
    public WebElement buttonSubmit;

    @FindBy(xpath = WEB_ELEMENT_REQUEST_CONFIRMATION)
    public WebElement requestConfirmation;

    @FindBy(css = WEB_ELEMENT_BUTTON_SELECT_TOPIC)
    public WebElement buttonSelectTopic;

    @FindBy(css = WEB_ELEMENT_AUTOCOMPLETE_OPTIONS)
    public WebElement autocompleteOptions;

    public void sendSearchRequest(String searchRequest) throws Exception {
        sendKeysToElement(inputSearch, searchRequest);
        pressEnterKey();
    }
    public boolean verifyPageTitles() throws Exception {
        return getUrlsAndTitlesFromListWebElementAndCompareToExcelDoc(linksHelpPageMenu,"href",pathFromUserDir + "/src/test/resources/RedfinTestData.xlsx", "HelpMenuTitles");
    }
    public void clickSubmitRequest(){
        clickElement(buttonSubmitARequest);
    }
    public void selectTopicOfRequest() throws Exception {
        clickElement(buttonSelectTopic);
        pressArrowDownKey();
        pressEnterKey();
        //        driver.findElement(By.xpath("//option[text()='"+ topicOfRequest+"']")).click();
    }
    public void sendEmailAddress(String emailAddress){
        sendKeysToElement(inputEmailAddress, emailAddress);
    }
    public void sendSubjectOfRequest(String subjectOfRequest){
        sendKeysToElement(inputRequestSubject, subjectOfRequest);
    }
    public void sendDescriptionOfRequest(String descriptionOfRequest){
        sendKeysToElement(inputRequestDescription, descriptionOfRequest);
    }

    public void uploadFile(){
        inputRequestAttachment.sendKeys("C:\\Users\\Erdosa\\IdeaProjects\\Team2_BDDFramework\\redfin\\src\\test\\resources\\TestFile.txt");
    }
    public void submitCompletedRequest(){
        clickElement(buttonSubmit);
    }
    public void typeRequestAndSelectAPrompt(String searchRequest){
        sendKeysToElement(inputSearch, searchRequest);
        clickElement(autocompleteOptions);
    }
}
