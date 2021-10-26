package images;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ImagesTest extends BaseTests {

    @Test
    @Tag("smoke")
    @DisplayName("Test Case 16457")
    public void testPresenceOfFirstImage(){
        boolean presenceOfFirstImage = homePage.clickBrokenImages().checkVisibilityOfFirstImage();
        Assertions.assertTrue(presenceOfFirstImage, "First image is not displayed");
    }

    @Test
    @Tag("smoke")
    @DisplayName("Test Case 16457-3")
    public void testPresenceOfThirdImage(){
        boolean presenceOfFirstImage = homePage.clickBrokenImages().checkVisibilityOfThirdImage();
        Assertions.assertTrue(presenceOfFirstImage, "Third image is not displayed");
    }
}
