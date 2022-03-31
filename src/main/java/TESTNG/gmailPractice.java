package TESTNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmailPractice {


    @Test
    public void Practice1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("gmail", Keys.ENTER);
        driver.manage().window().maximize();
        WebElement gmailtext= driver.findElement(By.xpath("//h3[.='Gmail - Google']"));
        gmailtext.click();
        WebElement signin= driver.findElement(By.xpath("\"//input[@id='username']\""));

    }
}
