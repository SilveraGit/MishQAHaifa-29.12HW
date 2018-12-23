package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Inka on 23-Dec-18.
 */
public class HomePageHelper extends PageBase{

    public HomePageHelper(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Create Account')]"),40);
    }

    public String getGoToEventButtonName() {
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        return goToEventsButton.getText();
    }

    public void pressGoToEventButton() {
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        goToEventsButton.click();
    }
}
