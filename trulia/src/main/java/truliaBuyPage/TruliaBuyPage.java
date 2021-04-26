package truliaBuyPage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static truliaBuyPage.TruliaBuyPageLocators.*;
public class TruliaBuyPage extends BaseAPI {
    public TruliaBuyPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = WebElementBuy)
    WebElement buy;
    @FindBy(xpath =WebElementHouseForSale)
    public WebElement houseForSale;
    @FindBy(xpath =WebElementAgentListings)
    public WebElement agentListings;
    @FindBy(xpath =WebElementPrice)
    public WebElement price;
    @FindBy(xpath =WebElementMinPrice)
    public WebElement minPrice;
    @FindBy(xpath =WebElementMaxPrice)
    public WebElement maxPrice;
    @FindBy(xpath =WebElementHomeType)
    public List<WebElement>homeType;
    @FindBy(xpath =WebElementHomeForSellResult)
    public WebElement homeForSellResult;
    @FindBy(xpath =WebElementOpenHouseLink)
    public WebElement openHouseLink;
    @FindBy(xpath =WebElementOpenHouseResult)
    public WebElement openHouseResult;
    @FindBy(xpath =WebElementNewtListings)
    public WebElement newListings;

    public void hoverTruliaBuy() {
        mouseHoverJScript(buy);
    }
    public void selectMinPrice(int priceMin){
        clickElement(price);
        Select sel=new Select(minPrice);
        sel.deselectByValue(String.valueOf(priceMin));
    }
    public void selectMaxPrice(int priceMax){
        clickElement(price);
        Select sel=new Select(maxPrice);
        sel.deselectByValue(String.valueOf(priceMax));
    }
    public List<String> selectHomeType(List<String> type){
        ArrayList<String> allHomes= new ArrayList<>();
        waitUntilWebElementListVisible(homeType);
        for(int i = 0; i<allHomes.size(); i++){
             homeType.get(i).click();
        }
        return type;
    }
    public void nameOfAllNewListings(){
        String url="";
        List<WebElement> allURLs = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Wb Page: " + allURLs.size());
        Iterator<WebElement> iterator = allURLs.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }
    }

}