package SeliniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumBasics {
    /* i want to you go to three website
     . get the title currentURl
     you decides and going back
     // forward with them lastly refresh and quit.

    */
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("https://www.chicago.gov/city/en.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      //  driver.get("https://www.britannica.com/place/Romania");
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        driver.close();

    }


}
