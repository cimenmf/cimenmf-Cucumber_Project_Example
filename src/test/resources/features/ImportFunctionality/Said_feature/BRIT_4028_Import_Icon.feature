@PR3
Feature:

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Change back import option for default
  @BRIT-4028 @Calendar @Mclean
  Scenario: Cucumber - Calendar / Import actions - Import Icon (Manager)

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    Then "Manager" should be able to see "Import" button
    When "Manager" clicks "Import on Calendar Page" button
    Then "Import page" Title should be displayed "Import a File - Odoo"