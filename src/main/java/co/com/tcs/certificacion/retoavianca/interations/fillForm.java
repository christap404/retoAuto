package co.com.tcs.certificacion.retoavianca.interations;

import co.com.tcs.certificacion.retoavianca.userinterfaces.Form;
import co.com.tcs.certificacion.retoavianca.utils.fileTxt;
import co.com.tcs.certificacion.retoavianca.utils.infoForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.tcs.certificacion.retoavianca.userinterfaces.Form.SELECT_COUNTRY;

public class fillForm implements Interaction {

    String country;
    String city;
    String password;

    public fillForm(String country, String city, String password) {
        this.country = country;
        this.city = city;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        infoForm persona = new infoForm();

        t.attemptsTo(Enter.theValue(persona.getName()).into(Form.INPUT_NAME),
                Enter.theValue(persona.getPhone()).into(Form.INPUT_PHONE),
                Enter.theValue(city).into(Form.INPUT_CITY),
                Enter.theValue(persona.getEmail()).into(Form.INPUT_EMAIL),
                Click.on(Form.INPUT_COUNTRY),
                Click.on(SELECT_COUNTRY.of(this.country)),
                Enter.theValue(persona.getUsername()).into(Form.INPUT_USERNAME),
                Enter.theValue(password).into(Form.INPUT_PASSWORD),
                Click.on(Form.BTN_SUBMIT));
    }

    public static fillForm fill(String country, String city, String password) {
        return Tasks.instrumented(fillForm.class, country, city, password);
    }
}
