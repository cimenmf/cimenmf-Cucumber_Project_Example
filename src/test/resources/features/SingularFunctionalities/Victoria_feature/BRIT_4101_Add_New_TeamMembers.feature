Feature:


  @BRIT-4101
  Scenario: Add New TeamMembers
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"


    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button

    When "Manager" clicks Channel leader dropdown
    Then "Manager" should be to see list options
    And "Manager" clicks first member from the list options

    Then "Manager" enter new email Victoria@cybertek.com
    And "Manager" clicks Add button
		    
		     
		    
		    