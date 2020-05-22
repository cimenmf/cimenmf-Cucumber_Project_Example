Feature:Calendar Module
  As an Inventory user I should be able search and receive relevant results


  Scenario: Verify Add Custom drop down menu is in Alphabteical Order


    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory User4" using "in_4@info.com" and "alsfuh7we74"
    Then "user" clicks "Calendar" button
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Filters and selects add custom Filters
    Then the add custom Filters should be displayed and is in Alpabetical order



