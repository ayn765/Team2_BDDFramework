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

    @When("user clicks on plus symbol for each topic in Frequently Asked Questions Section")
    public void user_clicks_on_plus_symbol_for_each_topic_in_frequently_asked_questions_section() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.clickAndGetFrequentlyAskedQuestionsAttributes();
    }

    @When("user clicks on plus symbol for each topic in Frequently Asked Questions Section to view the answers")
    public void user_clicks_on_plus_symbol_for_each_topic_in_frequently_asked_questions_section_to_view_the_answers() throws InterruptedException {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        bmwFinancialServicesPage.clickAndGetTextAnswers();
    }

    @Then("titles of Frequently Asked Questions should be displayed correctly")
    public void titles_of_Frequently_Asked_Questions_should_be_displayed_correctly() throws Exception{
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        Assert.assertTrue("One or more titles of the Frequently Asked Questions are displayed incorrectly.", bmwFinancialServicesPage.verifyTitlesOfFrequentlyAskedQuestions());
    }

    @Then("the answer expands so that the user can read it")
    public void the_answer_expands_so_that_the_user_can_read_it() {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        Assert.assertTrue("The answers to Frequently Asked Questions are not displayed correctly or cannot be found.", bmwFinancialServicesPage.verifyFrequentlyAskedQuestionsAreDisplayed());
    }

    @Then("content of answers to the Frequently Asked Questions should be accurate")
    public void content_of_answers_to_the_Frequently_Asked_Questions_should_be_accurate() throws Exception {
        bmwFinancialServicesPage = new BMWFinancialServicesPage();
        Assert.assertTrue(bmwFinancialServicesPage.verifyTextAnswers());

    }

}
