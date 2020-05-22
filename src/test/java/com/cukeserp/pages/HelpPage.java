package com.cukeserp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cukeserp.utilities.Driver;

public class HelpPage {

    public HelpPage(){
        PageFactory.initElements( Driver.getDriver(), this);
    }

    @FindBy (css = "h1:last-of-type" )
    public WebElement howToImportDataToOdoMessage;



}
