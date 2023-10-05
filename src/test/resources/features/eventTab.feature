@Event1601
Feature:As a user, I should be able to create events by clicking on Event tab under Activity Stream

  Scenario: : User must be able to login successfully
    Given user  on the main page
    And user verify  "hr1@cybertekschool.com" and "UserUser"
    And user should clicks the login button
    Then user should see the main page
    And user should click event tab
    And  user should click setReminder box
    And user click the minute value box
    And user enter the value into the text box
    And Then user click locationList box
    And user should select any location
    And user should click members textbox
    And user should add a person or group
    And  user should be able to see "More" link and click it
    And user be able to click the send button


