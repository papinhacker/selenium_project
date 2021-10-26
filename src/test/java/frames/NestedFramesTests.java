package frames;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        var nestedFramesPage = homePage.clickNestedFramesPage();
        Assertions.assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        Assertions.assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");

    }
}
