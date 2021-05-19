package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver,10);
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private static final By IFRAME = By.xpath("//*[@id='mce_0_ifr']");
    private static final By IFRAME_INPUT_FIELD = By.xpath("//*[@data-id='mce_0']");

    public void switchToIFrame() {
        WebElement frame = driver.findElement(IFRAME);
        driver.switchTo().frame(frame);
    }

    public void typeIntoFrame(String text) {
        switchToIFrame();
        driver.findElement(IFRAME_INPUT_FIELD).sendKeys(text);
    }

    public void waitUntilIFrameIsVisiable() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(IFRAME)));
    }

    public String getTextFromIFrame() {
        switchToIFrame();
        return driver.findElement(IFRAME_INPUT_FIELD).getText();
    }
}
