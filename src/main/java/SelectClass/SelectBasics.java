package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectBasics {
    @Test
    public void practiceOne() throws InterruptedException {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

   //  WebElement DropDown=driver.findElement(By.linkText("Dropdown"));
        WebElement DropDown= driver.findElement(By.xpath("//a[.='Dropdown']"));
       DropDown.click();
     WebElement optionBox=driver.findElement(By.xpath("//select[@id='dropdown']")) ;
         Select option = new Select(optionBox); // provide weblement location

//
//        option.selectByIndex(1); // option it will be the output
//        Thread.sleep(1000);
//       option.selectByValue("2");
//       Thread.sleep(1000);
//        option.selectByVisibleText("Option 1");
        List<WebElement> options=option.getOptions();
        for (WebElement optn:options){
            String optionsform=optn.getText().trim();
            System.out.println(optionsform);

        }





    }
}
