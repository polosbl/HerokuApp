package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest implements ITestConstants {
    WebDriver driver;
    AddRemoveElementsPage addRemoveElementsPage;
    CheckboxesPage checkboxesPage;
    DropdownPage dropdownPage;
    HoverPage hoverPage;
    InputPage inputPage;
    TyposPage typosPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        initPages();
    }

    @AfterMethod
    public void endTest() {
        driver.quit();
    }

    public void initPages() {
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        checkboxesPage = new CheckboxesPage(driver);
        dropdownPage = new DropdownPage(driver);
        hoverPage = new HoverPage(driver);
        inputPage = new InputPage(driver);
        typosPage = new TyposPage(driver);
    }
}
