Feature: 

	#Verify that User can specify that Advanced Search queries return only results for which the User is directly responsible.
	# 
	#h4.  
	@BRIT-4145
	Scenario: User should be able to make an Advanced Search and recieve results Organized by Responsibility.
		Scenario: User should be able to make an Advanced Search and recieve results Organized by Responsibility.
		    Given user is on the Calendar page
		    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
		    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
		    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
		    When the user clicks on the Advanced Search icon titled Group By
		    Then user should observe a new tag in the search bar labeled Responsible
		
		