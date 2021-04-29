package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HerokuAppTest {

    @Test
    public void herokuAppTestInputs() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputField = driver.findElement(By.xpath("//*[@type='number']"));
        inputField.sendKeys("243");
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText,"243");
        inputField.sendKeys(Keys.ARROW_UP);
        actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, "244");
        driver.quit();
    }

    // По домашке:
    // как проверить, что кнопка появилась:
    // boolean isDeleteButtonDisplayed
    // Assert.assertTrue

    // Чем больше тестов, тем лучше. Одна проверка на тест

    // Дропдауны:
    // Select select = new Select(driver.findElement(By.id("dropdown")));
    // select.selectByVisibleText("Option 1");
    // String text = select.getFirstSelectedOption();
    // Assert.assertEquals(text, "Option 1");
}