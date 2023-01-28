package ironscales_Selenium_POM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CommonOperations extends BaseVariables {


    public static void InitBrowser() {
        driver = GetChrome(); // add if else with differ types of browsers //
        actions = new Actions(driver);
        soft_assert = new SoftAssert();
        ManagePages.InitWebPages();

    }


    public static WebDriver GetChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @BeforeMethod
    public void StartSession() {
        System.out.println("\nTest case started!");
        InitBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ironscales.com/");
    }

    @AfterMethod
    public void CloseSession() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        System.out.println("\nTest case completed!\n");
    }
}

