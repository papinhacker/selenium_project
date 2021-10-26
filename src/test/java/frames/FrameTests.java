package frames;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygPage = homePage.clickWYSIWYGEditorPage();
        wysiwygPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world";

        wysiwygPage.setTextArea(text1);
        wysiwygPage.decreaseIndention();
        wysiwygPage.setTextArea(text2);

        Assertions.assertEquals(wysiwygPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
}
