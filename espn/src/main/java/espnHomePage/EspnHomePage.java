package espnHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import static espnHomePage.EspnHomePageLocators.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class EspnHomePage extends BaseAPI {
    public EspnHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WebElementSubscribe)
    WebElement subscribe;
    @FindBy(xpath =WebElementSignUpLink)
    public WebElement signUpLink;
    @FindBy(xpath =WebElementFname)
    public WebElement fName;
    @FindBy(xpath =WebElementLname)
    public WebElement lName;
    @FindBy(xpath =WebElementPassword)
    public WebElement password;
    @FindBy(xpath =WebElementEmail)
    public WebElement email;
    @FindBy(xpath =WebElementShowPassword)
    public WebElement showPassword;
    @FindBy(xpath =WebElementDisneyCheck)
    public WebElement disneyCheckBox;
    @FindBy(xpath =WebElementSignUpButton)
    public WebElement signUpButton;
    @FindBy(css=WebElementAccountDropdown)
    public WebElement accountDropDown;
    @FindBy(xpath= WebElementFavoriteButton)
    public WebElement favoriteButton;
    @FindBy(xpath=WebElementSuggestedTeams)
    public List<WebElement> suggestedTeam;
    @FindBy(xpath=WebElementFollowedTeams)
    public WebElement followedTeams;
    @FindBy(xpath=WebElementVideoSettings)
    public WebElement videoSettings;
    @FindBy(xpath=WebElementVideoAutoPlay)
    public WebElement videoAutoPlay;
    @FindBy(xpath=WebElementTvProvider)
    public WebElement tvProvider;
    @FindBy(xpath=WebElementListTvProvider)
    public List <WebElement> listTvProvider;




    public void inputFname(String firstName){
        sendKeysToElement(fName,firstName);
    }
    public void inputLname(String lastName){
        sendKeysToElement(lName,lastName);
    }
    public void inputEmail(String emailAddress){
        sendKeysToElement(email,emailAddress);
    }
    public void inputPassword(String userPassword){
        sendKeysToElement(password,userPassword);
    }
    public void suggestedTeamsList(String team){
       Actions action=new Actions(driver);
       action.moveToElement((WebElement) suggestedTeam).build().perform();
        ArrayList<String> allTeams= new ArrayList<>();
        waitUntilWebElementListVisible(suggestedTeam);
        for(int i = 0; i<suggestedTeam.size(); i++){
            suggestedTeam.get(i).click();
        }
    }
    public void selectFromListTv() {
        ArrayList<String> allTvProvider = new ArrayList<>();
        waitUntilWebElementListVisible(listTvProvider);
        for (int i = 0; i < listTvProvider.size(); i++) {
            listTvProvider.get(i).click();
        }
    }}


