package hover;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        Assertions.assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assertions.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assertions.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        Assertions.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");

    }
}
