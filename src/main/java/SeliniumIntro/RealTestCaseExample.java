package SeliniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTestCaseExample {
    //  Test Case - Open Godaddy.com and validate it's Page title and the url.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and validate it.
//4. Get URL of current page and validate it.
//            5. Close browser.
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.godaddy.com/");
        webDriver.manage().window().maximize();
       String str= webDriver.getTitle();
        if (str.equals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        String str1=webDriver.getCurrentUrl();
        if (str1.equals("https://www.godaddy.com/")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        webDriver.close();


    }




}
