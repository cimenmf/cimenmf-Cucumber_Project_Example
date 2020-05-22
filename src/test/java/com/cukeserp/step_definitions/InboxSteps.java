package com.cukeserp.step_definitions;

import com.cukeserp.utilities.BrowserUtils;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.util.List;

public class InboxSteps {
    Pages pages = new Pages();

    @Then("Actual user Name should be displayed {string}")
    public void actual_user_Name_should_be_displayed(String actualUser) {
        Assert.assertEquals(pages.getInboxPage().actualUsername.getText(), actualUser);
    }

    @Then("manager should be able to see following Headers:")
    public void manager_should_be_able_to_see_following_Headers(List<String> Headers) {
        List<String> actualHeaders = BrowserUtils.getElementsText(pages.getInboxPage().allHeaders);
        Assert.assertEquals(Headers, actualHeaders);
    }

    @When("manager clicks Calendar icon on Headers")
    public void manager_clicks_Calendar_icon_on_Headers() {
        BrowserUtils.waitForClickablility(pages.getHeaderPage().calendar_button, 5);
        pages.getHeaderPage().calendar_button.click();
    }



}
