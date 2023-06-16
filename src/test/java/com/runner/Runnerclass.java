package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/req.feature",glue={"com.stepdefenition"},plugin="html:target/HtmlReports.html")

public class Runnerclass {

	public Runnerclass() {
		// TODO Auto-generated constructor stub
	}

}
