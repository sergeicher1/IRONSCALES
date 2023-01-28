package ironscales_Selenium_POM.utilities;

import org.openqa.selenium.JavascriptExecutor;

import static ironscales_Selenium_POM.utilities.BaseVariables.driver;

public class Helpers {


    // Scroll down to footer
    public static void ScrollToFooter() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
    }


}
