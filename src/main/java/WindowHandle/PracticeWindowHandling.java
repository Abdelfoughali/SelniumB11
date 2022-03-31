package WindowHandle;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeWindowHandling {
    @Test
    public void practice1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        WebElement taps4=driver.findElement(By.id("newTabsBtn"));
        taps4.click();
        BrowserUtilis.SwitchAllTabs(driver,"\n"+"Basic Controls-\n"+ "H Y R Tutorials");
        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys("abdennour");
        WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
        firstname.sendKeys("foughali");
        WebElement language=driver.findElement(By.xpath("//input[@id='englishchbx']"));
        language.click();
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("abdelfoughali@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        email.sendKeys("12345");
        //
        WebElement submit=driver.findElement(By.xpath("//button[@id='registerbtn']"));
       submit.click();
        //label[@id='msg']
        WebElement masg=driver.findElement(By.xpath("//label[@id='msg']"));
        String expc=masg.getText();
        String actual="Registration is Successful";

        Assert.assertEquals(expc,actual);
        BrowserUtilis.SwitchAllTabs(driver,"Alerts");
        WebElement clickme=driver.findElement(By.id("alertBox"));
        clickme.click();
        driver.quit();

    }
}
