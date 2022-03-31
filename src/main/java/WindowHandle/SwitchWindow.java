package WindowHandle;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
//    @Test
//    public void practaice1(){
//
//        // the reason of failing bacause of the new window opening
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/windows");
//        WebElement cliHere= driver.findElement(By.xpath("//a[.='Click Here']"));
//        cliHere.click();
//
//        WebElement header= driver.findElement(By.xpath("//h3[.='New Window']"));
//        System.out.println(header.getText());
//
//
//    }
    @ Test
    public  void SwitchingWindow() {// for review it failed
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
      //  System.out.println(driver.getWindowHandle());
        WebElement cliHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        cliHere.click();
        //System.out.println(driver.getWindowHandles());
        String mainPage = driver.getWindowHandle();
        Set<String> allPages = driver.getWindowHandles();
        for (String id : allPages) {
            System.out.println(id);
            if (!id.equals(mainPage)) {

                driver.switchTo().window(id);
            }
        }
        WebElement header = driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println(header.getText());
        String actualText = header.getText();
        String expected = "New Window";
        Assert.assertEquals(actualText, expected);

    }

    @Test
    public void practice1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String mainPage=driver.getWindowHandle();
        driver.manage().window().maximize();
        WebElement newTab= driver.findElement(By.id("newTabBtn"));
        newTab.click();

//        Set<String> allPages = driver.getWindowHandles();
//        for (String id:allPages){
//            System.out.println(id);
//            if (!id.equals(mainPage)){
//
//                driver.switchTo().window(id);
//            }
//
//            //alertBox
//    }
        BrowserUtilis.SwitchTwoTabs(driver,mainPage);
        WebElement gettextmain= driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        System.out.println(gettextmain.getText());
        String actual=gettextmain.getText();
        String expected="AlertsDemo";
        Assert.assertEquals(actual,expected);
  WebElement element=driver.findElement(By.id("alertBox"));
        element.click();

}}
