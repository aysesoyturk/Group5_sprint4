@SCRUM-1315
Feature: As a user, I should be able to land on Employee menu; so that I can display Staff Change.

  Background: User should be able to log in successfully
    Given user lands on the login page
    And user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks the login button

  @SCRUM-1311
    Scenario: User should be able to display company structure
      When user click Employees from CONFIGURE MENU
      Then user should be able to see Company Structure
  @SCRUM-1312
    Scenario: User should be able to display Staff Change
      When user click Employees from CONFIGURE MENU
      And user click Staff Changes from the top of the modules
      Then user should be able to display Staff Change
  @SCRUM-1313
    Scenario: User should be prefer different options as person to person, privet and public chat
      When user click Employees from CONFIGURE MENU
      And user click Staff Changes from the top of the modules
      And user click any Send message button which is next to any member
      And user click New Message button which is next to Search box
      Then user should be able to see options
  @SCRUM-1314
    Scenario: User should be close the chat pop-ups window by clicking XClose button
      When user click Employees from CONFIGURE MENU
      And user click Staff Changes from the top of the modules
      And user click any Send message button which is next to any member
      And user click XClose button
      Then user should be able to close pop-ups window
