import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPaste extends BasePage {
    public NewPaste() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='notice -success -post-view']")
    private WebElement newPasteCreated;


    public boolean newPasteIsDisplayed() {
        wait(newPasteCreated);
        return newPasteCreated.isDisplayed();
    }
}
