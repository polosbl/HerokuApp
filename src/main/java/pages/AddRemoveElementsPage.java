package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage extends BasePage {

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    private static final By ADD_ELEMENT_BUTTON = By.xpath("//button[text()='Add Element']");
    private static final String DELETE_ELEMENT_BUTTON = "//*[@id='elements']/*[%s]";
    private static final By ALL_DELETE_ELEMENT_BUTTONS = By.xpath("//*[@id='elements']/*[@onclick='deleteElement()']");

    public void addElement() {
        driver.findElement(ADD_ELEMENT_BUTTON).click();
    }

    public void deleteNthButton(String buttonNumber) {
        driver.findElement(By.xpath(String.format(DELETE_ELEMENT_BUTTON, buttonNumber))).click();
    }

    public int countAllElements() {
        return driver.findElements(ALL_DELETE_ELEMENT_BUTTONS).size();
    }

    public boolean isNthElementDisplayed(String buttonNumber) {
        return driver.findElement(By.xpath(String.format(DELETE_ELEMENT_BUTTON, buttonNumber))).isDisplayed();
    }


}
