package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)

public class ComputerPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
/*1. verifyUserShouldNavigateToComputerPageSuccessfully()
Click on Computer tab
Verify "Computer" text
* */
    @Test(groups = {"Sanity", "regrestion"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.selectMenu("Computers");
    }
/*verifyUserShouldNavigateToDesktopsPageSuccessfully()
Click on Computer tab
Click on Desktops link
Verify "Desktops" text
* */
    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopPageSuccessfully() {
        homePage.selectMenu("Computers");
        computerPage.clickOnDeskTopLink();
        desktopsPage.verifyDesktopText("Desktops");
    }

/*verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String
processor, String ram, String hdd, String os, String software)
Click on Computer tab
Click on Desktops link
Click on product name "Build your own computer"
Select processor "processor"
Select RAM "ram"
Select HDD "hdd"
Select OS "os"
Select Software "software"
Click on "ADD TO CART" Button
Verify message "The product has been added to your shopping cart"
* */
    //  @Test(groups = {"regression1", "regression"})
@Test(dataProvider = "ComputerSpec", dataProviderClass = TestData.class, groups = {"regression1", "regression"})
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.selectMenu("Computers");
        computerPage.clickOnDeskTopLink();
        desktopsPage.selectProductFromList();
        buildYourOwnComputerPage.selectParts(processor,ram,hdd,os,software);
        buildYourOwnComputerPage.clickAddToCart();
        buildYourOwnComputerPage.verifyAddToCartText();
    }
}