package SeliniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        // Step1: we need to define the chrome driver in to the project as a proprety
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        // if it is  MAC you do not need the exe extention
        // Step2: we need to instantiate (decalre ) our driever
        WebDriver driver= new ChromeDriver();
        // diver is reference name.WebDriver --> interface
        // new chromeDriver  --. object
        // interview question
        // whre do you use polymorphism in you framework
        // i use it to instantiate my driver.example
        // WebDriver driver = new ChromeDriver();
        // chromeDriver driver= new ChromeDriver();
        // can you intiate your driver like WebDriver driver = new WebDriver (); the answer is no
        driver.get("https://www.techtorialacademy.com/");
        // getTitle () --> methods get the title of the page
        String title =driver.getTitle();
        System.out.println(title);
        if (title.equals("Home Page - Techtorial")){
            System.out.println("your test is passed");
        }else{
            System.out.println(" your test is failed ");

        }
        // getCurrentUrl() --> it get the current url of the website
   String actual= driver.getCurrentUrl();
        String expected="https://www.techtorialacademy.com/";
        if (actual.equals(expected)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }


    }
}
