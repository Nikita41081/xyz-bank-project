package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
By customerDropDownList = By.id("userSelect");
By currencyDropDownList = By.xpath("//select[@id='currency']");
By processBtn = By.xpath("//button[contains(text(),'Process')]");
By homeBtn = By.xpath("//button[@class='btn home']");

public void clickAndSelectOnCustomerDropDownList (){
    clickOnElement(customerDropDownList);
    selectByVisibleTextFromDropDown(customerDropDownList, "Nikita Patel");
}
public void clickAndSelectOnCurrencyDropDownList (){
    clickOnElement(currencyDropDownList);
    selectByVisibleTextFromDropDown(currencyDropDownList,"Pound");
}

public void clickOnProcessBtn (){
    clickOnElement(processBtn);
}

public void clickOnHomeBtn(){
    clickOnElement(homeBtn);
}

}
