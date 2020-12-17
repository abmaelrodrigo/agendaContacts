package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {


    public LoginFormPage(WebDriver browser) {
        super(browser);
    }

    //structural approach
    public LoginFormPage typeName(String name){
        browser.findElement(By.className("popup")).findElement(By.id("login-email")).sendKeys(name);
        return this;
    }

    public LoginFormPage typePassword(String password){
        browser.findElement(By.className("popup")).findElement(By.id("login-senha")).sendKeys(password);
        return this;
    }

    public ContactPage clickSignIn(){
        browser.findElement(By.xpath("//button[@class=\"botao-1\"]")).click();
        return new ContactPage(browser);
    }

    //functional approach
    public ContactPage doLogin(String name, String password){
        typeName(name);
        typePassword(password);
        clickSignIn();

        return new ContactPage(browser);

    }
}
