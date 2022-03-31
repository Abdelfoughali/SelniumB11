package com.tests.orangeHRM;

import org.testng.annotations.DataProvider;

public class DataForLoginNegativeTest {
    @DataProvider(name ="LoginNegativeScenario" )
    public Object[][] getNegativeScenarioData(){
        return new Object[][]{
                {"Admin","wrongpassword","Invalid credentials"},
                {"Wrongusernaem","admin123","Invali credentials"},
                {"Wrongusernaem","wronpassword","Invalid credentials"}
        };
    }

    @DataProvider(name = "UserRoles")
    public Object[][] getUserRoles(){
        return new Object[][]{
                {"Admin"},
                {"ESS"}
        };
    }
}
