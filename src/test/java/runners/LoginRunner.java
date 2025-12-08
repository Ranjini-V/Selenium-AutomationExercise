package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", glue = { "stepDefinitions", "hooks" }, plugin = { "pretty",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"html:target/HTMLReports/report.html",
		"json:target/JSONReports/report.json",
		"junit:target/XMLReports/reports.xml" }, monochrome = true, tags = "@smoketest")
public class LoginRunner {

}
