package com.cydeo.step_definitions;

import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefinitions  {

    Login_Pages LoginPages = new Login_Pages();

    @Given("user lands on the login page")
    public void user_lands_on_the_login_page() {
        System.out.println("User lands on the page");
    }
    @When("user sees the login page")
    public void user_sees_the_login_page() {
        String actualTitle = LoginPages.seeLoginPage.getText();
        String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
            BrowserUtils.waitFor(1);
            LoginPages.entersUsername.click();
            LoginPages.entersUsername.sendKeys(username);
            BrowserUtils.waitFor(1);
            LoginPages.entersPassword.click();
            LoginPages.entersPassword.sendKeys(password);
    }
    @When("user sees the login button")
    public void user_sees_the_login_button() {
        System.out.println("User sees the Log In button -> "+LoginPages.loginButton.isDisplayed());
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        LoginPages.loginButton.click();
    }
    @When("user sees the Activity Stream")
    public void user_sees_the_activity_stream() {
        String actualActivityStream = LoginPages.ActivityStream.getText();
        String expectedActivityStream = "Activity Stream";
        Assert.assertEquals(expectedActivityStream,actualActivityStream);
    }










}
