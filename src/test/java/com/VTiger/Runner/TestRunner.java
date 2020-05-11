package com.VTiger.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/VTiger/features/Login.feature"
		,glue= {"com.VTiger.StepDefination"},
		//format= {"pretty","html:target/test"},
       plugin= {"pretty","json:target/cucumber.json"},
		//tags= {"@sanity"},
		monochrome=true)

public class TestRunner {

	
}
