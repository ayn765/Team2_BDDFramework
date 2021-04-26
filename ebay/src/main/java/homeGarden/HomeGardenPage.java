package homeGarden;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static homeGarden.HomeGardenPageLocators.*;
public class HomeGardenPage extends BaseAPI {
    public HomeGardenPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = WebElementHomeGardenButton)
    public WebElement homeGardenButton;
    @FindBy(css = WebElementHomeGardenShopByCategory)
    public WebElement shopHomeGardenCategory;
    @FindBy(xpath = WebElementFashionMenu)
    public WebElement fashionMenu;
    @FindBy(xpath = WebElementFashionWomenClothing)
    public WebElement fashionWomenClothing;
    @FindBy(xpath=WebElementDinnerware)
    public WebElement dinnerwareLink;
    @FindBy(xpath = WebElementSort)
    public WebElement sort;
    @FindBy(xpath =WebElementColor)
    public List<WebElement> color;
    @FindBy(xpath =WebElementBrand)
    public List<WebElement> brand;
    @FindBy(xpath =WebElementMinPrice)
    public WebElement minPrice;
    @FindBy(xpath =WebElementMaxPrice)
    public WebElement maxPrice;
    @FindBy(xpath = WebElementSmartHome)
    public WebElement smartHome;
    @FindBy(css = WebElementSmartTv)
    public WebElement smartTv;
    @FindBy(xpath =WebElementTvsBrand)
    public List<WebElement> tvsBrand;
    @FindBy(css = WebElementShopByBrandButtonArrow)
    public WebElement shopByBrandArrow;
    @FindBy(xpath = WebElementShopByBrandSony)
    public WebElement shopByBrandSony;
    @FindBy(xpath = WebElementSelectTVInSonyBrand)
    public WebElement selectedTvInSonyBrand;
    @FindBy(xpath = WebElementAddTvToTheCart)
    public WebElement addTvToTheCart;
    @FindBy(xpath = WebElementDoNotAddWarranty)
    public WebElement doNotAddWarranty;
    @FindBy(xpath = WebElementSaveForLater)
    public WebElement saveForLater;




  public void sortBy(String sortBy){
      mouseHoverJScript(sort);
      WebElement ul = driver.findElement(By.xpath("//*[@id=\"s0-27_1-9-0-1[0]-0-1-6-5-35-7-45\"]/ul"));
      List<WebElement> all_lis = ul.findElements(By.className("btn"));
      for (int i = 0; i < all_lis.size(); i++) {
          all_lis.get(i).click();
      }}
  public void selectColor(String colorWare){
      ArrayList<String> allColors= new ArrayList<>();
      waitUntilWebElementListVisible(color);
      for(int i = 0; i<color.size(); i++){
          color.get(i).click();
      }}

 public void selectBrand(String brandWare){
     ArrayList<String> allBrands= new ArrayList<>();
     waitUntilWebElementListVisible(brand);
     for(int i = 0; i<brand.size(); i++){
         brand.get(i).click();
     }
      }

  public void inputMinPrice(int priceMin){
      sendKeysToElement(minPrice,String.valueOf(priceMin));
  }
  public void inputMaxPrice(int priceMax){
    sendKeysToElement(maxPrice,String.valueOf(priceMax));
  }

  public void selectTvBrand(String brandTv){
      ArrayList<String> allTvs= new ArrayList<>();
      waitUntilWebElementListVisible(tvsBrand);
      for(int i = 0; i<tvsBrand.size(); i++){
          tvsBrand.get(i).click();
      }
  }
  }

