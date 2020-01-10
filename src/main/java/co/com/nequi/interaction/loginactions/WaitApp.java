package co.com.nequi.interaction.loginactions;

import co.com.nequi.interaction.WaitForElement;
import co.com.nequi.tasks.generic.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.nequi.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitApp implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
    	System.out.println("entre en la iteraccion");
        boolean initialized = false;
        while (!initialized) {
            //actor.attemptsTo(WaitFor.seconds(3));
            System.out.println("espere 2 segundos");
           // actor.attemptsTo(WaitForElement.visibility(ENTRY_BUTTON, 3));
            if (TEXT_USER.resolveFor(actor).isVisible()   ) 
            		System.out.println("Pse el if");
            		
                     {
                initialized = true;
            }
        }
    }

    public static WaitApp initialized() {
        return instrumented(WaitApp.class);
    }
}