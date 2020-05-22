Feature:


  @BRIT-4140
  Scenario: Save Button NegativeTest
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"

    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button
    And "Manager" type's "" on SalesTeam Name input line
    When "Manager" clicks "Save" button appear popUp window
		    
		    
		     
		    
		    