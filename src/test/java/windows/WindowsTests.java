package windows;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WindowsTests extends BaseTests {

    @Test
    public void testWindowTabs(){
        var loadingPageInNewTab = homePage.clickDynamicLoading().clickToOpenInNewTabExample2();
        getWindowManager().switchToNewTab();
        loadingPageInNewTab.clickStartButton();
        Assertions.assertEquals(loadingPageInNewTab.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
