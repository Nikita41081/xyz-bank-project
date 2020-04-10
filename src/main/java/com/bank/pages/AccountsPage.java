package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountsPage extends Utility {
    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By depositOrWithdrawBtn = By.xpath("//button[@class='btn btn-default']");
    By logOutBtn = By.xpath("//button[@class='btn logout']");
    By depositOrWithdrawl_msg = By.xpath("//span[@class='error ng-binding']");
    By withdrawlTab = By.xpath("//button[contains(text(),'Withdrawl')]");

    //button[@class='btn btn-lg tab btn-primary']
    public void verifyThatLogOutBtnIsDisplayed() {
        if (verifyThatElementIsDisplayed(logOutBtn)) {
            System.out.println("LogOut Button is Present");
            clickOnElement(logOutBtn);
        } else System.out.println("User is not successfully Logged In.");
    }

    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawlTab() {
        clickOnElement(withdrawlTab);
    }

    public void enterAmount() {
        sendTextToElement(amountField, "100");
    }

    public void clickOnDepositOrWithdrawBtn() {
        clickOnElement(depositOrWithdrawBtn);
    }

    public String getDepositOrWithdrawlSuccessfulMessage() {
        return getTextFromElement(depositOrWithdrawl_msg);
    }
}
