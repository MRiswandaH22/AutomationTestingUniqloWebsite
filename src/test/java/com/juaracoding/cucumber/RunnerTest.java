package com.juaracoding.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/1.Register.feature",
        "src/main/resources/features/2.Login.feature"},

        glue = {"com.juaracoding.cucumber"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber-json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
