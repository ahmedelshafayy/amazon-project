package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToAmazonPage extends PageBase{

    public NewToAmazonPage(WebDriver driver) {
        super(driver);
    }

    /*********************************************Elements**********************************************/
    @FindBy (className = "a-button-input")
    WebElement proceedToCreateAccountBtn ;


    /*********************************************Methods**********************************************/

    @Step("Press create new account ")
    public void pressOnCreateNewAccount(){
        clickElement(proceedToCreateAccountBtn);
    }

}
