package step_definition;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SharedSteps extends BaseAPI {
    @Before
    public void setUp() {
        driver = getLocalDriver("chrome");
        driver.get("https://ebay.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }

    @After
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}