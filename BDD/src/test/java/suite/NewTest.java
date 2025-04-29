package suite;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/suite/TestFeatureFile.feature", glue="suite", tags="@tag1")
public class NewTest extends AbstractTestNGCucumberTests {
  
}
