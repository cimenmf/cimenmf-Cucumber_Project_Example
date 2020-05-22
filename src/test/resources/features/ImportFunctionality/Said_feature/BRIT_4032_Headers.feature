Feature:


  @BRIT-4032
  Scenario: Cucumber - Calendar / Import actions - Headers (Manager)
   # Pre-Condition: Environment is up and running

    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then manager should be able to see following Headers:
      | Discuss     |
      | Calendar    |
      | Notes       |
      | Contacts    |
      | Website     |
      | Inventory   |
      | Repairs     |
      | Invoicing   |
      | Employees   |
      | Leaves      |
      | Expenses    |
      | Maintenance |
      | Dashboards  |
