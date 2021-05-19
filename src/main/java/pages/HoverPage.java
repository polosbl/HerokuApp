package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HoverPage extends BasePage {
    public HoverPage(WebDriver driver) {
        super(driver);
    }

    private static final String AVATAR = "//*[@id='content']/div/div[%s]/img";
    private static final String USERNAME = "//*[@id='content']/div/div[%s]/div/h5";
    private static final String USER_URL = "//*[@id='content']/div/div[%s]/div/a";

    public void hoverOverElement(String elementNumber) {
        WebElement avatar = driver.findElement(By.xpath(String.format(AVATAR,elementNumber)));
        Actions actions = new Actions(driver);
        actions.moveToElement(avatar).perform();
    }

    public String getUsername(String elementNumber) {
        hoverOverElement(elementNumber);
        return driver.findElement(By.xpath(String.format(USERNAME,elementNumber))).getText();
    }

    public int getResponseCodeOfUserPage(String elementNumber) throws IOException {
        driver.findElement(By.xpath(String.format(USER_URL,elementNumber))).click();
        String currentUrl = driver.getCurrentUrl();
        HttpURLConnection connection = (HttpURLConnection) new URL(currentUrl).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        return connection.getResponseCode();
    }
}
