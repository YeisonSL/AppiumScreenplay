package co.com.nequi.interaction;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ChangeAppTo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver facade = getProxiedDriver();
        facade.runAppInBackground(Duration.ofMillis(1000));
    }

    public static ChangeAppTo runInBackground() {
        return instrumented(ChangeAppTo.class);
    }

}