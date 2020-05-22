Feature: Calendar Module
  As a manager I should be able to perform actions in Calendar tab.

  Scenario: BRIT_762 Manager can schedule events test
    Given I open url
    When I click the BritErpDemo button
    Then logs in as a Manager
    Then Manager clicks on calendar tab
    Then Manager clicks on day button
    And Manager clicks on six am box
    Then Manager verifies "testing purposes" is displayed















