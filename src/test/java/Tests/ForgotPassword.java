package Tests;
import Pages.ForgotPasswordPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ForgotPassword extends TestBase{


    HomePage hp ;
    LoginPage lp ;
    ForgotPasswordPage fb ;
    @Test
    @Description("Test for Forgot Password Flow")
    public  void logInTest() {
        hp = new HomePage(driver);
        lp= new LoginPage(driver);
        fb =new ForgotPasswordPage(driver);

        hp.navLogin();
        lp.enterlogin("ahmedelshafay4@gmail.com");
        lp.pressContinue();
        fb.forgotPasswordnav();
        fb.enterEmail();
        fb.clickContinue();
    }
}