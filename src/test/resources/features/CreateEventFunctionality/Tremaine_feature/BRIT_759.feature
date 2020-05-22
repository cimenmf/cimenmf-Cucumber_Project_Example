Feature:Calendar Module
  As a manager I should be able to perform actions in Calendar tab.

  Scenario: BRIT_759_Manager can view main Calendar in the required format
    Given I open url
    When I click the BritErpDemo button
    Given User signs in as a manager
    Then Manager clicks on Calendar tab button
    When Manager is on calendar page,clicks on the day button
