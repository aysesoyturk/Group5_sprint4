package com.cydeo.step_definitions;

import com.cydeo.pages.EmployeePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Employee_StepDefinitions {
    @When("user click {string} button")
    public void user_click_button(String module) {
        EmployeePage.navigateToModule(module);
        BrowserUtils.waitFor(3);
    }

    @Then("User display {string} module")
    public void user_display_module(String subModule) {
        WebElement element=EmployeePage.getSubModule(subModule);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(element.isDisplayed());
    }

    EmployeePage employeePage = new EmployeePage();

    @When("User click the add department button")
    public void user_click_the_add_department_button() {
        employeePage.addDepartment.click();
        BrowserUtils.waitFor(2);
    }

    @When("User writes {string} to department name")
    public void user_writes_to_department_name(String departmentName) {
        employeePage.departmentName.sendKeys(departmentName);
        BrowserUtils.waitFor(2);
    }

    @Then("User click the ADD button")
    public void userClickTheADDButton() {
        employeePage.addButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("User click the {string} button")
    public void user_click_the_button(String method) {
        EmployeePage.clickMethod(method);
        BrowserUtils.waitFor(2);
    }

    @Then("User displays the department name in the table")
    public void user_displays_the_department_name_in_the_table() {
        Assert.assertTrue(employeePage.departmentsTable.isDisplayed());
}

    @When("User click the {string} module")
    public void user_click_the_module(String subModule) {
        EmployeePage.getSubModule(subModule).click();
        BrowserUtils.waitFor(2);
    }

    @When("User click in the search box")
    public void user_click_in_the_search_box() {
        employeePage.searchBox.click();
        BrowserUtils.waitFor(2);
    }

    @When("User searches the employee name in the search box")
    public void user_searches_the_employee_name_in_the_search_box() {
        employeePage.searchBox.sendKeys("adam"+ Keys.ENTER);
    }

    @Then("User display the employee name")
    public void user_display_the_employee_name() {
        Assert.assertTrue(employeePage.employeeName.isDisplayed());
        BrowserUtils.waitFor(2);
    }

    String searchLetter;
    @And("User click {string} of the letters")
    public void userClickOfTheLetters(String letter) {
        EmployeePage.clickLetter(letter);
        BrowserUtils.waitFor(2);
         searchLetter=letter;
    }


    @Then("User display the employees starting with the letter")
    public void user_display_the_employees_starting_with_the_letter() {
        List<WebElement> employeeNames = employeePage.employeeNames;

        for (WebElement employeeName : employeeNames) {

            String employeeNameText = employeeName.getText().toUpperCase();

            int firstBlank = employeeNameText.indexOf(" ");
            String lastName=employeeNameText.substring(firstBlank+1);
            boolean result=employeeNameText.startsWith(searchLetter) || lastName.startsWith(searchLetter) ;
            Assert.assertTrue(result);
        }
    }


    @Then("User displays the Export to Excell button")
    public void userDisplaysTheExportToExcellButton() {
        Assert.assertTrue(employeePage.exportToExcell.isDisplayed());
    }


    @And("User click the More... button")
    public void userClickTheMoreButton() {
        employeePage.more.click();
        BrowserUtils.waitFor(2);
    }


    @Then("User display the {string} module")
    public void user_display_the_module(String subModule) {
        WebElement element=EmployeePage.getSubModule(subModule);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(element.isDisplayed());
    }


    @When("User clicks on the name of one of the employees in the employee list")
    public void user_clicks_on_the_name_of_one_of_the_employees_in_the_employee_list() {
        employeePage.oneOfTheEmployee.click();
        BrowserUtils.waitFor(2);
    }

    @And("User click the SEND MESSAGE button")
    public void userClickTheSENDMESSAGEButton() {
        employeePage.messageButton.click();
    }


    @When("User send the message by pressing enter")
    public void user_send_the_message_by_pressing_enter() {
        employeePage.writeMessage.sendKeys("hello" + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }


    @Then("User display that message")
    public void user_display_that_message() {
        Assert.assertTrue(employeePage.message.isDisplayed());
    }



}
