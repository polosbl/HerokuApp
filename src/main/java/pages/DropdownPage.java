package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    private static final By DROPDOWN = By.id("dropdown");
    private static final String OPTION_BY_TEXT = "//*[contains(text(),'%s')]";

    public void selectOption(String option) {
        Select select = new Select(driver.findElement(DROPDOWN));
        select.selectByVisibleText(option);
    }

    public boolean isOptionSelected(String option) {
        return driver.findElement(By.xpath(String.format(OPTION_BY_TEXT,option))).isSelected();
    }
}
