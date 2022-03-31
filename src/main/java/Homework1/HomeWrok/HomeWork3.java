package Homework1.HomeWrok;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeWork3 {

    @Test
    public void test1() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();

        WebElement shiromi = driver.findElement(By.xpath("//img[@class='main-image' and @alt='Shiromi']"));
//        Actions actions= new Actions(driver);
//        actions.moveToElement(shiromi).perform();
//        Thread.sleep(1000);
//        shiromi.click();
        BrowserUtilis.ClickWithJS(driver, shiromi);
        WebElement arrow = driver.findElement(By.xpath("//a[@id='navigate-next']"));
        arrow.click();
        WebElement tekkamaki = driver.findElement(By.xpath("//h1[.='Tekka maki']"));
        boolean expected = tekkamaki.isDisplayed();
        boolean actual = true;
        Assert.assertEquals(expected, actual);
//WebElement advertisement=driver.findElement(By.)
        Thread.sleep(2000);
        WebElement tekkaMakiArrow = driver.findElement(By.id("navigate-prev"));
        BrowserUtilis.ClickWithJS(driver, tekkaMakiArrow);
        Thread.sleep(1000);
        WebElement shiromoBack = driver.findElement(By.xpath("//h1[.='Shiromi']"));
        boolean expectedshiromi = shiromoBack.isDisplayed();
        boolean actualshirom = true;
        Assert.assertEquals(expectedshiromi, actualshirom);
        Thread.sleep(1000);
        WebElement cart0 = driver.findElement(By.xpath("//span[contains(text(),'0')]"));
        String expectedcart0 = cart0.getText();
        String actualcart0 = "0";
        Assert.assertEquals(expectedcart0, actualcart0);
    }

    @Test
    public void test2() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();

        ////a[@href="#/menu/4"]//following-sibling::button
        WebElement edamame=driver.findElement(By.xpath("//a[@href=\"#/menu/4\"]//following-sibling::button"));
        edamame.click();
      //  List<WebElement> edamane = driver.findElements(By.xpath("//li //button[text()='Add to cart']"));
//        for (int i = 0; i < edamane.size(); i++) {
//            edamane.get(3).click();
//        }
WebElement  cartcontains1= driver.findElement(By.xpath("//span[text()='1']"));
        String expected=cartcontains1.getText();
        String actual="1";
        Assert.assertEquals(expected,actual);

        WebElement price4=driver.findElement(By.xpath("//p[@data-bind='html: totalPrice']"));
      String expectedprice4=price4.getText().replace("$","").trim();

        String actualprice4="4.00";
        Assert.assertEquals(expectedprice4,actualprice4);
        WebElement emptycart=driver.findElement(By.xpath("//a[@id='empty-cart']"));
        emptycart.click();
        WebElement cart0 = driver.findElement(By.xpath("//span[contains(text(),'0')]"));
        String expectedcart0 = cart0.getText();
        String actualcart0 = "0";
        Assert.assertEquals(expectedcart0, actualcart0);
    }

    @Test
    public void test3() throws InterruptedException {

        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        WebElement scroll= driver.findElement(By.xpath("//p[contains(text(),'Copyright')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);
        Thread.sleep(1000);
        WebElement salamonTeryaki= driver.findElement(By.xpath("//img[@alt='Salmon Teriyaki']"));
       // BrowserUtilis.ClickWithJS(driver,salamonTeryaki);
        Actions  actions= new Actions(driver);
        actions.moveToElement(salamonTeryaki).click().perform();
        WebElement addtocart= driver.findElement(By.xpath("//button[@class='buy']"));
        Actions actions1= new Actions(driver);
        actions1.moveToElement(addtocart).doubleClick().perform();

        WebElement price=driver.findElement(By.xpath("//p[contains(text(),'$26.00')]"));
        String actualprice=price.getText().replace("$","").trim();
        String expectedprice="26.00";
        Assert.assertEquals(actualprice,expectedprice);
        Thread.sleep(1000);
        WebElement  cartcontains1= driver.findElement(By.xpath("//span[text()='1']"));
        String expected=cartcontains1.getText();
        String actual="1";
        Assert.assertEquals(expected,actual);
        WebElement arrow=driver.findElement(By.xpath("//a[@id='navigate-next']"));
        arrow.click();
        Thread.sleep(1000);
        WebElement addCartGohan=driver.findElement(By.xpath("//button[@class='buy']"));
        addCartGohan.click();;

WebElement priceForGohan=driver.findElement(By.xpath("//p[contains(text(),'$29.00')]"));
String actualForGohan=priceForGohan.getText().replace("$","").trim();
String ExpectedForGohan="29.00";
Assert.assertEquals(actualForGohan,ExpectedForGohan);
        WebElement cart2 = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
        String expectedcart2 = cart2.getText();
        String actualcart2 = "2";
        Assert.assertEquals(expectedcart2, actualcart2);

    }

    @Test
    public void case4(){
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        List<WebElement> allprices=driver.findElements(By.xpath("//span[@data-bind='text: price']"));

        List<String> APRICES=new ArrayList<>();
        List<Double> pris=new ArrayList<>();
        for (WebElement price:allprices){
       pris.add(Double.parseDouble(price.getText()));
        }
        int count=0;
       Object[] pris1=pris.toArray();
        for (Object obj:pris1){
            double i= (Double) obj;
            if (i<=25){
                count++;
            }
        }
     int actualresult=count;
        int expected=19;
Assert.assertEquals(count,19);
    }
@Test
    public void test5(){
    ChromeDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://demos.telerik.com/kendo-ui/websushi#");
    driver.manage().window().maximize();
    WebElement item1=driver.findElement(By.xpath("//a[@href='#/menu/1']//following-sibling::button"));
    item1.click();
    WebElement item2=driver.findElement(By.xpath("//a[@href='#/menu/2']//following-sibling::button"));
    item2.click();
    WebElement item3=driver.findElement(By.xpath("//a[@href='#/menu/3']//following-sibling::button"));
    item3.click();
WebElement imgX=driver.findElement(By.xpath("//img[@src='/kendo-ui/content/spa/websushi/images/200/seaweed-salad.jpg'  and @width='100']"));

Actions actions= new Actions(driver);
actions.moveToElement(imgX).click().perform();
    WebElement cart2 = driver.findElement(By.xpath("//span[contains(text(),'2')]"));
    String expectedcart2 = cart2.getText();
    String actualcart2 = "2";
    Assert.assertEquals(expectedcart2, actualcart2);


}

@Test
    public void test6() throws InterruptedException {


        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        WebElement shiromi=driver.findElement(By.xpath("//a[@href='#/menu/8']//following-sibling::button"));
        shiromi.click();
        WebElement abirools=driver.findElement(By.xpath("//a[@href='#/menu/14']//following-sibling::button"));
        abirools.click();

        WebElement checkOut=driver.findElement(By.xpath("//a[@id='checkout']"));
        checkOut.click();

        WebElement totalItem=driver.findElement(By.xpath("//span[.='$17.00']"));
        String actualtoal=totalItem.getText().replace("$","").trim();
        String expectedtotal="17.00";
        Assert.assertEquals(actualtoal,expectedtotal);
//        List<WebElement>  secondArraow= driver.findElements(By.xpath("//button[@class='k-spinner-increase k-button k-button-md k-button-solid k-button-solid-base k-icon-button']"));
//       List<String> arraww= new ArrayList<>();
////        for (int i=0;i<secondArraow.size();i++){
////            Thread.sleep(1000);
////
////        }
//    secondArraow.get(1).click();

    WebElement arrowclick=driver.findElement(By.xpath("//span[.=\"Ebi rolls\"]/parent::td/following-sibling::td//button[@title=\"Decrease value\"]"));
    arrowclick.click();


Thread.sleep(1000);
WebElement clilcloc=driver.findElement(By.xpath("//div[@id='details-checkout']"));
clilcloc.click();
    WebElement totalItem1=driver.findElement(By.xpath("//span[.='$25.00']"));
    String actualtoal1=totalItem1.getText().replace("$","").trim();
    String expectedtotal1="25.00";
    Assert.assertEquals(actualtoal1,expectedtotal1);
WebElement orderNow=driver.findElement(By.xpath("//button[@class='order-now']"));
orderNow.click();
    WebElement cart0 = driver.findElement(By.xpath("//span[contains(text(),'0')]"));
    String expectedcart0 = cart0.getText();
    String actualcart0 = "0";
    Assert.assertEquals(expectedcart0, actualcart0);

}

}
