package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginBtn = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginBtn = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnBankManagerLoginBtn() {
        clickOnElement(bankManagerLoginBtn);
    }

    public void clickOnCustomerLoginBtn() {
        clickOnElement(customerLoginBtn);
    }
}
