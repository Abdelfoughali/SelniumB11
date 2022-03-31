package com.Etsy.pages;

import com.Etsy.EtsyTestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;


/*)1)First of all navigate to website "https://www.etsy.com/'
   2)take care of your TestBase
   3)Find searchBox and type iphone 13 case and click searchbox or enter
     I would store my all elements inside of mainPage
   4)I would create a test class and validate all of the headers from search
   includes either iphone,13 or case. If all of them includes it should assert pass

   5)Your search name(iphone 13 case) should come from parameter.xml
   6)You can run your class at the end from TestNG runner.xml

 */

public class Etsymainpage2 {
    public Etsymainpage2(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@data-id='search-query']")
    WebElement searchButton;

    public void serchiphone(String searchItem){
     searchButton.sendKeys(searchItem, Keys.ENTER);
    }

}
