package com.cukeserp.pages;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.DBUtils;
import com.cukeserp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ImportPage extends BrowserUtils {

    public ImportPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[@class='btn btn-primary']/input")
    public WebElement loadFile;

    @FindBy(xpath = "//span[@class='input-group-btn']/button")
    public WebElement reloadFile;

    @FindBy(xpath = "(//input[@checked = 'checked'])[2]")
    public WebElement theFirstRowLabel;

    @FindBy(xpath = "//label[@for='oe_import_has_header']")
    public WebElement theFirstRowLabelText;

    @FindBy(id = "oe_import_advanced_mode")
    public WebElement showFields;

    @FindBy(xpath = "//label[@for='oe_import_advanced_mode']")
    public WebElement showFieldsText;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement loadFileInputLine;

    @FindBy(xpath = "//div[@class='oe_import_with_file oe_padding col-sm-12']/h2")
    public WebElement mapYourColumnsToImport;

    @FindBy(xpath = "//a[@class='select2-choice select2-default']")
    public WebElement dontImportField;

    @FindBy(xpath = "(//ul[@class='select2-results']/li/div)[3]")
    public WebElement startDate;

    @FindBy(xpath = "(//ul[@class='select2-results']/li/div)[2]")
    public WebElement repeatUntil;

    @FindBy(xpath = "(//ul[@class='select2-results']/li/div)[1]")
    public WebElement endDate;

    @FindBy(xpath = "(//div[@class='select2-search'])[5]/input")
    public WebElement search;

    @FindBy(xpath = "(//a[@class='select2-choice'])[5]/abbr")
    public WebElement xButton;

    @FindBy(xpath = "(//div[@style='display: block;']/p/label)[1]")
    public WebElement encodingText;

    @FindBy(xpath = "(//a[@class='select2-choice'])[1]")
    public WebElement encodingButton;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[3]")
    public WebElement windows1252;

    @FindBy(xpath = "(//div[@style='display: block;']/p/label)[2]")
    public WebElement separatorText;

    @FindBy(xpath = "(//a[@class='select2-choice'])[2]")
    public WebElement separatorButton;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement semicolon;

    @FindBy(xpath = "//tr[@class='oe_import_grid-header']")
    public WebElement fileNameTopDontImport;

    @FindBy(xpath = "(//div[@style='display: block;']/p/label)[6]")
    public WebElement thousandsSeparatorText;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
    public WebElement thousandsSeparatorButton;

    @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement dot;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[1]")
    public WebElement testImportButton;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[2]")
    public WebElement importButtonToImportFile;

    @FindBy(xpath = "(//div[@class='o_cp_buttons']/button)[3]")
    public WebElement cancelButton;

    @FindBy(xpath = "(//div[@class='oe_import_error_report'])/ul/li/span")
    public WebElement youMustConfigureAtLeastOneFieldToImportErrorMessage;

    @FindBy(xpath = "(//div[@class='modal-dialog modal-lg']//div//div)[1]//h4")
    public WebElement odooClientErrorMessage;

    @FindBy(xpath = "(//div[@class='modal-dialog modal-lg']//div//div)[5]//button//span")
    public WebElement errorMessageOkButton;

    @FindBy(xpath = "//div[@class='o_dialog_error modal-body']/div/p[2]")
    public WebElement pleasuUseCopyButtonMessage;

    @FindBy(xpath = "//div[@class='modal-content']/div/div/button")
    public WebElement copyTheFullErrorToClipboardButton;

    @FindBy(xpath = "(//div[@class='modal-content']/div/button)[2]")
    public WebElement seeDetailsButton;

    @FindBy(css = "div.alert.alert-danger.o_error_detail.collapse.in>pre:first-of-type")
    public WebElement uncaughtEventSettingsChanged;

    @FindBy(xpath = "//span[@class='oe_import_report_message']")
    public WebElement messageForSelect;

    @FindBy(xpath = "(//li[@class='select2-results-dept-1 select2-result select2-result-selectable']/div)[1]")
    public WebElement active;

    @FindBy(xpath = "//div[@class='col-sm-12']//a")
    public WebElement helpButton;

    @FindBy(css = ".oe_import_grid-header")
    public WebElement fileName;

    @FindBy(xpath = "//div[@class='oe_title']//h1//input")
    public WebElement meetingSubjectLine;

    @FindBy(xpath = "//div[@class='oe_title']//h2//input")
    public WebElement attendeesLine;

    @FindBy(css = ".fa.fa-times.o_delete")
    public WebElement attendeesCloseButton;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']/tbody//input)[5]")
    public WebElement startingAtLine;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']/tbody//input)[7]")
    public WebElement durationLine;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']/tbody//input)[9]")
    public WebElement tagsLine;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']/tbody//input)[10]")
    public WebElement remindersLine;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6']/tbody//input)[11]")
    public WebElement locationLine;

    @FindBy(xpath = "(//div[@class='o_notebook']//ul//li[2])//a")
    public WebElement optionsButton;

    @FindBy(xpath = "//select[@name='privacy']")
    public WebElement privacyLine;

    @FindBy(xpath = "//select[@name='show_as']")
    public WebElement showTimeAsLine;

    @FindBy(linkText = "Meeting Details")
    public WebElement meetingDetailsButton;

    @FindBy(xpath = "//div[@class='oe_title']/h1/span")
    public WebElement meetingSubjectMessage;

    @FindBy(xpath = "(//div[@class='oe_title']/h2/div/span)/span[2]")
    public WebElement attendeesMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[1]/table[1]/tbody/tr[6]/td[2]/span")
    public WebElement startingMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[1]/table[1]/tbody/tr[8]/td[2]/div/span[1]")
    public WebElement durationMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[1]/table[2]/tbody/tr[1]/td[2]/div/span[1]/span")
    public WebElement tagsMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[1]/table[2]/tbody/tr[2]/td[2]/div/span")
    public WebElement remindersMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[1]/table[2]/tbody/tr[3]/td[2]/span")
    public WebElement locationMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[2]/table/tbody/tr[1]/td[2]/span")
    public WebElement privacyMessage;

    @FindBy(xpath = "(//div[@class='o_group'])[2]/table/tbody/tr[2]/td[2]/span")
    public WebElement showTimeAsMessage;


    public static void main(String[] args) {
        DBUtils dbUtils = new DBUtils();
        String str = dbUtils.getHoursDuration("2:10");
        System.out.println("database: " + getRowList(MEETING_SHOW_AS_QUERY).get(0).toString());

        System.out.println(str);
    }



}
