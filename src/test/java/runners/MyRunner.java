package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/features",
                  glue="stepdefinitions",
                  plugin={"html:target/cucumber_html_report.html"},
                  tags= "@Settings")
public class MyRunner extends  AbstractTestNGCucumberTests  {

}
