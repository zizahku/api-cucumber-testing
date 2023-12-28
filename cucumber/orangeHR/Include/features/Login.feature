Feature: Login

  Scenario: Check login using valid credential
    Given user is on login page
    When user input username and password
    And user should be logged in successfully
    Then user log out