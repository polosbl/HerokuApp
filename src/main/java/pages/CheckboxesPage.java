package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEEDED_CHECKBOX = "//*[@id='checkboxes']/*[@type='checkbox'][%s]";

    public void clickOnCheckbox(String neededCheckbox) {
        driver.findElement(By.xpath(String.format(NEEDED_CHECKBOX,neededCheckbox))).click();
    }

    public boolean isNeededChckboxSelected(String neededCheckbox) {
        return driver.findElement(By.xpath(String.format(NEEDED_CHECKBOX,neededCheckbox))).isSelected();
    }

}
