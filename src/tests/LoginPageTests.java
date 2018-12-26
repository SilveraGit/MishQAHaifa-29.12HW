package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventsUnAuthPageHelper;
import pages.HomePageHelper;
import pages.LoginPageHelper;

/**
 * Created by Inka on 19-Dec-18.
 */
public class LoginPageTests extends TestBase{
    HomePageHelper homePage;
    LoginPageHelper loginPage;

    @BeforeMethod
    public void initPage(){
        homePage = PageFactory
                .initElements(driver,HomePageHelper.class);
        loginPage = PageFactory
                .initElements(driver,LoginPageHelper.class);

    }
    @Test
    public void loginPositive()  {
        homePage.waitUntilPageLoad();
        homePage.pressLoginButton();
        loginPage.waitUntilPageLoad();
        loginPage.enterValueToFieldEmail("mishUser1@gmail.com");
        loginPage.enterValueToFieldPassword("example");

        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Log in')]"),
                20);
        WebElement login_button=driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        waitUntilElementIsLoaded(driver,
                By.xpath("//mat-icon[@class='but mat-icon material-icons']"),
                20);
        WebElement iconMenu = driver
                .findElement(By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        Assert.assertTrue(iconMenu.getAttribute("mattooltip")
                .equals("Menu"));
    }

    @Test
    public void loginNegative(){
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Login')]"),
                45);
        WebElement login = driver.findElement(By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Cancel')]"),
                20);
        WebElement email_field = driver.findElement(By
                .xpath("//input[@formcontrolname='email']"));
        WebElement password_field = driver.findElement(By
                .xpath("//input[@formcontrolname='password']"));
        email_field.click();
        email_field.sendKeys("misshUser1@gmail.com");
        password_field.click();
        password_field.sendKeys("example");
        waitUntilElementIsLoaded(driver,
                By.xpath("//span[contains(text(),'Log in')]"),
                20);
        WebElement login_button=driver.findElement(By
                .xpath("//span[contains(text(),'Log in')]"));
        login_button.click();
        waitUntilElementIsLoaded(driver,
                By.xpath("//div[@class='alert alert-danger ng-star-inserted']"),
                20);
        WebElement alertText = driver.findElement(By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));
        Assert.assertTrue(alertText.getText()
                .equals("Wrong authorization, login or password"));
    }
}
