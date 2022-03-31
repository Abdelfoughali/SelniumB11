package SelectClass;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelect {
    @Test
    public void multipleSelectAndFirstSelectPractice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/jafar%20foughali/Downloads/Techtorial%20(2).html");
        driver.manage().window().maximize();
        WebElement header = driver.findElement(By.id("techtorial1"));
        System.out.println( BrowserUtilis.getTextMethod(header));

           WebElement mutiselectBox= driver.findElement(By.xpath("//select[@class='select']"));
//           Select opt1= new Select(mutiselectBox);
//           opt1.selectByVisibleText("Three");
       BrowserUtilis.selectBy(mutiselectBox,"text","Two");
        BrowserUtilis.selectBy(mutiselectBox,"index","3");
        BrowserUtilis.selectBy(mutiselectBox,"value","1");

        Select select= new Select(mutiselectBox);
        Thread.sleep(2000);
        select.deselectByIndex(3);
        //select.deselectAll();  you can use this method to deselect all
        //select[@name='country']
        WebElement contrylist= driver.findElement(By.xpath("//select[@name='country']"));
        Select country= new Select(contrylist);
        String cntr=country.getFirstSelectedOption().getText();
       // String actualFirstSelectOption=country.getFirstSelectedOption().getText().trim();
        String actualFirstSelectOption=BrowserUtilis.getTextMethod(country.getFirstSelectedOption());

        String expectedFirstSelectOption="UNITED STATES";
        Assert.assertEquals(cntr,expectedFirstSelectOption);


    }
}
