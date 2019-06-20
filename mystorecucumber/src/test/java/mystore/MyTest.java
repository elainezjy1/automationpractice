package mystore;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.test.definition.BrowserFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:test.feature",
        glue = {"com.test.definition"}
        //plugin = {"html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        //        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"}
        )

public class MyTest {

}
