package ironscales_Selenium_POM.workflows;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import ironscales_Selenium_POM.utilities.CommonOperations;
import ironscales_Selenium_POM.utilities.Helpers;
import ironscales_Selenium_POM.utilities.UIActions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class workflows extends CommonOperations {

    // Question number 1. On the 'solution' tab go to 'by plan'
    // Validate: there are 3 options called 'starter', 'email protect', and 'complete protect'.
//    Allure.step("Question 1 verify presence of 3 elements")
    public static void VerifyPresenceOfElements() {
        Allure.step("Question 1 verify presence of 3 elements");

        // Mouse hover elements in dropdown till by plan is open
        UIActions.MouseHoverTwoEls(nav_bar.GetSolution(), sol_dropdown.GetByPlan());

        // Expected elements
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Starter™", "Email Protect™", "Complete Protect™"));

        // Save elements to ArrayList
        ArrayList<String> links = new ArrayList<>();
        for (WebElement actualLink : sol_by_plan.GetAllElements()) {
            String elementText = actualLink.getText();
            links.add(elementText);
        }

        for (int i = 0; i < links.size(); i++) {
            Assert.assertEquals(links.get(i), expected.get(i), "The text doesn't match: ");
        }
    }


    // Question 2. Go to the 'Company' tab then go to careers open job opportunities and look
    // for the QA automation position, open the position
    // Validate: that year of experience is bigger than 1y.
//    @Step("Question 2 Validate that year of experience is bigger than 1y")
    public static void ValidateYearOfExperience() {
        Allure.step("Question 2 Validate that year of experience is bigger than 1y");
        // Mouse hover and click careers link
        UIActions.MouseHover(nav_bar.GetCompany());
        UIActions.MouseHoverAndClick(comp_dropdown.GetCareers());
        UIActions.MouseHoverAndClick(careers.GetJobOpenings());
        UIActions.Click(recruiting.GetQAAutomation());
        String text = Arrays.toString(qa_automation.GetYearOfExperience().getText().split(" year of experience", 2));
        // Casting
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        int i = Integer.parseInt(String.valueOf(sb));
        System.out.println(i);
        Assert.assertTrue(i > 1);
    }


    // Question 3. On the main screen, scroll down until the end of the page
    // Validate 1: we have 5 icons for social media and validate the type:
    // FB, YouTube, LinkedIn, Instagram, and tweeter

    //    @Step("Question 3.1 Validate that we have 5 icons for social media and validate the type of them")
    public static void ScrollDownAndValidatePresenceOfElements() throws InterruptedException {
        Allure.step("Question 3.1 Validate that we have 5 icons for social media and validate the type of them");
        // Expected text of icons
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("LinkedIn In1_layer", "YouTube2_layer", "Twitter3_layer", "Facebook F4_layer", "Instagram5_layer"));

        // Scroll down to footer
        Helpers.ScrollToFooter();

        // Find id of social links and add it to the array
        ArrayList<String> actual_attr = new ArrayList<>();
        for (WebElement socialLink : main_page.GetSocialMediaIcons()) {
            String typeValue = socialLink.getAttribute("id");
            actual_attr.add(typeValue);
        }
        for (int i = 0; i < actual_attr.size(); i++) {
            Assert.assertEquals(actual_attr.get(i), expected.get(i), "The text of icons don't match: ");
        }
    }

    // Validate 2: Each of the link open relevant page
//    @Step("Question 3.2 Validate all 5 social links open relevant page")
    public static void ValidateSocialLinks() throws InterruptedException {
        Allure.step("Question 3.2 Validate all 5 social links open relevant page");
        // Scroll down to footer
        Helpers.ScrollToFooter();

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();


        // LinkedIn
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        //Click the link which opens in a new window
        UIActions.MouseHoverAndClick(main_page.GetSocialMediaLinks().get(0));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        UIActions.Click(linked_in.GetClosePopup());

        // Expected url
        String expected_linkedin_url = "https://www.linkedin.com/company/ironscales/";
        soft_assert.assertEquals(driver.getCurrentUrl(), expected_linkedin_url, "URL don't match: ");

        //Switch back to the old tab or window
        driver.close();
        driver.switchTo().window(originalWindow);


        // YouTube
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        //Click the link which opens in a new window
        UIActions.MouseHoverAndClick(main_page.GetSocialMediaLinks().get(1));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Expected url
        String expected_youtube_url = "https://www.youtube.com/@ironscales4137";
        soft_assert.assertEquals(driver.getCurrentUrl(), expected_youtube_url, "URL don't match: ");

        //Switch back to the old tab or window
        driver.close();
        driver.switchTo().window(originalWindow);


        // Twitter
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        //Click the link which opens in a new window
        UIActions.MouseHoverAndClick(main_page.GetSocialMediaLinks().get(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Expected url
        String expected_twitter_url = "https://twitter.com/IRONSCALES";
        soft_assert.assertEquals(driver.getCurrentUrl(), expected_twitter_url, "URL don't match: ");

        //Switch back to the old tab or window
        driver.close();
        driver.switchTo().window(originalWindow);

        // Facebook
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        //Click the link which opens in a new window
        UIActions.MouseHoverAndClick(main_page.GetSocialMediaLinks().get(3));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Expected url
        String expected_facebook_url = "https://www.facebook.com/ironscalesltd/";
        soft_assert.assertEquals(driver.getCurrentUrl(), expected_facebook_url, "URL don't match: ");

        //Switch back to the old tab or window
        driver.close();
        driver.switchTo().window(originalWindow);


        // Instagram
        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        //Click the link which opens in a new window
        UIActions.MouseHoverAndClick(main_page.GetSocialMediaLinks().get(4));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Expected url
        String expected_instagram_url = "https://www.instagram.com/ironscalesltd/";
        soft_assert.assertEquals(driver.getCurrentUrl(), expected_instagram_url, "URL don't match: ");

        //Switch back to the old tab or window
        driver.close();
        driver.switchTo().window(originalWindow);


        soft_assert.assertAll();
    }
}
