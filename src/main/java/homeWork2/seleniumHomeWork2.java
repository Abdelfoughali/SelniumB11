package homeWork2;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class seleniumHomeWork2 {
    @Test
    public void case1(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement submitButton= driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        submitButton.click();
        WebElement AtoZ=driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
       AtoZ.click();
       Select select=new Select(AtoZ);
       select.selectByValue("za");
List<WebElement> zaSlect=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

List <String> expected=new ArrayList<>();
List<String> actual=new ArrayList<>();
for (int i=0;i<zaSlect.size();i++){
   actual.add(zaSlect.get(i).getText()) ;
    expected.add(zaSlect.get(i).getText().trim());

}
Collections.sort(expected);
Collections.reverse(expected);
Assert.assertEquals(actual,expected);

    }
    @Test
    public void TestCase2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement submitButton= driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        submitButton.click();
        WebElement AtoZ=driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        AtoZ.click();
        Select select=new Select(AtoZ);
        select.selectByValue("lohi");
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<String> expectedproductInsertion=new ArrayList<>();
        List<Double> price= new ArrayList<>();
        List<Double> priceexpected= new LinkedList<>();
        for (int i = 0; i < products.size(); i++) {
            expectedproductInsertion.add(products.get(i).getText());
            price.add(Double.parseDouble((prices.get(i).getText()).replace("$","")));
          priceexpected.add(Double.parseDouble((prices.get(i).getText()).replace("$","")));
        }
        System.out.println(price);
        System.out.println(expectedproductInsertion);
Collections.sort(price);
Assert.assertEquals(price,priceexpected);


    }

    @Test
    public  void task3(){
        WebDriverManager.chromedriver().setup();
            ChromeDriver driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
            userName.sendKeys("standard_user");
            WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("secret_sauce");
            WebElement submitButton= driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
            submitButton.click();
        WebElement AtoZ=driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        AtoZ.click();
        Select select=new Select(AtoZ);
        select.selectByValue("lohi");
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> expectedproductInsertion=new ArrayList<>();
        for (int i = 0; i < products.size()-4; i++) {
            expectedproductInsertion.add(products.get(i).getText());
        }
      WebElement addFirstElement=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        addFirstElement.click();
        WebElement addSecondElement=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        addSecondElement.click();
WebElement chart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        String ExpeectedItem=chart.getText();

        String actual="2";
Assert.assertEquals(ExpeectedItem,actual);
    }
    @Test
    public void testCase4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement submitButton= driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        submitButton.click();
        WebElement AtoZ=driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        AtoZ.click();
        Select select=new Select(AtoZ);
        select.selectByValue("hilo");
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> expectedproductInsertion=new ArrayList<>();
        for (int i = 0; i < products.size()-4; i++) {
            expectedproductInsertion.add(products.get(i).getText());
        }
        WebElement addFirstElement=driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        addFirstElement.click();
        WebElement addSecondElement=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addSecondElement.click();

        WebElement cartbutton= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartbutton.click();
        WebElement checkOutButton=driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkOutButton.click();
        WebElement firstname=driver.findElement(By.id("first-name"));
        firstname.sendKeys("abdennour");
        WebElement lastName=driver.findElement(By.id("last-name"));
        Thread.sleep(2000);
        lastName.sendKeys("foughali");
        WebElement zipCode=driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("60171");
        Thread.sleep(1000);
        WebElement continueButton=driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
        continueButton.click();
        Thread.sleep(1000);
     List<WebElement> preices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
     List<String> prices1= new ArrayList<>();
     List<Double> pris=new ArrayList<>();
     for (WebElement prix:preices){
      pris.add(Double.parseDouble( prix.getText().replace("$","")));

     }
double prix1=pris.get(0);
     double prix2=pris.get(1);
     double expectdtotal=prix1+(prix2+6.4);
        System.out.println(expectdtotal);
     double actualtotal=86.38;
        Thread.sleep(2000);
        Assert.assertEquals(expectdtotal,actualtotal);
     boolean ExpectedUrl=driver.getCurrentUrl().contains("checkout");
     boolean ActualUrl=true;
        Thread.sleep(2000);
     Assert.assertEquals(ExpectedUrl,ActualUrl);

     WebElement finishButton=driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
        Thread.sleep(2000);
     finishButton.click();
WebElement textHeader=driver.findElement(By.xpath("//h2"));
String expected=textHeader.getText().trim();
String actualtext="THANK YOU FOR YOUR ORDER";
Assert.assertEquals(expected,actualtext);

    }

    @Test
    public void TestCase5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement option=driver.findElement(By.xpath("//div[@id='withOptGroup']"));
        option.click();
       WebElement Grou2Option1=driver.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]"));
       Grou2Option1.click();



    }
}
