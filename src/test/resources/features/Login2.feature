@Smoke
Feature: Login Function
  User Story: As a user, I should be able to log in

  Scenario Outline: Positive Scenario-> User can login with valid credentials
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

  Scenario Outline: Negative Scenario-> If user uses the invalid credentials
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

  Scenario: User should be displayed if the password or username is empty
    Given user lands on the login page
    When user sees the login page
    When user clicks Login
    When user clicks Password
    When user sees the login button
    When user clicks the login button
    When user sees warning messages


  Scenario: user enters the Forget Password
    Given user lands on the login page
    When user sees the login page
    When user sees the Forgot Your Password
    When user enters the Forgot Your Password
    When user sees the forget password page

  Scenario: user sees the "Remember me on this computer"
    Given user lands on the login page
    When user sees the login page
    When user sees the Remember me on this computer
    When user clickable the Remember me on this computer

  Scenario: keyboard enter key can be used
    Given user lands on the login page
    When user sees the login page
    When user enters "hr1@cybertekschool.com" and "UserUser"
    When user sees the login button
    When user uses enter keyboard login button
    When user sees the Activity Stream
