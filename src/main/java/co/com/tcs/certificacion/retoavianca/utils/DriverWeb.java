package co.com.tcs.certificacion.retoavianca.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverWeb {

    private DriverWeb(){
        throw new IllegalStateException("Utility class");
    }

    public static WebDriver hisBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("InPrivate", true);
        WebDriver chrome = new ChromeDriver(options);
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.manage().window().maximize();
        return chrome;
    }

}
