package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver","/Users/abmaelrodrigo/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();

        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open the page https://mockflow.com/
        browser.get("https://agendap.com/");

        return  browser;
    }
}
