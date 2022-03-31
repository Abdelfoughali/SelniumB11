package com.test.opencart.Test;

import com.test.opencart.Pages.MainPageOpenCart;
import com.test.opencart.Pages.OpenCartCustumerPage;
import com.test.opencart.Pages.OpenChartLoginPage;
import com.test.opencart.TestBaseOpenCart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openCartCustumerTest extends TestBaseOpenCart {

    @Test
    public void custumerfinal() throws InterruptedException {
        OpenChartLoginPage openChartLoginPage= new OpenChartLoginPage(driver);
        openChartLoginPage.login("demo","demo");
        MainPageOpenCart mainPageOpenCart= new MainPageOpenCart(driver);
        mainPageOpenCart.custumer();
        OpenCartCustumerPage openCartCustumerPage= new OpenCartCustumerPage(driver);
        openCartCustumerPage.cuctumer2();
        Assert.assertEquals(openCartCustumerPage.validatemsg(),"Warning: You do not have permission to modify customers!\n" +
                "×");;
                Assert.assertEquals(openCartCustumerPage.msgColor(),"rgba(199, 47, 29, 1)");

    }

}
