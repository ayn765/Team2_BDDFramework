package step_definitions;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps extends BaseAPI {

    @Before
    public void setUp() {

        driver = getLocalDriver("chrome");
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
        driver.get("https://www.mbusa.com/en/home");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}
