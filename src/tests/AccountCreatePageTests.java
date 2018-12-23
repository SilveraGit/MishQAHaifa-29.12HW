package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Inka on 22-Dec-18.
 */
public class AccountCreatePageTests extends TestBase {
    @Test
    public void createNewAccount(){
        String email1 = latinDigitString(8) + "@gmail.com";
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),40);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(email1);


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();


        waitUntilElementIsLoaded(driver,By.xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."),40);
        waitUntilElementIsLoaded(driver,By.xpath("//mat-icon[@mattooltip='Menu']"),20 );

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        waitUntilElementIsLoaded(driver, By.xpath("//span[@class='marginLeft']"), 20);
        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
    }

    @Test
    public void newAccountAndLogin(){
        String email2 = latinDigitString(8) + "@gmail.com";
        waitUntilElementIsLoaded(driver, By.xpath("//span[contains(text(),'Create Account')]"),40);

        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(email2);


        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Registration')]"),20);
        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();


        waitUntilElementIsLoaded(driver,By.xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."),40);
        waitUntilElementIsLoaded(driver,By.xpath("//mat-icon[@mattooltip='Menu']"),20 );
        /*WebElement cancelButton = driver
                .findElement(By.xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."));*/

        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        waitUntilElementIsLoaded(driver, By.xpath("//span[@class='marginLeft']"), 20);
        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        //------------------------------Login created user----------

        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(),'Login')]"),40);
        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        waitUntilElementIsLoaded(driver,By.xpath("//button[@type='button']/span[contains(text(),'Cancel')]/.."),20);
        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys(email2);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();

    }
}
