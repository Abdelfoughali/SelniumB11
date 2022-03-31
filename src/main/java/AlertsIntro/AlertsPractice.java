package AlertsIntro;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsPractice {


    @Test
    public void JSAlert() {
    /*(ALERT CLASS)
    1)Navigate to "https://sweetalert.js.org/"
    2)Click first preview(which is on the bottom left one)
    3)Validate the text on pop-up
    4)Handle the pop up

     */
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
//        WebElement preview=driver.findElement(By.xpath("//h5[contains(text(),'Normal alert')]//following-sibling::button[@class='preview']"));
//        preview.click();
//        Alert alert=driver.switchTo().alert();
//
//        String acutalmsg= alert.getText();
//        String expectedmsg="Oops, something went wrong!";
//        Assert.assertEquals(acutalmsg,expectedmsg);
//        alert.accept();



    }

    @Test
    public void TrialForAlertToHandleHTMLpopup() throws InterruptedException { // it will not work
    /* TASK 2 (ALERT CLASS)
     1)Navigate to "https://sweetalert.js.org/"
    2)Click first preview(which is on the bottom right one)
    3)Validate the text on pop-up
    4)Handle the pop up
     */
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        WebElement preview=driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        preview.click();
       Alert alert=driver.switchTo().alert();
       alert.accept();




    }
@Test
    public void HTMLALERT() throws InterruptedException {
    /*
    TASK 3 (HTML ALERT)
    1)Navigate to "https://sweetalert.js.org/"
    2)Click first preview(which is on the bottom right one)
    3)Validate the text on pop-up
    4)Handle the pop up
     */
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sweetalert.js.org/");
        driver.manage().window().maximize();
        WebElement preview=driver.findElement(By.xpath("//h5[@class='swal-logo']//following-sibling::button[@class='preview']"));
       preview.click();
//        Alert alert=driver.switchTo().alert();  it is HTML
    Thread.sleep(1000);


WebElement okButton=driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']"));
okButton.click();





    }

}







