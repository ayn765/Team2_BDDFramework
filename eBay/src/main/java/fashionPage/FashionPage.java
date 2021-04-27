package fashionPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static fashionPage.FashionPageLocators.*;
public class FashionPage extends BaseAPI {

    public FashionPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = WEB_ELEMENT_FASHION_TAB)
    public WebElement fashionTab;
    @FindBy(xpath = WEB_ELEMENT_ALL_CATEGORIES_DROP_DOWN)
    public WebElement allCategoriesDropDown;
    @FindBy(xpath = WEB_ELEMENT_OPTION_ANTIQUES)
    public WebElement optionAntiques;
    @FindBy(xpath = WEB_ELEMENT_ART_PAGE_TEXT)
    public WebElement artPageTitle;
    //Women clothing
    @FindBy(xpath = WEB_ELEMENT_WOMEN_CLOTHING)
    public WebElement womenClothingTab;
    @FindBy(xpath = WEB_ELEMENT_DRESSES)
    public WebElement dressesTab;
    @FindBy(xpath = WEB_ELEMENT_SHOP_FOR_WOMEN_CLOTHING)
    public WebElement shopForWomenClothing;
    @FindBy(xpath = WEB_ELEMENT_SELECT_BY_ALL_BRANDS)
    public List<WebElement> allDressesBrands;
    @FindBy(xpath = FashionPageLocators.WEB_ELEMENT_SELECT_SIZE)
    public List<WebElement> allDressesSizes;
    @FindBy(xpath = WEB_ELEMENT_SELECT_BY_Size_TYPE)
    public List<WebElement> allSizeTypes;
    @FindBy(xpath=WEB_ELEMENT_ACTIVEWEAR_TAB)
    public WebElement activewearTab;
    @FindBy(xpath=WEB_ELEMENT_SHOP_BY_CATEGORY)
    public List<WebElement> allCategoriesActivewear;
    @FindBy(xpath=WEB_ELEMENT_SHOP_TOP_BRANDS)
            public List<WebElement> topBrandsActivewear;




            public void navigateToFashionPage() {
        clickJScript(fashionTab);
    }

    public void clickOnAllCategoriesDropDown() {
        clickJScript(allCategoriesDropDown);
    }

    public void selectOptionFromDropDown(String option) {
        selectFromDropDownByVisibleText(allCategoriesDropDown, option);
    }


    public void selectBrand(String dressBrand) {
        ArrayList<String> allBrands = new ArrayList<>();
        waitUntilWebElementListVisible(allDressesBrands);
        for (int i = 0; i < allDressesBrands.size(); i++) {
            allDressesBrands.get(i).click();
        }
    }


    public void selectSize(String dressSize) {
        ArrayList<String> allSizes = new ArrayList<>();
        waitUntilWebElementListVisible(allDressesSizes);
        for (int i = 0; i < allDressesSizes.size(); i++) {
            allDressesSizes.get(i).click();
        }
    }

    public void selectType(String dressType) {
        ArrayList<String> allTypes = new ArrayList<>();
        waitUntilWebElementListVisible(allSizeTypes);
        for (int i = 0; i < allSizeTypes.size(); i++) {
            allSizeTypes.get(i).click();
        }
    }

    public void selectCategory(String activewearCategory) {
        ArrayList<String> allCategories= new ArrayList<>();
        waitUntilWebElementListVisible(allCategoriesActivewear);
        for (int i = 0; i < allCategoriesActivewear.size(); i++) {
            allCategoriesActivewear.get(i).click();
        }
    }

    public void selectTopBrandsActivewear(String activewearBrand) {
        ArrayList<String> topBrands = new ArrayList<>();
        waitUntilWebElementListVisible(topBrandsActivewear);
        for (int i = 0; i < topBrandsActivewear.size(); i++) {
            topBrandsActivewear.get(i).click();
        }
    }















}




