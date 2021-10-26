package slider;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SliderTests extends BaseTests {

    @Test
    public void testSliderWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        Assertions.assertEquals(sliderPage.getSliderValue(), "4", "Slider value is incorrect");
    }
}
