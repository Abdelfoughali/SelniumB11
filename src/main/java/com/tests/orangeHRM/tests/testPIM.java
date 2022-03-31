package com.tests.orangeHRM.tests;

import com.tests.orangeHRM.TestBase;
import com.tests.orangeHRM.pages.LoginPage;
import com.tests.orangeHRM.pages.MainPage;
import com.tests.orangeHRM.pages.PimPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testPIM extends TestBase {
    LoginPage loginPage;
    MainPage mainPage;
    PimPage pimPage;
    @BeforeMethod
            public void intializePages() {
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        pimPage = new PimPage(driver);
    }

    @Test
public void validatePim() throws InterruptedException {

        Thread.sleep(1000);
        loginPage.login("Admin","admin123");
        Thread.sleep(1000);
        mainPage.clickPIMpage();
      pimPage.addEmployyetoPIM("jafar","foughali","1990","C:\\Users\\jafar foughali\\Desktop/usa.png");

        Assert.assertEquals(pimPage.validationNameentered(),"jafar");
        Assert.assertEquals(pimPage.validateLastName(),"foughali");
        Assert.assertTrue(pimPage.validatemeployeeId("1990"));

}
@Test
    public void validatePersonnelDetailElement() throws InterruptedException {
    loginPage.login("Admin","admin123");
    Thread.sleep(1000);
    mainPage.clickPIMpage();
    Thread.sleep(500);

    pimPage.addEmployyetoPIM("jafar","foughali","1990","C:\\Users\\jafar foughali\\Desktop/usa.png");
Thread.sleep(1000);

    pimPage.editemployeeDetails("Algerian","1990-03-09","Single");

Assert.assertEquals(pimPage.validationTheNationality(),"Algerian");


}






}
