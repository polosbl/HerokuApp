package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void selectFirstOption() {
        dropdownPage.openPage(DROPDOWN_PAGE_URL);
        dropdownPage.selectOption("Option 1");
        Assert.assertTrue(dropdownPage.isOptionSelected("Option 1"), "Option is not selected");
    }

    @Test
    public void selectSecondOption() {
        dropdownPage.openPage(DROPDOWN_PAGE_URL);
        dropdownPage.selectOption("Option 2");
        Assert.assertTrue(dropdownPage.isOptionSelected("Option 2"), "Option is not selected");
    }
}
