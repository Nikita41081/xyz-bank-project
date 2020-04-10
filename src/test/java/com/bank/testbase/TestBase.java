package com.bank.testbase;

import com.bank.basepage.BasePage;
import com.bank.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "http://www.way2automation.com/angularjs-protractor/banking/#/login";

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectorBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

/*
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
*/
}
