package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage=new HomePage();
    AccountsPage accountsPage=new AccountsPage();
    BankManagerLoginPage bankManagerLoginPage=new BankManagerLoginPage();
    CustomersPage customersPage=new CustomersPage();
    CustomerLoginPage customerLoginPage=new CustomerLoginPage();
    OpenAccountPage openAccountPage=new OpenAccountPage();
    AddCustomerPage addCustomerPage=new AddCustomerPage();

    By logOutBtn = By.xpath("//button[@class='btn logout']");

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);

    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickAndSelectOnCustomerDropDownList();
        openAccountPage.clickAndSelectOnCurrencyDropDownList();
        openAccountPage.clickOnProcessBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
    }
    @Test
    public void customersShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickAndSelectOnCustomerDropDownList();
        openAccountPage.clickAndSelectOnCurrencyDropDownList();
        openAccountPage.clickOnProcessBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.clickAndSelectOnYourNameDropDownList();
        customerLoginPage.clickOnLoginBtn();
        accountsPage.verifyThatLogOutBtnIsDisplayed();
        openAccountPage.clickOnHomeBtn();
    }
    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickAndSelectOnCustomerDropDownList();
        openAccountPage.clickAndSelectOnCurrencyDropDownList();
        openAccountPage.clickOnProcessBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.clickAndSelectOnYourNameDropDownList();
        customerLoginPage.clickOnLoginBtn();
        accountsPage.clickOnDepositTab();
        accountsPage.enterAmount();
        accountsPage.clickOnDepositOrWithdrawBtn();
        String expectedText = "Deposit Successful";
        String actualText = accountsPage.getDepositOrWithdrawlSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginBtn();
        bankManagerLoginPage.clickOnAddCustomerBtn();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddCustomerBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        bankManagerLoginPage.clickOnOpenAccountBtn();
        openAccountPage.clickAndSelectOnCustomerDropDownList();
        openAccountPage.clickAndSelectOnCurrencyDropDownList();
        openAccountPage.clickOnProcessBtn();
        Thread.sleep(3000);
        bankManagerLoginPage.handleAlert();
        Thread.sleep(3000);
        openAccountPage.clickOnHomeBtn();
        homePage.clickOnCustomerLoginBtn();
        customerLoginPage.clickAndSelectOnYourNameDropDownList();
        customerLoginPage.clickOnLoginBtn();
        accountsPage.clickOnDepositTab();
        accountsPage.enterAmount();
        accountsPage.clickOnDepositOrWithdrawBtn();
        Thread.sleep(3000);
        String expectedText = "Deposit Successful";
        String actualText = accountsPage.getDepositOrWithdrawlSuccessfulMessage();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(3000);
        accountsPage.enterAmount();
        accountsPage.clickOnWithdrawlTab();
        Thread.sleep(3000);
        accountsPage.enterAmount();
        accountsPage.clickOnDepositOrWithdrawBtn();
        Thread.sleep(3000);
        String expectedText1 = "Transaction successful";
        String actualText1 = accountsPage.getDepositOrWithdrawlSuccessfulMessage();
        Assert.assertEquals(expectedText1, actualText1);
    }
}
