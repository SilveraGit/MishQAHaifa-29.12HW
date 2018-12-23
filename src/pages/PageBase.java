package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Inka on 23-Dec-18.
 */
public abstract class PageBase {
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void waitUntilElementIsLoaded(WebDriver driver,
                                         By locator, int time)
    {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions
                    .presenceOfElementLocated(locator));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
