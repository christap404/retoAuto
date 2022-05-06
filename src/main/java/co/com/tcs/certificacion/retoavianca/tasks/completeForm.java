package co.com.tcs.certificacion.retoavianca.tasks;

import co.com.tcs.certificacion.retoavianca.interations.fillForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class completeForm implements Task {

    String country;
    String city;
    String password;

    public completeForm(String country, String city, String password) {
        this.country = country;
        this.city = city;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(fillForm.fill(country, city, password));
    }

    public static completeForm complete(String country, String city, String password) {
        return Tasks.instrumented(completeForm.class, country, city, password);
    }
}
