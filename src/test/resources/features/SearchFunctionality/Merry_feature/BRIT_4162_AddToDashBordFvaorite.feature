Feature:
  As an Inventory user I should be able search and receive relevant results

#  Background:
#
#    Given user is on the login page
#    When user logs in as general user
#    Given user is on the Calendar page
#
#  Scenario: BRIT_4162_AddToDashBordFvaorite User Should be able to Add to DashBoard from his favorite search
#    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
#    Given user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
#    Then three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
#    When User clicks on the Favorites drop down menu
#    And user should click on Add Dash Borad Icon
#    Then User should "text" his searches and be abel to Add it to Dash Board
  Scenario:
    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory User4" using "in_4@info.com" and "alsfuh7we74"
    Then "user" clicks "Calendar" button
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Given user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    Then three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    And user should click on Favorites button
    And user should click on Add Dash Borad Icon
    Then User should "text" his searches and be abel to Add it to Dash Board