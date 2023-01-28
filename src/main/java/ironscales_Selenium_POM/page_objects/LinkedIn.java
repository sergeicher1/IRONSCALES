package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedIn {


    @FindBy(xpath = "//section/button[@aria-label='Dismiss']")
    private WebElement close_popup;

    public WebElement GetClosePopup() {
        return close_popup;
    }
}
