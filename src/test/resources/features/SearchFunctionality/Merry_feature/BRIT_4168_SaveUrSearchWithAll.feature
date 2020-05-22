Feature:Calendar Module
  As an Inventory user I should be able search and receive relevant results


  Scenario:BRIT_4168_SaveOnlyOnce
  User should made only one choose under Group By button for one filter criteria
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory User4" using "in_4@info.com" and "alsfuh7we74"
    Then "user" clicks "Calendar" button
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    And user should click on Favorites button
    Then user should click on Save current Search option and send text to the box
    And user should be able to share his Favorite search with all users