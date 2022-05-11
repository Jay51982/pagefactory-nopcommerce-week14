package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]")
    WebElement registerText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement genderRadioBtn;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameBox;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateOfBirthDay;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthOfBirthMonth;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearOfBirthYear;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordBox;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement clickRegisterButton;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
    WebElement registrationComplegeMessage;

    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
    WebElement continueButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredError;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredError;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredError;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredError;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredError;

     public void verifyRegisterPageText(String text){
         verifyThatTextIsDisplayed(registerText,text);
         CustomListeners.test.log(Status.PASS,"Verify Register Page Text"+ text);
     }
    public void selectGender(String text) {
         clickOnElement(genderRadioBtn);
       //  clickOnElement(genderRadioBtn, text);
        CustomListeners.test.log(Status.PASS, "Select Gender " + text);
    }

    public void firstNameClick(String text) {

        sendTextToElement(firstNameBox, text);
        CustomListeners.test.log(Status.PASS, "First name  " + text);
    }

    public void lastNameClick(String text) {

        sendTextToElement(lastNameBox, text);
        CustomListeners.test.log(Status.PASS, "Last name " + text);
    }

    public void selectDateOfBirth(String dayDOB, String monthDOB, String yeaDOB) {

        selectByVisibleTextFromDropDown(dateOfBirthDay, dayDOB);
        selectByVisibleTextFromDropDown(monthOfBirthMonth, monthDOB);
        selectByVisibleTextFromDropDown(yearOfBirthYear, yeaDOB);
        CustomListeners.test.log(Status.PASS, "Birth details" );
    }

    public void enterEmailId(String text) {

        sendTextToElement(emailBox, text);
        CustomListeners.test.log(Status.PASS, "Enter Email  " + text);
    }

    public void passwordClick(String text) {

        sendTextToElement(passwordBox, text);
        CustomListeners.test.log(Status.PASS, "Enter password  " + text);
    }

    public void confirmPasswordClick(String text) {

        sendTextToElement(confirmPasswordBox, text);
        CustomListeners.test.log(Status.PASS, "Enter confirmPassword " + text);
    }

    public void registerButtonClick() {

        clickOnElement(clickRegisterButton);
        CustomListeners.test.log(Status.PASS, "Click Register Button " );
    }

    public void verifyRegisterText(String text) {

        verifyThatTextIsDisplayed(registrationComplegeMessage, text);
        CustomListeners.test.log(Status.PASS, "Click Register Button" + text);
    }

    public void clickContinueButton() {

        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click Continue Button" );
    }

    public void verifyFirstNameErrorMessage(String text) {

        verifyThatTextIsDisplayed(firstNameRequiredError, text);
        CustomListeners.test.log(Status.PASS, "First name error " + text);
    }

    public void verifyLastNameErrorMessage(String text) {

        verifyThatTextIsDisplayed(lastNameRequiredError, text);
        CustomListeners.test.log(Status.PASS, "Last name error " + text);
    }

    public void verifyEmailErrorMessage(String text) {

        verifyThatTextIsDisplayed(emailRequiredError, text);
        CustomListeners.test.log(Status.PASS, "Email error " + text);
    }

    public void verifyPasswordErrorMessage(String text) {

        verifyThatTextIsDisplayed(passwordRequiredError, text);
        CustomListeners.test.log(Status.PASS, "Password error " + text);
    }

    public void verifyConfirmPasswordErrorMessage(String text) {

        verifyThatTextIsDisplayed(confirmPasswordRequiredError, text);
        CustomListeners.test.log(Status.PASS, "Confirm password error  " + text);
    }

}



