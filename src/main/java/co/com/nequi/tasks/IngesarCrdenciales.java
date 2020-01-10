package co.com.nequi.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.interactions.SendKeysAction;

import com.google.common.collect.Multiset.Entry;

import co.com.nequi.interaction.loginactions.WaitApp;
import co.com.nequi.tasks.generic.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static co.com.nequi.userinterfaces.LoginPage.*;
import static co.com.nequi.userinterfaces.LoginPage.TEXT_PASS;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.EnterValueIntoElement;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;
import net.serenitybdd.screenplay.actions.SendKeystoElement;
import co.com.nequi.interaction.WaitForElement;
import co.com.nequi.interaction.loginactions.*;


public class IngesarCrdenciales implements Task {
    private String user;
    private String pass;

    public IngesarCrdenciales(String user, String pass) {
        this.user = user;
        this.pass = pass;
        

    }

    @Override
    @Step("{0} attemps to login in CT ")
    public <T extends Actor> void performAs(T actor) {  
    	  	
    	//actor.attemptsTo(WaitForElement.visibility(TEXT_USER, 2));
    	//actor.attemptsTo(Enter.theValue(user).into(TEXT_USER));
    	//actor.attemptsTo(WaitForElement.visibility(bt2, 1));
        //actor.attemptsTo(Enter.theValue(pass).into(TEXT_PASS));
       // actor.attemptsTo(WaitFor.seconds(2));
       // actor.attemptsTo(Enter.theValue(pass).into(pas1));
        //actor.attemptsTo(WaitFor.seconds(2));
       // actor.attemptsTo(Click.on(TEXT_USER));
        actor.attemptsTo(Click.on(pas3));
        //actor.attemptsTo(Enter.theValue(user).into(pas5));
        actor.attemptsTo(Click.on(pas5));
        //actor.attemptsTo(Enter.keyValues(pass).into(pas3));
        
        //actor.attemptsTo(Enter.theValue(pass).into(pas3));
        actor.attemptsTo(WaitFor.seconds(2));
//        actor.attemptsTo(Enter.theValue(pass).into(pas3));
//        actor.attemptsTo(WaitFor.seconds(2));
//        actor.attemptsTo(Enter.theValue(pass).into(pas4));
//        actor.attemptsTo(WaitFor.seconds(2));
//        actor.attemptsTo(Enter.theValue(pass).into(pas5));
//        actor.attemptsTo(WaitFor.seconds(5));
//        actor.attemptsTo(ClickEntry.button());
      
              }

   public static IngesarCrdenciales login(String user, String pass) {
        return instrumented(IngesarCrdenciales.class, user, pass);
    }
    
}
