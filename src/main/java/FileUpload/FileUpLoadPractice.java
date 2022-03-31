package FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpLoadPractice {

    @Test
    public void validateFileUpload(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement choosefile=driver.findElement(By.id("file-upload"));
        choosefile.sendKeys("C:\\Users\\jafar foughali\\Desktop\\usa.png");
        WebElement upload= driver.findElement(By.id("file-submit"));
        upload.click();
        WebElement message= driver.findElement(By.xpath("//h3"));
        String actualmesage=message.getText().trim();
        String expectedmsg="File Uploaded!";
        Assert.assertEquals(actualmesage,expectedmsg);
WebElement usapng=driver.findElement(By.id("uploaded-files"));
String actual=usapng.getText().trim();
        String expected="usa.png";
        Assert.assertEquals(actual,expected);



    }


}
