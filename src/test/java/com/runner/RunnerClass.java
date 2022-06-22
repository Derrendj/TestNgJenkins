package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/login.feature", glue = {"com.stepdefn"}, monochrome = true,plugin = {"pretty","json:src/test/resources/Reports/output.json"},snippets = SnippetType.CAMELCASE, dryRun = false, strict = true)
public class RunnerClass {
	@AfterClass
	public static void afterClass() {
		String path = System.getProperty("user.dir");
		Reporting.generateJvmReport(path + "\\src\\test\\resources\\Reports\\output.json");
	}
}
