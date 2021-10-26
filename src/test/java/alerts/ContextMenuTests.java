package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage =  homePage.clickContextMenuPage();
        contextMenuPage.rightClickToBox();
        String message = contextMenuPage.getAlertText();
        contextMenuPage.acceptAlert();
        Assertions.assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
