package com.cukeserp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions (
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target//json-reports/cucumber6.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com.cukeserp.step_definitions"
        ,dryRun = false
        ,tags = "@PR2"

        ,monochrome=true

)
public class trialParallelRunnerTwo {
}

// mvn clean verify   --> it will first delete the target folder, then run tests, then generate reports
