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

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage(){PageFactory.initElements(driver,this);
    }

        @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    WebElement computerPageLink;
        @FindBy(className = "page-title") WebElement computerText;
        @FindBy(xpath = "//div[@class='page-title']") WebElement desktopText;
        @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[1]/a")
                WebElement desktopLink;
        @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a")
                WebElement notebookLink;
        @FindBy(xpath = "//div[@class='master-wrapper-page']/div[3]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/ul/li[3]/a")
                WebElement softwareLink;


        public void clickOncomputerPageLink() {
            Reporter.log("Clicking on Computer Page Link " + computerPageLink.toString());
            clickOnElement(computerPageLink);
        }

        public void clickOnDesktopLink() {
            Reporter.log("Clicking on Desktop Page Link " + desktopLink.toString());
            clickOnElement(desktopLink);
        }

        public void clickOnNotebookPageLink() {
            Reporter.log("Clicking on Notebook Page Link " + notebookLink.toString());
            clickOnElement(notebookLink);
        }

        public void clickOnSoftwarePageLink() {
            Reporter.log("Clicking on Software Page Link " + softwareLink.toString());
            clickOnElement(softwareLink);
        }

        public String getComputersText(){
            return getTextFromElement(computerText);
        }

        public String getDesktopText(){
            return getTextFromElement(desktopText);
        }
    }