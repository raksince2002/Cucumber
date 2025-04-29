package awesomeqa;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/awesomeqa/File.feature", glue="awesomeqa", tags="@tag1 or @tag2")
public class TestRunner extends AbstractTestNGCucumberTests {
  
}
