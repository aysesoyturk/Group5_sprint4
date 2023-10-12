Feature: shfjhs
  @tah
Scenario: : User must be able to login successfully
Given user  on the main page
And user verify  "helpdesk1@cybertekschool.com" and "UserUser"
And user should clicks the login button
Then user should see the main page
And user should click more tab