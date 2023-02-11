package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage(){PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='ico-register']") WebElement registerLink;
    @FindBy(xpath= "//h1[text()='Register']") WebElement registerText;
    //By registerText = By.xpath("//button[@class='button-1 register-button']");
    @FindBy(xpath = "//button[@id='register-button']") WebElement registerButton;
    @FindBy(xpath = "//span[@id='FirstName-error']") WebElement firstNameError;
    @FindBy(xpath = "//span[@id='LastName-error']")WebElement lastNameError;
    @FindBy(xpath = "//span[@id='Email-error']") WebElement emailError;
    @FindBy(xpath = "//span[@id='Password-error']") WebElement passwordError;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']") WebElement confirmPasswordError;
    @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")
    WebElement gender;//practice
    @FindBy(xpath = "//input[@id='FirstName']") WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']") WebElement lastNameField;
    //@FindBy(xpath = "//select[@name='DateOfBirthDay']") WebElement day;
   //@FindBy(xpath = "//div[@class='inputs date-of-birth']/div[1]/select[1]//option[7]") WebElement day;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]") WebElement day;
    //@FindBy(xpath = "//select[@name='DateOfBirthMonth']") WebElement month;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]") WebElement month;
    //@FindBy(xpath = "//select[@name='DateOfBirthYear']") WebElement year;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]") WebElement year;
    @FindBy(xpath = "//input[@id='Email']") WebElement emailfield;
    @FindBy(xpath = "//input[@id='Password']") WebElement passwordfield;
    @FindBy(xpath = "//input[@id='ConfirmPassword']") WebElement confirmPasswordfield;
    @FindBy(xpath= "//div[text()='Your registration completed']") WebElement registerCompleted;



    public void clickOnregisterLink() {
        Reporter.log("Clicking on login button " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }


    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyfirstNameError() {
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        return getTextFromElement(lastNameError);
    }

    public String verifyemailErrorr() {
        return getTextFromElement(emailError);
    }

    public String verifyPasswordErrorr() {
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordErrorr() {
        return getTextFromElement(confirmPasswordError);
    }

    public void clicckOnGenderCheckbox() {
        clickOnElement(gender);
    }

    public void enterFirstname(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastname(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

//    public void selectDay(int value) {
//        selectByValueFromDropDown((By) day, value);
//    }
     public void selectDay (){clickOnElement(day);}

//    public void selectMonth(int value) {
//        selectByValueFromDropDown((By) month, value);
//    }
//
//    public void selectYear(int value) {
//        selectByValueFromDropDown((By) year, value);
//    }
    public void selectMonth(){clickOnElement(month);}
    public void selectYear(){ clickOnElement(year);}

    public void enterEmail(String email) {
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String pass) {
        sendTextToElement(passwordfield, pass);
    }

    public void enterConfirmPassword(String confpass) {
        sendTextToElement(confirmPasswordfield, confpass);
    }

    public String verifyRegisterCompleted() {
        return getTextFromElement(registerCompleted);
    }
}
