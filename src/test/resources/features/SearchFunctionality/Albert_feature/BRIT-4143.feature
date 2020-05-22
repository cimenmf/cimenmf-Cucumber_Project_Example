Feature: 

	#{color:#cc7832}Background:{color}{color:#cc7832} Given {color}user is on the Calendar page
	#
	#{color:#cc7832}Scenario: {color}Verify that User can refine Advanced Search queries
	# by meetings they have created through filter titled 'My Events'
	# {color:#cc7832}Given {color}user is on the Calendar page
	# {color:#cc7832}When {color}the user clicks on the Magnifying Glass icon in the far right side of the search bar
	# {color:#cc7832}Then {color}user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
	# {color:#cc7832}And {color}three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
	# {color:#cc7832}When {color}the user clicks on the Advanced Search icon titled Filters
	# {color:#cc7832}And {color}user clicks on the option My Events
	# {color:#cc7832}Then {color}user should observe a new tag in the search bar labeled My Events
	@BRIT-4143 @Calendar @McLean
	Scenario: User should be able to make an Advanced Search and Filter Results by 'My Events'
		
		
		
		
		Scenario: Verify that User can refine Advanced Search queries
		by meetings they have created through filter titled 'My Events'
		Given user is on the Calendar page
		When the user clicks on the Magnifying Glass icon in the far right side of the search bar
		Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
		And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
		When the user clicks on the Advanced Search icon titled Filters and selects My Events
		Then user should observe a new tag in the search bar labeled My Events
		