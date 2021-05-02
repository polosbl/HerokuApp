package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InputsTest {

    @Test
    public void inputIntegerTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        int randomNumber = (int) (Math.random() * 1000);
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys(Integer.toString(randomNumber));
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText,Integer.toString(randomNumber));
        driver.quit();
    }

    @Test
    public void increaseIntegerTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        int randomNumber = (int) (Math.random() * 1000);
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys(Integer.toString(randomNumber));
        inputField.sendKeys(Keys.ARROW_UP);
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, Integer.toString(randomNumber + 1));
        driver.quit();
    }

    @Test
    public void decreaseIntegerTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        int randomNumber = (int) (Math.random() * 1000);
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys(Integer.toString(randomNumber));
        inputField.sendKeys(Keys.ARROW_DOWN);
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, Integer.toString(randomNumber - 1));
        driver.quit();
    }

    @Test
    public void inputTextTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys("Test text");
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, "Test text");
        driver.quit();
    }
}
