package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {


    public LoginFormPage(WebDriver browser) {
        super(browser);
    }

    //structural approach
    public LoginFormPage typeName(String email){
        browser.findElement(By.className("popup")).findElement(By.id("login-email")).sendKeys(email);
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
    public ContactPage doLogin(String email, String password){
        typeName(email);
        typePassword(password);
        clickSignIn();

        return new ContactPage(browser);

    }
}
