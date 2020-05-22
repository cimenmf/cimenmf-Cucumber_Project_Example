package com.cukeserp.step_definitions;

import com.cukeserp.utilities.*;
import cucumber.api.java.en.Given;

public class LandingSteps extends BrowserUtils implements ApplicationConstants {
    Pages pages = new Pages();

    @Given("I open {string} url")
    public void i_open_url(String url) {
        Driver.getDriver().get(url);

    }






}
