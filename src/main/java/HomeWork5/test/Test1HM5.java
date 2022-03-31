package HomeWork5.test;

import HomeWork5.TestBaseHM5;
import HomeWork5.pages.PageHMmain1;
import Utilis.BrowserUtilis;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1HM5 extends TestBaseHM5 {

    @Test
    public void testcase1() throws InterruptedException {
        PageHMmain1 pageHMmain1= new PageHMmain1(driver);
pageHMmain1.testCase1(driver);

    }

}
