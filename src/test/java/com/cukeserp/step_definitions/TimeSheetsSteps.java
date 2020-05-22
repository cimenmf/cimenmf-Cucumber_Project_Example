package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.ExcelUtil;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.text.ParseException;
import java.util.*;

public class TimeSheetsSteps extends BrowserUtils {
    Pages pages = new Pages();
    ExcelUtil dataTimeSheets = new ExcelUtil(PATH_PHASE_V, SHEET_TIMESHEETS);
    List<Map<String, String>> listTimeSheets = dataTimeSheets.getDataList();


    @Then("{string} sendKeys {int} from excel {string}, {string} sheet")
    public void sendkeys_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {

        pages.getTimeSheetsPage().date_line.clear();
        pages.getTimeSheetsPage().date_line.sendKeys(listTimeSheets.get(i).get("Date") + Keys.ENTER);

        pages.getTimeSheetsPage().description_line.sendKeys(listTimeSheets.get(i).get("Description"));

        pages.getTimeSheetsPage().project_line.click();
        waitForClickablility(pages.getTimeSheetsPage().getProject_line(listTimeSheets.get(i).get("Project")), 10);
        pages.getTimeSheetsPage().getProject_line(listTimeSheets.get(i).get("Project")).click();

        pages.getTimeSheetsPage().task_line.click();
        waitForClickablility(pages.getTimeSheetsPage().getTask_line(listTimeSheets.get(i).get("Task")), 10);
        pages.getTimeSheetsPage().getTask_line(listTimeSheets.get(i).get("Task")).click();


        pages.getTimeSheetsPage().amount_line.clear();
        pages.getTimeSheetsPage().amount_line.sendKeys(listTimeSheets.get(i).get("Amount") + Keys.ENTER);

        pages.getTimeSheetsPage().quantity_line.clear();
        pages.getTimeSheetsPage().quantity_line.sendKeys(listTimeSheets.get(i).get("Quantity"));

//        UniversalStepDefinitions universalStepDefinitions = new UniversalStepDefinitions();

//        universalStepDefinitions.clicks_button("Manager","Save");
//        universalStepDefinitions.clicks_button("Manager","Create");


    }

    @Then("{string} should be able to see {int} on page from excel {string}, {string} sheet")
    public void should_be_able_to_see_on_page_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {
        wait(1);
        System.out.println(pages.getTimeSheetsPage().date_message.getText());
        System.out.println(pages.getTimeSheetsPage().description_message.getText());
        System.out.println(pages.getTimeSheetsPage().quantity_message.getText());
        System.out.println(pages.getTimeSheetsPage().getProject_line(listTimeSheets.get(i).get("Project")).getText());
        System.out.println(pages.getTimeSheetsPage().getTask_line(listTimeSheets.get(i).get("Task")).getText());

        Assert.assertEquals(listTimeSheets.get(i).get("Date"), pages.getTimeSheetsPage().date_message.getText());
        Assert.assertEquals(listTimeSheets.get(i).get("Description"), pages.getTimeSheetsPage().description_message.getText());
        Assert.assertEquals(listTimeSheets.get(i).get("Quantity"), pages.getTimeSheetsPage().quantity_message.getText());
        Assert.assertEquals(listTimeSheets.get(i).get("Project"), pages.getTimeSheetsPage().getProject_line(listTimeSheets.get(i).get("Project")).getText());
        Assert.assertEquals(listTimeSheets.get(i).get("Task"), pages.getTimeSheetsPage().getTask_line(listTimeSheets.get(i).get("Task")).getText());

    }

    @Then("{string} should be able to see {int} in Database from excel {string}, {string} sheet")
    public void should_be_able_to_see_in_Database_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {

        Assert.assertTrue(dateFormat(getRowList(TIMESHEETS_DATE_QUERY).get(0).toString()).contains(listTimeSheets.get(i).get("Date")));
        Assert.assertEquals(dateFormat(getRowList(TIMESHEETS_DATE_QUERY).get(0).toString()),listTimeSheets.get(i).get("Date"));
        System.out.println("database: " + dateFormat(getRowList(TIMESHEETS_DATE_QUERY).get(0).toString()));
        System.out.println("excel   : " + listTimeSheets.get(i).get("Date"));

        Assert.assertTrue(getRowList(TIMESHEETS_DECSRIPTION_QUERY).get(0).toString().contains(listTimeSheets.get(i).get("Description")));
        Assert.assertEquals(getRowList(TIMESHEETS_DECSRIPTION_QUERY).get(0).toString(),listTimeSheets.get(i).get("Description"));
        System.out.println("database: " + getRowList(TIMESHEETS_DECSRIPTION_QUERY).get(0).toString());
        System.out.println("excel   : " + listTimeSheets.get(i).get("Description"));


        Assert.assertTrue(extraZero(getRowList(TIMESHEETS_AMOUNT_QUERY).get(0).toString()).contains(listTimeSheets.get(i).get("Quantity")));
        Assert.assertEquals(extraZero(getRowList(TIMESHEETS_AMOUNT_QUERY).get(0).toString()),listTimeSheets.get(i).get("Quantity"));
        System.out.println("database: " + extraZero(getRowList(TIMESHEETS_AMOUNT_QUERY).get(0).toString()));
        System.out.println("excel   : " + listTimeSheets.get(i).get("Quantity"));




    }


    public static void main(String[] args) throws ParseException {
//        System.out.println("hi");
//        ExcelUtil dataTimeSheets = new ExcelUtil(PATH_PHASE_V, SHEET_TIMESHEETS);
//        List<Map<String, String>> listTimeSheets = dataTimeSheets.getDataList();
//
////        System.out.println("list of tables in " + listTimeSheets);
//
////        System.out.println(listTimeSheets);
////
//        for (int i = 0; i < listTimeSheets.size(); i++) {
//            System.out.println("getting " + (i) + " ++++++++++++" + listTimeSheets.get(i).get("Date"));
//        }
//        System.out.println(listTimeSheets.size());
//        System.out.println(dataTimeSheets.rowCount());
//        System.out.println(dataTimeSheets.columnCount());
//        System.out.println(dataTimeSheets.rowCount());
//
////        for (int i = 0; i < dataTimeSheets.rowCount(); i++) {
////            System.out.println(listTimeSheets.get(i).get("Date"));
////            System.out.println(listTimeSheets.get(i).get("Description"));
////            System.out.println(listTimeSheets.get(i).get("Project"));
////            System.out.println(listTimeSheets.get(i).get("Task"));
////            System.out.println(listTimeSheets.get(i).get("Amount"));
////            System.out.println(listTimeSheets.get(i).get("Quantity"));
////        }
//
//        System.out.println(dataTimeSheets.getCellData(1,2));

//        List<Object> str = new ArrayList<>(getColumnData(MAINTENANCE_ALL_QUERY, "name"));
//        System.out.println(str);
       Pages pages = new Pages();



    }


}
