Feature: 

	#User Story: 
	# * As an Inventory Manager 2, I should be able to do actions in import based module on list module
	#
	#Acceptance Criteria:
	# * Verify 'Encoding' is displayed and User can select
  @BRIT-4080 @Calendar @Mclean
  Scenario: Cucumber - Calendar Import - Encoding

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Import on Calendar Page" button

    When "Manager" sendKeys "/uploaded_files/utility.xlsx" in "Load File"
    Then "utility.xlsx" should be displayed on the Input Line
    And "Manager" should be able to see "Encoding:" field

    When "Manager" clicks "Encoding" select button
    Then "Manager" should be able to see "windows-1252"
    And "Manager" clicks "windows-1252" on the selective panel