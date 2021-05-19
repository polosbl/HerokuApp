package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsTest extends BaseTest{

    @Test
    public void addElementsTest() {
        addRemoveElementsPage.openPage(ADD_REMOVE_ELEMENTS_PAGE_URL);
        addRemoveElementsPage.addElement();
        Assert.assertTrue(addRemoveElementsPage.isNthElementDisplayed("1"),
                    "Button is not displayed");
    }

    @Test
    public void deleteElementTest() {
        addRemoveElementsPage.openPage(ADD_REMOVE_ELEMENTS_PAGE_URL);
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        int numberOfElementsBefore = addRemoveElementsPage.countAllElements();
        addRemoveElementsPage.deleteNthButton("3");
        int numberOfElementsAfter = addRemoveElementsPage.countAllElements();
        Assert.assertTrue(numberOfElementsAfter == numberOfElementsBefore - 1,
                "Incorrect number of elements");
    }
}
