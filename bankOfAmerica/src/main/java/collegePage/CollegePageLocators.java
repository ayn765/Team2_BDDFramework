package collegePage;

public class CollegePageLocators {

    public static final String WEB_ELEMENT_BETTER_MONEY_HABITS="//span[contains(text(),'Better Money Habits®')]";//xpath
    public static final String WEB_ELEMENT_COLLEGE_TAB ="//span[contains(text(),'College')]";//xpath
    public static final String WEB_ELEMENT_COLLEGE_HEADER="//h1[contains(text(),'College')]";//xpath
    //dept tab
    public static final String WEB_ELEMENT_DEBT_TAB ="#page--privacy-security > div:nth-child(6) > div.nav-topics.js-nav-topics > nav > ul > li:nth-child(2) > a > span";//css
    public static final String WEB_ELEMENT_FINANTIAL_ASSISTANCE_Option="//a[@id='SubNavSubTopic_debt_debt-financial-assistance']";//xpath
    public static final String WEB_ELEMENT_PAYING_OFF_DEPT="#SubTopicTab_paying_off_debt";//css
    public static final String WEB_ELEMENT_PAYING_OFF_DEPT_HEADER="//p[contains(text(),'Learn how to manage debt, including credit cards, ')]";//xpath
    //home ownership Tab
    public static final String WEB_ELEMENT_HOME_OWNERSHIP_TAB= " //span[@class='nav-topic__link'][normalize-space()='Homeownership']";//xpath
    public static final String WEB_ELEMENT_EQUITY_HEADER="//div[@class='tip-tile js-tip-tile text--template-theme-color-cx background--template-theme-color-cx--light']";//XPATH
    public static final String WEB_ELEMENT_HOME_EQUITY_OPTION="#SubNavSubTopic_home-ownership_home-equity";//css
    public static final String WEB_ELEMENT_MORTGAGE_BASICS="#SubTopicTab_mortgage_basics";//CSS
    public static final String WEB_ELEMENT_HEADER_MORTGAGE_BASICS="//h3[normalize-space()='What are mortgage points?']";//XPATH
    //Auto Tab
    public static final String WEB_ELEMENT_AUTO_TAB= "//span[@class='nav-topic__link'][normalize-space()='Auto'] ";//xpath
    public static final String WEB_ELEMENT_BUYING_A_CAR="#SubNavSubTopic_auto_buying-a-car";//css
    public static final String WEB_ELEMENT_AUTO_LOAN_TIPS="#SubNavSubTopic_auto_auto-loan-tips";//CSS
    public static final String WEB_ELEMENT_AUTO_LOAN_TIPS_HEADER="//p[contains(text(),'From interest rates to incentives, these factors c')]";//xpath
/**
 * Feature 2
 * do search
*/
//do search
public static final String WEB_ELEMENT_SEARCH_TAB="//span[text()='Search']";
    public static final String WEB_ELEMENT_SEARCH_BAR="//input[@id='nav-search-query']";
    public static final String WEB_ELEMENT_SEARCH_BUTTON="//input[@type='submit']";
    public static final String WEB_ELEMENT_BILL_PAYMENT_SEARCH_RESULT="//a[@name='Search Module - Search Results - Result 1']";//

    //select routing number from search bar dropdown
    public static final String WEB_ELEMENT_SELECT_ROUTING_NUMBER= "//a[@name='Search Module - Suggestion - routing number']";//XPATH
    public static final String WEB_ELEMENT_ROUTING_RESULT="//a[text()='Routing Numbers']";//XPATH CUS

    //search open an account
    public static final String WEB_ELEMENT_OPEN_ACCOUNT_RESULT="//span[text()='open an account']";

    //select billing dispute
    public static final String WEB_ELEMENT_SELECT_BILLING_DISPUTE="//a[@name='Search Module - Suggestion - billing dispute']";//XPATH CUS
    public static final String WEB_ELEMENT_BILLING_DISPUTE_RESULT="//a[text()='Dispute debit card charge online']";//XPATH RESULT
   //select erica
    public static final String WEB_ELEMENT_SELECT_ERICA="//a[@name='Search Module - Suggestion - Erica']";// xpath cus
    public static final String WEB_ELEMENT_ERICA_RESULT="//a[text()=' Meet Erica, your virtual financial assistant.']";

}

