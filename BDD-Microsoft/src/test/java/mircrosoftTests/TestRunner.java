package mircrosoftTests;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/mircrosoftTests/IIS.feature", glue="mircrosoftTests", tags="@tag1")
public class TestRunner extends AbstractTestNGCucumberTests {
  
}
