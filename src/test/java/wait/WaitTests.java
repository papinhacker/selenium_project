package wait;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        Assertions.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");

    }

    @Test
    public void testWaitUntilRendered(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        Assertions.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
