@PR2
Feature:

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to click Reload File and Reload file. which is not working
  @BRIT-4036
  Scenario: Cucumber - Calendar / Import actions - Reloading File, FAIL (Manager)
		# Pre-Condition: Environment is up and running.

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button
    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"

    Then "Manager" should be able to see "Reload File" button
    And  "Manager" sendKeys "C:\Users\saidy\IdeaProjects\Cukes_ERP\uploaded_files\EmployeesTestData.xlsx" in "Reload File"
