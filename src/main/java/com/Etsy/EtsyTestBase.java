package com.Etsy;

import Utilis.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EtsyTestBase {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
      driver= DriverHelper.getDriver();
      driver.get("https://www.etsy.com/");

    }
    @AfterMethod
    public void tearDown(){

        //  driver.quit();
        DriverHelper.tearDown();
    }



}
