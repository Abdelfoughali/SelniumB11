package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;


public class TestNGPracticeWithRealWebSite {
    @Test
            public void validatioNOfAscendingOrder() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
       driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(1000);
        WebElement options=driver.findElement(By.xpath("//a[.='Options']"));// first time does not work because
        // there is an exception ELEMENTNOTINTERACTABLE EXCEPTION PUT THREAD
        options.click();
        Thread.sleep(1000);
        List<WebElement> allOption=driver.findElements(By.xpath("//tbody/tr/td[2]"));
        Set<String> actaulOptionOrder= new LinkedHashSet<>(); // insertion order
        Set <String> expectedOptionOrder=new TreeSet<>();

        for (WebElement option:allOption){
           actaulOptionOrder.add(option.getText().trim());
           expectedOptionOrder.add(option.getText().trim());
        }
        Assert.assertEquals(actaulOptionOrder,expectedOptionOrder);


    }
    @Test
    public void validationDecendingElement() throws InterruptedException {
////a[.='Option Name']
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(1000);
        WebElement options=driver.findElement(By.xpath("//a[.='Options']"));// first time does not work because
        // there is an exception ELEMENTNOTINTERACTABLE EXCEPTION PUT THREAD
        options.click();
        WebElement optionNameButton= driver.findElement(By.xpath("//a[.='Option Name']"));
        optionNameButton.click();
        List<WebElement> descendingallOption= driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<String> actualDescendingOrder= new LinkedList<>();
        List<String> expecdtedDescendingOrders= new ArrayList<>();
        for (int i = 0; i < descendingallOption.size(); i++) {

            actualDescendingOrder.add(descendingallOption.get(i).getText().trim());
            expecdtedDescendingOrders.add(descendingallOption.get(i).getText().trim());
            Collections.sort(expecdtedDescendingOrders);
            Collections.reverse(expecdtedDescendingOrders);



        }
Assert.assertEquals(actualDescendingOrder,expecdtedDescendingOrders);

    }
    @Test
    public void ValidationAssending() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar=driver.findElement(By.id("menu-catalog"));
        catalogBar.click();
        Thread.sleep(1000);
        WebElement options=driver.findElement(By.xpath("//a[.='Options']"));
        options.click();
////tbody/tr/td[3]

        List<WebElement> assendingsortOrder= driver.findElements(By.xpath("//tbody/tr/td[3]"));

        List<String> actualAsending=new ArrayList<>();

        Set<String> expectedAssending= new TreeSet<>();
        for (WebElement sortOrder:assendingsortOrder) {
            actualAsending.add(sortOrder.getText());
            expectedAssending.add(sortOrder.getText());
            Collections.sort(actualAsending);

        }

        Assert.assertEquals(actualAsending,expectedAssending);
        WebElement sortOrderbutton1= driver.findElement(By.xpath("//a[.='Sort Order']"));
        sortOrderbutton1.click();
       Thread.sleep(5000);
        WebElement sortOrderbutton2= driver.findElement(By.xpath("//a[.='Sort Order']"));
       sortOrderbutton2.click();

    }

}
