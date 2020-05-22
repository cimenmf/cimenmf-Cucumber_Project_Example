Feature: Calendar Module
  As a manager I should be able to perform actions in Calendar tab.
  Background:
    Given I open url
    When I click the BritErpDemo button
    Then logs in as a Manager
    Then Manager clicks on calendar tab
    Then Manager clicks on day button

  Scenario: BRIT_927-Manager can click on recurrent check box inside options tab.
    And Manager clicks on the eight o clock box
    Then Manager clicks on edit button
    Then Manager clicks on options tab
    Then Manager clicks on recurrent check box
    And Manager verifies the check box was selected
