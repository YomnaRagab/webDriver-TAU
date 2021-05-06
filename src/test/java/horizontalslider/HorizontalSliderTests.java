package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    void testHorizontalSlider(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveTheSlider(2);
        assertEquals(horizontalSliderPage.getSliderValue(),"2");
    }
}
