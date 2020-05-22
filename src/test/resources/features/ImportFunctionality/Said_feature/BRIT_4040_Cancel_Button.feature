@PR2
Feature:

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to verify the Cancel button near Meetings / Import a File.
	# * Verify that manager as a user should be able to click the Cancel button
  @BRIT-4040
  Scenario: Cucumber - Calendar / Import actions - Cancel Button (Manager)
		        # Pre-Condition: Environment is up and running

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "Manager" should be able to see "Cancel" button
    And "Manager" clicks "Cancel" button

    Then "List page" Title should be displayed "Meetings - Odoo"
    And url is "http://52.39.162.23/web?#view_type=list&model=calendar.event&menu_id=120&action=136"