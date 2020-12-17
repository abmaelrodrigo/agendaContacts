package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "CreateANewContactPageObjectsTest.csv")
public class CreateANewContactPageObjectsTest {
    private WebDriver browser;

    @Before
    public void setUp(){
        browser = Web.createChrome();
    }

    @Test
    public void testAdicionarumNovoContato(
            @Param(name = "email")String email,
            @Param(name = "password")String password,
            @Param(name = "name")String name,
            @Param(name = "phone")String phone,
            @Param(name = "addEmail")String addEmail){
        new LoginPage(browser)
                .clickLogIn().doLogin(email,password)
                .createNewContact(name,phone,addEmail);
    }

   /* @After
    public void tearDown(){
        browser.quit();
    }*/
}
