package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpDataPage extends PageBase{
    public SignUpDataPage(WebDriver driver) {
        super(driver);
    }
    /*********************************************Elements**********************************************/

    @FindBy(id = "ap_phone_number")
    WebElement phoneNumTxt;
    @FindBy (id = "ap_customer_name")
    WebElement fullNameTxt;
    @FindBy (id = "ap_password")
    WebElement passwordTxt ;
    @FindBy (id = "ap_password_check")
    WebElement reenterPasswordText;
    @FindBy (id = "continue")
    WebElement continueBtn;
    @FindBy (xpath = "//*[@id=\"verification-code-form\"]/div[1]/div[1]/h1")
    public WebElement OtpHeader;
    @FindBy (xpath = "//*[@id=\"auth-error-message-box\"]/div/h4")
    public WebElement errorMsg;
    /*********************************************Methods**********************************************/
    @Step ("Enter Phone Number")
    public void enterPhoneNum (String phone){

        writeTxt(phoneNumTxt,phone);
    }
    @Step ("Enter Full Name")
    public void  enterFullName (String fullName){
        writeTxt(fullNameTxt ,fullName);

    }
    @Step ("Enter Password")
    public void enterPassword (String password){
        writeTxt(passwordTxt,password);
    }
    @Step("Re-enter password")
    public void reenterPassword (String password)
    {
        writeTxt(reenterPasswordText,password);
    }

    @Step("Click verify button")
    public  void  clickVerify (){
        clickElement(continueBtn);
    }


}
