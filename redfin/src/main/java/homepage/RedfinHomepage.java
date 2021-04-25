package homepage;

import common.BaseAPI;
import helpPage.RedfinHelpPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homepage.RedfinHomepageLocators.*;
public class RedfinHomepage extends BaseAPI {

    public RedfinHomepage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_BUTTON_NAVIGATE_TO_HELP)
    public WebElement buttonNavigateToHelp;

    public RedfinHelpPage navigateToHelpPage(){
        clickElement(buttonNavigateToHelp);
        return new RedfinHelpPage();
    }
}
