package TESTNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
    @Parameters("FirstName")
    @Test(priority = 1,invocationCount = 10)
    public void test(String name){
        System.out.println(name);
    }
@Parameters({"City","State"})
    @Test
    public void test1(String city,String state){
        System.out.println(city);
        System.out.println(state);
    }
}
