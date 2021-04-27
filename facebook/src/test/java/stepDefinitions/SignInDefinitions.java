package stepDefinitions;

import common.BaseAPI;
import facebookSignInPage.FacebookSignIn;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInDefinitions extends BaseAPI {

    FacebookSignIn facebookSignIn = new FacebookSignIn();

    @Before
    public void setUp() {

        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);

    }

    @Given("User navigates to FACEBOOK.COM")
    public void user_navigates_to_facebook_com() {
        driver.get("https://facebook.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @When("user enters email as {string} and Password {string}")
    public void user_enters_email_as_and_password(String email, String password) {
        facebookSignIn = new FacebookSignIn();
        facebookSignIn.clickEmail();
        facebookSignIn.EmailButton.sendKeys(email);

        facebookSignIn.clickPassword();
        facebookSignIn.PasswordButton.sendKeys(password);

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        facebookSignIn = new FacebookSignIn();
        facebookSignIn.clickLogin();

        Assert.assertTrue("Sign in Page has logged in", false);
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        facebookSignIn = new FacebookSignIn();

        facebookSignIn.verifySuccessLoginMsg();

    }

        @After
        public static void tearDown() {
            driver.close();
            driver.quit();
        }


    }






