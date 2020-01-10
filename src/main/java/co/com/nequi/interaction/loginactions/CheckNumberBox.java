package co.com.nequi.interaction.loginactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static co.com.nequi.userinterfaces.LoginPage.TEXT_USER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.nequi.interaction.WaitForElement;


public class CheckNumberBox implements Interaction {

	@Override
	@Step("{0} attemps to enter credentials for the first time")
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Segudno aqui");
		//actor.attemptsTo(WaitForElement.visibility(TEXT_USER, 2));
		actor.attemptsTo(
				Check.whether(!TEXT_USER.resolveFor(actor).isVisible() && !TEXT_USER.resolveFor(actor).isPresent()));
		System.out.println("Encontre elemeto useer");
	}

	public static CheckNumberBox isVisible() {
		return instrumented(CheckNumberBox.class);
	}
}
