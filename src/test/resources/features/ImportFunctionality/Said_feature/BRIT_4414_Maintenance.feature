Feature:


  @BRIT-4414
  Scenario Outline: Cucumber - Maintenance / Create actions - Maintenance (Manager)
    Given I open "http://54.148.96.210/web/login" url
    When I log in as a "Inventory Manager 2" using "inm2@info.com" and "alsfuh7we68"
    And "Manager" clicks "Maintenance" button
    Then "Manager" clicks "Metrology" button
    And "Manager" clicks "Create" button

    * "Manager" sendKeys "<Maintenance Name>" in "Maintenance Name line"
    * "Manager" sendKeys "<Created By>" in "Created By line"
    * "Manager" sendKeys "<Maintenance Type>" in "Maintenance Type line"
    * "Manager" sendKeys "<Team>" in "Team line"
    * "Manager" sendKeys "<Responsible>" in "Responsible line"
    * "Manager" sendKeys "<Scheduled Date>" in "Scheduled Date line"
    * "Manager" sendKeys "<Scheduled Hours>" in "Scheduled Hours line"
    * "Manager" sendKeys "<Priority>" in "Priority line"
    * "Manager" sendKeys "<Internal Notes>" in "Internal Notes line"

    Then "Manager" clicks "Save" button

    * "Manager" should be able to see "<Maintenance Name>" message in "Maintenance Name line"
    * "Manager" should be able to see "<Created By>" message in "Created By line"
    * "Manager" should be able to see "<Request Date>" message in "Request Date line"
    * "Manager" should be able to see "<Maintenance Type>" message in "Maintenance Type line"
    * "Manager" should be able to see "<Team>" message in "Team line"
    * "Manager" should be able to see "<Responsible>" message in "Responsible line"
    * "Manager" should be able to see "<Scheduled Date>" message in "Scheduled Date line"
    * "Manager" should be able to see "<Scheduled Hours>" message in "Scheduled Hours line"
    * "Manager" should be able to see "<Internal Notes>" message in "Internal line"

    * "Manager" should be able to see "<Maintenance Name>" message in "Maintenance Name line" Database
#    * "Manager" should be able to see "<Created By>" message in "Created By line" Database
    * "Manager" should be able to see "<Request Date>" message in "Request Date line" Database
    * "Manager" should be able to see "<Maintenance Type>" message in "Maintenance Type line" Database
#    * "Manager" should be able to see "<Team>" message in "Team line" Database
#    * "Manager" should be able to see "<Responsible>" message in "Responsible line" Database
    * "Manager" should be able to see "<Scheduled Date>" message in "Scheduled Date line" Database
    * "Manager" should be able to see "<Scheduled Hours>" message in "Scheduled Hours line" Database
    * "Manager" should be able to see "<Priority>" message in "Priority line" Database
    * "Manager" should be able to see "<Internal Notes>" message in "Internal Notes line" Database

    Examples:
      | Maintenance Name | Created By        | Request Date | Maintenance Type | Team                 | Responsible            | Scheduled Date      | Scheduled Hours | Priority | Internal Notes                                                                                    |
      | Framework        | 佐藤さくら(demo_ja_JP) | 03/09/2019   | Corrective       | Metrology            | POSManager             | 03/19/2019 00:18:35 | 3.12            | 1        | Arya was born and raised at Winterfell                                                            |
      | Branches         | Jack Macklin      | 03/09/2019   | Preventive       | Internal Maintenance | Administrator          | 03/20/2019 01:18:35 | 2.13            | 2        | Jon Snow, born Aegon Targaryen                                                                    |
      | Github           | Hans Anders       | 03/09/2019   | Corrective       | Subcontractor        | ExpensesManager        | 03/21/2019 05:42:30 | 5.35            | 1        | Queen Daenerys I Targaryen is the younger sister of Rhaegar Targaryen                             |
      | Maven            | Famke Jenssens    | 03/09/2019   | Preventive       | Metrology            | EventsCRM_User         | 03/25/2019 09:13:33 | 6.36            | 2        | DescriptionSansa Stark is the eldest daughter of Eddard Stark of Winterfell and his wife Catelyn. |
      | Testng           | Николай Петра     | 03/09/2019   | Corrective       | Internal Maintenance | InventoryManager       | 03/26/2019 11:17:35 | 5.36            | 3        | Lord Eddard Stark was the head of House Stark.                                                    |
      | Cucumber         | Martin Lawrence   | 03/09/2019   | Preventive       | Metrology            | ManufacturingUser      | 06/14/2019 15:15:35 | 4.41            | 3        | DescriptionLord Ramsay Bolton was the legitimized bastard son of Roose Bolton.                    |
      | JUnit            | Demo User         | 03/09/2019   | Corrective       | Internal Maintenance | InventoryUser          | 07/16/2019 18:58:35 | 2.22            | 1        | DescriptionBrienne Tarth, commonly known as Brienne of Tarth, is a warrior of House Tarth,        |
      | SQL              | Liam Nelson       | 03/09/2019   | Preventive       | Subcontractor        | Lunch_InvoicingManager | 08/25/2019 20:00:35 | 3.55            | 2        | Queen Cersei I Lannister is the widow of King Robert Baratheon and Queen of the Seven Kingdoms    |
      | API              | Jan Van Eyck      | 03/09/2019   | Preventive       | Subcontractor        | Lunch_Invoicing_User   | 09/20/2019 23:18:35 | 14.69           | 3        | DescriptionSer Jaime Lannister is the eldest son of Tywin Lannister.                              |


		
		
		
		    
		    
		    
		    
		    
		    
		