@PR2
Feature:

	#User Story; 
	#
	# * As an inventory manager 2 should be able to do actions in import based module on list module 
	#
	#Acceptance Criteria;
	# * Verify that manager should be able to verify and click Help button
  @BRIT-4037
  Scenario: Cucumber - Calendar / Import actions - Help button (Manager)
		# Pre-Condition: Environment is up and running.

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button
    And "Manager" should be able to see "Help" button
    When "Manager" clicks "Help" button
    And "Manager" switchs page to "How to import data into Odoo — Odoo 11.0 documentation"
    Then "Help page" Title should be displayed "How to import data into Odoo — Odoo 11.0 documentation"
    And url is "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html"
    Then "Manager" should be able to see "How to import data into Odoo" Message