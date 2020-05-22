package com.cukeserp.pages;

import com.cukeserp.utilities.ConfigurationReader;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.seleniumcucumber.ConfigurationMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cukeserp.utilities.BrowserUtils.waitForPageToLoad;


public class LoginPage {


    public LoginPage ( ) {
        PageFactory.initElements ( Driver.getDriver ( ) , this );
    }

    @FindBy ( xpath = "//div[@class='form-group field-login']/input" )
    public WebElement emailBox;

    @FindBy ( xpath = "//div[@class='form-group field-password']/input" )
    public WebElement passwordBox;

    @FindBy ( xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;


    public void userLogin ( ) {
        emailBox.sendKeys ( ConfigurationReader.getProperties ( "user" ) );
        passwordBox.sendKeys ( ConfigurationReader.getProperties ( "userpass" ) );
        login_button.click ( );
    }


    public void managerLogin ( ) {

        emailBox.sendKeys ( ConfigurationReader.getProperties ( "manager" ) );
        passwordBox.sendKeys ( ConfigurationReader.getProperties ( "managerpass" ) );
        login_button.click ( );
    }

    public void open ( ) {
        Driver.getDriver ( ).manage ( ).window ( ).maximize ( );
        Driver.getDriver ( ).get ( ConfigurationReader.getProperties ( "url" ) );
        waitForPageToLoad ( 5 );
    }




}
