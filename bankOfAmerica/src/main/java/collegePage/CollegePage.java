package collegePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static collegePage.CollegePageLocators.*;
public class CollegePage extends BaseAPI {
    public CollegePage(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath=WEB_ELEMENT_BETTER_MONEY_HABITS)
    public WebElement betterMoneyHabits;
    @FindBy(xpath = WEB_ELEMENT_COLLEGE_TAB)
    public WebElement collegeTab;
    @FindBy(xpath=WEB_ELEMENT_COLLEGE_HEADER)
    public WebElement collegeHeader;


    @FindBy(css =WEB_ELEMENT_DEBT_TAB)
    public WebElement deptTab;
    @FindBy(xpath=WEB_ELEMENT_FINANTIAL_ASSISTANCE_Option)
    public WebElement financialAssistanceOptions;
    @FindBy(css= WEB_ELEMENT_PAYING_OFF_DEPT)
    public WebElement payingOffDeptTab;
    @FindBy(xpath=WEB_ELEMENT_PAYING_OFF_DEPT_HEADER)
    public WebElement payingOffDeptHeader;

    @FindBy(xpath=WEB_ELEMENT_HOME_OWNERSHIP_TAB)
    public WebElement homeOwnershipTab;
    @FindBy(css=WEB_ELEMENT_HOME_EQUITY_OPTION)
    public WebElement homeEquityOption;
    @FindBy(css=WEB_ELEMENT_MORTGAGE_BASICS)
    WebElement mortgageBasics;
    @FindBy(xpath=WEB_ELEMENT_HEADER_MORTGAGE_BASICS)
    public WebElement headerMortgageBasics;

    @FindBy(xpath=WEB_ELEMENT_AUTO_TAB)
    public WebElement autoTab;
    @FindBy(css=WEB_ELEMENT_BUYING_A_CAR)
    public WebElement buyingCar;
    @FindBy(css=WEB_ELEMENT_AUTO_LOAN_TIPS)
    public WebElement autoLoanTips;
    @FindBy(xpath=WEB_ELEMENT_AUTO_LOAN_TIPS_HEADER)
    public WebElement autoLoanTipsHeader;

    //do search
    @FindBy(css=WEB_ELEMENT_SEARCH_TAB)
    public WebElement searchTab;
    @FindBy(xpath=WEB_ELEMENT_SEARCH_BAR)
    public WebElement searchBar;
    @FindBy(xpath=WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;
   //SearchBill pay
    @FindBy (xpath=WEB_ELEMENT_BILL_PAYMENT_SEARCH_RESULT)
    public WebElement billPaymentSearchResult;

    //select routing number from search drop down
    @FindBy(xpath=WEB_ELEMENT_SELECT_ROUTING_NUMBER)
    public WebElement selectRoutingNumber;
    @FindBy(xpath= WEB_ELEMENT_ROUTING_RESULT)
    public WebElement routingResult;

    //search open an account
    @FindBy (xpath = WEB_ELEMENT_OPEN_ACCOUNT_RESULT)
    public WebElement openAnAccountResult;

    //select billing dispute from search drop down
    @FindBy(xpath=WEB_ELEMENT_SELECT_BILLING_DISPUTE)
    public WebElement selectBillingDisputeFromSearchDropDown;
    @FindBy(xpath=WEB_ELEMENT_BILLING_DISPUTE_RESULT)
    public WebElement billingDisputeHeader;

    //select erica from search drop down
    @FindBy(xpath=WEB_ELEMENT_SELECT_ERICA)
    public WebElement selectEricaFromSearchDropDown;
    @FindBy(xpath=WEB_ELEMENT_ERICA_RESULT)
    public WebElement ericaSearchResult;


    //Background Steps
    public void clickBetterMoneyTab(){  betterMoneyHabits.click();    }

    public void navigateToCollegePage(){  clickElement(collegeTab); }

     //DeptTab
     public void hoverOverDepthTab(){ clickElement(deptTab);}

     public void selectFinancialAssistanceFromDeptDropDown(){ clickElement(financialAssistanceOptions); }

     public void clickPayOffDept(){ payingOffDeptTab.click(); }


     //HomeOwnerTab
     public void hoverOverHomeOwnershipTab(){ mouseHoverJScript(homeOwnershipTab);}

     public void homeEquityOption(){clickElement(homeEquityOption);}

     public void clickMortgageBasics(){  mortgageBasics.click();}

     //AutoTab
     public void hoverOverAutoTab(){   mouseHoverJScript(autoTab);   }

     public void clickBuyingCar(){clickElement(buyingCar);}

     public void clickAutoLoanTips(){  clickElement(autoLoanTips);}

}



