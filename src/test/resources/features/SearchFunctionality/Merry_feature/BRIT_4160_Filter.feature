Feature:Calendar Module
  As an Inventory user I should be able search and receive relevant results

  Background:

    Given user is on the login page
    When user logs in as general user
    Then "user" clicks "Calendar" button

  Scenario:BRIT_4160_Filter
  User should be able to filter it's search by adding custom filter

    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When User clicks on the Filter drop down menu
    Then User should be able to see the Add Custom Filter
    When User clicks on the  Add Custom Filter
    Then User should be able to select any  from the drop down list
    Then User should be abel to save his selected option