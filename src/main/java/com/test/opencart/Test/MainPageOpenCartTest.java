package com.test.opencart.Test;

import Utilis.BrowserUtilis;
import com.test.opencart.Pages.MainPageOpenCart;
import com.test.opencart.Pages.OpenCartCustumerPage;
import com.test.opencart.Pages.OpenChartLoginPage;
import com.test.opencart.TestBaseOpenCart;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageOpenCartTest extends TestBaseOpenCart {

    @Test

    public void validationOpenCart() throws InterruptedException {
        OpenChartLoginPage openChartLoginPage= new OpenChartLoginPage(driver);
        openChartLoginPage.login("demo","demo");
        MainPageOpenCart mainPageOpenCart= new MainPageOpenCart(driver);


Assert.assertEquals(mainPageOpenCart.Validation().trim(),"12K");
Assert.assertEquals(mainPageOpenCart.Validation1().trim(),"11.8M");
Assert.assertEquals(mainPageOpenCart.Validation2().trim(),"145.4K");
mainPageOpenCart.custumer();



    }


}
