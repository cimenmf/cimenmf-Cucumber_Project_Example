package com.cukeserp.step_definitions;

import com.cukeserp.utilities.ApplicationConstants;
import com.cukeserp.utilities.Pages;
import cucumber.api.java.en.When;

public class CalendarListViewSteps implements ApplicationConstants {
    Pages pages = new Pages();


    @When("User clicks on Calendar tab")
    public void user_clicks_on_Calendar_tab() {
        // Write code here that turns the phrase above into concrete actions
        pages.getHeaderPage().calendar_button.click();
    }


}
