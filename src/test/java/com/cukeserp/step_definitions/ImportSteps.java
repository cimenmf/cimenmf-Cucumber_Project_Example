package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.Map;

public class ImportSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    ExcelUtil excelUtil = new ExcelUtil(PATH_PHASE_V, SHEET_MEETINGS);
    List<Map<String, String>> listMeetingSheets = excelUtil.getDataList();


    @But("manager should be able to Type {string} to the Upload line - Fail")
    public void manager_should_be_able_to_Type_to_the_Upload_line_Fail(String inputFile) {
    }

    @And("manager should be able to see Uploaded file {string} - Fail")
    public void manager_should_be_able_to_see_Uploaded_file_Fail(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("{string} should be displayed on the Input Line")
    public void  should_be_displayed_on_the_Input_Line(String utilityXlsx) {
        Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("value"), utilityXlsx);
    }

    @Then("verify Checkbox The first row contains the label of the column is selected by default")
    public void verify_Checkbox_The_first_row_contains_the_label_of_the_column_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().theFirstRowLabel.isSelected());
    }

    @Then("verify Checkbox Show fields of relation fields is selected by default")
    public void verify_Checkbox_Show_fields_of_relation_fields_is_selected_by_default() {
        Assert.assertTrue(pages.getImportPage().showFields.isSelected());
    }

    @When("{string} Checkbox is not selected")
    public void checkbox_is_not_selected(String checkboxName) {
        waitForClickablility(pages.getImportPage().messageForSelect, 10);
        Assert.assertFalse(pages.getImportPage().showFields.isSelected());
    }

    @Then("{string} enter information from excel table: {string}, sheet: {string} and verify with information with Page and Database")
    public void enter_information_from_excel_table_sheet_and_verify_with_information_with_Page_and_Database(String actualUser, String excelName, String sheetName) {

        for (int i = 0; i < excelUtil.rowCount(); i++) {

            pages.getImportPage().meetingSubjectLine.sendKeys(listMeetingSheets.get(i).get("meeting subject"));

            wait(1);
            pages.getImportPage().attendeesCloseButton.click();
            wait(1);
            pages.getImportPage().attendeesLine.sendKeys(listMeetingSheets.get(i).get("attendees"));
            pages.getUniversalPage().getConfirmation_line(listMeetingSheets.get(i).get("attendees")).click();
            wait(1);
            pages.getImportPage().startingAtLine.sendKeys(listMeetingSheets.get(i).get("starting at"));
            wait(1);
            pages.getImportPage().durationLine.clear();
            wait(1);
            pages.getImportPage().durationLine.sendKeys(listMeetingSheets.get(i).get("duration"));
            wait(1/2);

            pages.getImportPage().tagsLine.sendKeys(listMeetingSheets.get(i).get("tags"));
            pages.getUniversalPage().getConfirmation_line(listMeetingSheets.get(i).get("tags")).click();

            wait(1);
            pages.getImportPage().remindersLine.sendKeys(listMeetingSheets.get(i).get("reminder"));
            wait(1);
            pages.getUniversalPage().getConfirmation_line(listMeetingSheets.get(i).get("reminder")).click();

            pages.getImportPage().locationLine.sendKeys(listMeetingSheets.get(i).get("location"));
            pages.getImportPage().optionsButton.click();

            wait(1);
            Select selectPrivacy = new Select(pages.getImportPage().privacyLine);
            selectPrivacy.selectByVisibleText(listMeetingSheets.get(i).get("privacy"));

            wait(1);
            Select selectShowTimeAs = new Select(pages.getImportPage().showTimeAsLine);
            selectShowTimeAs.selectByVisibleText(listMeetingSheets.get(i).get("show time as"));
            wait(1/2);

            pages.getUniversalPage().save_button.click();

            Assert.assertEquals(pages.getImportPage().showTimeAsMessage.getText(), listMeetingSheets.get(i).get("show time as"));
            Assert.assertEquals(pages.getImportPage().privacyMessage.getText(), listMeetingSheets.get(i).get("privacy"));

            wait(1);
            pages.getImportPage().meetingDetailsButton.click();

            Assert.assertEquals(pages.getImportPage().meetingSubjectMessage.getText(), listMeetingSheets.get(i).get("meeting subject"));
            Assert.assertEquals(pages.getImportPage().startingMessage.getText(), listMeetingSheets.get(i).get("starting at"));
            Assert.assertEquals(pages.getImportPage().durationMessage.getText(), listMeetingSheets.get(i).get("duration"));
            Assert.assertEquals(pages.getImportPage().locationMessage.getText(), listMeetingSheets.get(i).get("location"));




            wait(1);
//            Assert.assertTrue(getRowList(MEETING_NAME_QUERY).get(0).toString().contains(listMeetingSheets.get(i).get("meeting subject")));
//            Assert.assertEquals(getRowList(MEETING_NAME_QUERY).get(0).toString(), listMeetingSheets.get(i).get("meeting subject"));
            System.out.println("database: " + getRowList(MEETING_NAME_QUERY).get(0).toString());
            System.out.println("excel   : " + listMeetingSheets.get(i).get("meeting subject"));

//            Assert.assertTrue(dateFormat(getRowList(MEETING_STARTING_AT_QUERY).get(0).toString()).contains(listMeetingSheets.get(i).get("starting at")));
//            Assert.assertEquals(dateFormat(getRowList(MEETING_STARTING_AT_QUERY).get(0).toString()), listMeetingSheets.get(i).get("starting at"));
            System.out.println("database: " + dateFormat(getRowList(MEETING_STARTING_AT_QUERY).get(0).toString()));
            System.out.println("excel   : " + listMeetingSheets.get(i).get("starting at"));

//            Assert.assertTrue(getPersentagedNumber(getHoursDuration(getRowList(MEETING_DURATION_QUERY).get(0).toString())).contains(listMeetingSheets.get(i).get("duration")));
//            Assert.assertEquals(getPersentagedNumber(getHoursDuration(getRowList(MEETING_DURATION_QUERY).get(0).toString())), listMeetingSheets.get(i).get("duration"));
            System.out.println("database: " + getPersentagedNumber(getHoursDuration(getRowList(MEETING_DURATION_QUERY).get(0).toString())));
            System.out.println("excel   : " + listMeetingSheets.get(i).get("duration"));

//            Assert.assertTrue(getRowList(MEETING_LOCATION_QUERY).get(0).toString().contains(listMeetingSheets.get(i).get("location")));
//            Assert.assertEquals(getRowList(MEETING_LOCATION_QUERY).get(0).toString(), listMeetingSheets.get(i).get("location"));
            System.out.println("database: " + getRowList(MEETING_LOCATION_QUERY).get(0).toString());
            System.out.println("excel   : " + listMeetingSheets.get(i).get("location"));

            pages.getImportPage().optionsButton.click();

            wait(1);
//            Assert.assertTrue(getRowList(MEETING_SHOW_AS_QUERY).get(0).toString().contains(listMeetingSheets.get(i).get("show time as")));
//            Assert.assertEquals(getRowList(MEETING_SHOW_AS_QUERY).get(0).toString(), listMeetingSheets.get(i).get("show time as"));
            System.out.println("database: " + getRowList(MEETING_SHOW_AS_QUERY).get(0).toString());
            System.out.println("excel   : " + listMeetingSheets.get(i).get("show time as"));

            wait(1);
//            Assert.assertTrue(getPrivacyCorrector(getRowList(MEETING_PRIVACY_QUERY).get(0).toString()).contains(listMeetingSheets.get(i).get("privacy")));
//            Assert.assertEquals(getPrivacyCorrector(getRowList(MEETING_PRIVACY_QUERY).get(0).toString()), listMeetingSheets.get(i).get("privacy"));
            System.out.println("database: " + getPrivacyCorrector(getRowList(MEETING_PRIVACY_QUERY).get(0).toString()));
            System.out.println("excel   : " + listMeetingSheets.get(i).get("privacy"));

            if (i != excelUtil.rowCount() - 1) {
                waitForClickablility(pages.getUniversalPage().create_button, 20);
                pages.getUniversalPage().create_button.click();
                pages.getImportPage().meetingDetailsButton.click();
            }

        }
    }

    @Then("{string} should be able to see {string} on Page from excel {string}, {string} sheet")
    public void should_be_able_to_see_on_Page_from_excel_sheet(String actualUser, String allNewInformation, String excelName, String sheetName) {

    }

    @Then("{string} should be able to see {string} in Database from excel {string}, {string} sheet")
    public void should_be_able_to_see_in_Database_from_excel_sheet(String actualUser, String allNewInformation, String excelName, String sheetName) {

    }

    public static void main(String[] args) {
//        ExcelUtil dataMeetingSheets = new ExcelUtil(PATH_PHASE_V, SHEET_MEETINGS);
//        List<Map<String, String>> listMeetingSheets = dataMeetingSheets.getDataList();
//        System.out.println(listMeetingSheets.get(0).get("meeting subject"));

        DBUtils dbUtils = new DBUtils();


        System.out.println(dbUtils.dateFormat("2022-12-13 03:22:22"));
//        System.out.println(dbUtils.dateFormat("2019-05-25 02:50:14"));
//
//        System.out.println(dbUtils.dateFormat("2019-07-04 04:05:05"));
//
//        System.out.println(dbUtils.dateFormat("2019-05-25 06:50:14"));
//        System.out.println(dbUtils.dateFormat("2019-05-25 10:50:14"));
//
//        System.out.println(dbUtils.dateFormat("2019-05-25 12:50:14"));
//        System.out.println(dbUtils.dateFormat("2019-05-25 16:50:14"));
//        System.out.println(dbUtils.dateFormat("2019-05-25 19:50:14"));
//        System.out.println(dbUtils.dateFormat("2019-05-25 24:50:14"));
    }


}


