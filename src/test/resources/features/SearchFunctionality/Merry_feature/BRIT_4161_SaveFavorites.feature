Feature:
  As an Inventory user I should be able search and receive relevant results

  Background:

    Given user is on the login page
    When user logs in as general user
    Then "user" clicks "Calendar" button


  Scenario:BRIT_4161_SaveFavorites
  User Should be able to save Default Current Search as favorite
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Given user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    Then three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When User clicks on the Favorites drop down menu
    Then User should click on Save Current Search
    Then User should "text" his searches and be abel to save as current search