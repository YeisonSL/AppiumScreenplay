package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactionloginactions.*;


public class IniciarApp implements Task {
   private String user;
   private String pass;

    public IniciarApp(String user, String pass) {
    	this.user = user;
    	this.pass = pass;
    	       

    }

    @Override
    @Step("{0} attemps iniciar app e iniciar session")
    public <T extends Actor> void performAs(T actor) {
    	actor.attemptsTo(WaitApp.initialized());
        actor.attemptsTo(CheckNumberBox.isVisible());
        actor.attemptsTo(IngesarCrdenciales.login(user, pass));
     
              }

//    public static IniciarApp ok(String user, String pass) {
//        return instrumented(IniciarApp.class, user, pass);
//    }
    public static IniciarApp ok(String user, String pass) {
        return instrumented(IniciarApp.class, user, pass);
    }
}
