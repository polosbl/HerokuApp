package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void inputIntegerTest() {
        inputPage.openPage(INPUT_PAGE_URL);
        String randomNumber = inputPage.convertIntegerToString(inputPage.generateRandomInteger());
        inputPage.typeTextIntoField(randomNumber);
        Assert.assertEquals(inputPage.getTextFromField(),randomNumber);
    }

    @Test
    public void increaseIntegerTest() {
        inputPage.openPage(INPUT_PAGE_URL);
        int randomNumber = inputPage.generateRandomInteger();
        inputPage.typeTextIntoField(inputPage.convertIntegerToString(randomNumber));
        inputPage.increaseIntegerInNumberField();
        Assert.assertEquals(inputPage.getTextFromField(),inputPage.convertIntegerToString(++randomNumber));
    }

    @Test
    public void decreaseIntegerTest() {
        inputPage.openPage(INPUT_PAGE_URL);
        int randomNumber = inputPage.generateRandomInteger();
        inputPage.typeTextIntoField(inputPage.convertIntegerToString(randomNumber));
        inputPage.decreaseIntegerInNumberField();
        Assert.assertEquals(inputPage.getTextFromField(),inputPage.convertIntegerToString(--randomNumber));
    }

    @Test
    public void inputTextTest() {
        inputPage.openPage(INPUT_PAGE_URL);
        inputPage.typeTextIntoField("Test text");
        Assert.assertEquals(inputPage.getTextFromField(),"Test text");
    }
}
