package chaseHomePage;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static chaseHomePage.ChaseHomePageLocators.*;

public class ChaseHomePage extends BaseAPI {
    public ChaseHomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = WebElementOpenAccount)
    public WebElement openAccount;
    @FindBy(xpath = WebElementInputEmail)
    public WebElement inputEmail;
    @FindBy(xpath = WebElementCoupon)
    public WebElement coupon;
    @FindBy(xpath = WebElementMessage)
    public WebElement message;
    @FindBy(xpath = WebElementClose)
    public WebElement close;
    @FindBy(id =WebElementATM)
    public WebElement atmLink;
    @FindBy(xpath =WebElementFindAdvisor)
    public WebElement findAdvisor;
    @FindBy(xpath = WebElementSearchBox)
    public WebElement searchBox;
    @FindBy(xpath = WebElementSearch)
    public WebElement searchButton;
    @FindBy(xpath =WebElementAdvisor)
    public WebElement advisor;
    @FindBy(xpath =WebElementConnectWithAdvisor)
    public WebElement connectWithAdvisor;
    @FindBy(xpath =WebElementFirstNameInput)
    public WebElement firstName;
    @FindBy(xpath =WebElementLastNameInput)
    public WebElement lastName;
    @FindBy(xpath =WebElementEmail)
    public WebElement email;
    @FindBy(xpath =WebElementPhone)
    public WebElement phone;
    @FindBy(xpath=WebElementZipInput)
    public WebElement zipInput;
    @FindBy(xpath=WebElementAmountRangeDropDown)
    public WebElement rangeDropDown;
    @FindBy(xpath= WebElementRange)
    public WebElement range;
    @FindBy(xpath=WebElementNext)
    public WebElement nextButton;
    @FindBy(xpath=WebElementFinishedProcess)
    public WebElement finishedProcess;
    @FindBy(xpath=WebElementOpenAnAccount)
    public WebElement openAnAccount;
    @FindBy(xpath=WebElementHeaderPage)
    public WebElement headerPage;
    @FindBy(xpath=WebElementSeeAll)
    public WebElement seeAll;
    @FindBy(xpath=WebElementEnglishTab)
    public WebElement englishTab;
    @FindBy(xpath=WebElementSpanishTab)
    public WebElement spanishTab;
    @FindBy(xpath=WebElementText)
    public WebElement text;
    @FindBy(xpath=WebElementLinkedInIcon)
    public WebElement linkedInIcon;
    @FindBy(xpath=WebElementProceedButton)
    public WebElement proceedButton;


    public void inputEmailAddress(String email){
        sendKeysToElement(inputEmail,email);
    }
    public void inputAdvisor(String advisorName){
        sendKeysToElement(searchBox,advisorName);
    }
    public void inputSearch(String key){
        sendKeysToElement(firstName,key);
    }
    public void getAllLinksTitle(){
        WebElement parent_div = driver.findElement(By.xpath("/html/body/div/div[4]/header/div[4]/div[1]/div/div/div/div"));
        List<WebElement> div_kids = parent_div.findElements(By.className("header__section--dropdown__tile"));
        for (int i = 0; i < div_kids.size(); i++) {
            System.out.println(div_kids.get(i).getText());
        }
        }
    public void checkTheLanguage(){
        if (text.getText().contains("Choose what's right for you")){
            System.out.println("The language is English");
        }else if(text.getText().contains("Elige lo que es correcto para ti")){
            System.out.println("The Language is Spanish ");
        }
    }

}

