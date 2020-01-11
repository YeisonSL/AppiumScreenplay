package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ResultNotWaitedException;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TheResult;
import tasks.*;

import static exceptions.LoginException.FAILED_LOGIN;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;




public class LoginStepDefinitions {


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I login with username (.*) and password (.*)$")
    public void iLogin(String username, String password) throws Throwable {
      theActorCalled("User").attemptsTo(IniciarApp.ok(username, password));
    }

    @Then("^you should see the home page$")
    public void youShouldSeeTheHome() throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheResult.is(), equalTo(true))
                .orComplainWith(ResultNotWaitedException.class, FAILED_LOGIN));
    }

}