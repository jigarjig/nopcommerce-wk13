package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage register;
    HomePage homePage;

    @BeforeMethod
    public void inIt(){
        register = new RegisterPage();
        homePage = new HomePage();
    }

    @Test
    public void userNavigateToRegisterPageSuccessFully(){
        homePage.clickOnLoginLink();
        homePage.clickOnRegisterLink();
        String actualMessage= register.verifyRegisterText();
        String expectedMessage = "Register";
        Assert.assertEquals(actualMessage,expectedMessage,"Register verfied");
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnLoginLink();
        homePage.clickOnRegisterLink();
        register.clickOnRegisterButton();

        String actualMessage1=register.verifyfirstNameError();
        String expedctedMessage1 = "First name is required.";
        Assert.assertEquals(actualMessage1,expedctedMessage1,"Error verified");

        String actualMessage2=register.verifyLastNameError();
        String expedctedMessage2 = "Last name is required.";
        Assert.assertEquals(actualMessage2,expedctedMessage2,"Error verified");

        String actualMessage3=register.verifyemailErrorr();
        String expedctedMessage3 = "Email is required.";
        Assert.assertEquals(actualMessage3,expedctedMessage3,"Error verified");

        String actualMessage4=register.verifyPasswordErrorr();
        String expedctedMessage4 = "Password is required.";
        Assert.assertEquals(actualMessage4,expedctedMessage4,"Error verified");

        String actualMessage5=register.verifyConfirmPasswordErrorr();
        String expedctedMessage5 = "Password is required.";
        Assert.assertEquals(actualMessage5,expedctedMessage5,"Error verified");
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnLoginLink();
        homePage.clickOnRegisterLink();
        register.clicckOnGenderCheckbox();
        register.enterFirstname("Rajja");
        register.enterLastname("patel");
        register.selectDay();
        register.selectMonth();
        register.selectYear();
        register.enterEmail("raja@gmail.com");
        register.enterPassword("123455");
        register.enterConfirmPassword("123455");
        register.clickOnRegisterButton();
        String actualMessage= register.verifyRegisterCompleted();
        String expectedMessage = "Your registration completed";
        Assert.assertEquals(actualMessage,expectedMessage,"Registration complete verfied");
    }
    }
