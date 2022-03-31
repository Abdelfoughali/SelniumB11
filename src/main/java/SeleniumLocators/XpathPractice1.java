package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice1 {
    public static void main(String[] args) {
        WebDriver driver1= new ChromeDriver();
        driver1.get("https://the-internet.herokuapp.com/horizontal_slider");
//        WebElement title = driver1.findElement(By.xpath("//h3"));
//        System.out.println(title.getText());
//        WebElement paragraph = driver1.findElement(By.xpath("//h4[@class='subheader']"));
//        System.out.println(paragraph.getText());

        WebElement title= driver1.findElement(By.xpath("//h3"));
        System.out.println(title.getText());
WebElement paragraph = driver1.findElement(By.xpath("//h4[@class='subheader']"));
        System.out.println(paragraph.getText());

        // contains works with text
        // tagname[contains(text(),'Horizontal')]//
        WebElement containsmethod= driver1.findElement(By.xpath("//h3[contains(text(),'Horizontal')]"));
        System.out.println(containsmethod.getText());

        // text : it works with the text as well this is for the simpli


    }
}
