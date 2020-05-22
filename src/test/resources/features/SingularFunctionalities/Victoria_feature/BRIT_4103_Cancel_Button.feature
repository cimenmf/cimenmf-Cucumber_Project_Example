Feature:


  @BRIT-4103
  Scenario: Cancel button
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"
    And "manager" clicks "CRM" button

    When "manager" clicks "SalesChannels CRM" button
    Then "SalesChannels page" Title should be displayed "Sales Channels - Odoo"

    When "Manager" clicks "Import CRM" button
    And "Import page" Title should be displayed "Import a File - Odoo"

    Then "Manager" clicks "Cancel CRM" Button
    And "SalesChannels page" Title should be displayed "Sales Channels - Odoo"
		    
		    
		     
		    
		    