#@smoker
#@runMe
#Feature: As a user, I should be able to FILTER Advanced Search queries of
#  Calendar events/meetings by meetings they have created
#
#
#  Background:
#   Given user is on the Calendar page
#
#  Scenario: Verify that User can refine Advanced Search queries
#  by meetings they have created through filter titled 'My Meetings'
#    Given user is on the Calendar page
#    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
#    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
#    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
#    When the user clicks on the Advanced Search icon titled Filters
#    And user clicks on the option My Meetings
#    Then user should observe a new tag in the search bar labeled My Meetings
#
#
#
##  /**http://jira.cybertekschool.com/browse/BRIT-93
##  -Verify that User can refine Advanced Search queries of Calendar events/meetings
##  by meetings they have created through filter titled 'My Meetings'
##
##  STEPS:
##  Step Five: User should click on the Calendar tab in the header, on the left side of the screen.
##
##  Step Six: User should click on the Magnifying Glass icon in the Search Bar, on the far right side.
##
##  Step Seven: User should click on the Advanced Search icon titled 'Filters.'
##
##  Step Eight: User should select 'My Meetings' from the Filters drop down menu.
##
##
##  EXPECTED RESULTS:
##  Step Six: The user should see the icon in the Magnifying Glass change from a plus-sign ('+')
##  to a minus-sign ('-'), also, three new icons should be revealed below the Search Bar, 'Filters',
##  'Group By', and 'Favorites'
##
##  Step Seven: User's click should reveal a drop down menu extending from the 'Filters' icon.
##
##  Step Eight: User should observe a new tag in the Search Bar labeled 'My Meetings'
##  **/
