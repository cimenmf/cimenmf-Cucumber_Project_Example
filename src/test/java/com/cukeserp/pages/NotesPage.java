package com.cukeserp.pages;

import com.cukeserp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {

    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='o_input_dropdown']//input")
    public WebElement notesTags_button;

    @FindBy(css = ".note-editable.panel-body")
    public WebElement notesMessage_button;

    @FindBy(xpath = "//div[@class='o_form_sheet']//span//span")
    public WebElement notesTags_message;

    @FindBy(xpath = "//div[@class='o_form_sheet']//div//p")
    public WebElement notesMessage_message;

    @FindBy(xpath = "(//div[@class='modal-footer'])[3]//button[1]")
    public WebElement notesCreate_button;

    public WebElement confimationTagName(int num) {
        String xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])//li[" + num + "]//a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }


}
