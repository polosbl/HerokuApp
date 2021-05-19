package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void rightClickOnPageTest() {
        contextMenuPage.openPage(CONTEXT_MENU_PAGE_URL);
        contextMenuPage.rightClickOnElement();
        Assert.assertEquals(contextMenuPage.getTextFromAlert(),"You selected a context menu");
    }

    @Test
    public void closeAlertTest() {
        contextMenuPage.openPage(CONTEXT_MENU_PAGE_URL);
        contextMenuPage.rightClickOnElement();
        contextMenuPage.closeAlert();
        Assert.assertFalse(contextMenuPage.isAlertPresent(), "Allert is displayed");
    }
}
