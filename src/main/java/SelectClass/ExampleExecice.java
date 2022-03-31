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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleExecice {

    @Test
    public void ValidationTripBuuton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
      WebElement OneWayButton= driver.findElement(By.xpath("//input[@value='oneway']"));
      OneWayButton.click();
        Assert.assertTrue(OneWayButton.isDisplayed());
        Assert.assertTrue(OneWayButton.isSelected());
        WebElement roundTrip=driver.findElement(By.xpath("//input[@value='roundtrip']"));
        Assert.assertTrue(roundTrip.isDisplayed());
        Assert.assertFalse(roundTrip.isSelected());
    }

    @Test
    public void SlectMethods() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement OneWayButton= driver.findElement(By.xpath("//input[@value='oneway']"));
        OneWayButton.click();
       WebElement passengerCount= driver.findElement(By.name("passCount"));
     Select psngr= new Select(passengerCount);
      psngr.selectByValue("2");
        WebElement departFrom= driver.findElement(By.name("fromPort"));
        Select depart= new Select(departFrom);
        depart.selectByVisibleText("London");
        WebElement month= driver.findElement(By.name("fromMonth"));
        Select mnth=new Select(month);
        mnth.selectByVisibleText("September");
        Thread.sleep(1000);
        WebElement departureDay= driver.findElement(By.xpath("//select[@name='fromDay']"));
        Select dprtDay=new Select(departureDay);
        dprtDay.selectByVisibleText("2");
        //toPort
        WebElement Arringcity= driver.findElement(By.name("toPort"));
        Select arngCity=new Select(Arringcity);
        arngCity.selectByVisibleText("Paris");
        //input[@value='Coach']
        WebElement prefernceClass= driver.findElement(By.xpath("//input[@value='Business']"));
        prefernceClass.click();
        Thread.sleep(1000);
        WebElement Airlinr= driver.findElement(By.xpath("//select[@name='airline']"));
        Select arline=new Select(Airlinr);
        arline.selectByVisibleText("Blue Skies Airlines");
        Thread.sleep(1000);
        WebElement contine= driver.findElement(By.name("findFlights"));
        contine.click();



    }
    @Test
    public void secondWay() throws InterruptedException {

//
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement trip = driver.findElement(By.xpath("//input[@value='oneway']"));
        trip.click();
        WebElement passenger = driver.findElement(By.name("passCount"));
      BrowserUtilis.selectBy(passenger,"2","value");
        WebElement departingFrom = driver.findElement(By.name("fromPort"));

//        Select depart = new Select(departingFrom);
//        depart.selectByVisibleText("Paris");
        BrowserUtilis.selectBy(departingFrom,"Paris","text");

        WebElement frommonth = driver.findElement(By.name("fromMonth"));
//        Select month = new Select(frommonth);
//        month.selectByIndex(7);
        BrowserUtilis.selectBy(frommonth,"7","index");
        WebElement fromday = driver.findElement(By.name("fromDay"));
//        Select day = new Select(fromday);
//        day.selectByValue("13");
        BrowserUtilis.selectBy(fromday,"13","value");
        WebElement arrivingIn = driver.findElement(By.name("toPort"));
//        Select arriving = new Select(arrivingIn);
//        arriving.selectByVisibleText("Sydney");
        BrowserUtilis.selectBy(arrivingIn,"Sydney","text");
        WebElement tomonth = driver.findElement(By.name("toMonth"));
//        Select toomonth = new Select(tomonth);
//        toomonth.selectByIndex(9);
        BrowserUtilis.selectBy(tomonth,"9","index");
        WebElement toDay = driver.findElement(By.name("toDay"));
//        Select tooDay = new Select(toDay);
//        tooDay.selectByValue("3");
        BrowserUtilis.selectBy(toDay,"3","value");
        WebElement Services = driver.findElement(By.xpath("//input[@value='First']"));
        Services.click();
        WebElement airlines = driver.findElement(By.xpath("//select[@name='airline']"));
        Select airline = new Select(airlines);
       List<WebElement> allairlines = airline.getOptions();
     List<String> actualAirlines = Arrays.asList("No Preference", "Blue Skies Airlines", "Unified Airlines", "Pangea Airlines");
      List<String> expectedairlines = new ArrayList<>();
       for (WebElement line : allairlines) {
            expectedairlines.add(line.getText().trim());
        }
        Assert.assertEquals(actualAirlines, expectedairlines);
        WebElement continueButton = driver.findElement(By.name("findFlights"));
        continueButton.click();
        WebElement message = driver.findElement(By.xpath("//font[@face='Arial, Helvetica, sans-serif']//font[@size='4']"));
        String actual = message.getText().trim();
        String expected = "After flight finder - No Seats Avaialble";
        Assert.assertEquals(actual, expected);
    }


}
