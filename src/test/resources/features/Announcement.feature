Feature: As a user, I should be able to send announcement from Announcement subheading from "More" under Activity Stream.

  Background: HR User should be able to log in successfully
    Given user lands on the login page
    And user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks the login button
    When user click MORE button
    And user click ANNOUNCEMENT button

  Scenario: User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user click To area
    And user click  Employees and departments button
    Then  User should be able to select more than one person
