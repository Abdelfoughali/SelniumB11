package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TESTNGAssertion {

    // create one method that take two parameter and return
    // multiplication of this numbers
    public double getmulti(double a,double b){
        return a*b;
    }
    @Test(priority = -1)
    public void validation(){
        double Actualresult=getmulti(5,6);
        double expected=30;
        Assert.assertEquals(Actualresult,expected,"my number are 5 and 6");
        System.out.println("-1111111");
    }
    public double getDivision(double num1,double mun2){
        if (num1>=mun2){
            return num1/mun2;
        }
            return mun2/num1;

    }
    public int substration(int number1,int number2){
        if (number1>=number2){
            return number1-number2;
        }
        return number2/number1;

    }

    @Test(priority = 0)
    public void validationdivision(){
    double actualresult=getDivision(8,2);
    double expected2=4;
    Assert.assertEquals(actualresult,expected2);
        System.out.println("00000");
    }
@Test(priority = 1)
    public void validatesubstracte(){
        int actualres=substration(65,43);
        int expected1=22;
        Assert.assertEquals(actualres,expected1);
    System.out.println("11111");
}

}
