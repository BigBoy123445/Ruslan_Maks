package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        Assert.assertEquals(
                "Невірний URL після входу",
                "https://www.saucedemo.com/inventory.html",
                driver.getCurrentUrl());
    }


    @Test
    public void unsuccessfulLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/");

        loginPage.enterUsername("Ruslan");
        loginPage.enterPassword("wrong_password");
        loginPage.clickLogin();

        Assert.assertEquals(
                "Невірне повідомлення про помилку",
                "Epic sadface: Username and password do not match any user in this service",
                loginPage.getErrorMessage()
        );
    }
}