package SoftAssertPr;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIntro {


    public int getSum(int num1,int num2){
        return  num1+num2;
    }

    @Test
    public void test(){

        Assert.assertEquals(getSum(2,6),8);
        System.out.println("TEST1");
        Assert.assertEquals(getSum(0,2),0);
        System.out.println("TEST2");
        Assert.assertEquals(getSum(-3,6),3);
        System.out.println("TEST3");
    }

    @Test
    public void test1(){
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(getSum(2,4),8);
        System.out.println("tes1");
        softAssert.assertEquals(getSum(0,0),0);
        System.out.println("TEST2");
        softAssert.assertEquals(getSum(-3,1),3);
        System.out.println("TEST3");
        softAssert.assertAll();

    }
}
