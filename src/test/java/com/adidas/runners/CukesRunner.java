package com.adidas.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/adidas/stepdefinitions",
        dryRun = false,
        tags = "@TRN-1243"


)

public class CukesRunner {
}
