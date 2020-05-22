@PR1
Feature:

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to choose at least one field.
	# * Verify that manager as a user should be able to double click the Test Import button
	# * Verify that manager as a user should be able to fail after double-clicking the Import button / negative test
	# * Verify that manager as a user should be able verify pop-up window
	# * Verify that for manager as a user "Odoo Client Error"  error messageis displayed in pop-up window
	# * Verify that for manager as a user "Please use the copy button to report the error to your support service."  error message is displayed in pop-up window
	# * Verify that manager as a user should be able to verify "Copy the full error to clipboard" button
	# * Verify that manager as a user should be able to click "Copy the full error to clipboard"
	# * Verify that manager as a user should be able to verify "see details" button
	# * Verify that manager as a user should be able to click "see details" button
	# * Verify that manager as a user should be able to verify "Uncaught event validate inappropriate in current state validating" message
	# * Verify that manager as a user should be able to verify "Ok" button
	# * Verify that manager as a user should be able to click "Ok" button
  @BRIT-4041
  Scenario: Cucumber - Calendar / Import actions Error message (Manager)
		# Pre-Condition: Environment is up and running

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    And "Manager" clicks "The first row contains the label of the column" button

    Then "Manager" should be able to see "Odoo Client Error" Message
    Then "Manager" should be able to see "Please use the copy button to report the error to your support service." Message

    Then "Manager" should be able to see "Copy the full error to clipboard" button
    And "Manager" clicks "Copy the full error to clipboard" button

    Then "Manager" should be able to see "See details" button
    When "Manager" clicks "see details" button
    Then "Manager" should be able to see "Uncaught event settings_changed inappropriate in current state previewing" Message

    Then "Manager" should be able to see "Ok" button
    When "Manager" clicks "Ok" button
    Then "Import page" Title should be displayed "Import a File - Odoo"
    And url is "http://52.39.162.23/web?#model=calendar.event&action=import"