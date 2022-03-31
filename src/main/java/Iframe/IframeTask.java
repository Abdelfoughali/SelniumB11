package Iframe;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTask {
    @Test
    public void test() throws InterruptedException {

        /*
TASK:
    1)Navigate to the website "https://skpatro.github.io/demo/iframes/"
    2)Click Pavilion and click selenium-java and validate the header
    3)Go back to mainPage and click category1
    4)from new webpage validate the title is ending with "qavalidation"
    5)Go back to mainppage and click Category3
    6)validate the new url is equal to "https://qavalidation.com/category/softwaretesting/"
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes/");
        driver.manage().window().maximize();
        WebElement pavillion=driver.findElement(By.xpath("//a[.='Pavilion']"));
        pavillion.click();
        BrowserUtilis.SwitchTwoTabs(driver,"Home - qavalidation");
        WebElement selenium=driver.findElement(By.xpath("//a[@href='http://qavalidation.com/category/seleniumtesting/']//span//span[contains(text(),'Selenium')]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(selenium).perform();
       // actions.sendKeys("Selenium-Java").click().perform();
       WebElement selenimJava=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[.='Selenium-Java']"));
// //ul[@id='primary-menu']//span[.='Selenium-Java']   you can use this also with webelement
selenimJava.click();
        WebElement header= driver.findElement(By.xpath("//h1"));
        String actual=BrowserUtilis.getTextMethod(header);

        String expected="Selenium-Java Tutorial – Basic to Advance";
        Assert.assertEquals(actual,expected);
//        BrowserUtilis.SwitchTwoTabs(driver,"iframes"); // switching the window
//        driver.switchTo().frame("Frame1");
//        WebElement category1=driver.findElement(By.xpath("//a[.='Category1'"));
//        category1.click();

        Thread.sleep(2000);
        BrowserUtilis.SwitchAllTabs(driver,"iframes");//I am switching the window to main window
        driver.switchTo().frame("Frame1");
        WebElement category1= driver.findElement(By.xpath("//a[.='Category1']"));//nosuch element because it is in iframe
        Thread.sleep(2000);
        category1.click();
        BrowserUtilis.SwitchAllTabs(driver,"qavalidation");
        Assert.assertTrue(driver.getTitle().endsWith("qavalidation"));
        Thread.sleep(2000);
        BrowserUtilis.SwitchAllTabs(driver,"iframes");
        driver.switchTo().frame("Frame2");
        WebElement category3= driver.findElement(By.xpath("//a[.='Category3']"));
        Thread.sleep(2000);
        category3.click();
        BrowserUtilis.SwitchAllTabs(driver,"SoftwareTesting Archives");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://qavalidation.com/category/softwaretesting/"));
        Thread.sleep(2000);









    }
}
