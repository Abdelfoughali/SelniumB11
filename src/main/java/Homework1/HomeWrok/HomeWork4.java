package Homework1.HomeWrok;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.*;

public class HomeWork4 {
    @Test
    public void test1() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Select#");
        driver.manage().window().maximize();
        WebElement indidSelect=driver.findElement(By.xpath("//select[@id='countriesSingle']"));
       String expcted="India";
       boolean expected1=indidSelect.isDisplayed();
Assert.assertTrue(expected1,expcted);
Select select= new Select(indidSelect);
int sizeExpected=select.getOptions().size();
int sizeActual=4;
Assert.assertEquals(sizeActual,sizeExpected);
String strexpected =indidSelect.getText().trim();
        System.out.println(strexpected);
String stractual="India\n" +
        "        United states of America\n" +
        "        China\n" +
        "        England";

Select select1=new Select(indidSelect);
select1.selectByIndex(2);
Thread.sleep(1000);
select1.selectByValue("england");
Thread.sleep(1000);
select1.selectByVisibleText("United states of America");


    }

    @Test
    public void test2() throws InterruptedException {

        ChromeDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Select#");
        driver.manage().window().maximize();
        WebElement indidSelect=driver.findElement(By.xpath("//select[@id='countriesMultiple']"));
        String strexpected =indidSelect.getText().trim();
        //System.out.println(strexpected);
        String stractual="India\n" +
                "        United states of America\n" +
                "        China\n" +
                "        England";
Select select1= new Select(indidSelect);
        select1.selectByIndex(2);
        Thread.sleep(1000);
        select1.selectByValue("england");
        Thread.sleep(1000);
WebElement chinaEngland=driver.findElement(By.xpath("//div[contains(text(),'China England ')]"));
String expected=chinaEngland.getText().trim();
String actual="China England";
Assert.assertEquals(expected,actual);
WebElement countryall= driver.findElement(By.xpath("//select[@id='countriesMultiple']"));
Select select2= new Select(countryall);
select2.selectByValue("usa");
select2.selectByValue("india");
select2.selectByValue("china");
select2.selectByValue("england");
boolean actualdips=countryall.isDisplayed();
boolean expecteddis=true;
Assert.assertEquals(actualdips,expecteddis);

select2.deselectByIndex(2);
select2.deselectByValue("england");

    }

    @Test
    public void test3() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement certififedCars=driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        certififedCars.click();
        Select select= new Select(certififedCars);
        select.selectByVisibleText("Certified cars");
        Thread.sleep(1000);
        WebElement allMakes=driver.findElement(By.xpath("//select[@id='makes']"));
        Select select1= new Select(allMakes);
        select1.selectByVisibleText("Toyota");
        Thread.sleep(1000);
        WebElement allmodels=driver.findElement(By.xpath("//select[@id='models']"));
        Select select2= new Select(allmodels);
        select2.selectByVisibleText("Corolla");
        WebElement price=driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        Select select3= new Select(price);
        select3.selectByVisibleText("$30,000");
        Thread.sleep(1000);
        WebElement mileage=driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        Select select4= new Select(mileage);
        select4.selectByVisibleText("40 miles");
        Thread.sleep(1000);
       WebElement zipcode=driver.findElement(By.xpath("//input[@id='make-model-zip']"));
       zipcode.clear();
       Thread.sleep(1000);
        zipcode.sendKeys("60018");
       Thread.sleep(500);
//        WebElement search=driver.findElement(By.xpath("//button[@data-linkname='search-new-make']"));
//        Actions action= new Actions(driver) ;
//        action.moveToElement(search).click().perform();
        WebElement button = driver.findElement(By.xpath("//button[@data-activity-rule-type='page-over-page']"));
        button.click();
 boolean actual =driver.getTitle().contains("Certified used");

        boolean expected=true;
Assert.assertEquals(expected,actual);

WebElement header = driver.findElement(By.xpath("//h1[.='Certified used Toyota Corolla for sale']"));
String actual1=header.getText();
String expected1="Certified used Toyota Corolla for sale";
Assert.assertEquals(actual1,expected1);
        Thread.sleep(500);
WebElement fourtyMile=driver.findElement(By.xpath("//option[@value='40']"));
boolean expected4=fourtyMile.isSelected();
boolean actual4=true;
Assert.assertEquals(expected4,actual4);


WebElement certified=driver.findElement(By.xpath("//option[@value='cpo']"));
        boolean expected5=fourtyMile.isSelected();
        boolean actual5=true;
        Assert.assertEquals(expected5,actual5);
        ////option[@value='toyota']
        Thread.sleep(500);
      WebElement toyota=driver.findElement(By.xpath("//select[@name='makes[]']"));
      Select select5= new Select(toyota);
      String actual6=select5.getFirstSelectedOption().getText().trim();
        System.out.println(actual6);
        String expeted6="Toyota";

//
       Assert.assertEquals(actual6,expeted6);
       Thread.sleep(500);
WebElement corrola=driver.findElement(By.xpath("//input[@id='model_toyota-corolla']"));
boolean actual7=corrola.isSelected();
boolean expected7=true;
Assert.assertEquals(actual7,expected7);

    }
    @Test
    public void test4() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        WebElement certififedCars=driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        certififedCars.click();
        Select select= new Select(certififedCars);
        select.selectByVisibleText("New & used cars");
        Thread.sleep(500);

        WebElement makes=driver.findElement(By.xpath("//select[@id='makes']"));
        Select select1=new Select(makes);
        select1.selectByVisibleText("Lexus");
        Thread.sleep(500);
        WebElement allmodels=driver.findElement(By.xpath("//select[@id='models']"));
        Select select2= new Select(allmodels);
        select2.selectByVisibleText("ES 350");
        WebElement price=driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        Select select3= new Select(price);
        select3.selectByVisibleText("$50,000");
        Thread.sleep(500);
        WebElement mileage=driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        Select select4= new Select(mileage);
        select4.selectByVisibleText("50 miles");
        Thread.sleep(100);
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='make-model-zip']"));
        zipcode.clear();
        Thread.sleep(500);
        zipcode.sendKeys("60016");
        Thread.sleep(500);
        WebElement serach=driver.findElement(By.xpath("//button[@data-linkname='search-all-make']"));
        serach.click();


        List<WebElement> allcars=driver.findElements(By.xpath("//p[contains(text(),'Used')]"));
        int cout=0;
        for (int i = 0; i < allcars.size(); i++) {
            cout++;

        }
        boolean expectedcount=false;
        if (cout<=20){
             expectedcount=true;
        }
boolean actualcount=true;
        Assert.assertEquals(expectedcount,actualcount);
       List< WebElement> carsnames=driver.findElements(By.xpath("//a[@class='vehicle-card-link js-gallery-click-link']"));
List<String> carsnameLexus=new ArrayList<>();
        for (int i = 0; i < carsnames.size(); i++){
            carsnameLexus.add( carsnames.get(i).getText().trim());

        }
        //System.out.println(carsnameLexus);
        boolean actallexusname=false;
        for (int i = 0; i < carsnames.size(); i++) {
            if (carsnameLexus.get(i).contains("Lexus")){
                actallexusname=true;
            }
        }
boolean expectedlexsusname=true;
        Assert.assertEquals(actallexusname,expectedlexsusname);

//div[@class='miles-from ']
//        List<WebElement> zipAndMile=driver.findElements(By.xpath("//div[@class='mileage']"));
//List<String> zipAndMileForCar=new ArrayList<>();
//int i=0;
//        for ( i = 0; i < zipAndMile.size(); i++){
//            zipAndMileForCar.add(zipAndMile.get(i).getText());
//
//    }




        WebElement selectprices=driver.findElement(By.xpath("//select[@id='sort-dropdown']"));
        Select select5= new Select(selectprices);
        select5.selectByVisibleText("Highest price");
        Thread.sleep(500);

        List<WebElement> pricesCars=driver.findElements(By.xpath("//span[@class='primary-price']"));
        List<String> priOfCar= new ArrayList<>();
        List<Double> prifinal=new ArrayList<>();

     for (WebElement pri:pricesCars) {
         // pri.getText().trim().replace()
         String pri1=pri.getText().trim().substring(1);
priOfCar.add(pri1.replace(",",""));

     }

     for (String prixunit:priOfCar){
         prifinal.add(Double.parseDouble(prixunit));

     }
        Object []  pr= prifinal.toArray();
       boolean flagexpected=false;
        for (Object obj:pr){
            double i= (Double) obj;
            if (i<50000){
               flagexpected=true;
            }
        }
      boolean actaul=true;
        Assert.assertEquals(actaul,flagexpected);


}}
