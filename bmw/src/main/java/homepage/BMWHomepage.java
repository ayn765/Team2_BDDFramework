package homepage;

import common.BaseAPI;
import financialServicesPage.BMWFinancialServicesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homepage.BMWHomepageLocators.*;

public class BMWHomepage extends BaseAPI {

    public BMWHomepage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_LINK_FINANCIAL_SERVICES)
    public WebElement linkFinancialServices;

    public BMWFinancialServicesPage navigateToFinancialServicesPage(){
        clickElement(linkFinancialServices);
        return new BMWFinancialServicesPage();
    }

}
