package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
         driver.get("https://demoqa.com/radio-button");
        WebElement radioButton=driver.findElement(By.id("yesRadio"));
       // ((JavascriptExecutor) driver).executeScript()
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click()",radioButton);
radioButton.click();


    }

}
