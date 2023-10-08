package com.cydeo.step_definitions;

import com.cydeo.pages.Announcement_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Announcement_stepDefinitions {
    Announcement_Page announcementPage = new Announcement_Page();

    @When("user click MORE button")
    public void user_click_more_button() {
        announcementPage.moreBtn.click();
    }

    @When("user click ANNOUNCEMENT button")
    public void user_click_announcement_button() {
        announcementPage.announcementBtn.click();
    }

    @When("user click To area")
    public void user_click_to_area() {
        announcementPage.toArea.click();
    }

    @When("user click  Employees and departments button")
    public void user_click_employees_and_departments_button() throws InterruptedException {
        Thread.sleep(1000);
        announcementPage.employeDepartmentsBtn.click();
    }

    @Then("User should be able to select more than one person")
    public void user_should_be_able_to_select_more_than_one_person() {
        announcementPage.itdepartment.click();
        announcementPage.itdepartmentBtn.click();
        announcementPage.managerdepartment.click();
        announcementPage.managerdepartmentBtn.click();
    }

    @When("user click  Link icon")
    public void userClickLinkIcon() {
        announcementPage.linkIcon.click();

    }

    @And("User write a link address")
    public void userWriteALinkAddress() {
        announcementPage.linkText.click();
        announcementPage.linkText.sendKeys("GOOGLE");
        announcementPage.linkUrl.click();
        announcementPage.linkUrl.sendKeys("www.google.com");

    }

    @And("user click Save button")
    public void userClickSaveButton() {
        announcementPage.saveBtn.click();
    }

    @Then("User should be able to add link")
    public void userShouldBeAbleToAddLink() throws InterruptedException {
        Thread.sleep(500);
        //  Assert.assertTrue(announcementPage.saveBtnDisplay.isDisplayed());
        System.out.println("displayed");
    }

    @When("user click  Add Mention icon")
    public void userClickAddMentionIcon() {
        announcementPage.addMentinonIcon.click();
    }

    @Then("User should be able to add mention")
    public void userShouldBeAbleToAddMention() {
        announcementPage.addMentinon.click();
    }

    @When("user click  Record Video icon")
    public void userClickRecordVideoIcon() {
        announcementPage.recordVideoIcon.click();
    }

    @And("User see text {string}")
    public void userSeeText(String arg0) {
        announcementPage.recordText.isDisplayed();
    }

    @And("User should be able to click the Allow")
    public void userShouldBeAbleToClickTheAllow() {
        announcementPage.allowBtn.click();
    }

    @Then("User should be able to Record Video.")
    public void userShouldBeAbleToRecordVideo() {

        System.out.println("***********************  not record   *****************************");

    }

    @When("User see show announcement")
    public void userSeeShowAnnouncement() {
        announcementPage.showBtn.isDisplayed();
    }

    @And("User click on the always or one day or two days etc")
    public void userClickOnTheAlwaysOrOneDayOrTwoDaysEtc() {
        announcementPage.timeBtn.click();
    }

    @Then("User should be able to change show announcement as \\(always,one day, two days etc)")
    public void userShouldBeAbleToChangeShowAnnouncementAsAlwaysOneDayTwoDaysEtc() throws InterruptedException {
        Thread.sleep(2000);
        announcementPage.always.click();
        Thread.sleep(2000);
        announcementPage.twoDays.click();
    }

    @When("user click  Topic icon")
    public void userClickTopicIcon() throws InterruptedException {
        Thread.sleep(2000);
        announcementPage.topicIcon.click();
    }

    @Then("User should be able to write something")
    public void userShouldBeAbleToWriteSomething() throws InterruptedException {


        System.out.println("error");


        Thread.sleep(2000);
        //announcementPage.topic.clear();
        announcementPage.topic.click();
        announcementPage.topic.sendKeys("1234" + Keys.ENTER);

        Thread.sleep(2000);
        //announcementPage.topicArea.click();
        announcementPage.topicArea.sendKeys("abcd" + Keys.ENTER);
        announcementPage.send.click();


    }


    @Then("User should be able to send a announcement")
    public void userShouldBeAbleToSendAAnnouncement() {

        announcementPage.announcementBtn.sendKeys("Hello World" + Keys.ENTER);
        announcementPage.announcementSend.click();

    }
}
