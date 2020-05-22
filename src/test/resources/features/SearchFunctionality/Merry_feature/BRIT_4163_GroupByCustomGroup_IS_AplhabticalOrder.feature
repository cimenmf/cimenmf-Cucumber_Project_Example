Feature:Calendar Module
  As an Inventory user I should be able search and receive relevant results

  Scenario Outline: BRIT_4163
  Verify Add Custom drop down menu under the Group By is in Alphabteical Order

    Given I open "http://52.39.162.23" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory User4" using "in_4@info.com" and "alsfuh7we74"
    Then "user" clicks "Calendar" button

    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Given user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    Then three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Group By and selects add custom groups
    Then the "<custom_groups>" should be displayed and is in Alpabetical order

    Examples:
      | custom_groups |
      | Active        |
#      | All Day                |
#      | Applicant              |
#      | By day                 |
#      | Created by             |
#      | Created on             |
#      | Date                   |
#      | Document Model         |
#      | Document Model Name    |
#      | End Date               |
#      | End Datetime           |
#      | Fri                    |
#      | Last Message Date      |
#      | Last Updated by        |
#      | Last Updated on        |
#      | Location               |
#      | Meeting Subject        |
#      | Mon                    |
#      | Opportunity            |
#      | Option                 |
#      | Privacy                |
#      | Recurrence             |
#      | Recurrence Termination |
#      | Recurrent              |
#      | Recurrent ID date      |
#      | Recurrent Rule         |
#      | Repeat Until           |
#      | Responsible            |
#      | Sat                    |
#      | Show Time as           |
#      | Start                  |
#      | Start Date             |
#      | Start DateTime         |
#      | Status                 |
#      | Stop                   |
#      | Sun                    |
#      | Thu                    |
#      | Tue                    |
#      | Wed                    |
#      | Weekday                |
