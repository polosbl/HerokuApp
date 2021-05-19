package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void checkIFrmaeDefaultTextTest() {
        framesPage.openPage(IFRAME_PAGE_URL);
        framesPage.waitUntilIFrameIsVisiable();
        Assert.assertEquals(framesPage.getTextFromIFrame(),IFRMAE_DEFAULT_TEXT);
    }

    @Test
    public void typeTextIntoFrameTest() {
        framesPage.openPage(IFRAME_PAGE_URL);
        framesPage.waitUntilIFrameIsVisiable();
        framesPage.typeIntoFrame("123");
        Assert.assertEquals(framesPage.getTextFromIFrame(),IFRMAE_DEFAULT_TEXT + "123");
    }
}
