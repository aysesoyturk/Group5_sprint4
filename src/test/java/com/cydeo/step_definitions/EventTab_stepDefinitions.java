package com.cydeo.step_definitions;

import com.cydeo.pages.EventTabPage;
import com.cydeo.pages.Login_Pages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class EventTab_stepDefinitions {
    Login_Pages loginPages=new Login_Pages();
    EventTabPage eventTabPage=new EventTabPage();
   //

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
    Thread.sleep(3000);
    String title="(80) Portal";
    Assert.assertTrue(eventTabPage.logo.isDisplayed());
    }
    @Then("user should click event tab")
    public void user_should_click_event_tab() {
    eventTabPage.eventTab.click();
    }
    @Then("user should click setReminder box")
    public void user_should_click_set_reminder_box() {
      if(eventTabPage.reminderCheckBox.isEnabled()==true) {

           Assert.assertTrue(eventTabPage.timeTextBox.isDisplayed());
           Assert.assertTrue(eventTabPage.timeTypeDropDown.isDisplayed());
       }else
       {
           eventTabPage.reminderCheckBox.click();
           Assert.assertTrue(eventTabPage.timeTextBox.isDisplayed());
           Assert.assertTrue(eventTabPage.timeTypeDropDown.isDisplayed());
       }
    }
    @Then("user click the minute value box")
    public void user_click_the_minute_value_box() throws InterruptedException {
    eventTabPage.timeTextBox.click();
    eventTabPage.timeTextBox.clear();
    eventTabPage.timeTextBox.sendKeys("30");
    Thread.sleep(1000);
    }
    @Then("user enter the value into the text box")
    public void user_enter_the_value_into_the_text_box() {
        Select selectValue=new Select(eventTabPage.timeTypeDropDown);
        selectValue.selectByIndex(0);
        selectValue.selectByIndex(1);
        selectValue.selectByIndex(2);
        selectValue.selectByIndex(0);
    }
    @Then("Then user click locationList box")
    public void then_user_click_location_list_box() throws InterruptedException {
    Assert.assertTrue(eventTabPage.eventLocationDropDown.isDisplayed());

    }
    @Then("user should select any location")
    public void user_should_select_any_location() throws InterruptedException {
       eventTabPage.eventLocationDropDown.click();
       eventTabPage.eventLocationDropDown.sendKeys("Central Meeting Room");
       Thread.sleep(500);
        eventTabPage.eventLocationDropDown.click();
       eventTabPage.eventLocationDropDown.clear();

        eventTabPage.eventLocationDropDown.click();
        eventTabPage.eventLocationDropDown.clear();
        eventTabPage.eventLocationDropDown.sendKeys("East Meeting Room");

        Thread.sleep(2000);

    }
    @Then("user should click members textbox")
    public void user_should_click_members_textbox() {
    eventTabPage.membersTypeLink.click();
    }
    @Then("user should add a person or group")
    public void user_should_add_a_person_or_group() throws InterruptedException {
    eventTabPage.addAllEmployee.click();
    Thread.sleep(500);
    eventTabPage.employeGerard.click();
        Thread.sleep(500);

        eventTabPage.groupList.click();
        Thread.sleep(500);
        eventTabPage.groupEmployeeList.click();
        Thread.sleep(500);
        eventTabPage.realGroupAddAction.click();
        Thread.sleep(500);
        eventTabPage.closeButton.click();
        Thread.sleep(500);
        //eventTabPage.groupEmploee.click();

    }
    @Then("user should be able to see {string} link and click it")
    public void user_should_be_able_to_see_link_and_click_it(String More) {
    Assert.assertTrue(eventTabPage.MoreLink.isDisplayed());
    eventTabPage.MoreLink.click();
    Assert.assertTrue(eventTabPage.MoreList.isDisplayed());



    }
    @Then("user be able to click the send button")
    public void user_be_able_to_click_the_send_button() {
    eventTabPage.sendButton.click();
    }


}
