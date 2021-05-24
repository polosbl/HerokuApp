package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {
    public TyposPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEEDED_PARAGRAPH = "//*[@class='example']/p[%s]";

    public String getTextFromParagraph (String numberOfParagraph) {
        return driver.findElement(By.xpath(String.format(NEEDED_PARAGRAPH,numberOfParagraph))).getText();
    }
}
