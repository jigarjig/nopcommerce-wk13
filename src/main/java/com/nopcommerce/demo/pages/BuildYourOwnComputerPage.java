package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import javax.xml.xpath.XPath;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage(){PageFactory.initElements(driver,this);
    }

        @FindBy(xpath = "//h2[@class='product-title']//a[text()='Build your own computer']")
        WebElement byocLink;
//        @FindBy(xpath = "//select[@id='product_attribute_1']") WebElement Processor;
//        @FindBy(xpath = "//select[@id='product_attribute_2']") WebElement Ram;
    @FindBy(xpath = "//select[@id='product_attribute_1']") WebElement Processor;
    @FindBy(xpath = "//select[@id='product_attribute_2']//option[text()='8GB [+$60.00]']") WebElement Ram;
        @FindBy(xpath = "//input[@id='product_attribute_3_7']") WebElement hdd;
        @FindBy(xpath = "//input[@id='product_attribute_4_9']") WebElement os;
        @FindBy(xpath = "//input[@id='product_attribute_5_10']") WebElement Software;
        @FindBy(xpath = "//button[@id='add-to-cart-button-1']") WebElement addCart;
        @FindBy(xpath="//p[text()='The product has been added to your ']") WebElement shoppingCart;


        public void clickOnByoc(){
            Reporter.log("Click on Build ur own " + byocLink.toString());
            clickOnElement(byocLink);
        }
//        public void selectProcessor(int value){selectByValueFromDropDown((By) Processor,value);
//        }
//        public void selectRam(int value){
//            selectByValueFromDropDown((By) Ram,value);
//        }
    public void selectProcessor(){clickOnElement(Processor);}
    public void selectRam(){clickOnElement(Ram);}
        public void selectHdd(){
            Reporter.log("Clicking on Hdd " + hdd.toString());
            clickOnElement(hdd);
        }
        public void selectOs(){
            Reporter.log("Clicking on Os " + os.toString());
            clickOnElement(os);
        }
        public void selectSoftware(){
            Reporter.log("clicking on Software " + Software.toString());
            clickOnElement(Software);
        }
        public void clickOnAddCArt(){
            Reporter.log("Clocking on AddCart" + addCart.toString());
            clickOnElement(addCart);
        }
        public String verifyOrder(){
            return getTextFromElement(shoppingCart);
        }
    }


