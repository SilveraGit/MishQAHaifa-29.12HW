package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Inka on 24-Dec-18.
 */
public class HomePageHelperWebinar extends PageBase{

    public HomePageHelperWebinar(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver, By.className("mat-stroked-button"),20);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),20);
    }

    public String getCreateAccountButtonName() {
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        WebElement createAccountButton = topLinksList.get(1);
        return createAccountButton.getText();
    }

    public void pressGoToEventButton() {
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        goToEventsButton.click();
    }
}
