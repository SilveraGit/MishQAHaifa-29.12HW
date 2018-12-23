package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Inka on 20-Dec-18.
 */
public class LoginPageTestsWebinar extends TestBase{
    @Test
    public void loginPositive() {
        waitUntilElementIsLoaded(driver,By.className("mat-stroked-button"),20);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),20);
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"),30);
        WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();
        waitUntilElementIsLoaded(driver,By.xpath("//button[@aria-label='Close dialog']"),20);
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("mishUser1@gmail.com");
        password_field.click();
        password_field.sendKeys("example");
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"),30);
        WebElement login_button=driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        waitUntilElementIsLoaded(driver, By.xpath("//mat-icon[@class='but mat-icon material-icons']"),20);
        WebElement iconMenu = driver.findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip").equals("Menu"));
    }

    @Test
    public void negativeLogin(){
        //driver.get("https://mish.sheygam.com/#/wellcome");
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                //By.xpath("//span[contains(text(),'Login')]"),
                45);
        //waitUntilElementIsLoaded(driver,By.className("mat-stroked-button"),20);
        //waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Create Account')]"),30);
        //waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Login')]"),50);
        WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();
        waitUntilElementIsLoaded(driver,By.xpath("//button[@aria-label='Close dialog']"),20);
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("mrn@123.com");
        password_field.click();
        password_field.sendKeys("marina");
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Log in')]"),20);
        WebElement login_button=driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        waitUntilElementIsLoaded(driver, By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),20);
        WebElement alertText = driver.findElement(By.xpath(("//div[@class='alert alert-danger ng-star-inserted']")));
        Assert.assertTrue(alertText.getText().equals("Wrong authorization, login or password"));
    }
}
