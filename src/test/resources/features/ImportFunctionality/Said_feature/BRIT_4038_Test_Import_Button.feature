Feature: 

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager as a user should be able to verify the Test Import button.
	# * Verify that manager as a user should be able to click the Test Import button
	# * Verify that manager as a user should be able to fail after clicking the Test Import button / negative test
	# * Verify that for manager as a user error message is displayed
  @BRIT-4038
  Scenario: Cucumber - Calendar / Import actions - Test Import Button (Manager)
		# Pre-Condition: Environment is up and running.

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "Manager" should be able to see "Test Import" button
    And "Manager" clicks "Test Import" button
    Then "Manager" should be able to see "You must configure at least one field to import" Message

