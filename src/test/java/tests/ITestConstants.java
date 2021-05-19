package tests;

import org.openqa.selenium.By;

public interface ITestConstants {
    String ADD_REMOVE_ELEMENTS_PAGE_URL = "http://the-internet.herokuapp.com/add_remove_elements/";
    String CHECKBOXES_PAGE_URL = "http://the-internet.herokuapp.com/checkboxes";
    String DROPDOWN_PAGE_URL = "http://the-internet.herokuapp.com/dropdown";
    String HOVER_PAGE_URL = "http://the-internet.herokuapp.com/hovers";
    String INPUT_PAGE_URL = "http://the-internet.herokuapp.com/inputs";
    String TYPOS_PAGE_URL = "http://the-internet.herokuapp.com/typos";
    String CONTEXT_MENU_PAGE_URL = "http://the-internet.herokuapp.com/context_menu";
    String DYNAMIC_CONTROLS_PAGE_URL = "http://the-internet.herokuapp.com/dynamic_controls";
    String FILE_UPLOAD_PAGE_URL = "http://the-internet.herokuapp.com/upload";
    String IFRAME_PAGE_URL = "http://the-internet.herokuapp.com/iframe";

    By DYNAMIC_CHECKBOX = By.xpath("//*[@id='checkbox']");
    String IFRMAE_DEFAULT_TEXT = "Your content goes here.";
}
