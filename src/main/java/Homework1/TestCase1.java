package Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    // frist step for starting the automation should be reading the test

    // test by step implement the requiremnt
    // interview question what is the web driver and why do you need it ?
    //web driver is a connection webpage and your system it is used to
    // manipulate (change ..etc ) the web element
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameBox=driver.findElement(By.xpath("//input[@id='userName']"));
        fullNameBox.sendKeys("abdennour foughali");

        WebElement emailBox=driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailBox.sendKeys("abdelfoughali@gmail.com");

        WebElement curentAdrees = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        curentAdrees.sendKeys("4367526 s bernard");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("algerie maamar");

        WebElement button= driver.findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        Thread.sleep(500);

        button.click();
    }



}
