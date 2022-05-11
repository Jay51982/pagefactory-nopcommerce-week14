package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[1]")
    WebElement computerPage;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement desktipPageLink;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/h2/a")
    WebElement notebookPageLink;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/h2/a")
    WebElement softwarePageLink;


    public void verifyComputerText(String text) {
        verifyThatTextIsDisplayed(computerPage,text);
        CustomListeners.test.log(Status.PASS,"Computer text displayed");

    }
     public void clickOnDeskTopLink(){
        clickOnElement(desktipPageLink);
        CustomListeners.test.log(Status.PASS,"Click Desktop link");

     }
      public void clickOnNotebookLink(){
        clickOnNotebookLink();
        CustomListeners.test.log(Status.PASS,"Click on Notebook Link");
      }
       public void clickOnSoftwareLink(){
        clickOnElement(softwarePageLink);
        CustomListeners.test.log(Status.PASS,"Click on software Link");
       }
}