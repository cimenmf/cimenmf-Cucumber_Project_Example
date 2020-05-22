package com.cukeserp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cukeserp.utilities.Driver;

public class CalendarListViewPage {
    public CalendarListViewPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy (css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement create_button;

    @FindBy(css = "button.btn.btn-sm.btn-default.o_button_import")
    public WebElement import_button;

    @FindBy(css = "button.btn.btn-sm.btn-default.o_button_import")
    public WebElement previousPage_button;

    @FindBy(css = "button.fa.fa-chevron-left.btn.btn-icon.o_pager_previous")
    public WebElement nextPage_button;

    @FindBy(xpath ="//button[@data-original-title='List']" )
    public WebElement list;

    @FindBy(xpath ="/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[1]/div/input")
    public WebElement subjectCheckbox;

    @FindBy(xpath ="//button[@data-toggle='dropdown'])[2]")
    public WebElement action;

    @FindBy(xpath ="//a[@data-index='2']")
    public WebElement unarchive;

    @FindBy(xpath ="//a[@data-index='0']")
    public WebElement export;

    @FindBy(xpath ="//a[@data-index='1']")
    public WebElement archive;

    @FindBy(xpath ="//button[@class='btn btn-sm btn-primary']")
    public WebElement warning;

    @FindBy(xpath ="//button[@class='btn btn-sm btn-default']")
    public WebElement close;

}
