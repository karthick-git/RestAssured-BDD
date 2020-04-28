package com.qa.spree.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    //dryRun = true, /* Run just to check if the syntax if fine */
    //tags = { "@Acceptance" }, /* Will run tests that only has the acceptance tag */
    //tags = { "@Acceptance, @Functional"}, /* Will run any test that has either the acceptance tag OR the functional tag */
        //tags = { "@Acceptance", "@Functional"}, /* Will run any test that has both the acceptance tag AND the functional tag */
    //monochrome = true, /* */
    features = {"src/test/resources/spree_features/"}, /* Specify where the feature files are located */
    glue = "com.qa.steps", /* Where are the step definitions located. Do not type /src/java/[main/test] */
    plugin = {
            "pretty:target/cucumber-test-report/basic/cucumber-pretty.txt",
            "html:target/cucumber-test-report/basic/",
            "json:target/cucumber-test-report/basic/cucumber-report.json",
            "junit:target/cucumber-test-report/basic/test-report.xml"
    }
)
public class BDDRunner extends AbstractTestNGCucumberTests { }
