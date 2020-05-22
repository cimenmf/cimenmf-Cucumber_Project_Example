package com.cukeserp.pages;

import com.cukeserp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MaintenancePage {
    public MaintenancePage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy (xpath = "(//div[@class='row'])[4]//div//button")
    public WebElement metrology_button;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement name_line;

    @FindBy (xpath = "(//div[@class='o_input_dropdown'])[1]//input")
    public WebElement createdBy_line;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement team_line;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement responsible_line;

    @FindBy (xpath = "(//div[@class='o_radio_item'])[1]//input")
    public WebElement corrective_radioButton;

    @FindBy (xpath = "(//div[@class='o_radio_item'])[2]//input")
    public WebElement preventive_radioButton;

    @FindBy (xpath = "(//input[@class='o_datepicker_input o_input'])")
    public WebElement scheduledDate_line;

    @FindBy (xpath = "(//div[@class='o_priority o_field_widget'])//a[1]")
    public WebElement priority_low_button;

    @FindBy (xpath = "(//div[@class='o_priority o_field_widget'])//a[2]")
    public WebElement priority_normal_button;

    @FindBy (xpath = "(//div[@class='o_priority o_field_widget'])//a[3]")
    public WebElement priority_high_button;

    @FindBy (xpath = "(//input[@class='o_field_float o_field_number o_field_widget o_input oe_inline'])")
    public WebElement hours_line;

    @FindBy(xpath = "(//div[@class='o_form_sheet'])//textarea[1]")
    public WebElement internalNote_line;

    @FindBy(css = ".oe_title>h1>span")
    public WebElement nameLine_message;

    @FindBy(xpath = "(//a[@class='o_form_uri o_field_widget'])[1]")
    public WebElement createdByLine_message;

    @FindBy(xpath = "(//a[@class='o_form_uri o_field_widget'])[2]")
    public WebElement responsibleLine_message;

    @FindBy(xpath = "//span[@class='o_field_date o_field_widget o_readonly_modifier']")
    public WebElement requestDateLine_message;

    @FindBy(xpath = "//span[@class='o_field_radio o_field_widget']")
    public WebElement maintenanceTypeLine_message;

    @FindBy(xpath = "//span[@class='o_field_widget o_required_modifier']")
    public WebElement teamLine_message;

    @FindBy(xpath = "//span[@class='o_field_date o_field_widget']")
    public WebElement scheduledDateLine_message;

    @FindBy(xpath = "//span[@class='o_field_text o_field_widget']")
    public WebElement internalNoteLine_message;

    @FindBy(xpath = "//span[@class='o_field_float o_field_number o_field_widget oe_inline']")
    public WebElement scheduledHoursLine_message;

    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li//a)[2]")
    public WebElement teamLineConfirmation;


    public WebElement responsibleName(int num) {
        String xpath = "(//ul[@id='ui-id-6'])//li[" + num + "]//a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement createdByName(int num) {
        String xpath = "(//ul[@id='ui-id-3'])//li[" + num + "]//a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }




}
