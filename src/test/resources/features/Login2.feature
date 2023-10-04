@SCRUM-1310
Feature: Login Function
  User Story: As a user, I should be able to log in

  @SCRUM-1303
  Scenario Outline: "Login Function" Positive Scenario
    Given user lands on the login page
    When user sees the login page
    When user enters "<username>" and "<password>"
    When user sees the login button
    When user clicks the login button
    When user sees the Activity Stream

    Examples: Valid Credentials
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | hr10@cybertekschool.com        | UserUser |
      | hr20@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk10@cybertekschool.com  | UserUser |
      | helpdesk20@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com  | UserUser |
      | marketing10@cybertekschool.com | UserUser |
      | marketing20@cybertekschool.com | UserUser |

  @SCRUM-1304
  Scenario Outline: "Login Function" Negative Scenario
    Given user lands on the login page
    When user sees the login page
    When user enters valid username "<invalidUserName>"
    When user enters invalid password "<invalidPassword>"
    When user sees the login button
    When user clicks the login button
    When user sees warning messages

    Examples: Invalid credentials
      | invalidUserName        | invalidPassword |
      | hr1@cybertakschool.com | user123         |
      | student@gmail.com      | UserUser        |
  @SCRUM-1306
  Scenario: "Login Function" username and password are empty
    Given user lands on the login page
    When user sees the login page
    When user clicks Login
    When user clicks Password
    When user sees the login button
    When user clicks the login button
    When user sees warning messages

  @SCRUM-1305
  Scenario: "Login Function" Forgot Password
    Given user lands on the login page
    When user sees the login page
    When user sees the Forgot Your Password
    When user enters the Forgot Your Password
    When user sees the forget password page

  @SCRUM-1308
  Scenario: "Login Function" Remember Me
    Given user lands on the login page
    When user sees the login page
    When user sees the Remember me on this computer
    When user clickable the Remember me on this computer

  @SCRUM-1309
  Scenario: "Login Function"  "Enter" key of the keyboard
    Given user lands on the login page
    When user sees the login page
    When user enters "hr1@cybertekschool.com" and "UserUser"
    When user sees the login button
    When user uses enter keyboard login button
    When user sees the Activity Stream
