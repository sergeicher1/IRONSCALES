package ironscales_Selenium_POM.utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;


public class UIActions extends CommonOperations {

    @Step("Click on element")
    public static void Click(WebElement elem) {
        elem.click();
    }

    @Step("Update text")

    public static void UpdateText(WebElement elem, String text) {
        elem.sendKeys(text);
    }


    @Step("Mouse hover on element")

    public static void MouseHover(WebElement elem1) {
        actions.moveToElement(elem1).perform();
    }
    @Step("Mouse hover on element then move to another element")

    public static void MouseHoverTwoEls(WebElement elem1, WebElement elem2) {
        actions.moveToElement(elem1).moveToElement(elem2).perform();
    }
    @Step("Mouse hover and click on element")

    public static void MouseHoverAndClick(WebElement elem1) {
        actions.moveToElement(elem1).click().build().perform();
    }
    @Step("Mouse hover on element then move to another element and click")

    public static void MouseHoverTwoElsAndClick(WebElement elem1, WebElement elem2) {
        actions.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }



}

