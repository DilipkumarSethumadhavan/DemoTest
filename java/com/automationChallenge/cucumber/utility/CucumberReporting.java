package com.automationChallenge.cucumber.utility;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class CucumberReporting {
	private String reportFolder = "target/cucumber-json-reports";

	private void generateHtmlReport() {

		File reportOutputDirectory = new File("target/feature-overview");
		List<String> jsonReportFiles = getAllJsonReportFiles();
		String projectName = "Automation Challenge";
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		configuration.addClassifications("Browser", System.getProperty("browser"));
		ReportBuilder reportBuilder = new ReportBuilder(jsonReportFiles, configuration);
		reportBuilder.generateReports();
	}

	private List<String> getAllJsonReportFiles() {
		File folder = new File(reportFolder);
		String[] fileNames = folder.list(new FilenameFilter() {
			public boolean accept(File dir, String fileName) {
				return fileName.endsWith(".json");
			}
		});

		List<String> jsonReportFiles = new ArrayList<String>();
		for (String fileName : fileNames) {
			jsonReportFiles.add(reportFolder + "/" + fileName);
		}
		return jsonReportFiles;
	}

	public static void main(String[] args) throws Throwable {
		CucumberReporting cp = new CucumberReporting();
		cp.generateHtmlReport();
	}
}

