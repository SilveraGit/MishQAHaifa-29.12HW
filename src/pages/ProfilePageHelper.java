package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageHelper extends PageBase {
    @FindBy(xpath = "//button[@type='button']/span[contains(text(),'Cancel')]/..")
    WebElement cancelButton;
    @FindBy(xpath = "//mat-icon[@mattooltip='Menu']")
    WebElement menuButton;
    @FindBy(xpath = "//span[@class='marginLeft']")
    WebElement logOutButton;




    public ProfilePageHelper(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageIsLoad() {
        waitUntilElementIsLoaded(driver, cancelButton,40);
        waitUntilElementIsLoaded(driver,menuButton,20 );
    }

    public void pressTheMenuButton() {
        menuButton.click();
    }

    public void pressTheLogOutButton() {

    }
}
