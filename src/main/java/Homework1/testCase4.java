package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase4 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
//submit-button btn_action
        WebElement submit =driver.findElement(By.id("login-button"));
        submit.click();
String actual =driver.getCurrentUrl();
        System.out.println(actual);
        String expected="https://www.saucedemo.com/inventory.html";
        if (actual.equals(expected)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
