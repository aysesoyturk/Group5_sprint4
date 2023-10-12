package com.cydeo.step_definitions;

import com.cydeo.pages.CRM24_Employees_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StaffChange_stepDefinitions {

    CRM24_Employees_Page EmployeesPage = new CRM24_Employees_Page();


        @When("user click Employees from CONFIGURE MENU")
        public void user_click_employees_from_configure_menu() {
       EmployeesPage.employeesBtn.click();
    }
        @Then("user should be able to see Company Structure")
        public void user_should_be_able_to_see_company_structure() {
        EmployeesPage.companyStructureMessage.isDisplayed();
    }

        @When("user click Staff Changes from the top of the modules")
        public void user_click_staff_changes_from_the_top_of_the_modules() {
        EmployeesPage.staffChangesBtn.click();
    }
        @Then("user should be able to display Staff Change")
        public void user_should_be_able_to_display_staff_change() {
        EmployeesPage.StaffChangesMessage.isDisplayed();
    }

        @When("user click any Send message button which is next to any member")
        public void user_click_any_send_message_button_which_is_next_to_any_member() throws InterruptedException {
          EmployeesPage.sendMessageBtn.click();
          Thread.sleep(1000);
        }
        @When("user click New Message button which is next to Search box")
        public void user_click_new_message_button_which_is_next_to_search_box() throws InterruptedException {
           EmployeesPage.sendMessageIcon.click();
           Thread.sleep(1000);
        }
        @Then("user should be able to see options")
        public void user_should_be_able_to_see_options() {
        EmployeesPage.personToPersonChat.isDisplayed();
        EmployeesPage.privateChat.isDisplayed();
        EmployeesPage.publicChat.isDisplayed();

        }


        @When("user click XClose button")
        public void user_click_x_close_button() {
        EmployeesPage.xCloseBtn.click();
    }
        @Then("user should be able to close pop-ups window")
        public void user_should_be_able_to_close_pop_ups_window() {
            Assert.assertEquals(EmployeesPage.checkClosingPupUp.getAttribute("class"),"bx-desktop bx-im-fullscreen-popup bx-im-fullscreen-popup-transparent bx-im-fullscreen-closed");
    }



}
