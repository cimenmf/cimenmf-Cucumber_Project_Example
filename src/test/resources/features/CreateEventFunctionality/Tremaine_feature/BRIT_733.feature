Feature:  As a user I can view the Calendar and modify its data

  Scenario: BRIT_733_change the current day test
    Given I open "http://52.39.162.23" url
    When I click the BritErpDemo button
    Then User
    When User clicks on Calendar tab
    And User clicks on day button
    Then User clicks on the right arrow two times
