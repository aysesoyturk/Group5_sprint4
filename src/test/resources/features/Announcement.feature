Feature: As a user, I should be able to send announcement from Announcement subheading from "More" under Activity Stream.

  Background: HR User should be able to log in successfully
    Given user lands on the login page
    And user enters "hr1@cybertekschool.com" and "UserUser"
    And user clicks the login button
    When user click MORE button
    And user click ANNOUNCEMENT button

  Scenario: 1-User should be able to add users from selecting multiple contacts from Employees and Departments contact lists.
    When user click To area
    And user click  Employees and departments button
    Then  User should be able to select more than one person

  Scenario: 2-User should be able to attach link by clicking on the link icon.
    When user click  Link icon
    And User write a link address
    And user click Save button
    Then User should be able to add link

  Scenario: 3-User should be able to add mention by clicking on the add mention icon.
    When user click  Add Mention icon
    Then  User should be able to add mention

  Scenario: 4-User should be able to Record Video.
    When user click  Record Video icon
    And  User see text "Device Access You have to allow access to your camera and microphone to record a video."
    And  User should be able to click the Allow
    Then User should be able to Record Video.

  Scenario: 5-User should be able to change show announcement as (always,one day, two days etc)
    When User see show announcement
    And User click on the always or one day or two days etc
    Then  User should be able to change show announcement as (always,one day, two days etc)


  Scenario: 6-The user should be able to add the subject sub-title by clicking on the topic section
    When user click  Topic icon
    Then User should be able to write something

  Scenario: 7-User should be able to send a announcement.
    Then User should be able to send a announcement