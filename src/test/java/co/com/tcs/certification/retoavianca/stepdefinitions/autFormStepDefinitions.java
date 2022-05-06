package co.com.tcs.certification.retoavianca.stepdefinitions;

import co.com.tcs.certificacion.retoavianca.questions.ValidateTxt;
import co.com.tcs.certificacion.retoavianca.tasks.completeForm;
import co.com.tcs.certificacion.retoavianca.utils.DriverWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class autFormStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(DriverWeb.hisBrowser())));
        OnStage.theActorCalled("user");
    }

    @Given("^the user enter to the website$")
    public void TheUserEnterToTheWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.way2automation.com/way2auto_jquery/index.php"));
    }

    @When("^the user enter the information (.*) (.*) (.*)$")
    public void theUserEnterTheInformation(String country, String city, String password) {

        OnStage.theActorInTheSpotlight().attemptsTo(completeForm.complete(country, city, password));
    }

    @Then("^the user see the message$")
    public void theUserSeeTheMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTxt.validate(), Matchers.containsString("This is just a dummy form,")));
    }
}
