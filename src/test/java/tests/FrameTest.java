package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void checkIFrameDefaultTextTest() {
        framesPage.openPage(IFRAME_PAGE_URL);
        framesPage.waitUntilIFrameIsVisible();
        Assert.assertEquals(framesPage.getTextFromIFrame(), IFRAME_DEFAULT_TEXT);
    }

    @Test
    public void typeTextIntoFrameTest() {
        framesPage.openPage(IFRAME_PAGE_URL);
        framesPage.waitUntilIFrameIsVisible();
        framesPage.typeIntoFrame("123");
        Assert.assertEquals(framesPage.getTextFromIFrame(), IFRAME_DEFAULT_TEXT + "123");
    }
}
