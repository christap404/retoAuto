package co.com.tcs.certification.retoavianca.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/aut_form.feature",
        glue = "co.com.tcs.certification.retoavianca.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@1")
public class autForm {
}
