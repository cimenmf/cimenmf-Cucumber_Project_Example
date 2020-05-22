Feature: Calendar Module
As a manager I should be able to perform actions in Calendar tab.


  Scenario: BRIT_769 Manager can edit events
    Given User open url
    When User clicks BriteErpDemo button
    Then User is logged in as "Inventory User4"
    Then Manager clicks on calendar tab
    And Manager clicks on day button
    Then Manager clicks on six am box
    Then Manager clicks on edit button
    And Manager verifies edit button is enabled
