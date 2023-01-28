/*
------------------------------------------------------------------------------------------------
-- coding                                   | utf-8
-- Author                                   | Sergei Chernyahovsky
-- Site                                     | http://sergeicher.pro/
-- Favorite Quote                           | “Always code as if the guy who ends up
                                                maintaining your code will be a violent
                                                    psychopath who knows where you live”
-- Language                                 | Java
-- WebDriver                                | Selenium
-- Site under test                          | https://ironscales.com/
-- Description                              | QA automation Junior position test - Selenium
-- Execution:
--
-- Generate Allure report:
-- in terminal navigate to main folder and RUN: allure serve allure-results
------------------------------------------------------------------------------------------------
 */

package test_cases;


import io.qameta.allure.Description;
import ironscales_Selenium_POM.utilities.CommonOperations;
import ironscales_Selenium_POM.workflows.workflows;
import org.testng.annotations.Test;

public class TestCases extends CommonOperations {


    @Test(description = "Test Case 01")
    @Description("Test Case 01 verifies presence of 3 elements")
    public void testCase01() {
        workflows.VerifyPresenceOfElements();
    }

    @Test(description = "Test Case 02")
    @Description("Test Case 02 Validate year of experience bigger than 1y")
    public void testCase02() {
        workflows.ValidateYearOfExperience();
    }
    @Test(description = "Test Case 03")
    @Description("Test Case 03 Validate that we have 5 icons for social media and validate the type of them")
    public void testCase03() throws InterruptedException {
        workflows.ScrollDownAndValidatePresenceOfElements();
    }

    @Test(description = "Test Case 04")
    @Description("Test Case 04 Validate that all 5 social links open the relevant page")
    public void testCase04() throws InterruptedException {
        workflows.ValidateSocialLinks();
    }
}
