package com.cydeo.step_definitions;

import com.cydeo.pages.InteractWith_Employees_Pages;
import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class InteractWith_Employees_StepDef {

    InteractWith_Employees_Pages interactWithEmployeesPages = new InteractWith_Employees_Pages();
    Login_Pages loginPages = new Login_Pages();



    @Given("user  on the main page")
    public void user_on_the_main_page() {
        Assert.assertTrue(loginPages.seeLoginPage.isDisplayed());

    }
    @Given("user verify  {string} and {string}")
    public void user_verify_and(String username, String password) {
        loginPages.entersUsername.sendKeys(username);
        loginPages.entersPassword.sendKeys(password);
    }
    @Given("user should clicks the login button")
    public void user_should_clicks_the_login_button() {
        loginPages.loginButton.click();
    }
    @Then("user should see the main page")
    public void user_should_see_the_main_page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(interactWithEmployeesPages.pageLogo.isDisplayed());

    }



    ///////


    @Given("Users click the Comment button on users posts")
    public void users_click_the_comment_button_on_users_posts() throws InterruptedException {

      interactWithEmployeesPages.clickCommentButton.click();
        Thread.sleep(2000);

    }
/*
    @When("Users write the comment message")
    public void users_write_the_comment_message() throws InterruptedException {

       interactWithEmployeesPages.writeCommentMessage.sendKeys("Hello World");
        Thread.sleep(2000);


        WebElement iframe= Driver.getDriver().findElement(By.xpath("//html//iframe"));
        Driver.getDriver().switchTo().frame(iframe);
        WebElement topicBelow = Driver.getDriver().findElement(By.xpath("//html//body"));
        topicBelow.sendKeys("Hello World");
        Driver.getDriver().switchTo().parentFrame();





    }

    @When("Users click the SEND button")
    public void users_click_the_send_button() throws InterruptedException {
        interactWithEmployeesPages.clickSendButton.click();
        Thread.sleep(2000);

    }

 */


    @When("Users click the Like button on users posts")
    public void users_click_the_like_button_on_users_posts() throws InterruptedException {
        interactWithEmployeesPages.clickLikeButton.click();
        Thread.sleep(2000);

    }

    @When("Users verify that the post is liked")
    public void users_verify_that_the_post_is_liked() {
        Assert.assertTrue(interactWithEmployeesPages.postLiked.isDisplayed());


    }

    @When("Users click the Follow button on users posts")
    public void users_click_the_follow_button_on_users_posts() throws InterruptedException {
        interactWithEmployeesPages.clickFollowButton.click();
        Thread.sleep(2000);
    }


    @Then("Users click the Unfollow button on users posts")
    public void users_click_the_unfollow_button_on_users_posts() throws InterruptedException {
        interactWithEmployeesPages.clickUnfollowButton.click();
        Thread.sleep(2000);

    }

    @Then("Users verify that the post is unfollowed")
    public void users_verify_that_the_post_is_unfollowed() throws InterruptedException {
        Assert.assertTrue(interactWithEmployeesPages.clickUnfollowButton.isDisplayed());
        Thread.sleep(2000);

    }




    @Given("Users click the Like button on other reviewers' comments")
    public void users_click_the_like_button_on_other_reviewers_comments() throws InterruptedException {

        interactWithEmployeesPages.likeReviewers.click();
        Thread.sleep(2000);
    }

    @When("Users verify like button is clickable")
    public void users_verify_like_button_is_clickable() throws InterruptedException {
        Assert.assertTrue(interactWithEmployeesPages.verifyLikeButtonClickable.isDisplayed());
        Thread.sleep(2000);

    }

    @When("Users click the Reply button on other reviewers' comments")
    public void users_click_the_reply_button_on_other_reviewers_comments() throws InterruptedException {
        interactWithEmployeesPages.replyReviewers.click();
        Thread.sleep(2000);

    }



    @When("Users click the profile name")
    public void users_click_the_profile_name() throws InterruptedException {
        interactWithEmployeesPages.clickReviewersProfileName.click();
        Thread.sleep(2000);

    }
    @Then("Users visit the reviewers profile")
    public void users_visit_the_reviewers_profile() throws InterruptedException {
        interactWithEmployeesPages.visitReviewersProfile.isDisplayed();
        Thread.sleep(2000);

    }




    }

