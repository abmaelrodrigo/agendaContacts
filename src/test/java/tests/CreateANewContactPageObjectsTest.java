package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.Web;

public class CreateANewContactPageObjectsTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();
    }

    @Test
    public void testAdicionarumNovoContato(){
        new LoginPage(browser)
                .clickLogIn().doLogin("abmaelrodrigo@outlook.com","abmaelcontactos91")
                .createNewContact("Ferraz H.","9812563252");
    }

   /* @After
    public void tearDown(){
        browser.quit();
    }*/
}
