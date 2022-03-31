package com.test.opencart.Pages;

import Utilis.BrowserUtilis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MainPageOpenCart {
    public MainPageOpenCart(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div//i[@class='fa fa-shopping-cart']//following-sibling::h2")
    WebElement twelveK;
    @FindBy(xpath = "//div//i[@class='fa fa-credit-card']//following-sibling::h2")
    WebElement elevenK;
    @FindBy(xpath = "//div//i[@class='fa fa-user']//following-sibling::h2")
    WebElement hundredK;
    @FindBy(xpath = "//a[@href='#collapse33']")
    WebElement custumerbutton;


    public String Validation(){
        return twelveK.getText().trim();
    }
    public String Validation1(){
        return elevenK.getText().trim();
    }
    public String Validation2(){
        return hundredK.getText().trim();
    }

//   public void validationprincipale(){
//       Assert.assertEquals(twelveK.getText().trim(),"12K");
//       Assert.assertEquals(elevenK.getText().trim(),"11.8M");
//       Assert.assertEquals(hundredK.getText().trim(),"144.8K");
//   }

   public void custumer() throws InterruptedException {
       custumerbutton.click();
       Thread.sleep(3000);




   }


}
