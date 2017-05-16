package config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Created by Wale on 23/01/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber","json:target/cucumber-report.jason" }
        ,features = "src/test/java/cucumber",
        glue = {"stepdefs"}, tags = {"@test1"})


public class RunCukesTest {


    @AfterClass
    public static void finalTearDown(){

    }



}
