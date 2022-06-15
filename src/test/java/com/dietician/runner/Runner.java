package com.dietician.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"com.dietician.stepDefinitions"},
		monochrome = true,
//		tags="@MenubarOptionsLogo or @HomePageTitle or @TeamLink or @RegisterLink or @ProductLink or @FeatureLink or @ContactUsLink or "
//				+ "@ClientLink or @BlogLink or @AboutLink",
//		dryRun = false,
		plugin = {"pretty","json:target/cucumber-reports/reports.json",
						"junit:target/cucumber-reports/Cucumber.xml",
						"html:target/cucumber-reports/reports.html",
						"html:test-output/index.html"}
		)
public class Runner {

}
