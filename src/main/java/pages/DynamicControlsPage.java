package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver,10);

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private static final By REMOVE_BUTTON = By.xpath("//button[contains(text(),'Remove')]");
    private static final By ADD_BUTTON = By.xpath("//button[contains(text(),'Add')]");
    private static final By CHECKBOX_EXAMPLE_MESSAGE_TEXT = By.xpath("//ancestor::*[@id='checkbox-example']//*[@id='message']");
    private static final By CHECKBOX = By.xpath("//*[@id='checkbox']");
    private static final By INPUT_FIELD = By.xpath("//*[@id='input-example']//*[@type='text']");
    private static final By ENABLE_BUTTON = By.xpath("//*[@id='input-example']//button[contains(text(),'Enable')]");
    private static final By DISABLE_BUTTON = By.xpath("//*[@id='input-example']//button[contains(text(),'Disable')]");
    private static final By INPUT_EXAMPLE_MESSAGE_TEXT = By.xpath("//*[@id='input-example']//*[@id='message']");

    public void waitUntilCheckboxInvisibility() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX));
    }

    public void waitUntilCheckboxVisibility() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKBOX));
    }

    public boolean isCheckboxInvisiable() {
        int numberOfElements = driver.findElements(CHECKBOX).size();
        return numberOfElements == 0;
    }

    public boolean isCheckboxDisplayed() {
        return driver.findElement(CHECKBOX).isDisplayed();
    }

    public String getCheckboxMessageText() {
        return driver.findElement(CHECKBOX_EXAMPLE_MESSAGE_TEXT).getText();
    }

    public void clickAddButton() {
        driver.findElement(ADD_BUTTON).click();
    }

    public void clickRemoveButton() {
        driver.findElement(REMOVE_BUTTON).click();
    }

    public boolean isInputFieldEnabled() {
        return driver.findElement(INPUT_FIELD).isEnabled();
    }

    public void waitUntilInputFieldEnabled() {
        wait.until(ExpectedConditions.elementToBeClickable(INPUT_FIELD));
    }

    public void clickEnableButton() {
        driver.findElement(ENABLE_BUTTON).click();
    }

    public void clickDisableButton() {
        driver.findElement(DISABLE_BUTTON).click();
    }

    public String getInputMessageText() {
        return driver.findElement(INPUT_EXAMPLE_MESSAGE_TEXT).getText();
    }

}
