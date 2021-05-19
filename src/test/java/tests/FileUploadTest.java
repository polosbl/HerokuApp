package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void uploadFileTest() {
        fileUploadPage.openPage(FILE_UPLOAD_PAGE_URL);
        fileUploadPage.uploadFile();
        fileUploadPage.clickUploadButton();
        Assert.assertEquals(fileUploadPage.getUploadedFileName(),"Aang");
    }
}
