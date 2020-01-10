package co.com.nequi.tasks;

import co.com.nequi.interaction.loginactions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IniciarApp implements Task {
   private String user;
   private String pass;

    public IniciarApp(String user, String pass) {
    	this.user = user;
    	this.pass = pass;
    	       

    }

    @Override
    @Step("{0} attemps iniciar app")
    public <T extends Actor> void performAs(T actor) {
    	System.out.println("inicari app");
        actor.attemptsTo(WaitApp.initialized());
        System.out.println("LLegue aqui");
        actor.attemptsTo(CheckNumberBox.isVisible());
        actor.attemptsTo(IngesarCrdenciales.login(user, pass));
        //actor.attemptsTo(Enter.theValue(pass).into(TEXT_PASSS));
        //actor.attemptsTo(ClickEntry.button());
      
              }

//    public static IniciarApp ok(String user, String pass) {
//        return instrumented(IniciarApp.class, user, pass);
//    }
    public static IniciarApp ok(String user, String pass) {
        return instrumented(IniciarApp.class, user, pass);
    }
}
