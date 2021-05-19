package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class htmlPageTest {

    //TODO: Rework using POM

    @Test
    public void checkParagraphTextTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///home/aleksandr/IdeaProjects/HerokuApp/src/test/resources/testpage.html");
        WebElement paragraph = driver.findElement(By.xpath("//*[@data-qa='p1']"));
        String paragrraphText = paragraph.getText();
        Assert.assertEquals(paragrraphText,"Hello World!");
        driver.quit();
    }

    @Test
    public void buttonIsDisabledTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///home/aleksandr/IdeaProjects/HerokuApp/src/test/resources/testpage.html");
        WebElement button = driver.findElement(By.xpath("//*[@data-qa='submit_button']"));
        Assert.assertTrue(!button.isEnabled());
        driver.quit();
    }

    @Test
    public void checkboxIsUncheckedTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///home/aleksandr/IdeaProjects/HerokuApp/src/test/resources/testpage.html");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='1']"));
        Assert.assertTrue(!checkbox.isSelected());
        driver.quit();
    }

    @Test
    public void inputFieldTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("file:///home/aleksandr/IdeaProjects/HerokuApp/src/test/resources/testpage.html");
        int randomNumber = (int) (Math.random() * 1000);
        WebElement inputField = driver.findElement(By.xpath("//*[@id='2']"));
        inputField.sendKeys(Integer.toString(randomNumber));
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, Integer.toString(randomNumber));
        driver.quit();
    }
}
