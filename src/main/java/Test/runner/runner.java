package Test.runner;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
              features="citifeaturefile"
              ,glue="steps"
              ,monochrome = true
              ,tags="@Sanitytest"
             //,tags="@End-to-Endtest"

)
public class runner {
}
