package co.com.nequi.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/Login.feature",
        glue = {"co.com.nequi.stepdefinitions"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Login"
)
public class LoginNequiRunner {

}
