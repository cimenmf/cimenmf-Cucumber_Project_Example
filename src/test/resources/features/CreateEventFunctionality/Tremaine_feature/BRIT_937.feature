Feature: Calendar Module
  As a manager I should be able to perform actions in Calendar tab.

  Scenario: BRIT_937 today button is enabled
    Given I open url
    When I click the BritErpDemo button
    Then logs in as a Manager
    Then Manager clicks on calendar tab
    Then Manager clicks on the right arrow button ,adjacent to day button,twice
    Then Manager clicks on day button
    And Manager Verifies day button was selected

