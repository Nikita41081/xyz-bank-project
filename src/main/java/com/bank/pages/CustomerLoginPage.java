package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By yourNameDropDownList = By.id("userSelect");
    By loginBtn = By.xpath("//button[@class='btn btn-default']");
    By selectAccountNo = By.xpath("//select[@id='accountSelect']");

    public void clickAndSelectOnYourNameDropDownList() {
        clickOnElement(yourNameDropDownList);
        selectByVisibleTextFromDropDown(yourNameDropDownList, "Nikita Patel");
    }

    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
    }


}
