package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver browser) {
        super(browser);
    }

    public LoginFormPage clickLogIn(){
        browser.findElement(By.xpath("//button[@id=\"login\"]")).click();

        return new LoginFormPage(browser);
    }
}
