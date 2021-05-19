package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TyposTest extends BaseTest{

    @Test
    public void typoTest() {
        typosPage.openPage(TYPOS_PAGE_URL);
        Assert.assertEquals(typosPage.getTextFromParagraph("2"),
                "Sometimes you'll see a typo, other times you won't.");
    }
}
