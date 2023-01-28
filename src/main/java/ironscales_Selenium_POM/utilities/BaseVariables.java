package ironscales_Selenium_POM.utilities;

import ironscales_Selenium_POM.page_objects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class BaseVariables {


    // Web

    protected static Actions actions;
    protected static WebDriver driver;
    protected static SoftAssert soft_assert;


    // Page Objects - NavBar
    protected static NavBar nav_bar;
    protected static SolutionDropDownMenu sol_dropdown;
    protected static SolutionByPlan sol_by_plan;
    protected static CompanyDropDownMenu comp_dropdown;

    // Page Objects - Career page
    protected static Careers careers;

    // Page Objects - Recruiting page
    protected static Recruiting recruiting;

    // Page Objects - QAAutomation page
    protected static QAAutomation qa_automation;

    // Page Objects - MainPage page
    protected static MainPage main_page;

    // Page Objects - LinkedIn page
    protected static LinkedIn linked_in;
}
