package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QAAutomation {


    // Year of experience element
    @FindBy(xpath = "//*[@id='opportunityDetailView']/div[2]/div/div/div/div[2]/div[1]/div[3]/p/ul[2]/li[2]")
    private WebElement year_of_experience;

    public WebElement GetYearOfExperience() {
        return year_of_experience;
    }
}
