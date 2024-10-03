package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\dpate\\Selenium12\\src\\test\\java\\test\\Launch1.feature"},
glue = {"StepDef"})
public class TestRunner {

}
