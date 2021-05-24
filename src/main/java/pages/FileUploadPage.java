package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver,10);
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    private static final By UPLOAD_BUTTON = By.xpath("//*[@id='file-submit']");
    private static final By FILE_INPUT_FIELD = By.xpath("//*[@id='file-upload']");
    private static final By UPLOADED_FILE_NAME = By.xpath("//*[@id='uploaded-files']");

    public void uploadFile(String pathToFile) {
        driver.findElement(FILE_INPUT_FIELD).sendKeys(pathToFile);
    }

    public void clickUploadButton() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String getUploadedFileName() {
        return driver.findElement(UPLOADED_FILE_NAME).getText();
    }
}
