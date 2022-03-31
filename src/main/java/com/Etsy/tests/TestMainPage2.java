package com.Etsy.tests;

import com.Etsy.EtsyTestBase;
import com.Etsy.pages.Etsymainpage2;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMainPage2 extends EtsyTestBase {
@Parameters("itemSearch")
    @Test
    public void EtsySerachTest(String item){
        Etsymainpage2 etsymainpage2= new Etsymainpage2(driver);
        etsymainpage2.serchiphone(item);

    }
}
