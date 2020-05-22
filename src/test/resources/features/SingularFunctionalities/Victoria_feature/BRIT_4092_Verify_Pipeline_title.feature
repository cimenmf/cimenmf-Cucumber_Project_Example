Feature:


  @BRIT-4092
  Scenario: Verify Pipeline & title


    Given I open "http://54.148.96.210/web/login" url
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then "Manager" clicks "CRM" button
    And "Pipeline page" Title should be displayed "Pipeline - Odoo"


		    