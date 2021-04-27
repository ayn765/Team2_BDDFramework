package modelsPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static modelsPage.ModelsPageLocators.*;
public class ModelsPage extends BaseAPI {

    public ModelsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_MODELS_PAGE)
    public WebElement modelsPage;
    @FindBy(xpath = WEB_ELEMENT_ALL_MODELS_TAB)
    public WebElement allModels;
    @FindBy(xpath = WEB_ELEMENT_MODEL_X3)
    public WebElement modelX3;
    @FindBy(xpath = WEB_ELEMENT_SHOP_BY_INVENTORY)
    public WebElement shopInventoryTab;
    @FindBy(xpath = WEB_ELEMENT_INPUT_ZIP_CODE)
    public WebElement inputZipCode;
    @FindBy(xpath = WEB_ELEMENT_SHOP_NOW_BUTTON)
    public WebElement shopNowButton;
    @FindBy(xpath = WEB_ELEMENT_CONTACT_DEALER_HEADER)
    public WebElement contactDealerHeader;
    @FindBy(xpath = WEB_ELEMENT_MODELS_PAGE_SHOP_INVENTORY)
    public WebElement modelsPageShopInventoryTab;
    @FindBy(xpath = WEB_ELEMENT_SHOP_BY_INVENTORY_RESULT)
    public WebElement inventoryResult;
    //Shop by model
    @FindBy(xpath=WEB_ELEMENT_SEDAN_TAB)
    public WebElement sedanTab;
    @FindBy(css = WEB_ELEMENT_SEDAN_OPTIONS)
    public List<WebElement> sedanOptions;
    @FindBy(xpath=WEB_ELEMENT_TEST_DRIVE_HEADER)
    public WebElement testDriveHeader;


    public void navigateToModelsPage() {
        modelsPage.click();
    }

    public void clickOnAllModelsTab() {
        mouseHoverJScript(allModels);
    }

    public void chooseModelsX3() {
        mouseHoverJScript(modelX3);
    }

    public void clickShopInventoryTabOnFilterPage() {

        clickJScript(shopInventoryTab);
    }

    public void inputZipCodeToSearchBar(String zipcode) {
        sendKeysToElement(inputZipCode, zipcode);
    }


    public void shopInventoryFromModelPage() {
        clickJScript(modelsPageShopInventoryTab);
    }
   public void clickSedanTab(){
     clickJScript(sedanTab);
   }


        public void shopByModel(String model) {
        ArrayList<String> allSedans = new ArrayList<>();
        waitUntilWebElementListVisible(sedanOptions);
        for (int i = 0; i < sedanOptions.size(); i++) {
            sedanOptions.get(i).click();
        }
    }
}


