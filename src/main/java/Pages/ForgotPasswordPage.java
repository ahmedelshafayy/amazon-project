package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends PageBase{
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "auth-fpp-link-bottom")
    WebElement forgotPasswordele;
    @FindBy(id = "ap_email")
    WebElement email;
    @FindBy(id ="continue")
    WebElement continueBtn;
    public void forgotPasswordnav ()
    {
        clickElement(forgotPasswordele);
    }
    public void enterEmail(){
        writeTxt(email,"ahmedelshafay4@gmail.com");
    }

    public void clickContinue(){
        clickElement(continueBtn);
    }

}