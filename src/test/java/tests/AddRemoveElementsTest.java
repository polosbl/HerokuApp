package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddRemoveElementsTest {

    @Test
    public void AddElementsTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        WebElement deleteButton;
        boolean isDeleteButtonDisplayed;
        for (int i = 1; i <= 2;i++) {
            addElementButton.click();
            deleteButton = driver.findElement(By.xpath("//*[@id='elements']/*[" + i + "]" ));
            isDeleteButtonDisplayed = deleteButton.isDisplayed();
            Assert.assertTrue(isDeleteButtonDisplayed, "Button " + i + " is not displayed");
        }
        driver.quit();
    }

    @Test
    public void deleteElementTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        WebElement deleteButton;
        List<WebElement> countElements;
        for (int i = 1; i <= 3;i++) {
            addElementButton.click();
        }
        countElements = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int numberOfElementsBefore = countElements.size();

        deleteButton = driver.findElement(By.xpath("//*[@id='elements']/*[3]" ));
        deleteButton.click();
        countElements = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int numberOfElementsAfter = countElements.size();

        Assert.assertTrue(numberOfElementsAfter < numberOfElementsBefore,
                "Incorrect number of elements");
        driver.quit();
    }
}
