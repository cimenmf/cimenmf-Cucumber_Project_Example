package com.cukeserp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions (
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target//json-reports/cucumber5.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/ImportFunctionality/Said_feature",
        glue = "com.cukeserp.step_definitions"
        ,dryRun = false
        ,tags = "@BRIT-4025"

        ,monochrome=true

)
public class trialParallelRunnerThree {
}
