package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {


    // Social links elements
    @FindBy(xpath = "//a[@class='no-decoration']/i/*[name()='svg']/*[name()='g']")
    private List<WebElement> social_media_icons;

    public List<WebElement> GetSocialMediaIcons() {
        return social_media_icons;
    }


    // Social media links
    @FindBy(xpath = "//a[@class='no-decoration']")
    private List<WebElement> social_media_links;

    public List<WebElement> GetSocialMediaLinks() {
        return social_media_links;
    }
}
