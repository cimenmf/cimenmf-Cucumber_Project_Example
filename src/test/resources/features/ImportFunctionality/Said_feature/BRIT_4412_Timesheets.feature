Feature:


  @BRIT-4412
  Scenario Outline: Cucumber - Timesheets / Create actions - Timeeshets (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 5" using "inm5@info.com" and "trt332qWW12"
    Then "Manager" clicks "Timesheets" button
    When "Manager" clicks "Create" button
    Then "Manager" sendKeys <number> from excel "Phase V", "Timesheets" sheet
    When "Manager" clicks "Save" button
    Then "Manager" should be able to see <number> on page from excel "Phase V", "Timesheets" sheet
    Then "Manager" should be able to see <number> in Database from excel "Phase V", "Timesheets" sheet
    Examples:
      | number |
      | 0      |
      | 1      |
      | 2      |
      | 3      |
      | 4      |
      | 5      |
      | 6      |
      | 7      |
      | 8      |
      | 9      |
      | 10     |

