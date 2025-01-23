package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewToAmazonPage;
import Pages.SignUpDataPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpFailedTest extends TestBase{

    HomePage hp ;
    LoginPage lp ;
    NewToAmazonPage ntap;
    SignUpDataPage sudp;
    @Test
    @Description("Test for Failed sign-up on Amazon")
    public void signUpTest (){
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        ntap=new NewToAmazonPage(driver);
        sudp=new SignUpDataPage(driver);



        hp.hoverOnAccountList();
        hp.clickStartHere();

        ntap.pressOnCreateNewAccount();
        sudp.enterPhoneNum("222080906901");
        sudp.enterFullName("AhmedTestTestttt");
        sudp.enterPassword("1231231");
        sudp.reenterPassword("1231231");
        sudp.clickVerify();
        Assert.assertEquals(sudp.errorMsg.getText(),"There was a problem");
    }
}
