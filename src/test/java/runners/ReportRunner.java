package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        plugin ={"html: reports/htmlReport.html ",
                   "json: reports/jsonReport.json",
                    "junit:reports/xmlReport.xml "}
)
public class ReportRunner {

    /*
    1-ExtentReport (Third party Reporting Framework)

    2- Cucumber built in raporları
     */
}
