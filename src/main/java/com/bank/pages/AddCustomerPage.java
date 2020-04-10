package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstName =By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomersBtn = By.xpath("//button[@class='btn btn-default']");

    public void enterFirstName(){sendTextToElement(firstName,"Nikita");}
    public void enterLastName(){sendTextToElement(lastName,"Patel");}
    public void enterPostCode(){sendTextToElement(postCode,"LU4 8HQ");}
    public void clickOnAddCustomerBtn(){clickOnElement(addCustomersBtn);}
}
