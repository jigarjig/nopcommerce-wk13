package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in") WebElement loginLink;
    //By loginLink = By.linkText("Log in");


    @FindBy(linkText = "Register") WebElement registerLink;
   // By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("clicking on login link : "+ loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click on register link :"+registerLink.toString());
    }

}
