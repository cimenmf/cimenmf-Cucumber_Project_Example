Feature: 

	#Verify that the custom groups are displayed and enabled.
  @BRIT-4275
  Scenario Outline: Group By / Custom Groups
    Given user is on the Calendar page
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Group By and selects add custom groups
    Then the "<custom_groups>" should be displayed and enabled

    Examples:
      | custom_groups          |
      | Active                 |
      | All Day                |
      | Applicant              |
      | By day                 |
      | Created by             |
      | Created on             |
      | Date                   |
      | Document Model         |
      | Document Model Name    |
      | End Date               |
      | End Datetime           |
      | Fri                    |
      | Last Message Date      |
      | Last Updated by        |
      | Last Updated on        |
      | Location               |
      | Meeting Subject        |
      | Mon                    |
      | Opportunity            |
      | Option                 |
      | Privacy                |
      | Recurrence             |
      | Recurrence Termination |
      | Recurrent              |
      | Recurrent ID date      |
      | Recurrent Rule         |
      | Repeat Until           |
      | Responsible            |
      | Sat                    |
      | Show Time as           |
      | Start                  |
      | Start Date             |
      | Start DateTime         |
      | Status                 |
      | Stop                   |
      | Sun                    |
      | Thu                    |
      | Tue                    |
      | Wed                    |
      | Weekday                |
		