package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.ArrayList;
import java.util.List;

public class SolutionByPlan {

    // All elements saved to list
    @FindBy(xpath = "//*[@id=\"navbar_global\"]/div/ul[1]/li[1]/ul/li[2]/ul/li/a")
    private List<WebElement> all_elements;

    public List<WebElement> GetAllElements() {
        return all_elements;
    }


}
