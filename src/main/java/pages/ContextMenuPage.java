package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    private Actions actions = new Actions(driver);

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private static final By ELEMENT_TO_CLICK = By.xpath("//*[@id='hot-spot']");

    public void rightClickOnElement() {
        actions.contextClick(driver.findElement(ELEMENT_TO_CLICK)).perform();
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public void closeAlert() {
        driver.switchTo().alert().accept();
    }

    public boolean isAlertPresent() {
        try
        {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException Ex)
        {
            return false;
        }
    }
}
