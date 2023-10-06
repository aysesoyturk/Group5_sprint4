package com.cydeo.step_definitions;

import com.cydeo.pages.Announcement_Page;
import com.cydeo.pages.CRM24_Employees_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Announcement_stepDefinitions {
    CRM24_Employees_Page EmployeesPage = new CRM24_Employees_Page();
    Announcement_Page AnnouncementPage = new Announcement_Page();

    @When("user click MORE button")
    public void user_click_more_button() {
        AnnouncementPage.moreBtn.click();
    }

    @When("user click ANNOUNCEMENT button")
    public void user_click_announcement_button() {
        AnnouncementPage.announcementBtn.click();
    }

    @When("user click To area")
    public void user_click_to_area() {
        AnnouncementPage.toArea.click();
    }

    @When("user click  Employees and departments button")
    public void user_click_employees_and_departments_button() throws InterruptedException {
        Thread.sleep(1000);
        AnnouncementPage.employeDepartmentsBtn.click();
    }
    @Then("User should be able to select more than one person")
    public void user_should_be_able_to_select_more_than_one_person() {

        AnnouncementPage.employeDepartmentsAddBtn1.click();
        AnnouncementPage.employeDepartmentsAddBtn2.click();
        AnnouncementPage.employeDepartmentsAddBtn3.click();

    }
}
