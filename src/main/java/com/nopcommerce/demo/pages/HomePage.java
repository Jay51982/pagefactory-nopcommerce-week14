package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopCommerceLogo;

    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement myAccounMenutLink;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutlink;

    @FindBy(xpath = "//div[@class='header-menu']//li")
    public WebElement allMenuList;

    public void selectMenu(String menu){

        List<WebElement>topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames){
            if (names.getText().equalsIgnoreCase(menu)){
                names.click();
                break;
            }
        }
    }

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public  void loginLinkDisplay(){
        verifyThatElementIsDisplayed(loginLink);
        CustomListeners.test.log(Status.PASS,"Verify displayed link");
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS,"clicking on Register Link");
    }
     public void clickMyAccountLink(){
        clickOnElement(myAccounMenutLink);
        CustomListeners.test.log(Status.PASS,"clicking on Logout Link");
     }
     public void logoutLinkDispalyed(){
      verifyThatElementIsDisplayed(logoutlink);
      CustomListeners.test.log(Status.PASS,"Verify displyed Link");
     }
    public void verifyNopCommerceLogo() {
        verifyThatElementIsDisplayed(nopCommerceLogo);
        CustomListeners.test.log(Status.PASS, "Verify Logo");
     }
}



