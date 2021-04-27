package expediaHomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static expediaHomePage.expediaHomePageLocators.*;

public class ExpediaHomePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_STAY_CHECK)
    public WebElement Stay_Check;

    @FindBy(xpath = WEB_ELEMENT_GOING_TO_STAY)
    public WebElement GoingToStay;

    @FindBy(xpath = WEB_ELEMENT_SELECT_LOCATION)
    public WebElement SelectLocation;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement SearchButton;

    @FindBy(xpath = WEB_ELEMENT_CRUISE)
    public WebElement Cruise;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_GOING)
    public WebElement SearchGoing;

    @FindBy(xpath = WEB_ELEMENT_MORE_TRAVEL)
    public WebElement MoreTravel;

    @FindBy(xpath = WEB_ELEMENT_PACKAGES)
    public WebElement Packages;


    public void stayWeb(){ clickElement(Stay_Check); }
    public void goingToSearch(){ clickElement(GoingToStay); }
    public void goingTo(){ sendKeysToElement(SearchGoing,"LGA"); }
    public void selectLocation(){ clickElement(SelectLocation); }
    public void searchButton(){clickElement(SearchButton);}
    public void cruiseWeb(){ clickElement(Cruise); }
    public void searchGoingWeb(){ clickElement(SearchGoing);}
    public void moreTravel(){ clickElement(MoreTravel);}
    public void packages(){ clickElement(Packages);}
}
