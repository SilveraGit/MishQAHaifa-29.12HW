package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestBase;

import static tests.TestBase.latinDigitString;

public class AccountCreatePageHelper extends PageBase {
    @FindBy(xpath ="//span[contains(text(),'Create Account')]")
            WebElement createAccountButton;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement mailField;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement passField;
    @FindBy(xpath = "//input[@formcontrolname='passwordRep']")
    WebElement passRepField;
    @FindBy(xpath = "//span[contains(text(),'Registration')]")
    WebElement regButton;



    public AccountCreatePageHelper(WebDriver driver) {
        super(driver);
    }

    public void waitUntilPageLoad() {
        waitUntilElementIsLoaded(driver, createAccountButton,40);
    }

    public void pressTheCreateAccountButton() {
        createAccountButton.click();
    }

    public void enteringEmail(String email) {

        mailField.click();
        mailField.sendKeys(email);
    }

    public void enteringPass(String pass) {
        passField.click();
        passField.sendKeys(pass);
    }

    public void enteringRepPass(String repPass) {
        passRepField.click();
        passRepField.sendKeys(repPass);
    }

    public void waitUntilPageLoadEnd() {
        waitUntilElementIsLoaded(driver,regButton,20);
    }

    public void pressTheRegButton() {
        regButton.click();
    }
}

