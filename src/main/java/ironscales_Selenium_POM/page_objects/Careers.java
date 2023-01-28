package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers {


    // Job openings element
    @FindBy(xpath = "//a[text()='Job Openings']")
    private WebElement job_openings;

    public WebElement GetJobOpenings() {
        return job_openings;
    }
}
