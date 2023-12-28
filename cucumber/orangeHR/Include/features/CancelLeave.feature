Feature: Leave Management

  Scenario: Cancel Leave - No Pending Approval Leave
    Given The user is already on MyLeave page
    When The user views the table of leave records
    Then the Cancel button should not be displayed