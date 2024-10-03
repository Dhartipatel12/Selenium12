Feature: Login Feature

  Scenario: Successful Login with valid credential
    Given user is on the login page
    When  user enters valid username and password
    And   user click on Login Button
    Then  user should be logged in successfully