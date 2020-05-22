Feature:Calendar Module
  As a user I can view the Calendar and modify its data

  @login
  Scenario: BRIT_ERP_323 edit event test
    Given I open "http://52.39.162.23" url
    When I click the BritErpDemo button
    Then I log in as a "Inventory User 2" using "in_4@info.com" and "alsfuh7we74"
    When User navigates to Calendar tab
    Then User click on day button
    When User clicks on eight o'clock box
    And User clicks on edit button
    Then User inserts "InventoryUser" into the attendees box