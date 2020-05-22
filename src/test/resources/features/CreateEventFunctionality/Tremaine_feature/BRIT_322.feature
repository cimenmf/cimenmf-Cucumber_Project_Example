Feature:Calendar Module
  As a user I can view the Calendar and modify its data


  @wip
  Scenario: BRIT_ERP_322 edit event test
    Given User open url
    When User clicks BriteErpDemo button
    When User is logged in as "InventoryUser4"
    When User navigates to Calendar tab
    Then User click on day button
    When User clicks on eight o'clock box
    And User clicks on edit button


