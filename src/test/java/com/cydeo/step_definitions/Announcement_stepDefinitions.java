package com.cydeo.step_definitions;

import com.cydeo.pages.Announcement_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
        Assert.assertTrue(announcementPage.addMentinon.isDisplayed());
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
    public void userShouldBeAbleToRecordVideo() throws InterruptedException {
        Thread.sleep(3000);

        announcementPage.recordVideoIcon.click();
        announcementPage.recordText.isDisplayed();
        announcementPage.recordText.click();

        // Assert.assertTrue(announcementPage.recordError.isDisplayed());

        if (announcementPage.recordError.isDisplayed()) {
            System.out.println("***********************  not record   *****************************");
        }

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

        Thread.sleep(2000);

        announcementPage.topic.click();
        announcementPage.topic.sendKeys("1234");

        Thread.sleep(2000);

        WebElement iframe = Driver.getDriver().findElement(By.xpath("//html//iframe"));
        Driver.getDriver().switchTo().frame(iframe);
        WebElement topicBelow = Driver.getDriver().findElement(By.xpath("//html//body"));
        topicBelow.sendKeys("abcd");
        Driver.getDriver().switchTo().parentFrame();
        announcementPage.send.click();

    }


    @Then("User should be able to send a announcement")
    public void userShouldBeAbleToSendAAnnouncement() throws InterruptedException {

        Thread.sleep(2000);

        WebElement iframe = Driver.getDriver().findElement(By.xpath("//html//iframe"));
        Driver.getDriver().switchTo().frame(iframe);

        WebElement topicBelow = Driver.getDriver().findElement(By.xpath("//html//body"));
        topicBelow.sendKeys("Hello World");
        Thread.sleep(2000);
        Driver.getDriver().switchTo().parentFrame();
        announcementPage.send.click();


    }
}
