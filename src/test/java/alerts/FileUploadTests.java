package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.uploadFile("C:\\Users\\h\\IdeaProjects\\automationproject\\resources\\chromedriver.exe");
        Assertions.assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
