Feature: 

	#Verify the that the default Filters : My Events ; My Meetings ; Unread Messages are present and enabled.
	#
	# 
  @BRIT-4266
  Scenario Outline: Filter Options / Default Filters
    Given user is on the Calendar page
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Filters
    Then the default "<filters>" should be displayed and enabled

    Examples:
      | filters         |
      | My Events       |
      | My Meetings     |
      | Unread Messages |
		    