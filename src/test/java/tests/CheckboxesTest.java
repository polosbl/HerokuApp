package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test
    public void firstCheckboxIsUncheckedTest() {
        checkboxesPage.openPage(CHECKBOXES_PAGE_URL);
        Assert.assertFalse(checkboxesPage.isNeededCheckboxSelected("1"),"First checkbox is checked");
    }

    @Test
    public void checkFirstCheckboxTest() {
        checkboxesPage.openPage(CHECKBOXES_PAGE_URL);
        checkboxesPage.clickOnCheckbox("1");
        Assert.assertTrue(checkboxesPage.isNeededCheckboxSelected("1"),"First checkbox is unchecked");
    }

    @Test
    public void secondCheckboxIsCheckedTest() {
        checkboxesPage.openPage(CHECKBOXES_PAGE_URL);
        Assert.assertTrue(checkboxesPage.isNeededCheckboxSelected("2"),"Second checkbox is unchecked");
    }

    @Test
    public void uncheckSecondCheckboxTest() {
        checkboxesPage.openPage(CHECKBOXES_PAGE_URL);
        checkboxesPage.clickOnCheckbox("2");
        Assert.assertFalse(checkboxesPage.isNeededCheckboxSelected("2"),"Second checkbox is checked");
    }
}
