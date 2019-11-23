package org.bdd.java.bdd_with_cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Feature", glue="",plugin = {"pretty"})
public class RunCucumberTest {
}
