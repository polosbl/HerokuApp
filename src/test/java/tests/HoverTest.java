package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class HoverTest extends BaseTest {

    @Test
    public void checkFirstUsername() {
        hoverPage.openPage(HOVER_PAGE_URL);
        hoverPage.hoverOverElement("1");
        Assert.assertEquals(hoverPage.getUsername("1"), "name: user1");
    }

    @Test
    public void checkResponseCodeOfFirstUserPage() throws IOException {
        hoverPage.openPage(HOVER_PAGE_URL);
        hoverPage.hoverOverElement("1");
        hoverPage.getResponseCodeOfUserPage("1");
        Assert.assertEquals(hoverPage.getResponseCodeOfUserPage("1"), 200,
                "Response code is incorrect");
    }

    @Test
    public void checkSecondUsername() {
        hoverPage.openPage(HOVER_PAGE_URL);
        hoverPage.hoverOverElement("2");
        Assert.assertEquals(hoverPage.getUsername("2"), "name: user2");
    }

    @Test
    public void checkResponseCodeOfSecondUserPage() throws IOException {
        hoverPage.openPage(HOVER_PAGE_URL);
        hoverPage.hoverOverElement("2");
        hoverPage.getResponseCodeOfUserPage("2");
        Assert.assertEquals(hoverPage.getResponseCodeOfUserPage("2"), 200,
                "Response code is incorrect");
    }
}
