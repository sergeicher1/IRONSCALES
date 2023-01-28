package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recruiting {


    // QA automation element
    @FindBy(xpath = "//h3/a[text()='QA Automation Engineer']")
    private WebElement qa_automation;

    public WebElement GetQAAutomation() {
        return qa_automation;
    }
}
