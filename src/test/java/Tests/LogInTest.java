package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    HomePage hp ;
    LoginPage lp ;
    @Test
    @Description("Test for logging into the Amazon account")
    public  void logInTest() {
        hp = new HomePage(driver);
        lp= new LoginPage(driver);

        hp.navLogin();
        lp.enterlogin("ahmedelshafay4@gmail.com");
        lp.pressContinue();
        lp.enterPassword("0108090690");
        lp.pressSignin();
        Assert.assertEquals(hp.wellcomMsg.getText(),"Hello, Ahmed");
    }


}
