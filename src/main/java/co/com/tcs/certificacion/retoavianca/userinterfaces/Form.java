package co.com.tcs.certificacion.retoavianca.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.way2automation.com/way2auto_jquery/index.php")
public class Form extends PageObject {

    public static final Target INPUT_NAME = Target.the("input name").
            located(By.name("name"));

    public static final Target INPUT_PHONE = Target.the("input phone").
            located(By.name("phone"));

    public static final Target INPUT_EMAIL = Target.the("input email").
            located(By.name("email"));

    public static final Target INPUT_COUNTRY = Target.the("input country").
            located(By.name("country"));

    public static final Target SELECT_COUNTRY = Target.the("select country").
            locatedBy("//option[contains(text(),'{0}')]");

    public static final Target INPUT_CITY = Target.the("input city").
            located(By.name("city"));

    public static final Target INPUT_USERNAME = Target.the("input username").
            located(By.xpath("(//input[@name='username'])[2]"));

    public static final Target INPUT_PASSWORD = Target.the("input password").
            located(By.xpath("(//input[@name='password'])[2]"));

    public static final Target BTN_SUBMIT = Target.the("button submit").
            located(By.xpath("(//input[@class='button'])[2]"));

    public static final Target ALERT = Target.the("message alert").
            located(By.id("alert"));

}
