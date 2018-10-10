package com.giftcards.bddrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="I:\\eclipse-workspace\\giftcards.bdd\\src\\main\\resources\\TestResource\\Features\\ValidLogin.feature",
		glue= {"com.giftcards.steps"},
//		dryRun=true,
		strict=true,
		monochrome=true,
		plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml"
        }
		)

public class TestRunner {

}
