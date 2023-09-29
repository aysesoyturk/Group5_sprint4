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