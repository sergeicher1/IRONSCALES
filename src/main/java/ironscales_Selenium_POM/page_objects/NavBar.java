package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class NavBar {

    // Nav Bar
    @FindBy(xpath = "//*[@id=\"navbar_global\"]/div/ul[1]")
    private List<WebElement> nav_bar;

    public List<WebElement> GetNavBar() {
        return nav_bar;
    }

    // Solution element in nav bar
    @FindBy(xpath = "//span[text()='Solution']")
    private WebElement solution;

    public WebElement GetSolution() {
        return solution;
    }

    // Resources element in nav bar
    @FindBy(xpath = "//span[text()='Resources']")
    private WebElement resources;

    public WebElement GetResources() {
        return resources;
    }

    // Pricing element in nav bar
    @FindBy(xpath = "//span[text()='Pricing']")
    private WebElement pricing;

    public WebElement GetPricing() {
        return pricing;
    }

    // Partners element in nav bar
    @FindBy(xpath = "//span[text()='Partners']")
    private WebElement partners;

    public WebElement GetPartners() {
        return partners;
    }

    // Blog element in nav bar
    @FindBy(xpath = "//span[text()='Blog']")
    private WebElement blog;

    public WebElement GetBlog() {
        return blog;
    }

    // Company element in nav bar
    @FindBy(xpath = "//span[text()='Company']")
    private WebElement company;

    public WebElement GetCompany() {
        return company;
    }
}
