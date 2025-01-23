package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage (WebDriver driver) {
        super(driver);
    }
    /*********************************************Elements**********************************************/
    @FindBy (xpath = " //span[@id='nav-link-accountList-nav-line-1']")
    WebElement logInNav ;
    @FindBy (xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
    WebElement createNewUserBtn;
    @FindBy (id = "nav-link-accountList-nav-line-1")
    public WebElement wellcomMsg ;

    @FindBy(linkText = "Mobiles, Tablets & Accessories")
    WebElement mobilesCategory;

    @FindBy( linkText = "All Mobile Phones")
    WebElement mobilePhonesCategory;

    @FindBy(xpath = "//h1[contains(text(), 'Cell Phones and Communication')]")
    WebElement cellPhonesAndCommunicationHeader;
    @FindBy (id = "nav-hamburger-menu")
    public WebElement viewAll ;
    /*********************************************Methods**********************************************/
    @Step("Navigate to login page")
    public void navLogin (){
        clickElement(logInNav);
    }
    @Step("Hover on account list")
    public  void  hoverOnAccountList(){
        hoverEle(logInNav);

    }
    @Step("Click 'Start Here' link")
    public void  clickStartHere(){

        clickElement(createNewUserBtn);
    }
    @Step("Select Mobile Phones category")
    public void selectMobilePhonesCategory() {
        clickElement(viewAll);
        waitEleByVisibility(mobilesCategory,10);
        clickElement(mobilesCategory);
        waitEleByVisibility(mobilePhonesCategory,10);
        clickElement(mobilePhonesCategory);
    }

    @Step("Verify Cell Phones and Communication header is displayed")
    public boolean isCellPhonesAndCommunicationVisible() {
        return cellPhonesAndCommunicationHeader.isDisplayed();
    }
}
