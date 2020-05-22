package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.Driver;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginSteps implements ApplicationConstants {
    Pages pages = new Pages();

    @Then("Login page Title should be displayed {string}")
    public void login_page_Title_should_be_displayed(String actualTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(),actualTitle);
    }


    @Then("I log in as a {string} using {string} and {string}")
    public void i_log_in_as_a_using_and(String userName, String email, String password) {
        pages.getLoginPage().emailBox.sendKeys(email);
        pages.getLoginPage().passwordBox.sendKeys(password);
        pages.getLoginPage().login_button.click();

    }



}
