package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkesAndTags {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/jafar%20foughali/Downloads/Techtorial%20(2).html");
        driver.manage().window().maximize();
//        WebElement javaLink =driver.findElement(By.linkText("Java"));
//        javaLink.click();
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
//        driver.navigate().back();
        WebElement javaLink=driver.findElement(By.linkText("Java"));
        javaLink.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.navigate().back();

//        WebElement seliniumlink=driver.findElement(By.linkText("Selenium"));
//        seliniumlink.click();
//        driver.navigate().back();

        WebElement selenium=driver.findElement(By.linkText("Selenium"));
        selenium.click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();


        javaLink =driver.findElement(By.linkText("Java"));
       javaLink.click();
       driver.navigate().back();
        WebElement restApi=driver.findElement(By.partialLinkText("Rest"));
        restApi.click();
        driver.navigate().back();
        WebElement version=driver.findElement(By.tagName("u"));
        System.out.println(version.getText());
    }
}
