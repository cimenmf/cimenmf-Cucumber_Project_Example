Feature:


  @BRIT-4094
  Scenario: Click SalesChannels &&  verify title
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    Then "Manager" clicks "CRM" button

    When "Manager" clicks "SalesChannels CRM" button
    And "Sales Channels page" Title should be displayed "Sales Channels - Odoo"
		    
