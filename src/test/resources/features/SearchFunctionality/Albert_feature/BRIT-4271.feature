Feature: 

	#Verify that the default Groups : Responsible ; Available ; Privacy  are displayed and enabled.
  @BRIT-4271
  Scenario Outline: Group By  / Default Groups
    Given user is on the Calendar page
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Group By
    Then the "<groups>" should be displayed and enabled

    Examples:
      | groups       |
      | Responsible  |
      | Availability |
      | Privacy      |