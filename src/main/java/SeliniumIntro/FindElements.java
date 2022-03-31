package SeliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        List<WebElement> alllink=driver.findElements(By.xpath("//li/a"));
        int count=0;
        // can you find the links that its size less than equal 12 and count
        // how many we have
        for (WebElement link :alllink){
            //System.out.println(link.getText());
            link.getSize();
            if (link.getText().length()<=12){
                System.out.println(link.getText());
                count++;

            }


        }

        System.out.println(count);


    }
}
