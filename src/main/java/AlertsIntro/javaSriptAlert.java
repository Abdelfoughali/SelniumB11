package AlertsIntro;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class javaSriptAlert {

    @Test
    public void JSBasicAlert(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement ClickAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        ClickAlert.click();

        Alert alert=driver.switchTo().alert();
        String actualText=alert.getText();
        String expected="I am a JS Alert";
        Assert.assertEquals(actualText,expected);
        alert.accept();
        WebElement msg=driver.findElement(By.xpath("//p[@id='result']"));
        String actualmsg=msg.getText().trim();
        String expectedmsg="You successfully clicked an alert";
        Assert.assertEquals(actualmsg,expectedmsg);

    }

    @Test
    public void DismisMethods(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement cancelButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        cancelButton.click();
        Alert alert=driver.switchTo().alert();

       String acutalmsg= alert.getText();
       String expectedmsg="I am a JS Confirm";
       Assert.assertEquals(acutalmsg,expectedmsg);
       alert.dismiss();
        WebElement msg=driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));
        String actualmsg1=msg.getText().trim();
        String expectedmsg1="You clicked: Cancel";
        Assert.assertEquals(actualmsg1,expectedmsg1);


    }
    @Test
    public void sendkeys() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement sendkeyss=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        sendkeyss.click();

        Alert alert=driver.switchTo().alert();


        alert.sendKeys("abdelfoughali@gmail...com");
        Thread.sleep(150);
        alert.accept();
        WebElement message=driver.findElement(By.xpath("//p[@id='result']"));
        String actmsg= BrowserUtilis.getTextMethod(message);
        String epctmsg="You entered: abdelfoughali@gmail...com";
        Assert.assertEquals(actmsg,epctmsg);


    }

}

