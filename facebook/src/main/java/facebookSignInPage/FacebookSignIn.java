package facebookSignInPage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static facebookSignInPage.FacebookSignInLocators.*;

public class FacebookSignIn extends BaseAPI {

    public FacebookSignIn() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = WEB_ELEMENT_EMAIL_BUTTON)
    public WebElement EmailButton;

    @FindBy(xpath = WEB_ELEMENT_PASSWORD_BUTTON)
    public WebElement PasswordButton;

    @FindBy(xpath = WEB_ELEMENT_LOGIN_BUTTON)
    public WebElement LoginButton;

    @FindBy(xpath = WEB_ELEMENT_FACEBOOK_MAIN_PAGE)
    public WebElement FacebookMain;

    public void clickEmail(){
        clickElement(EmailButton);
    }

    public void clickPassword(){
        clickElement(PasswordButton);
    }

    public void clickLogin(){
        clickElement(LoginButton);
    }

    public String verifySuccessLoginMsg(){
        return new BaseAPI().getTextFromElement(FacebookMain);
    }


}
