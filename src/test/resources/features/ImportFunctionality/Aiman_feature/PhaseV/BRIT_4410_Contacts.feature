Feature:

  @BRIT-4410 @Contacts @McLean
  Scenario Outline: Cucumber - Contacts/ Create actions - Contacts (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Contacts" button
    When "Manager" clicks "Create" button

    Then "Manager" enters "<Name>" in "Name" field
    And "Manager" enters "<Company>" in "Company" field
    Then "Manager" enters "<Street>" in "Street" field
    And "Manager" enters "<City>" in "City" field
    Then "Manager" enters "<State>" in "State" field
    And "Manager" enters "<Zip Code>" in "Zip Code" field
    Then "Manager" enters "<Country>" in "Country" field
    And "Manager" enters "<Job Position>" in "Job Position" field
    Then "Manager" enters "<Phone>" in "Phone" field
    And "Manager" enters "<Email>" in "Email" field
    Then "Manager" enters "<Website>" in "Website" field

    When "Manager" clicks "Save" button

    Then "Manager" should see "<Name>" in "Name" field
    And "Manager" should see "<Street>" in "Street" field
    Then "Manager" should see "<City>" in "City" field
    And "Manager" should see "<Zip Code>" in "Zip Code" field
    Then "Manager" should see "<Job Position>" in "Job Position" field
    And "Manager" should see "<Phone>" in "Phone" field
    Then "Manager" should see "<Email>" in "Email" field
    And "Manager" should see "<Website>" in "Website" field

    Then "Manager" should see "<Name>" in "name" Database
    And "Manager" should see "<Street>" in "street" Database
    Then "Manager" should see "<City>" in "city" Database
    And "Manager" should see "<Zip Code>" in "zip" Database
    Then "Manager" should see "<Job Position>" in "function" Database
    And "Manager" should see "<Phone>" in "phone" Database
    Then "Manager" should see "<Email>" in "email" Database
    And "Manager" should see "<Website>" in "website" Database

    Examples:
      | Name            | Company | Street              | City    | State   | Zip Code | Country       | Job Position            | Phone        | Email              | Website        |
      | Desmond Fordham | Nlounge | 90058 Thierer Place | Phoenix | Arizona | 85083    | United States | Senior Quality Engineer | 602-928-5985 | dfordham4@about.me | https://va.gov |
  #      | Carmela Pollins | Fadeo        | 7498 Troy Terrace   | Cincinnati | Ohio    | 45203    | United States | Programmer III            | 513-282-4702 | cpollins1@topsy.com   | https://elpais.com   |
  #      | Irina Bonallick | Jabbersphere | 769 Corben Road     | Fort Worth | Texas   | 76192    | United States | Software Test Engineer II | 682-874-7930 | ibonallick2@wired.com | https://columbia.edu |
