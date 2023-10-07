package com.cydeo.step_definitions;

import com.cydeo.pages.Appreciation_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Timer;

public class Appreciation_StepDefinitions {
    Appreciation_Page appreciationPage = new Appreciation_Page();

    @When("user clicks More button verify user can see Appreciation choice")
    public void user_clicks_More_button_verify_user_can_see_appreciation_choice() {
        BrowserUtils.waitFor(3);
        appreciationPage.moreButton.click();
        appreciationPage.appreciatonBtn.isDisplayed();
    }

    @Then("user clicks Appreciation and upload files icon appears")
    public void user_clicks_appreciation_and_upload_files_icon_appears() {
        appreciationPage.appreciatonBtn.click();
        appreciationPage.uploadIcon.isDisplayed();
    }

    @When("user_clicks_on_upload_files_icon and Upload Files and images Button Appears")
    public void user_clicks_on_upload_files_icon_and_upload_files_and_images_button_appears() {
        BrowserUtils.waitFor(3);
        appreciationPage.uploadIcon.click();

    }
/*

        appreciationPage.filesAndImagesUpload.click();
        BrowserUtils.waitFor(3);
    }


    @When("verify user can upload files and pictures from the local disks")
    public void verify_user_can_upload_files_and_pictures_from_the_local_disks() {

    }

 */

    @Then("user be able click link icon")
    public void user_be_able_click_link_icon() {
        appreciationPage.link_icon.click();
        BrowserUtils.waitFor(3);


    }

    @Then("verify user be able to attach a link text and a link")
    public void verify_user_be_able_to_attach_a_link_text_and_a_link() {
        appreciationPage.writeText.isDisplayed();
        appreciationPage.writeText.sendKeys("Google");
        BrowserUtils.waitFor(3);
        appreciationPage.insertLink.sendKeys("www.google.com");
        appreciationPage.saveButton.click();

    }

    @Then("verify the link is added")
    public void verify_the_link_is_added() {
        Driver.getDriver().switchTo().frame(0);
        appreciationPage.checkLink.isDisplayed();
        String expectedLinkText="Google";
        Assert.assertEquals(appreciationPage.checkLink.getText(),expectedLinkText);
        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("user should be able to create a quote by clicking on the Quote text icon")
    public void user_should_be_able_to_create_a_quote_by_clicking_on_the_quote_text_icon() {
        appreciationPage.quoteAdd.click();
        Driver.getDriver().switchTo().frame(0);
        appreciationPage.typeQuote.isDisplayed();
        appreciationPage.typeQuote.sendKeys("Abraham");
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("verify a quote is typed")
    public void verify_a_quote_is_typed() {
        Driver.getDriver().switchTo().frame(0);
        appreciationPage.createdText.isDisplayed();
        String expectedText="Abraham";
        Assert.assertEquals(appreciationPage.createdText.getText(), expectedText);
        Driver.getDriver().switchTo().parentFrame();
    }



    @Then("user should be able to add mention by clicking on the add mention icon")
    public void user_should_be_able_to_add_mention_by_clicking_on_the_add_mention_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify mention is added")
    public void verify_mention_is_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to add tags by clicking add tag icon")
    public void user_should_be_able_to_add_tags_by_clicking_add_tag_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the tag is added")
    public void verify_the_tag_is_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should be able to send an appreciation")
    public void user_should_be_able_to_send_an_appreciation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the appreciation has been sent.")
    public void verify_the_appreciation_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
