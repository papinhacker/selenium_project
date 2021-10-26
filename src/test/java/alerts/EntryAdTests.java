package alerts;

import base.BaseTests;
import org.junit.jupiter.api.Test;

public class EntryAdTests extends BaseTests {

    @Test
    public void testModalWindow(){
        var adEntryPage = homePage.clickEntryAdPage();
        adEntryPage.clickCloseButton();
    }
}
