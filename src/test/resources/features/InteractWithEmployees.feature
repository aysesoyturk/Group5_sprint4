

Feature:
  As a user, I should be able to interact with employees on the posts that I have access to

  Background: User should be able to log in successfully

    When user enters "hr1@cybertekschool.com" and "UserUser"
    When user clicks the login button
    Then user should see the main page



  Scenario:
  Users should be able to make a comment, like, or unfollow on other employees' posts

    Given Users click the Comment button on users posts

    When Users click the Like button on users posts
    When Users verify that the post is liked
    When Users click the Follow button on users posts
    When Users click the Unfollow button on users posts
    Then Users verify that the post is unfollowed

  @wip
  Scenario:
Users should be able to like, or make comments on all other reviewers' comments

    Given Users click the Like button on other reviewers' comments
    When Users verify like button is clickable
    When Users click the Reply button on other reviewers' comments


  Scenario:
  Users should be able to click on reviewers' name and visit their profiles

    When Users click the profile name
    Then Users visit the reviewers profile








