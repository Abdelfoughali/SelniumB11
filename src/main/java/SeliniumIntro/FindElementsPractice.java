package SeliniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Locale;

public class FindElementsPractice {
    public static void main(String[] args) {
        // face book quastion

        // naviagte to yahoo.com
        // find all the header has the covid words
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        WebElement news=driver.findElement(By.id("root_2"));
        news.click();


        List<WebElement> headers=driver.findElements(By.xpath("//h3"));
        int count=0;
        for (WebElement header:headers){
          //  System.out.println(header.getText());
            if (header.getText().toUpperCase(Locale.ROOT).contains("CHINA")){
                System.out.println(header.getText());
                count++;
            }

        }
        System.out.println(count);

    }


}
