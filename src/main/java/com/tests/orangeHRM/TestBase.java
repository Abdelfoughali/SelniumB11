package com.tests.orangeHRM;

import Utilis.BrowserUtilis;
import Utilis.ConfiReader;
import Utilis.DriverHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
  public   WebDriver driver;
    @BeforeMethod
    public void setup(){

        driver = DriverHelper.getDriver();
        driver.get(ConfiReader.readProperty("urlOrangeHRM"));

       // System.out.println("i am running before any test annotation");

    }
    @AfterMethod
    public void tearDown(ITestResult result){
        if (!result.isSuccess())
            BrowserUtilis.getscreenShot(driver,"OrangeHrmScreenShot");
       // System.out.println("iam running after aech test annotation");
        //driver.quit();

       // DriverHelper.tearDown();
    }




}
