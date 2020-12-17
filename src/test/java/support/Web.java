package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static final String USERNAME = "abmaelrodrigo1";
    public static final String AUTOMATE_KEY = "EX8GEFxvKQzdqqzAy6hx";
    public static final String URLBrowserStack = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","/Users/abmaelrodrigo/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();

        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open the page https://mockflow.com/
        browser.get("https://agendap.com/");

        return  browser;
    }

    public static WebDriver createBrowserStack(){
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x1024");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "85.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "abmaelrodrigo1's First Test");
        caps.setCapability("build", "BStack Build Number 1");

        WebDriver browser = null;
        try {
             browser = new RemoteWebDriver(new URL(URLBrowserStack), caps);
             browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //open the page https://agendap.com/
             browser.get("https://agendap.com/");

        } catch (MalformedURLException e) {
            System.out.println("There were some problems with the URL: "+e.getMessage());
        }

        return browser;


    }
}
