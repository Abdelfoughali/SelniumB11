package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPractice {
    /*
    Facebook Sign up:
Scenario:
Open a Chrome browser.
Navigate to "http://www.fb.com"
Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
Verify that there is a "Create an account" section on the page.
Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
Update the date of birth in the drop-down.
Select gender.
Click on "Create an account".
Verify that the account is not created.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String actualURL = driver.getCurrentUrl();
        String expectedURL="https://www.facebook.com/";

        if (actualURL.equals(expectedURL)){
            System.out.println("web site is correct");
        }else
            System.out.println("the web site is wrong");
        WebElement create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        boolean validation=create.isDisplayed();
        boolean expected=true;
        if (validation==expected){
            System.out.println("displayed");
        }else {
            System.out.println("not displayed");
        }
        create.click();
Thread.sleep(10000);
      WebElement firstname=driver.findElement(By.name("firstname"));
      firstname.sendKeys("jafar");

//
WebElement lastname=driver.findElement(By.name("lastname"));
lastname.sendKeys("foughali");

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("abdelfoughalii@gmail.com");
////input[@name='reg_email_confirmation__']
        WebElement remail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        remail.sendKeys("abdelfoughalii@gmail.com");
        ////input[@id='u_2_j_x1']
        WebElement password=driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("jafar6587ty");
        //month
        WebElement month=driver.findElement(By.id("month"));
        month.sendKeys("Sep");
//birthday_day
        WebElement day=driver.findElement(By.name("birthday_day"));
        day.sendKeys("3");
//birthday_day
        WebElement year=driver.findElement(By.name("birthday_year"));
        year.sendKeys("1990");
////input[@name='sex' and @value='2']
        WebElement sex=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        sex.click();
        WebElement submit=driver.findElement(By.name("websubmit"));
        submit.click();


    }
}
