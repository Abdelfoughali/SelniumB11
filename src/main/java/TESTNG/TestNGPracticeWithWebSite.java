package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGPracticeWithWebSite {
    @Test (priority = 1)
    public void ValidateWebSite(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        String actualWebSite= driver.getCurrentUrl();
        String ExpectedWebSite="https://demo.opencart.com/admin/";
        Assert.assertEquals(actualWebSite,ExpectedWebSite);
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
    @Test (priority =2)
    public void validatelogicDisplayed(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalog=driver.findElement(By.id("menu-catalog"));
    boolean Actualcatalog= catalog.isDisplayed();
    boolean expectedCatolog=true;
    Assert.assertEquals(expectedCatolog,expectedCatolog,"catalog is not there");
catalog.click();


    }
    @Test (priority = 3)
    public void validateProductIsdisplayed() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalog = driver.findElement(By.id("menu-catalog"));
        catalog.click();
        WebElement catalogbar = driver.findElement(By.xpath("//a[.='Products']"));
        boolean Actualcatalog1 = catalogbar.isDisplayed();
        boolean expectedCatolog1 = true;
        Assert.assertEquals(Actualcatalog1, expectedCatolog1);
        catalogbar.click();
    }



   @Test (priority = 4)
           public void boxeselect() throws InterruptedException {

            WebDriver driver= new ChromeDriver();
            driver.get("https://demo.opencart.com/admin/");
            driver.manage().window().maximize();
            WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();
            WebElement catalog=driver.findElement(By.id("menu-catalog"));
            catalog.click();
            Thread.sleep(500);
            WebElement catalogbar=driver.findElement(By.xpath("//a[.='Products']"));

            catalogbar.click();
            List<WebElement> icone=driver.findElements(By.xpath("//input[@type='checkbox']"));
            for (int i=1;i<20;i++) {
                icone.get(i).click();
                Thread.sleep(500);

                boolean ActualboxValidation = icone.get(i).isDisplayed();
                boolean ExpectedboxValidation = true;
                Assert.assertEquals(ActualboxValidation, ExpectedboxValidation);
                boolean ActualBoxValidationIsSelected = icone.get(i).isSelected();
                boolean ExpectedBoxValidationIsSelected = true;
                Assert.assertEquals(ActualBoxValidationIsSelected, ExpectedBoxValidationIsSelected);
            }

        }




    }



