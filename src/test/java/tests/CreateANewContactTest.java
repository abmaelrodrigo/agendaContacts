package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import support.Web;

import java.util.concurrent.TimeUnit;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "CreateANewContact.csv")
public class CreateANewContactTest {
    private WebDriver browser;

    @Before
    public void setup(){
        browser = Web.createChrome();

        System.setProperty("webdriver.chrome.driver","/Users/abmaelrodrigo/drivers/chromedriver");
        browser = new ChromeDriver();

        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open the page https://mockflow.com/
        browser.get("https://agendap.com/");

        //Click on the button Login
        browser.findElement(By.xpath("//button[@id=\"login\"]")).click();

        //Identifying the popup window where there is the class popup-login
        WebElement popupLogin = browser.findElement(By.className("popup"));

        //Write a valid email on the email field
        popupLogin.findElement(By.id("login-email")).sendKeys("abmaelrodrigo@outlook.com");

        //Write a valid password on the password field
        popupLogin.findElement(By.id("login-senha")).sendKeys("abmaelcontactos91");

        //Click on Sign in button
        popupLogin.findElement(By.xpath("//button[@class=\"botao-1\"]")).click();

    }
    @Test
    public void testAdicionarumNovoContato(@Param(name = "name")String name,@Param(name = "phone")String phone){
        //Click on the button 'Novo contato' através de seu id novo-contato
        browser.findElement(By.id("novo-contato")).click();

        //Identifying the popup window where there is the id popup-criar-contato
        WebElement popupNewRegister = browser.findElement(By.id("popup-criar-contato"));

        //Write a contact name on the name field
        popupNewRegister.findElement(By.xpath("//input[@id=\"nome\"]")).sendKeys(name);

        //Write a phone on the phone field
        popupNewRegister.findElement(By.xpath("//input[@name=\"numero[]\"]")).sendKeys(phone);

        //Click on the 'Criar contato' button
        popupNewRegister.findElement(By.className("botao-1")).click();

    }
}
