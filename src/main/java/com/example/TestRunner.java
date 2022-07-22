package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
// Accept and Validate Complete Interventional Trial
@CucumberOptions(
        plugin={"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features={"src/test/resources/features/browseToURL.feature","src/test/resources/features/trial.feature"},
        glue={"com.example.Steps"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
}
