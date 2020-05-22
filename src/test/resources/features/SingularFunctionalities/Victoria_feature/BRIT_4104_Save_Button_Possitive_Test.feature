Feature:


  @BRIT-4104
  Scenario: Save Button
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"

    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button
    When "Manager" sendKeys "Victoria" in "SalesTeam Name"
    Then "Manager" clicks "Save" button
		    
		    
		     
		    
		    