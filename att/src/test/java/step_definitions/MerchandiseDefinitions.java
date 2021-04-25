package step_definitions;

import common.BaseAPI;
import io.cucumber.java.en.*;
import org.junit.Assert;
import wirelessPage.ATTWirelessPage;

public class MerchandiseDefinitions extends BaseAPI {

    ATTWirelessPage attWirelessPage;

    @When("user clicks shop all accessories")
    public void user_clicks_shop_all_accessories() throws InterruptedException {
    attWirelessPage = new ATTWirelessPage();
    attWirelessPage.clickOnShopAllAccessories();
    }
    @When("user hovers over Wireless Charging Pad and clicks view details")
    public void user_hovers_over_wireless_charging_pad_and_clicks_view_details() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.hoverOverAndClickChargingPadDetails();
    }
    @When("user chooses white color")
    public void user_chooses_white_color() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.chooseWhiteColor();
    }
    @Then("white charging pad is displayed")
    public void white_charging_pad_is_displayed() {
        attWirelessPage = new ATTWirelessPage();
        String expectedImageText = "AT&T 15W Fast Charge Wireless Charging Pad - White";
        Assert.assertEquals(expectedImageText,attWirelessPage.imageChargingPad.getText(), "The wrong or no image is displayed.");

    }
    @When("user chooses black color")
    public void user_chooses_black_color() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.chooseBlackColor();
    }
    @Then("black changing pad is displayed")
    public void black_changing_pad_is_displayed() {
        attWirelessPage = new ATTWirelessPage();
        String expectedImageText = "AT&T 15W Fast Charge Wireless Charging Pad - Black";
        Assert.assertEquals(expectedImageText,attWirelessPage.imageChargingPad.getText(), "The wrong or no image is displayed.");
    }
    @When("user expands Video&Images dropdown and clicks on the video")
    public void user_expands_video_images_dropdown_and_clicks_on_the_video() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.clickToViewVideo();
    }
    @Then("the video is playing")
    public void the_video_is_playing() {
        attWirelessPage = new ATTWirelessPage();
        String expectedAttribute = "Video is Playing";
        Assert.assertEquals("The video is not playing or can not be found",expectedAttribute, attWirelessPage.getAttributePlayButton());
    }
    @When("user pauses the video")
    public void user_pauses_the_video() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.pauseVideo();
    }
    @Then("the video is paused")
    public void the_video_is_paused() {
        attWirelessPage = new ATTWirelessPage();
        String expectedAttribute = "Video is Paused";
        Assert.assertEquals("The video is not paused or can not be found",expectedAttribute, attWirelessPage.getAttributePlayButton());
    }
    @When("user moves slider to skip a part of the video")
    public void user_moves_slider_to_skip_a_part_of_the_video() {
        attWirelessPage = new ATTWirelessPage();
        attWirelessPage.skipPartOfVideo();
    }
    @Then("a part of the video is skipped")
    public void a_part_of_the_video_is_skipped() {
        attWirelessPage = new ATTWirelessPage();
        Assert.assertTrue("The video wan not skipped or was not found", attWirelessPage.isVideoSkipped());
    }
}
