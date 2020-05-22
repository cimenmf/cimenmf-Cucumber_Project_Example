Feature:  User should be able to make an Advanced Search and Filter Results by 'My Meetings'__Cucumber

	#Verify that User can refine Advanced Search queries of Calendar events/meetings by meetings they have created through filter titled 'My Meetings'
  @BRIT-4139


  Given user is on the Calendar page

  Scenario: Verify that User can refine Advanced Search queries by meetings they have created through filter titled 'My Meetings'
    Given user is on the Calendar page
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Filters
    And user clicks on the option My Meetings
    Then user should observe a new tag in the search bar labeled My Meetings