package JavaScriptExecuter;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSMethods {
    @Test
    public void javaScriptMethod(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle()+"from driver");

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        String title=javascriptExecutor.executeScript("return document.title").toString();
        System.out.println(title+"from java script");

        String actualTitle= BrowserUtilis.GetTitleWithJS(driver);
        String expectedTitle="Home Page - Techtorial";
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test // i use this method a lot
    public void ClickWithJS(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.get("http://www.techtorialacademy.com/");
//        WebElement browserCourse=driver.findElement(By.xpath("//a[.='Browse Course']"));
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
//       // JavascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        WebElement browserCourse=driver.findElement(By.xpath("//a[.='Browse Course']"));
//        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
//       javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        BrowserUtilis.ClickWithJS(driver,browserCourse);


    }
    @Test
    public void ClickWithJSPractice(){
        // click hte student login
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        WebElement loginButon=driver.findElement(By.xpath("//div[@class='sidenav'] //a[.='Student login']"));
        BrowserUtilis.ClickWithJS(driver,loginButon);



    }

    @Test
    public void ScrollIntoView(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
       WebElement copyright= driver.findElement(By.xpath("//p[contains(text(),'Copy')] "));
       JavascriptExecutor js= (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true)",copyright);




    }


    @Test
    public void practice(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");

        WebElement  browser = driver.findElement(By.xpath("//a[.='Browse Course']"));
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",browser);

       WebElement getstartd= driver.findElement(By.xpath("//h4[.='On-Campus Course']//..//a"));
       JavascriptExecutor js= (JavascriptExecutor) driver;
      js.executeScript("arguments[0].scrollIntoView(true)",getstartd);
       // BrowserUtilis.ScrollWithJS(driver,getstartd);
      // yoiu can use BrowserUtilis.ClickWithJS(driver,getstarted);
    }
@Test
    public void ScroolWithXandYCordianTest(){
        // this is interview quaetion
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("http://www.techtorialacademy.com/");
    driver.manage().window().maximize();
    WebElement copyright= driver.findElement(By.xpath("//p[contains(text(),'Copy')] "));
//    JavascriptExecutor js= (JavascriptExecutor) driver;
//    Point location=copyright.getLocation();
//    System.out.println(location.getX());
//    System.out.println(location.getY());
//
//    int xCord=location.getX();
//    int yCord=location.getY();
//
//    js.executeScript("window.scrollTo("+xCord+","+yCord+")");
    BrowserUtilis.ScrollWithXandYCord(driver,copyright);



}
@Test
    public void MoveByOffSetMethod(){

        // Task by using the move by off set and point class    click contact us
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        WebElement conatactus=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
        Point cordoanteOfcontactUs=conatactus.getLocation();
        int xCoord=cordoanteOfcontactUs.getX();
        int yCoord=cordoanteOfcontactUs.getY();
       Actions actions= new Actions(driver);
       actions.moveByOffset(xCoord,yCoord).click().perform();

}

}
