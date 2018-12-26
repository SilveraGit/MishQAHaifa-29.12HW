package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Inka on 26-Dec-18.
 */
public class EventsAuthPageHelper extends PageBase {

    public EventsAuthPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//mat-icon[@class='but mat-icon material-icons']"),
                20);
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Filters')]"),30);
    }

    public String getTooltipIconMenu() {
        WebElement iconMenu = driver
                .findElement(By.
                        xpath("//mat-icon[@class='but mat-icon material-icons']"));
        return iconMenu.getAttribute("mattooltip");

    }
    public String getHeader() {
        WebElement titlePage = driver.findElement(By
                .xpath("//h1[@class='gorisontal-center']"));
        return titlePage.getText();
    }
}
