package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement sortBy;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement displayBy;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement selectProductList;

    public void verifyDesktopText(String text){

        verifyThatTextIsDisplayed(desktopText, text);
        CustomListeners.test.log(Status.PASS, "Desktop text " + text);
    }
    public void sortByProduct(){

        clickOnElement(sortBy);
        CustomListeners.test.log(Status.PASS, "Sortby Product");
    }
    public void displayByProduct(){

        clickOnElement(displayBy);
        CustomListeners.test.log(Status.PASS, "Display by product ");
    }
    public void selectProductFromList(){

        clickOnElement(selectProductList);
        CustomListeners.test.log(Status.PASS, "Select product from List ");
    }

}
