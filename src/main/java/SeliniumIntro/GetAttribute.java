package SeliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement googleserach=driver.findElement(By.name("btnK"));
      //  System.out.println(element.getText());  no text it is not working
        System.out.println(googleserach.getAttribute("value"));
        System.out.println(googleserach.getAttribute("aria-label"));
        if (googleserach.getAttribute("value").equals("Google Search")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
    }
}
