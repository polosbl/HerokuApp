package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckboxesTest {

    @Test
    public void firstCheckboxIsUncheckedTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/*[@type='checkbox'][1]"));
        Assert.assertTrue(!checkbox.isSelected(),"First checkbox is checked");
        driver.quit();
    }

    @Test
    public void checkFirstCheckboxTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/*[@type='checkbox'][1]"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected(),"First checkbox is unchecked");
        driver.quit();
    }

    @Test
    public void secondCheckboxIsCheckedTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/*[@type='checkbox'][2]"));
        Assert.assertTrue(checkbox.isSelected(),"Second checkbox is unchecked");
        driver.quit();
    }

    @Test
    public void uncheckSecondCheckboxTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkboxes']/*[@type='checkbox'][2]"));
        checkbox.click();
        Assert.assertTrue(!checkbox.isSelected(),"First checkbox is checked");
        driver.quit();
    }
}
