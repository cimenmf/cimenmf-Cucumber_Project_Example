Feature:As a user I can view the Calendar and modify its data

  Scenario: BRIT_748_User can click on all-day checkbox test
    Given User open url
    When User clicks on the BritErpDemo button
    Then User is logged in as "InventoryUsetr4"
    When User navigates to the Calendar tab
    And User clicks on day button
    Then User clicks on the six o'clock box
    When User clicks on edit button
    Then User clicks on options tab
    Then User clicks on all day checkbox