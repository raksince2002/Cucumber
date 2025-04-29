package com.features.automationex;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/com.feature.automationex/Automationex.feature", glue="com.feature.automationex", tags="@tag1 or @tag2")
public class TestRunner extends AbstractTestNGCucumberTests {
  
}
