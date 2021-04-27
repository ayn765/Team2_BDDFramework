package searchScreen;


import common.BaseAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.lang.model.element.Element;
import java.util.*;

import static searchScreen.SearchStepsLocators.*;

public class SearchScreen extends BaseAPI {

    public SearchScreen() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = WEB_ELEMENT_SEARCH_FIELD)
    public WebElement searchField;

    @FindBy(className = WEB_ELEMENT_SEARCH_RESULTS)
    public List<Element> searchResults;

    /*
     *   Wait for Search Screen to display
     */
    public void waitForSearchScreen() {
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(searchField));
    }

    /*
     *   Search for images using keywords
     */
    public void searchForImagesByKeyword(String searchText) {
        waitForSearchScreen();
        searchField.click();
        searchField.sendKeys(searchText);
        searchField.sendKeys(Keys.RETURN);
    }

    public Object getSearchResults(String searchText) {
    }
}
