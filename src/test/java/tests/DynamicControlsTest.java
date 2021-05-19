package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void isCheckboxDisplayedByDefaultTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        Assert.assertTrue(dynamicControlsPage.isCheckboxDisplayed(),"Checkbox is not displayed");
    }

    @Test
    public void removeCheckboxMessageTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitUntilCheckboxInvisibility();
        Assert.assertEquals(dynamicControlsPage.getCheckboxMessageText(),"It's gone!");
    }

    @Test
    public void removeCheckboxTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitUntilCheckboxInvisibility();
        Assert.assertTrue(dynamicControlsPage.isCheckboxInvisiable());
    }

    @Test
    public void addCheckboxMessageTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitUntilCheckboxInvisibility();
        dynamicControlsPage.clickAddButton();
        dynamicControlsPage.waitUntilCheckboxVisibility();
        Assert.assertEquals(dynamicControlsPage.getCheckboxMessageText(),"It's back!");
    }

    @Test
    public void addCheckboxTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitUntilCheckboxInvisibility();
        dynamicControlsPage.clickAddButton();
        dynamicControlsPage.waitUntilCheckboxVisibility();
        Assert.assertFalse(dynamicControlsPage.isCheckboxInvisiable());
    }

    @Test
    public void isInputFieldDisabledByDefaultTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        Assert.assertFalse(dynamicControlsPage.isInputFieldEnabled());
    }

    @Test
    public void enableInputFieldTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickEnableButton();
        dynamicControlsPage.waitUntilInputFieldEnabled();
        Assert.assertTrue(dynamicControlsPage.isInputFieldEnabled());
    }

    @Test
    public void checkEnabledInputMessageTextTest() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.clickEnableButton();
        dynamicControlsPage.waitUntilInputFieldEnabled();
        Assert.assertEquals(dynamicControlsPage.getInputMessageText(),"It's enabled!");
    }

//    TODO: Implement method
//    @Test
//    public void checkDisabledInputMessageTextTest() {
//        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
//        dynamicControlsPage.clickEnableButton();
//        dynamicControlsPage.waitUntilInputFieldEnabled();
//        dynamicControlsPage.clickDisableButton();
//        dynamicControlsPage.waitUntilInputFieldDisabled();
//        Assert.assertEquals(dynamicControlsPage.getInputMessageText(),"It's disabled!");
//    }
}
