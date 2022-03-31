package FileUpload;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest {

    @Test
    public  void practice1() throws InterruptedException {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        WebElement file=driver.findElement(By.id("uploadfile_0"));
        file.sendKeys("C:\\Users\\jafar foughali\\Desktop\\usa.png");
        WebElement acceptCondition= driver.findElement(By.xpath("//input[@id='terms']"));
        acceptCondition.click();
Thread.sleep(500);
        WebElement submit=driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submit.click();
        WebElement msg=driver.findElement(By.xpath("//center[contains(text(),'1 file ')]"));
        String actaul= msg.getText().trim();
        String expected="1 file\n" +
                "has been successfully uploaded.";
      Assert.assertEquals(actaul,expected);

    }
}
