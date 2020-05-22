Feature:Calendar Module
  As an Inventory user I should be able search and receive relevant results

  Background:

    Given user is on the login page
    When user logs in as general user

  Scenario:BRIT_4159_SearchBox
  User should be able to input text into the search box and receive results relevant to the search criteria.
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should send text into the the search box
    Then User should receive relevant results
