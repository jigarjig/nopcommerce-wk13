package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopsPage(){PageFactory.initElements(driver,this);
    }

        @FindBy(className = "//h1[text()='Desktops']")
        WebElement desktopsText;
        @FindBy(xpath = "//div[@class='product-sorting']") WebElement sortText;
        @FindBy(xpath = "//div[@class='product-page-size']")WebElement displayView;
        @FindBy(xpath = "//select[@id='products-pagesize']")WebElement selectDisplay;
        @FindBy(xpath = "//div[@class='item-grid']")WebElement selectItems;

        public void clickOnDesktopsButton(){
            Reporter.log("Clicking on Desktop button " + desktopsText.toString());
            clickOnElement(desktopsText);
        }
        public void clickOnSortButton(){
            Reporter.log("Clicking on sort button " + sortText.toString());
            clickOnElement(sortText);
        }
        public void clickOnDisplay(){
            Reporter.log("Clicking on Display  " + displayView.toString());
            clickOnElement(displayView);
        }
        public void clickOnSelectDisplay(){
            Reporter.log("Clicking on select display" + selectDisplay.toString());
            clickOnElement(selectDisplay);
        }
        public void clickOnItem(){
            Reporter.log("Clicking on Items " + selectItems.toString());
            clickOnElement(selectItems);
        }

    }

