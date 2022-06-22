package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	public static void generateJvmReport(String jsonFile) {
		//location of the jvm report
		String path = System.getProperty("user.dir");
		File reportDirectory = new File (path +"\\src\\test\\resources\\Reports" );
		
		//object for confirmation class ----> jvm report location,project
		Configuration configuration = new Configuration(reportDirectory, "Hotel Booking Automation");
		
		//k,v ------> print,reg,smoke,browser
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "95");
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("sprint", "34");
		
		//Add jon file into list
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		//pass the json file ---> Fetch the results from json file--->like how many scenario passed,failed,skipped
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		
		//to generate the jvm reports
		reportBuilder.generateReports();
		
	}

}
