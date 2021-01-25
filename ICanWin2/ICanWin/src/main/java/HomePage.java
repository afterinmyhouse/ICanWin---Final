import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "postform-text")
    private WebElement postFormInput;
    @FindBy(id = "select2-postform-expiration-container")
    private WebElement postformExpirationContainer;
    @FindBy(xpath = "//li[contains(text(),'10 Minutes')]")
    private WebElement resultOption;
    @FindBy(id = "postform-name")
    private WebElement postformName;
    @FindBy(xpath = "//button[contains(.,'Create New Paste')]")
    private WebElement createNewPasteBtn;


    public void setTextToPostForm(String text) {
        wait(postFormInput);
        postFormInput.sendKeys(text);
    }

    public void clickOnPostformExpirationContainer() {
        wait(postformExpirationContainer);
        postformExpirationContainer.click();
    }

    public void clickOnResultOption() {
        wait(resultOption);
        resultOption.click();
    }
    public void sendKeysToPostformName(String text) {
        wait(postformName);
        postformName.sendKeys(text);
    }
    public void clickOnCreateNewPasteBtn() {
        wait(createNewPasteBtn);
        createNewPasteBtn.click();
    }
}
