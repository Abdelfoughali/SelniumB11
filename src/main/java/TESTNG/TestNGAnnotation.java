package TESTNG;

import org.testng.annotations.*;

public class TestNGAnnotation {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
        /*
        you can use to setup your browser properties or stop cokies
         */
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("beforeTest");
        // launch your browser
    }

@BeforeClass
public void beforeClas(){
    System.out.println("before class");

    // you can navigate to the website
}
    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method");
        // you can use it to login to the page
    }

    @Test
    public void test1(){
        System.out.println("test-1");


    }
    @Test
    public void test2(){
        System.out.println("test2");

    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("after method");
        // you can take screenshot for failed test
        // driver.quit()
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println(" after suite");
    }
}
