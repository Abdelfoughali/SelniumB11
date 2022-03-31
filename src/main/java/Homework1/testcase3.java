package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.id("user-name"));
userName.sendKeys("Java");
        WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("Selinium");
//submit-button btn_action
        WebElement submit =driver.findElement(By.id("login-button"));
        submit.click();
        WebElement msg = driver.findElement(By.xpath("//h3"));
        String actual=msg.getText();
        String expected="Epic sadface: Username and password do not match any user in this service";

        if (actual.equals(expected)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }



    }
}
