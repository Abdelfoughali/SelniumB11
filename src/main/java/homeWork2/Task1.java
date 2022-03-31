package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*Here is your Homework By tomorrow's class. TASK: CREATING AN ACCOUNT FOR AMAZON:
1-NAVIGATE TO THE WEBSITE https://www.amazon.com/
2_Click Hello, Sign in Button
3-Click Create your amazon account button
4-Fill the information and click Continue Button
5-If there is an error or message. Validate it, if not then you completed the task

        */
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement logInBotton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        logInBotton.click();
driver.getCurrentUrl();
WebElement createcompte=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
createcompte.click();
driver.getCurrentUrl();
WebElement name=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
name.sendKeys("Abdennour foughali");
WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
email.sendKeys("kahinaflissi05@gmail.com");
WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
password.sendKeys("Jafar3930@");
        WebElement password1=driver.findElement(By.xpath("//input[@id='ap_password_check']"));
        password1.sendKeys("Jafar3930@");

        WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        driver.getCurrentUrl();
        WebElement adrress=driver.findElement(By.xpath("//h4[contains(text(),'Email address already in use')]"));
        System.out.println(adrress.getText());
        String actual=adrress.getText();
        String expected="Email address already in use";
        if (actual.equals(expected)){
            System.out.println("validate");
        }




    }
}
