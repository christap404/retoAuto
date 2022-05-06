package co.com.tcs.certificacion.retoavianca.questions;

import co.com.tcs.certificacion.retoavianca.userinterfaces.Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateTxt implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Form.ALERT.resolveFor(actor).getText();
    }
    public static ValidateTxt validate() {
        return new ValidateTxt();
    }

}
