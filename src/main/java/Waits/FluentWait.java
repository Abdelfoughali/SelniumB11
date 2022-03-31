package Waits;

import Utilis.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWait {
    @Test
public void FluentWaitTest(){
    WebDriver driver= DriverHelper.getDriver();
driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement removeButton=driver.findElement(By.xpath("//button[.='Remove']"));
        removeButton.click();
        Wait<WebDriver> fluentwait= new org.openqa.selenium.support.ui.FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(1))
                .withMessage("Text on the page")
                .withTimeout(Duration.ofSeconds(2))
                .ignoring(Exception.class);
        WebElement message=fluentwait.until(mydriver->driver.findElement(By.xpath("//p[@id='message']")));
        System.out.println(message.getText().trim());
        Assert.assertEquals(message.getText().trim(),"It's gone!");




}}
