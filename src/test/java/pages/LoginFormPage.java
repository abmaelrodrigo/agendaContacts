package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
    private WebDriver browser;

    public LoginFormPage(WebDriver browser){
        this.browser = browser;
    }

    public LoginFormPage typeLogin(String login){
        browser.findElement(By.id("popup-criar-contato")).findElement(By.xpath("//input[@id=\"nome\"]")).sendKeys(login);
        return this;
    }
}
