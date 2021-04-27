package truliaHomePage;

import common.BaseAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static truliaHomePage.TruliaHomePageLocators.*;

public class TruliaHomePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_BUTTON_BUY)
    public WebElement buttonBuy;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_List_BUY)
    public List<WebElement> buttonListBuy;

    @FindBy(css = WEB_ELEMENT_BUTTON_IN_DROP_DOWN_HOME_FOR_SALE)
    public WebElement buttonInDropDown_homeForSale;

    @FindBy(css = WEB_ELEMENT_BUTTON_RENT)
    public WebElement buttonRent;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_LIST_RENT)
    public List<WebElement> buttonListRent;

    @FindBy(css = WEB_ELEMENT_BUTTON_MORTGAGE)
    public WebElement buttonMortgage;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_LIST_MORTGAGE)
    public List<WebElement> buttonListMortgage;


    @FindBy(xpath = WEB_ELEMENT_LIST_CATEGORY_SEARCH_BAR_)
    public List<WebElement> listcategorySearchbar;

    @FindBy(xpath = WEB_ELEMENT_HOME_IMAGE)
    public WebElement homeImage;
    @FindBy(xpath = WEB_ELEMENT_BUTTON_SEARCH_BAR)
    public WebElement buttonSearchBar;
    @FindBy(css= WEB_ELEMENT_INPUT_SEARCH_BAR)
    public WebElement inputSearchBar;

    @FindBy(xpath= WEB_ELEMENT_CURRENT_PAGE)
    public WebElement currentPage;

    @FindBy(css= WEB_ELEMENT_NEW_TAB)
    public WebElement newTab ;

    @FindBy(css= WEB_ELEMENT_Image_NEW_TAB)
    public WebElement ImageNewTab ;

    @FindBy(css= WEB_ELEMENT_TEXT_IN_THE_PARENT_PAGE)
    public WebElement text_In_Parent_page ;

    @FindBy(css= WEB_ELEMENT_BUTTON_PROFILE)
    public WebElement buttonProfile ;

    @FindBy(xpath= WEB_ELEMENT_LINKS_LIST_REAL_ESTATE_MARKET)
    public WebElement linksRealEstateMarket ;

    @FindBy(xpath= WEB_ELEMENT_LINKS_LIST_EXPLORE_TRULIA)
    public WebElement linksExploreTrulia ;

    @FindBy(xpath= WEB_ELEMENT_LINKS_LIST_POPULAR_SEARCH)
    public WebElement linksPopularSearch ;


    @FindBy(xpath= WEB_ELEMENT_BUTTON_BUY_SEARCH_BAR)
    public WebElement buttonBuySearchBare;

    @FindBy(xpath= WEB_ELEMENT_BUTTON_RENT_SEARCH_BAR)
    public WebElement buttonRentSearchBare;

    @FindBy(xpath= WEB_ELEMENT_BUTTON_SOLD_SEARCH_BAR)
    public WebElement buttonSoldSearchBare;

    @FindBy(xpath= WEB_ELEMENT_Expected_TEXT_AFTER_SAERCH)
    public WebElement expectedTextAfterSearch;

    public TruliaHomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clearInputFieldAndSendKeysToElement() {
        try {
            waitUntilWebElementVisible(inputSearchBar);
            inputSearchBar.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SEND KEYS TO WEB ELEMENT");
        }

    }

    public void sendKeySearchBox( String keysToSend){ inputSearchBar.sendKeys(keysToSend);}


    public void clickBuyButton(){
        clickElement(buttonBuySearchBare);
    }

    public void clickSoldButton(){
        clickElement(buttonSoldSearchBare);
    }

    public void clickRentButton(){
        clickElement(buttonRentSearchBare);
    }

    public void clickSearchButton(){
        clickElement(buttonSearchBar);
    }

public String getText(){
    System.out.println("gftsgbj bnjjj nmjj   nnj" +getTextFromElement(expectedTextAfterSearch));
    return getTextFromElement(expectedTextAfterSearch);

}
}
