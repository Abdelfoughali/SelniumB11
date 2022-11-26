package ActionClass;

import Utilis.BrowserUtilis;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionClassMethod {
    @Test
    public  void ContaxtClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextMenu= driver.findElement(By.partialLinkText("Context"));
        contextMenu.click();
            WebElement box= driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }
    @Test
    public void HoverOver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement Hover= driver.findElement(By.xpath("//a[contains(text(),'Hovers')]"));
       Hover.click();

        Actions actions= new Actions(driver);

        List<WebElement> names= driver.findElements(By.tagName("h5"));
        List<WebElement> pictures= driver.findElements(By.xpath("//div[@class='figure']"));
       List <String> expectedNmes= Arrays.asList("name: user1","name: user2","name: user3");
List<String> str1= new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            Thread.sleep(2000);
            actions.moveToElement(pictures.get(i)).perform();
          str1.add(names.get(i).getText());

//            System.out.println(BrowserUtilis.getTextMethod(names.get(i)));
//            Assert.assertEquals(BrowserUtilis.getTextMethod(names.get(i)),expectedNmes.get(i));

        }  Assert.assertEquals(str1,expectedNmes);

    }

@Test
    public void doubleclick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
//        WebElement doubleClickButton=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//       Actions actions= new Actions(driver);
//       actions.doubleClick(doubleClickButton).perform();
WebElement rightclick= driver.findElement(By.className("context-menu-one btn btn-neutral"));
Actions actions= new Actions(driver);
actions.contextClick(rightclick).perform();




}
@Test
    public void doubleclickPracrice(){

        /*
        Scenario to Automate:
1. Launch the Chrome web browser.
2. Open a URL "https://selenium08.blogspot.com/2019/11/double-click.html".
3. Locate the element "Double-click".
4.  click on the current location (i.e. on Double-click element).
5. Close the web browser.
         */

    ChromeDriverManager.chromedriver().setup();
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
    driver.manage().window().maximize();
    WebElement doublecliq=driver.findElement(By.xpath("//button[.='Double-Click me to see Alert message']"));
    Actions actions= new Actions(driver);
    actions.doubleClick(doublecliq).perform();


}
@Test
        public void dropAnddown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
            WebElement acceptCookies= driver.findElement(By.id("onetrust-accept-btn-handler"));

        acceptCookies.click();
    Actions actions = new Actions(driver);
            for(int i = 0; i<5;i++){
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }
    WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement orangeBox=driver.findElement(By.xpath("//div[@class='test2']"));
    String actualMessage=BrowserUtilis.getTextMethod(orangeBox);
    String expectedMessage="... Or here.";
        Assert.assertEquals(actualMessage,expectedMessage);
        actions.dragAndDrop(draggable,orangeBox).perform();
        Thread.sleep(3000);
    orangeBox=driver.findElement(By.xpath("//div[@class='test2']"));
    String actualAfterDragAndDrop=BrowserUtilis.getTextMethod(orangeBox);
    String expectedAfterDragAndDrop="You did great!";
        Assert.assertEquals(actualAfterDragAndDrop,expectedAfterDragAndDrop);


        String ActualValue=orangeBox.getCssValue("background-color");
        String expectedCss ="rgba(238, 111, 11,1)";
        Assert.assertEquals(ActualValue,expectedCss);

}

@Test
    public void ClickAndHold(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area)");
        driver.manage().window().maximize();
        WebElement bluebox= driver.findElement(By.xpath("//div[@class='test1']"));
        String actualblueboxMessage= BrowserUtilis.getTextMethod(bluebox);
        String expectedBlueBoxMessage="Drag the small circle here ...";
        Assert.assertEquals(actualblueboxMessage,expectedBlueBoxMessage);
    WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
    Actions actions= new Actions(driver);
    actions.clickAndHold(draggable).moveToElement(bluebox).release().perform();




}
@Test
    public void DragAndDropPractice(){
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        WebElement dragable=driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dropable= driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
    Actions actions= new Actions(driver);
actions.dragAndDrop(dragable,dropable).perform();
WebElement textmessegae=driver.findElement(By.xpath("//div[@class='drop-box ui-droppable ui-state-highlight']"));
String expected=textmessegae.getText().trim();
String actaul="Dropped!";
Assert.assertEquals(expected,actaul);
 WebElement box= driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));

String color=box.getCssValue("background-color");

    String actual1="rgba(70, 130, 180, 1)";
    Assert.assertEquals(color,actual1);

}
@Test
    public void secondCssclor() throws InterruptedException {
         /*
        1)Navigate to the website :"https://demoqa.com/droppable"
        2)Click Accept
        3)ClickAndHold notAccepted box and release to Drop box
        4)validate the background is still white and message is still Drop here
        5)ClickAndHold acceptable box and release to Drop box
        6)Validate the background is blue and message is dropped
         */
    ChromeDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("https://demoqa.com/droppable");
    driver.manage().window().maximize();
WebElement accept=driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
accept.click();
WebElement holdansAccepted=driver.findElement(By.xpath("//div[@id='acceptable']"));
WebElement dropdownbox=driver.findElement(By.xpath("//div[@id= 'droppableExample-tabpane-accept']//div[@id='droppable'] "));

Actions actions= new Actions(driver);

actions.clickAndHold(holdansAccepted).moveToElement(dropdownbox).release().perform();


}

@Test
    public void MoveOffSet(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        driver.manage().window().maximize();
        WebElement slider=driver.findElement(By.xpath("//input"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(40,0).perform();




}

@Test
    public void sliderShortCut(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/horizontal_slider");
    driver.manage().window().maximize();
    WebElement slider=driver.findElement(By.xpath("//input"));
WebElement range = driver.findElement(By.xpath("//span[@id='range']"));
String myrange="5";
while (!range.getText().trim().equals(myrange)){
    slider.sendKeys(Keys.ARROW_RIGHT);
}


}
// task for student

    @Test
    /*
    1)navigate to the Website "https://text-compare.com/"
2)Type with the Keys --> "Good Bye Keys"
3)with CTRL(COMMAND)+A --> select all text
4)Copy this text CTRL(COMMAND) + C --> it will copy the text
5)Go to the second box and paste CTRL(COMMAND) + V-->it will paste the text
6) Validate this two boxes text are matching
     */
    public void taskForStudent(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        WebElement text1=driver.findElement(By.xpath("//textarea[@name='text1']"));
        WebElement text2=driver.findElement(By.xpath("//textarea[@name='text2']"));
        text1.sendKeys("action last day");
        Actions actions=new Actions(driver);

        // control -A

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        // control -C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.keyDown(Keys.TAB);
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.perform();


    }
    @Test
    public static void main (){
        System.out.println("this is for git practice");
    }
}














