package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
//import com.nopcommerce.demo.testdata.TestData;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {


        HomePage homePage;
        LoginPage loginPage;
        ComputerPage computer;
        BuildYourOwnComputerPage Byoc;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        computer = new ComputerPage();
        Byoc = new BuildYourOwnComputerPage();
    }
        @Test
        public void verifyUserShouldNavigateToComputerPageSuccessfully(){
            computer.clickOncomputerPageLink();
            String actualMessage = computer.getComputersText();
            String expectedMessage = "Computers";
            Assert.assertEquals(actualMessage,expectedMessage,"Computers verfied");
        }
        @Test
        public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
            computer.clickOncomputerPageLink();
            computer.clickOnDesktopLink();
            String actualMessage = computer.getDesktopText();
            String expectedMessage = "Desktops";
            Assert.assertEquals(actualMessage,expectedMessage,"Desktops verfied");
        }
        @Test
        public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully() {
            computer.clickOncomputerPageLink();
            computer.clickOnDesktopLink();
            Byoc.clickOnByoc();
            Byoc.selectProcessor();
            Byoc.selectRam();
            Byoc.selectHdd();
            Byoc.selectOs();
            Byoc.selectSoftware();
            Byoc.clickOnAddCArt();
            String actualMessage = Byoc.verifyOrder();
            String expectedMessage = "The product has been added to your shopping cart";
            Assert.assertEquals(actualMessage, expectedMessage, "order verfied");
        }

        @Test(dataProvider = "Processor",dataProviderClass = TestData.class)
    public void doLogin(String Processor, String Ram, String hdd, String os, String Software) {

        computer.clickOncomputerPageLink();
        computer.clickOnDesktopLink();
        Byoc.clickOnByoc();
        Byoc.selectProcessor();
        Byoc.clickOnAddCArt();
        String actualText =Byoc.verifyOrder();
        String expectedText = "The product has been added to your shopping cart";
        Assert.assertEquals(actualText,expectedText);
        }
    }

