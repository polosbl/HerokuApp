package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HoverTest {

    @Test
    public void hoverOnFirstProfileTest() throws IOException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement avatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));

        Actions actions = new Actions(driver);
        actions.moveToElement(avatar).perform();
        WebElement username = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        String text = username.getText();
        Assert.assertEquals(text, "name: user1");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).click();
        String currentUrl = driver.getCurrentUrl();
        HttpURLConnection connection = (HttpURLConnection) new URL(currentUrl).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        Assert.assertEquals(responseCode, 200, "Response code is incorrect");
        driver.quit();
    }

    @Test
    public void hoverOnSecondProfileTest() throws IOException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement avatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));

        Actions actions = new Actions(driver);
        actions.moveToElement(avatar).perform();
        WebElement username = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        String text = username.getText();
        Assert.assertEquals(text, "name: user2");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/a")).click();
        String currentUrl = driver.getCurrentUrl();
        HttpURLConnection connection = (HttpURLConnection) new URL(currentUrl).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        Assert.assertEquals(responseCode, 200, "Response code is incorrect");
        driver.quit();
    }

    @Test
    public void hoverOnThirdProfileTest() throws IOException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement avatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));

        Actions actions = new Actions(driver);
        actions.moveToElement(avatar).perform();
        WebElement username = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));
        String text = username.getText();
        Assert.assertEquals(text, "name: user3");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/a")).click();
        String currentUrl = driver.getCurrentUrl();
        HttpURLConnection connection = (HttpURLConnection) new URL(currentUrl).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        Assert.assertEquals(responseCode, 200, "Response code is incorrect");
        driver.quit();
    }
}
