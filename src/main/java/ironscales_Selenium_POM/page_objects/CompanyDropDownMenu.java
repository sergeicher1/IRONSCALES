package ironscales_Selenium_POM.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyDropDownMenu {

    // About element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='About']")
    private WebElement about;

    public WebElement GetAbout() {
        return about;
    }

    // Leadership team element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Leadership Team']")
    private WebElement leadership_team;

    public WebElement GetLeaderShip() {
        return leadership_team;
    }

    // Board element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Board']")
    private WebElement board;

    public WebElement GetBoard() {
        return board;
    }

    // Awards element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Awards']")
    private WebElement awards;

    public WebElement GetAwards() {
        return awards;
    }

    // News element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='News']")
    private WebElement news;

    public WebElement GetNews() {
        return news;
    }

    // Events element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Events']")
    private WebElement events;

    public WebElement GetEvents() {
        return events;
    }

    // Careers element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Careers']")
    private WebElement careers;

    public WebElement GetCareers() {
        return careers;
    }

    // Contact us element in nav bar
    @FindBy(xpath = "//ul/li/a[text()='Contact Us']")
    private WebElement contact_us;

    public WebElement GetContactUs() {
        return contact_us;
    }

}
