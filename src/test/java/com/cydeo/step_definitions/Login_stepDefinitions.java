package com.cydeo.step_definitions;

import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

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
            BrowserUtils.waitForClickablility(LoginPages.entersUsername, 1);
            LoginPages.entersUsername.click();
            LoginPages.entersUsername.sendKeys(username);
            BrowserUtils.waitForClickablility(LoginPages.entersPassword,1);
            LoginPages.entersPassword.click();
            LoginPages.entersPassword.sendKeys(password);
    }
    @When("user sees the login button")
    public void user_sees_the_login_button() {
        System.out.println("User sees the Log In button -> "
                +LoginPages.loginButton.isDisplayed());
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        BrowserUtils.waitForClickablility(LoginPages.loginButton, 1);
        LoginPages.loginButton.click();


    }
    @When("user sees the Activity Stream")
    public void user_sees_the_activity_stream() {
        String actualActivityStream = LoginPages.ActivityStream.getText();
        String expectedActivityStream = "Activity Stream";
        Assert.assertEquals(expectedActivityStream,actualActivityStream);
    }


    @When("user enters valid username {string}")
    public void userEntersValidUsername(String validUsername) {
        BrowserUtils.waitForClickablility(LoginPages.entersUsername,1);
        LoginPages.entersUsername.sendKeys(validUsername + Keys.ENTER);
    }

    @When("user enters invalid password {string}")
    public void userEntersInvalidPassword(String invalidPassword) {
        BrowserUtils.waitForClickablility(LoginPages.entersPassword,1);
        LoginPages.entersPassword.sendKeys(invalidPassword + Keys.ENTER);
    }

    @When("user sees warning messages")
    public void userSeesWarningMessages() {
        String actualMessage = LoginPages.warningMessage.getText();
        String expectedMessage = "Incorrect login or password";
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("user enters invalid username {string}")
    public void userEntersInvalidUsername(String invalidUsername) {
        BrowserUtils.waitForClickablility(LoginPages.entersUsername,1);
        LoginPages.entersUsername.sendKeys(invalidUsername + Keys.ENTER);
    }

    @When("user enters valid password {string}")
    public void userEntersValidPassword(String validPassword) {
        BrowserUtils.waitForClickablility(LoginPages.entersPassword,1);
        LoginPages.entersPassword.sendKeys(validPassword + Keys.ENTER);
    }

    @When("user sees the Forgot Your Password")
    public void userSeesTheForgotYourPassword() {
       String actualForgotPassword = LoginPages.ForgotYourPasswordButton.getText();
       String expectedForgotPassword = "FORGOT YOUR PASSWORD?";
       Assert.assertEquals(expectedForgotPassword, actualForgotPassword);
    }

    @When("user enters the Forgot Your Password")
    public void userEntersTheForgotYourPassword() {
        BrowserUtils.waitForClickablility(LoginPages.ForgotYourPasswordButton,1);
        LoginPages.ForgotYourPasswordButton.click();

    }

    @When("user sees the forget password page")
    public void userSeesTheForgetPasswordPage() {
        String actualForgotPasswordPage = LoginPages.ForgotPasswordPage.getText();
        String expectedForgotPasswordPage = "Get Password";
        Assert.assertEquals(expectedForgotPasswordPage, actualForgotPasswordPage);
    }

    @When("user sees the Remember me on this computer")
    public void userSeesTheRememberMeOnThisComputer() {
       String actualRememberMeCheckbox = LoginPages.RememberMe.getText();
       String expectedRememberMeCheckbox = "Remember me on this computer";
       Assert.assertEquals(expectedRememberMeCheckbox, actualRememberMeCheckbox);

    }

    @When("user clickable the Remember me on this computer")
    public void userClickableTheRememberMeOnThisComputer() {
        System.out.println("LoginPages.RememberMe.isSelected() = " + LoginPages.RememberMeCheckbox.isSelected());
        LoginPages.RememberMeCheckbox.click();
        System.out.println("LoginPages.RememberMeCheckbox.isSelected() = " + LoginPages.RememberMeCheckbox.isSelected());
    }

    @When("user uses enter keyboard login button")
    public void userUsesEnterKeyboardLoginButton() {
        BrowserUtils.waitForClickablility(LoginPages.loginButton,1);
        LoginPages.loginButton.sendKeys(Keys.ENTER);

    }

    @When("user clicks Login")
    public void userClicksLogin() {
        BrowserUtils.waitForClickablility(LoginPages.entersUsername, 1);
        LoginPages.entersUsername.click();
    }

    @When("user clicks Password")
    public void userClicksPassword() {
        BrowserUtils.waitForClickablility(LoginPages.entersPassword, 1);
        LoginPages.entersPassword.click();
    }

}
