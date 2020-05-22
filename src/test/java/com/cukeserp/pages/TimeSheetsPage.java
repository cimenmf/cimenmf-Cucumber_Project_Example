package com.cukeserp.pages;

import com.cukeserp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeSheetsPage {


    public TimeSheetsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@name='date']//input")
    public WebElement date_line;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement description_line;

    @FindBy(xpath = "//div[@name='project_id']//input")
    public WebElement project_line;

    @FindBy(xpath = "//div[@name='task_id']//input")
    public WebElement task_line;

    @FindBy(xpath = "//div[@name='amount']//input")
    public WebElement amount_line;

    @FindBy(xpath = "//input[@name='unit_amount']")
    public WebElement quantity_line;

    public WebElement getProject_line(String name){
        return Driver.getDriver().findElement(By.linkText(name));
    }

    public WebElement getTask_line(String name){
        return Driver.getDriver().findElement(By.linkText(name));
    }

    @FindBy (xpath = "(//table[@class='o_group o_inner_group o_group_col_6'])[1]//tbody//tr[1]//td//span")
    public WebElement date_message;

    @FindBy (xpath = "(//table[@class='o_group o_inner_group o_group_col_6'])[1]//tbody//tr[2]//td//span")
    public WebElement description_message;

    @FindBy (xpath = "(//table[@class='o_group o_inner_group o_group_col_6'])[2]//tbody//tr[1]//td//span")
    public WebElement amount_message;

    @FindBy (xpath = "(//table[@class='o_group o_inner_group o_group_col_6'])[2]//tbody//tr[2]//td//span")
    public WebElement quantity_message;

}
