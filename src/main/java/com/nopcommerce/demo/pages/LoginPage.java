package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this); // 1 Change create Constructors
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(name = "Password")
    WebElement passwordFiled;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutButton;
    @FindBy(xpath = "")
    WebElement logOutLinkDispaly;

    public void verifyWelcomText(String text) {
        verifyThatTextIsDisplayed(welcomeText, text);
        CustomListeners.test.log(Status.PASS, "Verify Welcome Text" + text);
    }
     public void randomEmailId(){
        emailField.click();
        Random randomEmail = new Random();
        int randomInt = randomEmail.nextInt(800);
        emailField.sendKeys("usernae" + randomInt + "@gmail.com");
        CustomListeners.test.log(Status.PASS,"Select random Email");
     }
       public void enterPassword(String password) {
        sendTextToElement(passwordFiled,password);
        CustomListeners.test.log(Status.PASS,"Enter Passowrd");
       }

       public void ClickOnLoginButton(){

        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on login Button");

       }
        public void verifyErrorMessage(String text){
        verifyThatTextIsDisplayed(errorMessage,text);
        CustomListeners.test.log(Status.PASS,"Verify error message " + text);

        }

}





