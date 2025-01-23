package Tests;

import Pages.HomePage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobilePhonesTest extends TestBase {

    HomePage hp;

    @Test
    @Description("Test for navigating to Mobile Phones and checking the header")
    public void mobilePhonesTest() {
        hp = new HomePage(driver);

        hp.selectMobilePhonesCategory();

        // Assert that "Cell Phones and Communication" is displayed
        Assert.assertTrue(hp.isCellPhonesAndCommunicationVisible(),
                "Cell Phones and Communication header is not visible!");
    }
}