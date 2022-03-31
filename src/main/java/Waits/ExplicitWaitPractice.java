package Waits;

import Utilis.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitPractice {




    @Test
    public void validateWait(){
        WebDriver driver= DriverHelper.getDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement satart1=driver.findElement(By.xpath("//button[.='Start']"));
        satart1.click();
//      WebElement text=driver.findElement(By.xpath("//h4[.='Hello World!']"));
//      String actual =text.getText().trim();
//        String expected="Hello World!";
//        Assert.assertEquals(actual,expected);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement text1= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[.='Hello World!']"))));
        Assert.assertEquals(text1.getText().trim(),"Hello World!");

    }
}
