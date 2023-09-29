Feature:
      User Story :  As a user, I should be able to log in

  Background:
    Given Users go to the login page
    When Users see login page

  Scenario Outline: Positive Scenario
    When Users write "<username>" and "<password>"
    When Users see the Log In button
    When Users click to Log In button
    When Users see Activity Stream
    When Users go to profile
    When Users click the profile
    When Users see the Log Out

    Examples: UserNames and Passwords
      | username               | password |
      | hr1@cybertekschool.com | UserUser |
