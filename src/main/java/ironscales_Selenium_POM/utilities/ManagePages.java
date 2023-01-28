package ironscales_Selenium_POM.utilities;

import ironscales_Selenium_POM.page_objects.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends BaseVariables {
    public static void InitWebPages() {

        nav_bar = PageFactory.initElements(driver, NavBar.class);
        sol_dropdown = PageFactory.initElements(driver, SolutionDropDownMenu.class);
        sol_by_plan = PageFactory.initElements(driver, SolutionByPlan.class);
        comp_dropdown = PageFactory.initElements(driver, CompanyDropDownMenu.class);
        careers = PageFactory.initElements(driver, Careers.class);
        recruiting = PageFactory.initElements(driver, Recruiting.class);
        qa_automation = PageFactory.initElements(driver, QAAutomation.class);
        main_page = PageFactory.initElements(driver, MainPage.class);
        linked_in = PageFactory.initElements(driver, LinkedIn.class);
    }
}
