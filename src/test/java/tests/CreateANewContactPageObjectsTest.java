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
    private void setUp(){
        browser = Web.createChrome();
    }

    @Test
    private void testAdicionarumNovoContato(){
        new LoginPage(browser)
                .clickSignIn()
                .typeLogin("abmaelrodrigo@outlook.com");

    }

    @After
    private void tearDown(){
        browser.quit();
    }
}
