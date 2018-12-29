package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Inka on 22-Dec-18.
 */
public class AccountCreatePageTests extends TestBase {
    HomePageHelper homePage;
    AccountCreatePageHelper accountCreatePage;
    ProfilePageHelper profilePage;
    MenuPageHelper menuPage;
    LoginPageHelper loginPage;


    @BeforeMethod
    public void initPage(){
        homePage = PageFactory.initElements(driver,HomePageHelper.class);
        accountCreatePage = PageFactory.initElements(driver, AccountCreatePageHelper.class);
        profilePage = PageFactory.initElements(driver,ProfilePageHelper.class);
        menuPage = PageFactory.initElements(driver,MenuPageHelper.class);
        loginPage = PageFactory.initElements(driver,LoginPageHelper.class);


    }

    @Test
    public void createNewAccount(){
        String email1 = latinDigitString(8) + "@gmail.com";
        homePage.waitUntilPageLoad();
        accountCreatePage.pressTheCreateAccountButton();
        accountCreatePage.enteringEmail(email1);
        accountCreatePage.enteringPass("example");
        accountCreatePage.enteringRepPass("example");
        accountCreatePage.waitUntilPageLoadEnd();
        accountCreatePage.pressTheRegButton();
        profilePage.waitUntilPageIsLoad();
        profilePage.pressTheMenuButton();
        profilePage.pressTheLogOutButton();
        menuPage.waitUntilPageLoad();
        menuPage.pressTheLogOutButton();

    }

    @Test
    public void newAccountAndLogin(){
        String email2 = latinDigitString(8) + "@gmail.com";
        homePage.waitUntilPageLoad();
        accountCreatePage.pressTheCreateAccountButton();
        accountCreatePage.enteringEmail(email2);
        accountCreatePage.enteringPass("example");
        accountCreatePage.enteringRepPass("example");
        accountCreatePage.waitUntilPageLoadEnd();
        accountCreatePage.pressTheRegButton();
        profilePage.waitUntilPageIsLoad();
        profilePage.pressTheMenuButton();
        profilePage.pressTheLogOutButton();
        menuPage.waitUntilPageLoad();
        menuPage.pressTheLogOutButton();
        //------------------------------Login created user----------

        homePage.waitUntilPageLoad();
        homePage.pressLoginButton();
        loginPage.waitUntilPageLoad();
        loginPage.enterValueToFieldEmail(email2);
        loginPage.enterValueToFieldPassword("example");
        loginPage.pressLogInButton();


    }
}
