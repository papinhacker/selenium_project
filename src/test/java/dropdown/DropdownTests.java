package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOption();
        Assertions.assertEquals(selectedOptions.size(), 1, "incorrect number of selections");
        Assertions.assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
