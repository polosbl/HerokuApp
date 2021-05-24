package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputPage extends BasePage {
    public InputPage(WebDriver driver) {
        super(driver);
    }

    private static final By NUMBER_INPUT_FIELD = By.xpath("//*[@type='number']");

    public void typeTextIntoField(String text) {
        driver.findElement(NUMBER_INPUT_FIELD).sendKeys(text);
    }

    public String getTextFromField() {
        return driver.findElement(NUMBER_INPUT_FIELD).getAttribute("value");
    }

    public void increaseIntegerInNumberField() {
        driver.findElement(NUMBER_INPUT_FIELD).sendKeys(Keys.ARROW_UP);
    }

    public void decreaseIntegerInNumberField() {
        driver.findElement(NUMBER_INPUT_FIELD).sendKeys(Keys.ARROW_DOWN);
    }
}
