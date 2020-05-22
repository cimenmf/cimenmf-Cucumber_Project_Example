Feature:


  @BRIT-4413
  Scenario: Cucumber - Meeting / Create actions - Meeting (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 5" using "inm5@info.com" and "trt332qWW12"
    Then "Manager" clicks "Calendar" button
    Then "Manager" clicks "List" button
    When "Manager" clicks "Create" button
    Then "Manager" enter information from excel table: "Phase V", sheet: "Meeting" and verify with information with Page and Database
