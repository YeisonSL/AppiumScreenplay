package co.com.nequi.stepdefinitions;

import co.com.nequi.exceptions.LoginException;
import co.com.nequi.exceptions.ResultNotWaitedException;
import co.com.nequi.model.LoginModel;
import co.com.nequi.questions.TheResult;
import co.com.nequi.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.nequi.exceptions.LoginException.FAILED_LOGIN;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;




public class LoginNequiStepDefinitions {


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
        //theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheHomePage.isVisible()));
    }

}