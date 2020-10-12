package com.maveric.demobank.runner;

import java.util.HashMap;

import org.junit.runner.RunWith;

import com.maveric.demobank.common.SeMethods;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\maveric\\demobank\\features\\AccountDetails.feature",
		glue="com.maveric.demobank.stepdef",dryRun=false,
		plugin={"pretty","html:target/cucumber","json:target/cucumber.json"})

public class TestRunner extends SeMethods {
	public static HashMap<String, SeMethods> tcObjs = new HashMap<String, SeMethods>();
}
