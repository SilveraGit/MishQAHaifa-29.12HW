package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EventUnAuthPageHelperWebinar;
import pages.EventsUnAuthPageHelper;
import pages.HomePageHelper;
import pages.HomePageHelperWebinar;

import java.util.List;

/**
 * Created by Inka on 17-Dec-18.
 */
public class HomePageTestsWebinar extends TestBase {
    HomePageHelperWebinar homePageWebinar;
    EventUnAuthPageHelperWebinar eventUnAuthPageHelperWebinar;

    @BeforeMethod
    public void initPage(){
        homePageWebinar = PageFactory
                .initElements(driver, HomePageHelperWebinar.class);
        eventUnAuthPageHelperWebinar = PageFactory
                .initElements(driver, EventUnAuthPageHelperWebinar.class);

    }

    @Test
    public void openHomePageTest()  {
        homePageWebinar.waitUntilPageIsLoaded();
        String createAccountButtonName = homePageWebinar.getCreateAccountButtonName();
        Assert.assertEquals("Create Account",createAccountButtonName);
    }

    @Test
    public void goToEventButtonTest()  {
        homePageWebinar.waitUntilPageIsLoaded();
        homePageWebinar.pressGoToEventButton();
        eventUnAuthPageHelperWebinar.waitUntilPageIsLoaded();
        String loginButtonName = eventUnAuthPageHelperWebinar.getLoginButtonName();
        String headerFindEvents = eventUnAuthPageHelperWebinar.getHeader();


        Assert.assertEquals("Find event",headerFindEvents);
        Assert.assertEquals("Login", loginButtonName);
    }

   }
