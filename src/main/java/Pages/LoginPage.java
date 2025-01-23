package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage (WebDriver driver) {
        super(driver);
    }
    /*********************************************Elements**********************************************/

    @FindBy (id = "ap_email")
    WebElement logInText ;

    @FindBy(id = "ap_email_login") // Secondary locator
    WebElement logInTextAlt;
    @FindBy (className = "a-button-input")
    WebElement continueBtn ;
    @FindBy (id = "ap_password")
    WebElement passwordTxt ;
    @FindBy (id = "signInSubmit")
    WebElement signInBtn ;

    /*********************************************Methods**********************************************/
    @Step("Enter Login Mail")
    public void enterlogin (String email){
        try {
            clickElement(logInTextAlt);
            writeTxt(logInTextAlt, email);

        }
        catch (NoSuchElementException e){

            clickElement(logInText);
            writeTxt(logInText,email);
        }

    }
    @Step("Press continue button")
    public void  pressContinue (){

        clickElement(continueBtn);
    }
    @Step("Enter password")
    public void  enterPassword(String password){
        waitEleByVisibility(passwordTxt,5);
        writeTxt(passwordTxt,password);
    }
    @Step("Press sign-in button")
    public void pressSignin(){

        clickElement(signInBtn);
    }


}
