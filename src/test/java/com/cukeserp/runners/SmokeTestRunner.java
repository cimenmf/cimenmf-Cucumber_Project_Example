package com.cukeserp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions (
        plugin = {
                "html:target/cucumber-default-Report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features/ImportFunctionality/Said_feature",
        glue = "com.cukeserp.step_definitions",
        dryRun = false,
        tags = "@smoke"

        ,monochrome = true

)
public class SmokeTestRunner {
}
