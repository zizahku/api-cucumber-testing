Feature: Update Detail Information

  Scenario: User successfully update personal information
    Given User is on the dashboard page
    When User click my info tab in sidebar menu
    And User update personal detail information
    Then Personal detail information updated successfully