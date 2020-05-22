
Feature:




  Background:
    Given I open "http://52.39.162.23/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button


  Scenario Outline:
    When the user clicks on the Magnifying Glass icon in the far right side of the search bar
    Then user should see the icon in the Magnifying Glass change from a plus-sign to a minus-sign
    And three new icons should be revealed below the Search Bar, Filters, Group By, and Favorites
    When the user clicks on the Advanced Search icon titled Filters
    And I select Add Custom Filter
    Then I should see the following Custom Filter "<filters>" displayed along with the corresponding "<filter options>"

    Examples:
      | filters                | filter options                                                                                                             |
      | Action Needed          | is true, is false                                                                                                          |
#      | Active                 | is true, is false                                                                                                          |
#      | Activities             | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | All Day                | is true, is false                                                                                                          |
#      | Applicant              | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Attendees              | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | By day                 | is, is not, is set, is not set                                                                                             |
#      | Created by             | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Created on             | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Date                   | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Date of month          | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Description            | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Document ID            | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Document Model         | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Document Model Name    | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Duration               | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | End Date               | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | End Datetime           | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Followers              | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Followers (Channels)   | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Followers (Partners)   | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Fri                    | is true, is false                                                                                                          |
#      | ID                     | is                                                                                                                         |
#      | Is Follower            | is true, is false                                                                                                          |
#      | Last Message Date      | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Last Updated by        | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Last Updated on        | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Location               | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Meeting Subject        | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Messages               | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Mon                    | is true, is false                                                                                                          |
#      | Opportunity            | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Option                 | is, is not, is set, is not set                                                                                             |
#      | Participant            | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Privacy                | is, is not, is set, is not set                                                                                             |
#      | Recurrence             | is, is not, is set, is not set                                                                                             |
#      | Recurrence Termination | is, is not, is set, is not set                                                                                             |
#      | Recurrent              | is true, is false                                                                                                          |
#      | Recurrent ID           | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Recurrent ID date      | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Recurrent Rule         | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Reminders              | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Repeat                 | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Repeat Every           | is equal to, is not equal to, greater than, less than, greater than or equal to, less than or equal to, is set, is not set |
#      | Repeat Until           | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Responsible            | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Responsible            | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Sat                    | is true, is false                                                                                                          |
#      | Show Time as           | is, is not, is set, is not set                                                                                             |
#      | Start                  | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Start Date             | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Start DateTime         | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Status                 | is, is not, is set, is not set                                                                                             |
#      | Stop                   | is equal to, is not equal to, is after, is before, is between, is set, is not set                                          |
#      | Sun                    | is true, is false                                                                                                          |
#      | Tags                   | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Thu                    | is true, is false                                                                                                          |
#      | Tue                    | is true, is false                                                                                                          |
#      | Website Messages       | contains, doesn't contain, is equal to, is not equal to, is set, is not set                                                |
#      | Wed                    | is true, is false                                                                                                          |
#      | Weekday                | is, is not, is set, is not set                                                                                             |

    # select.o_input.o_searchview_extended_prop_field     <-- CustomFilterDropDown
    # select.o_input.o_searchview_extended_prop_op        <-- CorrespondingConditions