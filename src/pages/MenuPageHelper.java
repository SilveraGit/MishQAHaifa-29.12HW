package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPageHelper extends PageBase{
    @FindBy(xpath = "//span[@class='marginLeft']" )
    WebElement logOutButton;


    public MenuPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver, logOutButton, 20);
    }

    public void pressTheLogOutButton() {
        logOutButton.click();
    }
}
