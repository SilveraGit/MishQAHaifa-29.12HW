package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Inka on 20-Dec-18.
 */
public class LoginPageTestsWebinar extends TestBase{
    HomePageHelperWebinar homePageWebinar;
    LoginPageHelperWebinar loginPageWebinar;
    EventAuthPageHelperWebinar eventAuthPagerWebinar;

    @BeforeMethod
    public void initPage(){
        homePageWebinar = PageFactory
                .initElements(driver, HomePageHelperWebinar.class);
        loginPageWebinar = PageFactory.initElements(driver, LoginPageHelperWebinar.class);
        eventAuthPagerWebinar = PageFactory.initElements(driver, EventAuthPageHelperWebinar.class);
    }

    @Test
    public void loginPositive() {
        homePageWebinar.waitUntilPageIsLoaded();
        homePageWebinar.pressLoginButton();
        loginPageWebinar.waitUntilPageIsLoaded();
        loginPageWebinar.enterValueToFieldEmail("mishUser1@gmail.com");
        loginPageWebinar.enterValueToFieldPassword("example");
        loginPageWebinar.pressLogInButton();
        eventAuthPagerWebinar.waitUntilPageIsLoaded();
        Assert.assertEquals("Menu",eventAuthPagerWebinar.getToolTipIconMenu());
        Assert.assertTrue(eventAuthPagerWebinar.isHeaderPageCorrect("Find event"));
    }

    @Test
    public void negativeLogin(){
        homePageWebinar.waitUntilPageIsLoaded();
        homePageWebinar.pressLoginButton();
        loginPageWebinar.waitUntilPageIsLoaded();
        loginPageWebinar.enterValueToFieldEmail("misshUser1@gmail.com");
        loginPageWebinar.enterValueToFieldPassword("example");
        loginPageWebinar.pressLogInButton();
        Assert.assertTrue(loginPageWebinar.isAlertTextCorrect("Wrong authorization, login or password"));
    }
}
