@SCRUM-1337
Feature: Employee menu
  User Story: A user should be able to use functions under Employee menu
  User: Human Resources User

  @SCRUM-1329
  Background: HR User should be able to log in successfully
    Given user lands on the login page
    And user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks the login button
    When user click "Employees" button

  @SCRUM-1330
  Scenario: User should be able to display company structure
    Then User display "Company Structure" module

  @SCRUM-1331
    Scenario: User should be able to add a department
      When User click the add department button
      And User writes "Automation" to department name
      Then User click the ADD button
      And User displays the department name in the table

  @SCRUM-1332
  Scenario: User should be able to find employees by search box
    When User click the "Find Employee" module
    And User click in the search box
    And User searches the employee name in the search box
    Then User display the employee name

  @SCRUM-1333
  Scenario: User should be able to find employees by search by Alphabet
    When User click the "Find Employee" module
    And User click the "Search By Alphabet" button
    And User click "A" of the letters
    Then User display the employees starting with the letter

  @SCRUM-1334
  Scenario: User should be able to export the employee list
    When User click the "Find Employee" module
    And User click the More... button
    Then User displays the Export to Excell button

  @SCRUM-1335
  Scenario: User should be able to display telephone directory
   Then User display the "Telephone Directory" module

  @SCRUM-1336
  Scenario: User should be able to send message to employee from the telephone directory
  When User click the "Telephone Directory" module
  And User clicks on the name of one of the employees in the employee list
  And User click the SEND MESSAGE button
  And User send the message by pressing enter
  Then User display that message




