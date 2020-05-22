Feature:

  @BRIT-4430 @Inventory @McLean
  Scenario: Cucumber - Products - Excel/ Create actions - Leaves (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Inventory" button
    And "Manager" clicks "Products" button
    When "Manager" clicks "Create" button
    Then "Manager" enters information from excel "Information", "Products" sheet and should see correct information

