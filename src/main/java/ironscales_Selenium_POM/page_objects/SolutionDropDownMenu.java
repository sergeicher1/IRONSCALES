package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SolutionDropDownMenu {

    // Solution overview element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Solution Overview']")
    private WebElement solution_overview;

    public WebElement GetSolutionOverview() {
        return solution_overview;
    }

    // By plan element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='By Plan']")
    private WebElement by_plan;

    public WebElement GetByPlan() {
        return by_plan;
    }

    // By use case element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='By Use Case']")
    private WebElement by_use_case;

    public WebElement GetByUseCase() {
        return by_use_case;
    }

    // By platform element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='By Platform']")
    private WebElement by_platform;

    public WebElement GetByPlatform() {
        return by_platform;
    }

    // By company size element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='By Company Size']")
    private WebElement by_company_size;

    public WebElement GetByCompanySize() {
        return by_company_size;
    }

    // Tech integrations element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Technology Integrations']")
    private WebElement tech_integ;

    public WebElement GetTechInteg() {
        return tech_integ;
    }
}
