package Iframe;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePractice {
    // i frame is html inside html . Driver can handle only 1 html at a time
    // if you want a handle the iframe we should swithc our driver into the iframe
    @Test
    public void iframe1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame("mce_0_ifr");
        WebElement boxmsg=driver.findElement(By.xpath("//body[@id='tinymce']"));
       boxmsg.clear();
       boxmsg.sendKeys("i love java");
       driver.switchTo().parentFrame();
WebElement header=driver.findElement(By.xpath("//h3"));
       String actualHeader= BrowserUtilis.getTextMethod(header);
       String expectedHeader="An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actualHeader,expectedHeader);





    }


}
