package javascript;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);

        var selectedOptions = dropdownPage.getSelectedOption();
        Assertions.assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not to selected");
        Assertions.assertEquals(selectedOptions.size(),optionsToSelect.size(), "Number of selected items");
    }
}
