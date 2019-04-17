package com.shreyansh.autoMate;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(pdfPageSize = "legal Landscape", toPDF = true, jsonReport = "Reports/autoMate.json", overviewReport = true, outputFolder = "Reports", reportPrefix = "autoMate-DATE(dd-MMM-yyyy)")
@CucumberOptions(monochrome = true, plugin = { "html:Reports/autoMate-html-report", "json:Reports/autoMate.json", "pretty:Reports/autoMate-pretty.txt", "usage:Reports/autoMate-usage.json", "junit:Reports/autoMate-results.xml" }, features = { "./Features" }, glue={ "com/shreyansh/autoMate/StepDefinitions" }, tags = { "~@manual" })
public class Runner {



}
