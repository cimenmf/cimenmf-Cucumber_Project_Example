Feature:

  @BRIT-4429 @Inventory @McLean
  Scenario Outline: Cucumber - Products/ Create actions - Leaves (Manager)
    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    Then "Manager" clicks "Inventory" button
    And "Manager" clicks "Products" button
    When "Manager" clicks "Create" button

    Then "Manager" enters "<Product name>" in "Product name" field
    And "Manager" enters "<Internal Reference>" in "Internal Reference" field
    And "Manager" enters "<Sales Price>" in "Sales Price" field
    Then "Manager" enters "<Cost>" in "Cost" field

    When "Manager" clicks "Save" button

    Then "Manager" should see "<Product name>" in "Product name" field
    And "Manager" should see "<Internal Reference>" in "Internal Reference" field
    And "Manager" should see "<Sales Price>" in "Sales Price" field
    Then "Manager" should see "<Cost>" in "Cost" field

    And "Manager" should see "<Product name>" in "product_name" Database
    Then "Manager" should see "<Internal Reference>" in "default_code" Database
    Then "Manager" should see "<Sales Price>" in "list_price" Database
    And "Manager" should see "<Cost>" in "cost" Database

    Examples:
      | Product name               | Internal Reference | Sales Price | Cost |
      | Sprouts - Baby Pe Tendrils | Lotlux             | 101         | 80   |
#      | Lettuce - Arugula          | Y-find             | 20          | 10   |
#      | Scallops - 10/20           | Zaam-Dox           | 50          | 30   |