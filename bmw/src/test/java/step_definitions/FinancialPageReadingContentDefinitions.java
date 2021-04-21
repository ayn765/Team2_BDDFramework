package step_definitions;

import common.BaseAPI;
import financialServicesPage.BMWFinancialServicesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class FinancialPageReadingContentDefinitions extends BaseAPI {

    BMWFinancialServicesPage bmwFinancialServicesPage;

    @When("user hovers over a question mark")
    public void user_hovers_over_a_question_mark() throws InterruptedException {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.hoverOverHelpBoxAndGetAttributeValue();
    }

    @Then("help box content should be displayed")
    public void help_box_content_should_be_displayed() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.hoverOverHelpBoxAndGetText();
        Assert.assertTrue("The help box is not displayed or cannot be located.", bmwFinancialServicesPage.verifyHelpBoxesAreDisplayed());
    }

    @Then("content of the help box should be accurate")
    public void content_of_the_help_box_should_be_accurate() throws Exception {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        Assert.assertTrue("The help box is not displayed correctly or cannot be found.", bmwFinancialServicesPage.verifyTextHelpBoxes());

    }

}
