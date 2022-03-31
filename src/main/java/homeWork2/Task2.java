package homeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TASK 2:Creating an account for nopcommerce and validation
1-NAVIGATE TO THE WEBSITE https://demo.nopcommerce.com/
2-Click Register
3-Fill the information
4-Newsletter box should be left unclicked
5-Click Register
6-Validate “Your registration completed”
7-Click Continue (edited) 
        */
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement regester=driver.findElement(By.xpath("//a[@class='ico-register']"));
        regester.click();
WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
gender.click();
WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
firstName.sendKeys("Abdennour");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("foughali");
WebElement date=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
date.sendKeys("3");
        WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        month.sendKeys("September");
        WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("1990");

        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("Jafar_18@hotmail.fr");

WebElement company=driver.findElement(By.xpath("//input[@id='Company']"));
company.sendKeys("techtorial");

WebElement pasword=driver.findElement(By.xpath("//input[@id='Password']"));
pasword.sendKeys("jafar040239@");
        WebElement pasword1=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        pasword1.sendKeys("jafar040239@");
        WebElement submit=driver.findElement(By.xpath("//button[@id='register-button']"));
        submit.click();
        Thread.sleep(1000);

        WebElement validation=driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']"));
        validation.click();

    }


}
