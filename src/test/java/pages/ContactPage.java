package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage{


    public ContactPage(WebDriver browser) {
        super(browser);
    }

    public ContactPage clickNewContact(){
        browser.findElement(By.id("novo-contato")).click();
        return this;
    }

    public ContactPage typeName(String name){
        browser.findElement(By.id("popup-criar-contato")).findElement(By.xpath("//input[@id=\"nome\"]")).sendKeys(name);
        return this;
    }

    public ContactPage typePhone(String phone){
        browser.findElement(By.id("popup-criar-contato")).findElement(By.xpath("//input[@name=\"numero[]\"]")).sendKeys(phone);
        return this;
    }

    public ContactPage createContact(){
        browser.findElement(By.id("popup-criar-contato")).findElement(By.className("botao-1")).click();
        return this;
    }

    public ContactPage createNewContact(String name, String phone){
        clickNewContact();
        typeName(name);
        typePhone(phone);
        createContact();
        return this;
    }
}
