package TESTNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
//@DataProvider(name ="FullnameTest")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"jafar","foughali","jafar foughali"},
//                { "eric","eric2","eric eric2"},
//                {"enes","enes1","enes enes1"},
//                {"olivia","charopova","olivia charopova"},
//                {"abdennour","foughali","abdennour foughali"},
//                {"george","serghie","george serghie"},
//                {"mohamed","foughali","mohamed foughali"}
//        };
//    }

    @Test(dataProvider = "FullnameTest",dataProviderClass = DatForNames.class)
    public void test1(String useName,String lastName,String expectedfullname){
//        String userName=useName;
//        String lasName=lastName;
//        String fullName=useName+" "+lastName;
//        Assert.assertEquals(fullName,expectedfullname);
        System.out.println(expectedfullname);
    }

}
