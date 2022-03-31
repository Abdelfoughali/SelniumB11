package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MentoringWithAhmet {
    @Test
    public void practiceHoverOver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();
        WebElement browser = driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(browser).perform();
        WebElement datascience = driver.findElement(By.xpath("//a[@class='dropdown-toggle ga_top_category' and .='Data Science']"));
        actions.moveToElement(datascience).perform();

        // continue the Execice at home
        //

    }

    @Test
    public void secondwebsite() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/fx/expand");
        driver.manage().window().maximize();
        List<WebElement> pictures = driver.findElements(By.xpath("//div[@role='listitem']"));
        List<WebElement> allprices = driver.findElements(By.xpath("//div[@class='product-description']//p"));
        List<Double> price = new ArrayList<>();
        Actions actions = new Actions(driver);

        for (int i = 0; i < pictures.size(); i++) {
            Thread.sleep(1000);
            actions.moveToElement(pictures.get(i)).perform();
          String str=  allprices.get(i).getText().trim().replace("$", "");
           // price.add(Double.parseDouble(allprices.get(i).getText().trim().replace("$", "")));
            System.out.println(str);
            double dbl=Double.parseDouble(str);
            System.out.println(dbl);

        }


    }
}












