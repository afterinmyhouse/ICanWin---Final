import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class ICanWinTest{
    HomePage homePage = new HomePage();
    NewPaste newPaste = new NewPaste();

    @Test
    public void CreateNewPaste () {
        homePage.openUrl("https://pastebin.com");
        homePage.setTextToPostForm ("Hello from WebDriver");
        homePage.clickOnPostformExpirationContainer();
        homePage.clickOnResultOption();
        homePage.sendKeysToPostformName ("helloweb");
        homePage.clickOnCreateNewPasteBtn();
        Assert.assertTrue(newPaste.newPasteIsDisplayed(), "New Paste Was Not Created");

    }
    @AfterTest
    public void closeWebDriver() {
        BasePage.closeWebDriver();
    }
}
