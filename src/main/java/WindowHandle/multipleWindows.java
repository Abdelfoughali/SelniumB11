package WindowHandle;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class multipleWindows {

    @Test
    public void MultipleWindows(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickhere=driver.findElement(By.xpath("//a[.='Click Here']"));
        clickhere.click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");

//        Set<String> allpages=driver.getWindowHandles();
//        for (String id :allpages){
//            driver.switchTo().window(id);
//            if (driver.getTitle().contains("About Us - Techtorial")){
//                driver.manage().window().maximize();
//                break;
//            }
//        }
        BrowserUtilis.SwitchAllTabs(driver,"Home Page");




    }
}
