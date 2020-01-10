package co.com.nequi.questions;

import co.com.nequi.exceptions.ResultNotWaitedException;
import co.com.nequi.model.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TheResult implements Question<Boolean> {
    private static final Logger LOGGER = Logger.getAnonymousLogger();

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo();
            return true;
        } catch (ResultNotWaitedException ex) {
            LOGGER.log(Level.SEVERE, "an error ocurred while attempting to Login Nequi with user: "  , ex);
            return false;
        }

    }

    public static TheResult is() {
        return new TheResult();
    }

}
