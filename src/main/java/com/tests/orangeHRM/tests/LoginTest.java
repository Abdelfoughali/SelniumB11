package com.tests.orangeHRM.tests;

import TESTNG.DatForNames;
import Utilis.ConfiReader;
import com.tests.orangeHRM.DataForLoginNegativeTest;
import com.tests.orangeHRM.TestBase;
import com.tests.orangeHRM.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void ValidationLoginPositve() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfiReader.readProperty("orangeHRMusername"),ConfiReader.readProperty("orangeHRMpassword"));
//        String acutalUrl = driver.getCurrentUrl();
//        String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");


    }


    @Test(dataProvider = "LoginNegativeScenario",dataProviderClass = DataForLoginNegativeTest.class)
    public void ValidationLoginNegative(String username,String password,String expectedmsg) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
//        String actualErrorMessage=loginPage.getErrorMessage();
//        String expectedErrorMessage=expectedmsg;
        Assert.assertEquals(loginPage.getErrorMessage(),expectedmsg);

    }

    // 2 more negative scenarios(wrong username, correct password // wrong username,wrong password)



















//
//    @Test
//    public void ValidationLoginNegative2() {
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
////        driver.manage().window().maximize();
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("", "");
//        String actualErrorMessage=loginPage.getErrorMessage();
//        String expectedErrorMessage="Username cannot be empty";
//        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
//        String actualColorOfErrorMessage=loginPage.getcolorOfTheErroMsg();
//String expectedColorOfMessage="rgba(221, 119, 0, 1)";
//Assert.assertEquals(actualColorOfErrorMessage,expectedColorOfMessage);
//
//
//    }




}