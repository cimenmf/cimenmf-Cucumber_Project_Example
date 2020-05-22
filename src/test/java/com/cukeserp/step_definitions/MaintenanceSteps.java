package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MaintenanceSteps extends BrowserUtils {
    Pages pages = new Pages();

    @Then("{string} should be able to see {string} message in {string} Database")
    public void should_be_able_to_see_message_in_Database(String actualUser, String actualMessage, String actualLINE) {

        switch (actualLINE) {
            case "Maintenance Name line":
                wait(1/2);
                Assert.assertTrue(getRowList(MAINTENANCE_NAME_QUERY).get(0).toString().contains(actualMessage));
                Assert.assertEquals(getRowList(MAINTENANCE_NAME_QUERY).get(0).toString(), actualMessage);
                System.out.println(getRowList(MAINTENANCE_NAME_QUERY).get(0).toString());
                break;
            case "Created By line":

                break;
            case "Request Date line":
                wait(1/2);
                Assert.assertTrue(dateFormat(getRowList(MAINTENANCE_REQUEST_DATE_QUERY).get(0).toString()).contains(actualMessage));
                Assert.assertEquals(dateFormat(getRowList(MAINTENANCE_REQUEST_DATE_QUERY).get(0).toString()), actualMessage);
                System.out.println(dateFormat(getRowList(MAINTENANCE_REQUEST_DATE_QUERY).get(0).toString()));
                break;
            case "Maintenance Type line":
                wait(1/2);
                Assert.assertTrue(getRowList(MAINTENANCE_TYPE_QUERY).get(0).toString().toLowerCase().contains(actualMessage.toLowerCase()));
                Assert.assertEquals(getRowList(MAINTENANCE_TYPE_QUERY).get(0).toString().toLowerCase(), actualMessage.toLowerCase());
                System.out.println(getRowList(MAINTENANCE_TYPE_QUERY).get(0).toString());
                break;
            case "Team line":

                break;
            case "Responsible line":

                break;
            case "Scheduled Date line":
                wait(1/2);
                Assert.assertTrue(dateFormat(getRowList(MAINTENANCE_SCHEDULE_DATE_QUERY).get(0).toString()).contains(actualMessage));
                Assert.assertEquals(dateFormat(getRowList(MAINTENANCE_SCHEDULE_DATE_QUERY).get(0).toString()), actualMessage);
                System.out.println(dateFormat(getRowList(MAINTENANCE_SCHEDULE_DATE_QUERY).get(0).toString()));
                System.out.println(actualMessage);
                break;
            case "Scheduled Hours line":
                wait(1/2);
                Assert.assertTrue(getRowList(MAINTENANCE_SCHEDULE_HOURS_QUERY).get(0).toString().trim().contains(actualMessage.trim()));
                Assert.assertEquals(getRowList(MAINTENANCE_SCHEDULE_HOURS_QUERY).get(0).toString(), actualMessage);
                System.out.println(getRowList(MAINTENANCE_SCHEDULE_HOURS_QUERY).get(0).toString());
                break;
            case "Priority line":
                wait(1/2);
                Assert.assertTrue(getRowList(MAINTENANCE_PRIORITY_QUERY).get(0).toString().contains(actualMessage));
                Assert.assertEquals(getRowList(MAINTENANCE_PRIORITY_QUERY).get(0).toString(),(actualMessage));
                System.out.println(getRowList(MAINTENANCE_PRIORITY_QUERY).get(0).toString());
                break;
            case "Internal Notes line":
                wait(1/2);
                Assert.assertTrue(getRowList(MAINTENANCE_DESCRIPTION_QUERY).get(0).toString().trim().contains(actualMessage.trim()));
                Assert.assertEquals(getRowList(MAINTENANCE_DESCRIPTION_QUERY).get(0).toString().trim(), actualMessage.trim());
                System.out.println(getRowList(MAINTENANCE_DESCRIPTION_QUERY).get(0).toString());
                break;

        }


    }


    public static void main(String[] args) {
        //     System.out.println(getDataList(MAINTENANCE_ALL_QUERY));
//        System.out.println(getDataList(MAINTENANCE_NAME_QUERY));
//        System.out.println(getStringData(MAINTENANCE_NAME_QUERY));
        System.out.println(getRowList(MAINTENANCE_ALL_QUERY));
//        System.out.println(getRowMap(MAINTENANCE_ALL_QUERY));
//        System.out.println(getQueryResultList(MAINTENANCE_ALL_QUERY));
//        System.out.println(getColumnData(MAINTENANCE_ALL_QUERY,"name"));
//        System.out.println(getQueryResultMap(MAINTENANCE_ALL_QUERY));
//        System.out.println(getColumnNames(MAINTENANCE_ALL_QUERY));
//        System.out.println(getRowCount());


    }


}
