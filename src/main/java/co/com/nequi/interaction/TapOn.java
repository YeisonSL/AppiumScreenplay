package co.com.nequi.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TapOn implements Interaction {

    private int tap;
    private Target element;


    public TapOn(int tap, Target element) {
        this.tap = tap;
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < this.tap; i++) {
            actor.attemptsTo(
                    Click.on(this.element));
        }

    }

    public static TapOn thisElement(int tap, Target element) {
        return instrumented(TapOn.class, tap, element);
    }

}
