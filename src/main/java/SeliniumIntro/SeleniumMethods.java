package SeliniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
       // Thread.sleep(3000);
        System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
        // driver.getPageSource() it gives html source of the page
       // System.out.println(driver.getPageSource());
        driver.navigate().to("https://www.techtorialacademy.com/");
        //Thread.sleep(3000);
        driver.navigate().back();  // amazon
       /// Thread.sleep(3000);
        driver.navigate().forward();  // techtorial
        //Thread.sleep(3000);
         //driver.navigate().refresh();
        // interview question what is the difference between the driver.close() and driver.quit()
        driver.close();


    }
}
