Feature:

  @BRIT-4425 @Contacts @McLean
  Scenario Outline: Cucumber - Contacts - Excel / Create actions - Contacts (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Contacts" button
    When "Manager" clicks "Create" button
    Then "Manager" takes information from excel "Information", "Contacts" sheet, row of <num>
    And "Manager" clicks "Save" button
    Then "Manager" should see correct information from excel "Information", "Contacts" sheet, row of <num>

    Examples:
      | num |
      | 0   |
#      | 1   |
#      | 2   |
#      | 3   |
#      | 4   |
#




