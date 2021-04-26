package homeLoansPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static homeLoansPage.HomeLoansLocators.*;

public class HomeLoansPage extends BaseAPI {
    public HomeLoansPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WebElementHomeLoans)
    WebElement homeLoans;
    @FindBy(id = WebElementFindHome)
    public WebElement findHome;
    @FindBy(xpath = WebElementNewConstruction)
    public WebElement newConstruction;
    @FindBy(xpath = WebElementHomeOhio)
    public WebElement homeOhio;
    @FindBy(xpath = WebElementHomeOhioColumbus)
    public WebElement homeOhioColumbus;
    @FindBy(xpath = WebElementSelectByPrice)
    public WebElement selectByPrice;
    @FindBy(xpath = WebElementHomeResultSearch)
    public WebElement resultSearch;
    @FindBy(css = webElementButtonHomeValue)
    public WebElement buttonValue;
    @FindBy(css = webElementInputLocation)
    public WebElement inputLocation;
    @FindBy(xpath = webElementSearchButton)
    public WebElement searchButton;
    @FindBy(xpath = webElementFirstLineAddress)
    public WebElement firstLine;
    @FindBy(xpath = webElementSecondLineAddress)
    public WebElement secondLine;
    @FindBy(xpath =  webElementZipResult)
    public WebElement zipResult;
    @FindBy(id=WebElementScheduleAppt)
    public WebElement scheduleAppt;
    @FindBy(id= WebElementStepsAppointment)
    public WebElement stepsAppt;
    @FindBy(id= WebElementContinue)
    public WebElement continueButton;
    @FindBy(xpath = webElementVideoSchedule)
    public WebElement video;

    public void navigateToHomeLoans() {
        clickElement(homeLoans);
    }

    public void filterSearch() {
        Select select = new Select(selectByPrice);
        select.selectByValue("1");
    }
    public void searchAddressHouse(String address){
        inputLocation.sendKeys(address);
    }
    public String getFullAddress() {
    String line1=firstLine.getText();
    String line2=secondLine.getText();
    String fullAddress=line1+"  "+line2;
    return fullAddress;
    }
 public boolean isVideoDisplayed(){
      video.isDisplayed();
        return true;
 }

}