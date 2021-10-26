package elements;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTest extends BaseTests {

    @Test
    public void testAddingElement(){
        var addDeleteElementPage = homePage.clickAddRemoveElements();
        addDeleteElementPage.clickAddElementButton();
        String text = addDeleteElementPage.getAddElementButtonText();
        Assertions.assertEquals(text, "Add Element", "Button text is incorrect");
    }

    @Test
    @Disabled
    public void testDeletingElement(){
        var addDeleteElementPage = homePage.clickAddRemoveElements();
        addDeleteElementPage.clickAddElementButton();
        addDeleteElementPage.clickDeleteButton();
        String text = addDeleteElementPage.getDeleteButtonText();
        Assertions.assertEquals(text, "Delete", "Button text is incorrect");
    }
}
