package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Inka on 27-Dec-18.
 */
public class EventAuthPageHelperWebinar extends PageBase {
    public EventAuthPageHelperWebinar(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),40);
        waitUntilElementIsLoaded(driver, By.xpath("//h1[@class='gorisontal-center']"),20);
    }

    public String getToolTipIconMenu() {
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        return iconMenu.getAttribute("mattooltip");
    }

    public boolean isHeaderPageCorrect(String value) {
        WebElement header = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        return header.getText().equals(value);
    }
}
