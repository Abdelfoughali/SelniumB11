package SelectClass;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class DreamCars {
    @Test
    public void Acura() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
       WebElement cars=driver.findElement(By.xpath("//select[@class='sds-text-field']"));
        BrowserUtilis.selectBy(cars,"all","value");
        WebElement brand=driver.findElement(By.xpath("//select[@id='makes']"));
        BrowserUtilis.selectBy(brand,"acura","value");

        WebElement model=driver.findElement(By.xpath("//select[@id='models']"));
        BrowserUtilis.selectBy(model,"acura-cl","value");

        WebElement price=driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        BrowserUtilis.selectBy(price,"4000","value");

        WebElement distance=driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        BrowserUtilis.selectBy(distance,"40","value");

        WebElement  zipcode=driver.findElement(By.xpath("//input[@name='zip']"));
        zipcode.clear();
        Thread.sleep(1000);
        zipcode.sendKeys("60171");
WebElement serach=driver.findElement(By.xpath("//button[@data-linkname='search-all-make']"));
serach.click();

WebElement header= driver.findElement(By.xpath("//h1"));
        String acutalHeader=BrowserUtilis.getTextMethod(header);

String ExpectedHeader="New and used Acura CL for sale";
        Assert.assertEquals(acutalHeader,ExpectedHeader);

       List <WebElement> modelssorting=driver.findElements(By.xpath("//a[@class='vehicle-card-link js-gallery-click-link']"));
      for (WebElement car:modelssorting){
          boolean contains = car.getText().trim().toUpperCase(Locale.ROOT).contains("ACURA");
          Assert.assertTrue(contains);
      }




    }




}
