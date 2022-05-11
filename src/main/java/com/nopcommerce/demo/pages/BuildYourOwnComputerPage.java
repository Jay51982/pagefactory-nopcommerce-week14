package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
   @FindBy (xpath = "//h1[contains(text(),'Build your own computer')]")
   WebElement buildYourOwnComputerText;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[1]/select[1]")
    WebElement processorDropDown;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[2]/select[1]")
    WebElement ramDropDown;

    @FindBy (xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[3]/ul[1]/li[2]/input[1]")
    WebElement hddRadios400;

    @FindBy (xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[4]/ul[1]/li[2]/input[1]")
    WebElement osRadio;

    @FindBy (xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[4]/ul[1]/li[2]/input[1]")
    WebElement softwareCheckBoxes;

    @FindBy (xpath = "//body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[9]/div[1]/button[1]")
    WebElement addToCartButton;

    @FindBy (xpath = "//body[1]/div[5]/div[1]/p[1]")
    WebElement theProductHasBeenAddedToYourShoopingCartMessage;

    public void verifyBuildYourOwnComputerText() {

        verifyThatTextIsDisplayed(buildYourOwnComputerText, "Build your own computer");
        CustomListeners.test.log(Status.PASS, "Build your own computer text displayed ");
    }

    public void selectProcessorFromDropDown(String text) {

        selectByVisibleTextFromDropDown(processorDropDown, text);
        CustomListeners.test.log(Status.PASS, "Select Processor " + text);
    }

    public void selectRAMFromDropDown(String text) {

        selectByVisibleTextFromDropDown(ramDropDown, text);
        CustomListeners.test.log(Status.PASS, "Select RAM " + text);
    }

    public void selectHDDRadioButton(String text) {

        clickOnElement(hddRadios400);
        CustomListeners.test.log(Status.PASS, "Select Harddisk " + text);
    }

    public void selectOSRadioButton(String text) {

        clickOnElement(osRadio);
        CustomListeners.test.log(Status.PASS, "Select Operating system " + text);
    }

    public void selectSoftwareCheckBox(String text) {

        clickOnElement(softwareCheckBoxes);
        CustomListeners.test.log(Status.PASS, "Select Software " + text);
    }

    public void clickAddToCart() {

        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Add to cart ");
    }

    public void verifyAddToCartText() {
        verifyThatTextIsDisplayed(theProductHasBeenAddedToYourShoopingCartMessage, "The product has been added to your shopping cart");
        CustomListeners.test.log(Status.PASS, "Verify Add to cart ");
    }

    public void selectParts(String processor, String ram, String hdd, String os, String software) {
        selectProcessorFromDropDown(processor);
        selectRAMFromDropDown(ram);
        selectHDDRadioButton(hdd);
        selectOSRadioButton(os);
        selectSoftwareCheckBox(software);
    }
}







