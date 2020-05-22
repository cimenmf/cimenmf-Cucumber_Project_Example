Feature: 

	#Verify that User is able to filter Advanced Search results by messages user has not previously accessed by enabling the 'Unread Message' filter.
	# 
	#h4.  
	@BRIT-4144 @Calendar @McLean
	Scenario: User should be able to make an Advanced Search and Filter Results by 'Unread Messages'EditCommentAssignMoreTo DoIn ProgressDoneExport__Cucumber
		 Scenario: Verify that User can refine Advanced Search queries
		  by meetings they have created through filter titled 'Unread Messages'
		    Given user is on the Calendar page
		    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
		    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
		    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
		    When the user clicks on the Advanced Search icon titled Filters and selects Unread Messages
		    Then user should observe a new tag in the search bar labeled Unread Messages
		
		