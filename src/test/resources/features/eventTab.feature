Feature:As a user, I should be able to create events by clicking on Event tab under Activity Stream

  Background: User must be able to login successfully
    Given user  on the main page
    And user verify  "hr1@cybertekschool.com" and "UserUser"
    And user should clicks the login button
    Then user should see the main page


    Scenario: User should be able to set reminder by entering the time.
      When  user should click event tab
      Then user should click setReminder box
      And user click the minute value box
      And user enter the value into the text box


      Scenario: User should be able to select event location from dropdown.
        When user click event tab
        Then user click locationList box
        And user should select any location


        Scenario: User should be able to add attendees by selecting contacts individually or adding groups and departments
          When user click event tab
          Then user should click members textbox
          Then user should add a person or group


          Scenario: User should be able to click on More to see the event details.
            When user click event tab
            Then user should be able to see "More" link and click it

            Scenario: User should be able to send message.
              When  user click event tab
              Then user be able to click the send button