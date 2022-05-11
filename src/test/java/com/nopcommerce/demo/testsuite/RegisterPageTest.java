package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class RegisterPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();  // creating Object. when my test run that time i will crate Object
        loginPage = new LoginPage(); // intilize element runtime first
        registerPage = new RegisterPage();

    }

/*1. verifyUserShouldNavigateToRegisterPageSuccessfully()
Click on Register Link
Verify "Register" text
2.
* */
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.verifyRegisterPageText("Register");

    }

/*verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(
)
Click on Register Link
Click on "REGISTER" button
Verify the error message "First name is required."
Verify the error message "Last name is required."
Verify the error message "Email is required."
Verify the error message "Password is required."
Verify the error message "Password is required."
* */
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandetory() {
        homePage.clickOnRegisterLink();
        registerPage.registerButtonClick();
        registerPage.verifyFirstNameErrorMessage("First name is required");
        registerPage.verifyLastNameErrorMessage("Last name is required");
        registerPage.verifyEmailErrorMessage("Email is required");
        registerPage.verifyPasswordErrorMessage("Password is required");
        registerPage.verifyConfirmPasswordErrorMessage("Password is required");
    }

    /*verifyThatUserShouldCreateAccountSuccessfully()
Click on Register Link
Select gender "Female"
Enter firstname
Enter lastname
Select day
Select month
Select year
Enter email
Enter password
Enter Confirm Password
Click on "REGISTER" button
Verify message "Your registration completed"
3.
    * */
    @Test(groups = {"regression"})
    public void verifyThatUsersShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.selectGender("Male");
        registerPage.firstNameClick("Elon");
        registerPage.lastNameClick("Musk");
       // registerPage.selectDateOfBirth();
        registerPage.selectDateOfBirth("12","January","1990");
        registerPage.enterEmailId(("prime321@gmail.com"));
        registerPage.passwordClick("prime321");
        registerPage.confirmPasswordClick("prime321");
        registerPage.registerButtonClick();
        registerPage.verifyRegisterPageText(" Your regisration is completed");
    }
}
