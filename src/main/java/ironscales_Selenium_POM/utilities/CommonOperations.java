package ironscales_Selenium_POM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CommonOperations extends BaseVariables {


    public static void InitBrowser() {
        driver = GetChrome();
    }


    public static WebDriver GetChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @BeforeMethod
    public void StartSession() {
        System.out.println("\nTest case started!");
        InitBrowser();
        actions = new Actions(driver);
        soft_assert = new SoftAssert();
        ManagePages.InitWebPages();
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

    @Attachment(value = "Page screenshot", type = "image/png")  // TODO: where to use it?
    public byte[] SaveScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}

