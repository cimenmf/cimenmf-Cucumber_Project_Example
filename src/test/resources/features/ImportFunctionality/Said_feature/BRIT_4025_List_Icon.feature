@PR3
Feature:

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click list icon
  @BRIT-4025 @smoke
  Scenario: Cucumber - Calendar / Import actions - List Icon (Manager)
		# Pre-Condition: Environment is up and running.

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Calendar page" Title should be displayed "Meetings - Odoo"
    When hover to the List option on the right top corner
    Then "Manager" should be able to see "List" button
    And "Manager" clicks "List" button
    Then "List page" Title should be displayed "Meetings - Odoo"
    And url is "http://54.148.96.210/web?#view_type=list&model=calendar.event&menu_id=120&action=136"


