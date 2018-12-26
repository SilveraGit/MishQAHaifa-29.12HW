package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Inka on 26-Dec-18.
 */
public class LoginPageHelper extends PageBase {

    public LoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Cancel')]"),
                20);
    }

    public void enterValueToFieldEmail(String value) {
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys(value);
    }

    public void enterValueToFieldPassword(String value) {
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        password_field.click();
        password_field.sendKeys(value);
    }
}
