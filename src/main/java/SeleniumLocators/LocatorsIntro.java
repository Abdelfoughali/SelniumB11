package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/jafar%20foughali/Downloads/Techtorial%20(2).html");
//LOCATORS :id
        WebElement techtorialacademy =driver.findElement(By.id("techtorial1"));
        String actualtext =techtorialacademy.getText(); // from the system
        String expectedText="Techtorial Academy";// from the business requirement
        System.out.println(techtorialacademy.getText());
        if (actualtext.equals(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        WebElement paragrapg= driver.findElement(By.id("details2"));
        System.out.println(paragrapg.getText());
// LOCATORS:CLASSNAME
//        WebElement tools = driver.findElement(By.className("group_checkbox"));
//        System.out.println(tools.getText());
WebElement tools= driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());
        // locators name
//        WebElement firstName=driver.findElement(By.name("firstName"));
//        firstName.sendKeys("abdennour");
 driver.findElement(By.name("firstName")).sendKeys("abdennour");


//        WebElement firstName1=driver.findElement(By.name("lastName"));
//        firstName1.sendKeys("foughali");
        driver.findElement(By.name("lastName")).sendKeys("foughali");

        WebElement phone=driver.findElement(By.name("phone"));
       phone.sendKeys("3125760131");
       WebElement email=driver.findElement(By.name("userName"));
       email.sendKeys("abdelfoughali@gmail.com");

//        WebElement javaBox=driver.findElement(By.id("cond1"));
//        javaBox.click();
//        System.out.println(javaBox.isDisplayed()); //return true
//        System.out.println(javaBox.isSelected());// return true
WebElement javabox= driver.findElement(By.id("cond1"));
javabox.click();
        System.out.println(javabox.isSelected());
        System.out.println(javabox.isDisplayed());
        System.out.println(javabox.isEnabled());

        WebElement javaBox1=driver.findElement(By.id("cond3"));
        javaBox1.click();
        System.out.println(javaBox1.isDisplayed());
        System.out.println(javaBox1.isDisplayed());
        WebElement javaBox2=driver.findElement(By.id("cond4"));
        javaBox2.click();
        System.out.println(javaBox2.isDisplayed());
        System.out.println(javaBox2.isDisplayed());

    }


}
