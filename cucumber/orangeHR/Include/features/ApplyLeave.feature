Feature: Leave Management

  Scenario: Apply Leave
    Given User is on the leave application page
    When User didnt have any leave balance and applies for leave
    Then user unavailable for applying leave