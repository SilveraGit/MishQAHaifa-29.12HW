package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Inka on 24-Dec-18.
 */
public class HomePageHelperWebinar extends PageBase{
    @FindBy(className = "mat-stroked-button")
    WebElement goToEventsButton;

    @FindBy(xpath = "//span[contains(text(),'Create Account')]")
    WebElement createAccountButton;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(css = ".mat-button-wrapper .mat-button-wrapper")
    List<WebElement> topLinksList;

    public HomePageHelperWebinar(WebDriver driver){
        super(driver);
    }

    public void waitUntilPageIsLoaded() {
        waitUntilElementIsLoaded(driver, goToEventsButton,40);
        waitUntilElementIsLoaded(driver,createAccountButton,40);
    }

    public String getCreateAccountButtonName() {
        return topLinksList.get(1).getText();
    }

    public void pressGoToEventButton() {
        goToEventsButton.click();
    }

    public void pressLoginButton() {
        loginButton.click();
    }
}
