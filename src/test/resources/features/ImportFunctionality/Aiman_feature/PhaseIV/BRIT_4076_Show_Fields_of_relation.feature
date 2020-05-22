Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# *  Verify that "Show fields of relation fields (advanced)" is displayed and clickable
  @BRIT-4076 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - Show fields of relation fields

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Calendar page" Title should be displayed "Meetings - Odoo"
    Then "Manager" should be able to see "List" button
    Then "Manager" clicks "List" button
    Then "List page" Title should be displayed "Meetings - Odoo"

    When "Manager" clicks "Import on Calendar Page" button
    Then "Import page" Title should be displayed "Import a File - Odoo"

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And "Manager" should be able to see "Map your columns to import" Message

    Then "Manager" should be able to see "The first row contains the label of the column" Checkbox
    And verify Checkbox The first row contains the label of the column is selected by default
    Then "Manager" clicks "The first row contains the label of the column" Checkbox

    Then "Manager" should be able to see "Show fields of relation fields (advanced)" Checkbox
    And verify Checkbox Show fields of relation fields is selected by default
    Then "Manager" clicks "Show fields of relation fields (advanced)" Checkbox