package Iframe;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrame {
    @Test
    public void nestedFrame(){
  WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
       driver.switchTo().frame(0);

        WebElement middleFrame=driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(middleFrame);
        WebElement textBox=driver.findElement(By.xpath("//div[@id='content']"));
        String actaulname= BrowserUtilis.getTextMethod(textBox);
        String expectedName="MIDDLE";
        Assert.assertEquals(actaulname,expectedName);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        WebElement leftFrame=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
String actaulText=leftFrame.getText().trim();
String expectedText1="LEFT";
Assert.assertEquals(actaulText,expectedText1);

// driver.switchTo().parentFrame();
      //  driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrame=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        String actaulText1=bottomFrame.getText().trim();
        String expectedText11="BOTTOM";
        Assert.assertEquals(actaulText1,expectedText11);



}


}
