package registerscripts;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/registerscripts/Input.feature", glue="registerscripts", tags="@tag1")
public class TestRunner extends AbstractTestNGCucumberTests {
  
}
