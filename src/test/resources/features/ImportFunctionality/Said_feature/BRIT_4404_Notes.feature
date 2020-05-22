Feature:


  @BRIT-4404
  Scenario Outline: Cucumber - Notes / Create actions - Notes (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Notes" button
    When "Manager" clicks "Create" button
    Then "Manager" sendKeys "<Tags>" in "Tag line"
    And "Manager" sendKeys "<Message>" in "Message line"
    When "Manager" clicks "Save" button
    Then "Manager" should be able to see "<Tags>" Tag
    And "Manager" should be able to see "<Message>" Note
   Then "Manager" should be able to see "<Tags>" Tag in Database
   And "Manager" should be able to see "<Message>" Note in Database

    Examples:
      | Tags      | Message                       |
      | interview | Interview Preparation         |
      | SQL       | SQL Preparation with friends  |
      | JDBC      | Watching JDBC day 1 and day 2 |
      | API       | Starting API before Market    |
      | Repeating | Repeating all classes         |








