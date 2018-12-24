package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Inka on 24-Dec-18.
 */
public class EventUnAuthPageHelperWebinar extends PageBase{

    public EventUnAuthPageHelperWebinar(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver, By.xpath("//button[@class='mat-raised-button']"),20);
    }

    public String getLoginButtonName() {
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        WebElement loginButton = topLinksList.get(0);
        return loginButton.getText();
    }

    public String getHeader() {
        WebElement titleEventsPage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        return titleEventsPage.getText();
    }
}
