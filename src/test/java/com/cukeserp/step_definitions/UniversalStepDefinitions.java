package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UniversalStepDefinitions extends BrowserUtils {
    Pages pages = new Pages();
    Actions actions = new Actions(Driver.getDriver());

    @Then("{string} Title should be displayed {string}")
    public void title_should_be_displayed(String Title, String actualTitle) {
        BrowserUtils.waitUntilTitleEquals(10, actualTitle);
        Assert.assertEquals(Driver.getDriver().getTitle(), actualTitle);
//        System.out.println(Driver.getDriver().getTitle());
    }

    @Then("url is {string}")
    public void url_is(String actualURL) {
        waitForURL(actualURL, 10);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), actualURL);
        //  System.out.println(Driver.getDriver().getCurrentUrl());
    }

    @When("{string} switchs page to {string}")
    public void switchs_page_to(String actualUserName, String secondPage) {
        switchToWindow(secondPage);
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} button")
    public void clicks_button(String actualUserName, String actualButton) {

        switch (actualButton) {

            case "SignIn":
                waitForClickablility(pages.getLandingPage().BriteErpDemo_button, 10);
                pages.getLandingPage().BriteErpDemo_button.click();
                break;
            case "Calendar":
                waitForClickablility(pages.getHeaderPage().calendar_button, 10);
                pages.getHeaderPage().calendar_button.click();
                break;
            case "Contacts":
                waitForClickablility(pages.getHeaderPage().contacts_button, 10);
                pages.getHeaderPage().contacts_button.click();
                break;
            case "List":
                waitForClickablility(pages.getCalendar().listView, 10);
                pages.getCalendar().listView.click();
                break;
            case "Import on Calendar Page":
                waitForClickablility(pages.getCalendarListViewPage().import_button, 10);
                pages.getCalendarListViewPage().import_button.click();
                break;
            case "Active":
                waitForClickablility(pages.getImportPage().active, 10);
                pages.getImportPage().active.click();
                break;
            case "x button to delete Active":
                waitForClickablility(pages.getImportPage().xButton, 10);
                pages.getImportPage().xButton.click();
                break;
            case "Help":
                waitForClickablility(pages.getImportPage().helpButton, 10);
                pages.getImportPage().helpButton.click();
                break;
            case "Test Import":
                waitForClickablility(pages.getImportPage().testImportButton, 10);
                pages.getImportPage().testImportButton.click();
                break;
            case "Import on Import a File Page":
                waitForClickablility(pages.getImportPage().importButtonToImportFile, 10);
                pages.getImportPage().importButtonToImportFile.click();
                break;
            case "Cancel":
                waitForClickablility(pages.getImportPage().cancelButton, 10);
                pages.getImportPage().cancelButton.click();
                break;
            case "The first row contains the label of the column":
                waitForClickablility(pages.getImportPage().theFirstRowLabel, 10);
                pages.getImportPage().theFirstRowLabel.click();
                break;
            case "Copy the full error to clipboard":
                waitForClickablility(pages.getImportPage().copyTheFullErrorToClipboardButton, 10);
                pages.getImportPage().copyTheFullErrorToClipboardButton.click();
                break;
            case "see details":
                waitForClickablility(pages.getImportPage().seeDetailsButton, 10);
                pages.getImportPage().seeDetailsButton.click();
                break;
            case "Ok":
                waitForClickablility(pages.getImportPage().seeDetailsButton, 10);
                pages.getImportPage().errorMessageOkButton.click();
                break;
            case "CRM":
                waitForClickablility(pages.getInboxPage().crmButton, 10);
                pages.getInboxPage().crmButton.click();
                break;
            case "SalesChannels CRM":
                waitForClickablility(pages.getSalesChannelsPage().SalesChannelsButton, 10);
                pages.getSalesChannelsPage().SalesChannelsButton.click();
                break;
            case "Create":
                waitForClickablility(pages.getUniversalPage().create_button, 10);
                pages.getUniversalPage().create_button.click();
                break;
            case "Save":
                waitForClickablility(pages.getUniversalPage().save_button, 10);
                wait(1);
                pages.getUniversalPage().save_button.click();
                break;
            case "Notes":
                waitForClickablility(pages.getHeaderPage().notes_button, 10);
                pages.getHeaderPage().notes_button.click();
                break;
            case "Maintenance":
                waitForClickablility(pages.getHeaderPage().maintenance_button, 10);
                pages.getHeaderPage().maintenance_button.click();
                break;
            case "Metrology":
                waitForClickablility(pages.getMaintenancePage().metrology_button, 10);
                pages.getMaintenancePage().metrology_button.click();
                break;
            case "Inventory":
                waitForClickablility(pages.getHeaderPage().inventory_button, 10);
                pages.getHeaderPage().inventory_button.click();
                break;
            case "Products":
                waitForClickablility(pages.getInventoryPage().products, 10);
                pages.getInventoryPage().products.click();
                break;
            case "Timesheets":
                waitForClickablility(pages.getHeaderPage().timesheets_button,10);
                pages.getHeaderPage().timesheets_button.click();
                break;
        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} button")
    public void should_be_able_to_see_button(String actualUserName, String actualButton) {
        switch (actualButton) {
            case "List":
                waitForVisibility(pages.getCalendar().listView, 10);
                Assert.assertEquals(pages.getCalendar().listView.getAttribute("data-original-title"), actualButton);
                break;
            case "Active":
                waitForVisibility(pages.getImportPage().active, 10);
                Assert.assertEquals(pages.getImportPage().active.getText(), actualButton);
                break;
            case "Import":
                waitForVisibility(pages.getCalendarListViewPage().import_button, 10);
                Assert.assertEquals(pages.getCalendarListViewPage().import_button.getText(), actualButton);
                break;
            case "Reload file":
                waitForVisibility(pages.getImportPage().reloadFile, 10);
                Assert.assertEquals(pages.getImportPage().reloadFile.getText(), actualButton);
                break;
            case "Help":
                waitForVisibility(pages.getImportPage().helpButton, 10);
                Assert.assertEquals(pages.getImportPage().helpButton.getText(), actualButton);
                break;
            case "Test Import":
                waitForVisibility(pages.getImportPage().testImportButton, 10);
                Assert.assertEquals(pages.getImportPage().testImportButton.getText(), actualButton);
                break;
            case "Import on Import a File Page":
                waitForVisibility(pages.getImportPage().importButtonToImportFile, 10);
                Assert.assertEquals(pages.getImportPage().importButtonToImportFile.getText(), ApplicationConstants.IMPORT_BUTTON);
                break;
            case "Cancel":
                waitForVisibility(pages.getImportPage().cancelButton, 10);
                Assert.assertEquals(pages.getImportPage().cancelButton.getText(), actualButton);
                break;
            case "Copy the full error to clipboard":
                waitForVisibility(pages.getImportPage().copyTheFullErrorToClipboardButton, 10);
                Assert.assertEquals(pages.getImportPage().copyTheFullErrorToClipboardButton.getText(), actualButton);
                break;
            case "see details":
                waitForVisibility(pages.getImportPage().seeDetailsButton, 10);
                wait(3);
                System.out.println(pages.getImportPage().seeDetailsButton.getText());
                Assert.assertEquals(pages.getImportPage().seeDetailsButton.getText(), actualButton);
                break;
            case "Ok":
                waitForVisibility(pages.getImportPage().errorMessageOkButton, 10);
                Assert.assertEquals(pages.getImportPage().errorMessageOkButton.getText(), actualButton);
                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Then("{string} should be able to see {string} Message")
    public void should_be_able_to_see_Message(String actualUserName, String actualMessage) {

        switch (actualMessage) {
            case "Map your columns to import":
                waitForVisibility(pages.getImportPage().mapYourColumnsToImport, 10);
                Assert.assertEquals(pages.getImportPage().mapYourColumnsToImport.getText(), actualMessage);
                break;
            case "How to import data into Odoo":
                waitForVisibility(pages.getHelpPage().howToImportDataToOdoMessage, 10);
                Assert.assertEquals(pages.getHelpPage().howToImportDataToOdoMessage.getText(), actualMessage);
                break;
            case "You must configure at least one field to import":
                waitForVisibility(pages.getImportPage().youMustConfigureAtLeastOneFieldToImportErrorMessage, 10);
                wait(1);
                Assert.assertEquals(pages.getImportPage().youMustConfigureAtLeastOneFieldToImportErrorMessage.getText(), actualMessage);
                break;
            case "Odoo Client Error":
                waitForVisibility(pages.getImportPage().odooClientErrorMessage, 10);
                Assert.assertEquals(pages.getImportPage().odooClientErrorMessage.getText(), actualMessage);
                break;
            case "Please use the copy button to report the error to your support service.":
                waitForVisibility(pages.getImportPage().pleasuUseCopyButtonMessage, 10);
                Assert.assertEquals(pages.getImportPage().pleasuUseCopyButtonMessage.getText(), actualMessage);
                break;
            case "Uncaught event settings_changed inappropriate in current state previewing":
                waitForVisibility(pages.getImportPage().uncaughtEventSettingsChanged, 10);
                Assert.assertEquals(pages.getImportPage().uncaughtEventSettingsChanged.getText(), actualMessage);
                break;

        }
    }
    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} message by default in {string}")
    public void should_be_able_to_see_message_by_default_in(String actualUserName, String actualMessage, String buttonName) {

        switch (buttonName) {
            case "Input line":
                Assert.assertEquals(pages.getImportPage().loadFileInputLine.getAttribute("placeholder"), actualMessage);
                break;

        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @When("{string} sendKeys {string} in {string}")
    public void sendKeys_in(String actualUserName, String loadFile, String buttonName) {

        switch (buttonName) {
            case "Load File":
                pages.getImportPage().loadFile.sendKeys(System.getProperty("user.dir") + loadFile);
                break;
            case "Input line":
                pages.getImportPage().loadFileInputLine.sendKeys(System.getProperty("user.dir") + loadFile + Keys.ENTER);
                break;
            case "Reload File":
                pages.getImportPage().reloadFile.sendKeys(System.getProperty("user.dir") + loadFile + Keys.ENTER);
                break;
            case "Tag line":
                pages.getNotesPage().notesTags_button.click();
                wait(1);
                pages.getNotesPage().notesTags_button.sendKeys(loadFile);
                wait(1);
                for (int i = 1; i < 100; i++) {
                    if (pages.getNotesPage().confimationTagName(i).getText().equals(loadFile)) {
                        pages.getNotesPage().confimationTagName(i).click();
                        break;
                    }
                }
                break;
            case "Message line":
                wait(1);
                pages.getNotesPage().notesMessage_button.sendKeys(loadFile);
                break;
            case "Maintenance Name line":
                pages.getMaintenancePage().name_line.sendKeys(loadFile + Keys.ENTER);
                break;
            case "Created By line":
                pages.getMaintenancePage().createdBy_line.click();
                pages.getMaintenancePage().createdBy_line.sendKeys(loadFile);
                wait(1);
                for (int i = 1; i < 100; i++) {
                    if (pages.getMaintenancePage().createdByName(i).getText().equals(loadFile)) {
                        pages.getMaintenancePage().createdByName(i).click();
                        break;
                    }
                }
                break;
            case "Maintenance Type line":
                switch (loadFile) {
                    case "Corrective":
                        pages.getMaintenancePage().corrective_radioButton.click();
                        break;
                    case "Preventive":
                        pages.getMaintenancePage().preventive_radioButton.click();
                        break;
                }
                break;
            case "Team line":
                pages.getMaintenancePage().team_line.clear();
                pages.getMaintenancePage().team_line.sendKeys(loadFile);
                wait(1);
                pages.getMaintenancePage().teamLineConfirmation.click();
                break;
            case "Responsible line":
                pages.getMaintenancePage().responsible_line.click();
                pages.getMaintenancePage().responsible_line.sendKeys(loadFile);
                wait(1);
                for (int i = 1; i < 100; i++) {
                    if (pages.getMaintenancePage().responsibleName(i).getText().equals(loadFile)) {
                        pages.getMaintenancePage().responsibleName(i).click();
                        break;
                    }
                }
                break;
            case "Scheduled Date line":
                pages.getMaintenancePage().scheduledDate_line.sendKeys(loadFile + Keys.ENTER);
                break;
            case "Scheduled Hours line":
                pages.getMaintenancePage().hours_line.clear();
                pages.getMaintenancePage().hours_line.sendKeys(loadFile + Keys.ENTER);
                break;
            case "Priority line":
                switch (loadFile) {
                    case "1":
                        pages.getMaintenancePage().priority_low_button.click();
                        break;
                    case "2":
                        pages.getMaintenancePage().priority_normal_button.click();
                        break;
                    case "3":
                        pages.getMaintenancePage().priority_high_button.click();
                        break;
                }
                break;
            case "Internal Notes line":
                pages.getMaintenancePage().internalNote_line.sendKeys(loadFile + Keys.ENTER);
                break;
            case "Description":
                pages.getContactPage().fullName.sendKeys(loadFile);
                break;
        }
    }


    //----------------------------------------------------------------------------------------------------------------------------------------------------------------


    @Then("{string} should be able to see {string} Checkbox")
    public void should_be_able_to_see_Checkbox(String actualUserName, String checkboxName) {

        switch (checkboxName) {
            case "Show fields of relation fields (advanced)":
                waitForVisibility(pages.getImportPage().showFields, 10);
                Assert.assertEquals(pages.getImportPage().showFieldsText.getText(), checkboxName);
                break;
            case "The first row contains the label of the column":
                Assert.assertEquals(pages.getImportPage().theFirstRowLabelText.getText(), checkboxName);
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} Checkbox")
    public void clicks_Checkbox(String actualUserName, String checkboxName) {

        switch (checkboxName) {
            case "Show fields of relation fields (advanced)":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().showFields.click();
                break;
            case "The first row contains the label of the column":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().theFirstRowLabel.click();
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string}")
    public void should_be_able_to_see(String actualUserName, String selectName) {

        switch (selectName) {
            case "Start Date":
                Assert.assertEquals(pages.getImportPage().startDate.getText(), selectName);
                break;
            case "Repeat Until":
                Assert.assertEquals(pages.getImportPage().repeatUntil.getText(), selectName);
                break;
            case "End Date":
                Assert.assertEquals(pages.getImportPage().endDate.getText(), selectName);
                break;
            case "Dot":
                Assert.assertEquals(pages.getImportPage().dot.getText(), selectName);
                break;
            case "Semicolon":
                Assert.assertEquals(pages.getImportPage().semicolon.getText(), selectName);
                break;
            case "Utility":
                Assert.assertEquals(pages.getImportPage().fileName.getText(), selectName);
                break;
            case "windows-1252":
                Assert.assertEquals(pages.getImportPage().windows1252.getText(), selectName);
                break;
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} clicks {string} on the selective panel")
    public void clicks_on_the_selective_panel(String actualUserName, String selectName) {

        switch (selectName) {
            case "Start Date":
                WebElement start = pages.getImportPage().startDate;
                BrowserUtils.waitForClickablility(start, 2);
                start.click();
                break;
            case "Repeat Until":
                WebElement repeat = pages.getImportPage().repeatUntil;
                BrowserUtils.waitForClickablility(repeat, 3);
                repeat.click();
                break;
            case "End Date":
                WebElement end = pages.getImportPage().endDate;
                BrowserUtils.waitForClickablility(end, 4);
                end.click();
                break;
            case "Dot":
                pages.getImportPage().dot.click();
                break;
            case "Semicolon":
                pages.getImportPage().semicolon.click();
                break;
            case "windows-1252":
                pages.getImportPage().windows1252.click();
                break;

        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Then("{string} should be able to see {string} field")
    public void should_be_able_to_see_field(String actualUserName, String fieldName) {
        switch (fieldName) {
            case "Thousands Separator:":
                Assert.assertEquals(pages.getImportPage().thousandsSeparatorText.getText(), fieldName);
                break;
            case "Separator:":
                Assert.assertEquals(pages.getImportPage().separatorText.getText(), fieldName);
                break;
            case "Encoding:":
                Assert.assertEquals(pages.getImportPage().encodingText.getText(), fieldName);
                break;

        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


    @When("{string} clicks {string} select button")
    public void clicks_select_button(String actualUserName, String selectButtonName) {
        switch (selectButtonName) {
            case "Thousands Separator":
                pages.getImportPage().thousandsSeparatorButton.click();
                break;
            case "Don't Import":
                waitForClickablility(pages.getImportPage().messageForSelect, 10);
                pages.getImportPage().dontImportField.click();
                break;
            case "Separator":
                pages.getImportPage().separatorButton.click();
                break;
            case "Encoding":
                pages.getImportPage().encodingButton.click();
                break;
            case "Invoice address":
                pages.getContactPage().addressType.sendKeys(selectButtonName);
                break;
        }


    }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


    @Then("{string} should be able to see {string} message in {string}")
    public void should_be_able_to_see_message_in(String actualUser, String expectedMessage, String buttonName) {
        switch (buttonName) {
            case "Maintenance Name line":
                Assert.assertEquals(pages.getMaintenancePage().nameLine_message.getText(), expectedMessage);
                break;
            case "Created By line":
                Assert.assertEquals(pages.getMaintenancePage().createdByLine_message.getText(), expectedMessage);
                break;
            case "Request Date line":
                Assert.assertEquals(pages.getMaintenancePage().requestDateLine_message.getText(), expectedMessage);
                break;
            case "Maintenance Type line":
                Assert.assertEquals(pages.getMaintenancePage().maintenanceTypeLine_message.getText(), expectedMessage);
                break;
            case "Team line":
                Assert.assertEquals(pages.getMaintenancePage().teamLine_message.getText(), expectedMessage);
                break;
            case "Responsible line":
                Assert.assertEquals(pages.getMaintenancePage().responsibleLine_message.getText(), expectedMessage);
                break;
            case "Scheduled Date line":
                wait(1/2);
                Assert.assertEquals(pages.getMaintenancePage().scheduledDateLine_message.getText(), expectedMessage);
                break;
            case "Scheduled Hours line":
                Assert.assertEquals(pages.getMaintenancePage().scheduledHoursLine_message.getText(), expectedMessage);
                break;
            case "Internal line":
                Assert.assertEquals(pages.getMaintenancePage().internalNoteLine_message.getText(), expectedMessage);
                break;

        }
    }


}