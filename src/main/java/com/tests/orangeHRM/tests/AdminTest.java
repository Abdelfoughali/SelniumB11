package com.tests.orangeHRM.tests;

import Utilis.ConfiReader;
import com.tests.orangeHRM.DataForLoginNegativeTest;
import com.tests.orangeHRM.pages.LoginPage;
import com.tests.orangeHRM.TestBase;
import com.tests.orangeHRM.pages.AdminPage;
import com.tests.orangeHRM.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminTest extends TestBase {

    @Test
    public void ValidateTheCreationOfTheEmployeeMsg() throws InterruptedException {

        LoginPage loginPage= new LoginPage(driver);

        Thread.sleep(1000);
        loginPage.login("Admin","admin123");
        Thread.sleep(1000);
        MainPage mainPage= new MainPage(driver);
        Thread.sleep(1000);
        mainPage.clickadminpage();

        AdminPage adminPage= new AdminPage(driver);
        Thread.sleep(1000);
        adminPage.sendingAllInformationForEmployee();
       Assert.assertEquals(adminPage.ValidationTheEmployeeIsCreated("abdel1111"),true);


    }
    @DataProvider(name = "UserRoles")
    public Object[][] getUserRoles(){
        return new Object[][]{
                {"Admin"},
                {"ESS"}
        };
    }



    @Test(dataProvider = "UserRoles",dataProviderClass = DataForLoginNegativeTest.class)
    public void ValidateTheselectRoleFunction1(String roleName1){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login(ConfiReader.readProperty("orangeHRMusername"),ConfiReader.readProperty("orangeHRMpassword"));
        MainPage mainPage= new MainPage(driver);
        mainPage.clickadminpage();
        AdminPage adminPage= new AdminPage(driver);
        adminPage.selectUserRole(roleName1,driver);

Assert.assertTrue(adminPage.validateRoleText(roleName1));

    }



    @Test
    public void ValidateTheselectRoleFunction(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.login(ConfiReader.readProperty("orangeHRMusername"),ConfiReader.readProperty("orangeHRMpassword"));
    MainPage mainPage= new MainPage(driver);
    mainPage.clickadminpage();
    AdminPage adminPage= new AdminPage(driver);
    adminPage.selectUserRole("ESS",driver);
        Assert.assertTrue(adminPage.validateRoleText("ESS"));


}
}
