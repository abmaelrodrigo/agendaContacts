package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver browser;

    public  LoginPage(WebDriver browser){
        this.browser = browser;
    }

    public LoginFormPage clickSignIn(){
        //Click on the button 'Novo contato' através de seu id novo-contato
        browser.findElement(By.id("novo-contato")).click();

        return new LoginFormPage(browser);
    }
}
