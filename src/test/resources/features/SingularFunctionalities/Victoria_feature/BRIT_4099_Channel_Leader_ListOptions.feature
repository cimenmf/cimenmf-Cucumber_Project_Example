Feature:


  @BRIT-4099
  Scenario:  Channel Leader list option
    Given I open "http://54.148.96.210/web/login" url
    When "I" clicks "BriteErpDemo" button
    Then I log in as a "EventsCRM_Manager" using "EventsCRM_Manager@info.com" and "Ugh45wQ12"



    When "Manager" clicks "SalesChannels" button
    Then "Manager" clicks "Create" button

    When "Manager" clicks "Channel leader" on the selective panel
    Then "Manager" should be able to see "list options"

    And "Manager" should be able to choose and click "FistChannelOption" Message
		    
		    