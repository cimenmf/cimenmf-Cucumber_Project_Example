Feature:Calendar Module
  As a user I can view the Calendar and modify its data

  @Work
  Scenario:BRIT_ERP_109 create event test
    Given I open url
    When I click the BritErpDemo button
    Then I log in as user
    Then User click on day button
    And User click on the all day box
    When User types in "testing purposes" as their event name
    Then User click on create button