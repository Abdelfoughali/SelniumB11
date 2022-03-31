package TESTNG;

import org.testng.annotations.DataProvider;

public class DatForNames {
    @DataProvider(name ="FullnameTest")
    public Object[][] getData(){
        return new Object[][]{
                {"jafar","foughali","jafar foughali"},
                { "eric","eric2","eric eric2"},
                {"enes","enes1","enes enes1"},
                {"olivia","charopova","olivia charopova"},
                {"abdennour","foughali","abdennour foughali"},
                {"george","serghie","george serghie"},
                {"mohamed","foughali","mohamed foughali"}
        };
    }
}
