package autoapp.automation.runner;
 
import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;
 
@CucumberOptions(features = "src\\test\\resources\\autoapp\\automation\\features\\AutoChallenge.feature",
format = {"pretty", "json:target/cucumber-json-reports/automationChallenge.json"},
glue = {"autoapp.automation.stepDef"},
tags = {"~@wip", "~@skip"},
monochrome = true)

public class AutomationChallengeTest extends AbstractTestNGCucumberTests{
 
}



