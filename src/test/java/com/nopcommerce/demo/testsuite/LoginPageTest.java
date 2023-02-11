package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        String actualMessage=loginPage.getWelcomeText();
        String expectedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage,expectedMessage,"Login page verfied");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abc@gmaill.com");
        loginPage.enterPassword("1234567");
        loginPage.clickOnLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }
    @Test
    public void verifyLoginSuccessFullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("raju@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getlogOut();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }
    @Test
    public void verifyUserLogoutSuccessFully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("raju@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        loginPage.getlogOut();
        String actual = loginPage.getlogOut();
        String expected = "Log out";
        Assert.assertEquals(actual, expected, "Log out");
    }
}
