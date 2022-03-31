package com.test.opencart.Test;

import com.test.opencart.Pages.OpenChartLoginPage;
import com.test.opencart.TestBaseOpenCart;
import org.testng.annotations.Test;

public class LoginPageopenchartTest extends TestBaseOpenCart {

    @Test
    public void validateLogin(){
        OpenChartLoginPage openChartLoginPage= new OpenChartLoginPage(driver);
        openChartLoginPage.login("demo","demo");
    }


}
