Feature: Update Contact Detail Information

  Scenario: User successfully updated detail information
    Given User is on their dashboard page
    When User click my info sidebar and click Contact Detail
    And User update contact detail information
    Then Contact detail information updated successfully