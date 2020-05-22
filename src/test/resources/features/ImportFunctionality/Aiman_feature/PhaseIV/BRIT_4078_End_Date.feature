Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Verify that "End Date" displayed and clickable
  @BRIT-4078 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - End Date

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And "Manager" should be able to see "Map your columns to import" Message

    Then "Manager" should be able to see "Show fields of relation fields" Checkbox
    And verify Checkbox Show fields of relation fields is selected by default
    Then "Manager" clicks "Show fields of relation fields (advanced)" Checkbox

    When "Show fields of relation fields (advanced)" Checkbox is not selected
    Then "Manager" clicks "Don't Import" select button
    And "Manager" should be able to see "End Date"
    Then "Manager" clicks "End Date" on the selective panel