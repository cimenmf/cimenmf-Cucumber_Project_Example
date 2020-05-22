Feature:

	#*User Story*
	#
	#User should be able to see all events in the selected month at one glance and able to get details of events
	#
	#*Acceptance Criteria*
	# * Verify that user can create event on any day in selected month.
  @BRIT-4202
  Scenario: sample

    Given I open "http://52.39.162.23" url
    Then "Landing Page" Title should be displayed "Odoo"
    When "I" clicks "BriteErpDemo" button
    Then "Login Page" Title should be displayed "Login | Website localhost"
    When I log in as a "user" using "in_4@info.com" and "alsfuh7we74"
    And "User" clicks "Calendar" button
    And "User" clicks "Week" button
    Then page shows weekly view calender