package com.test.opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenCartCustumerPage {
    public OpenCartCustumerPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='collapse in']//li//a[contains(@href,'customer/customer&user')]")
     WebElement custumerbutton2;

@ FindBy(xpath = "//i[@class='fa fa-plus']")
WebElement plusbutton;
@FindBy(xpath = "//select[@id='input-customer-group']")
WebElement deaufltselect;
@FindBy(xpath = "//input[@id='input-firstname']")
WebElement firstname;
@FindBy(xpath = "//input[@id='input-lastname']")
WebElement lastname;
@FindBy (xpath = "//input[@id='input-email']")
WebElement email;
@FindBy(xpath = "//input[@id='input-telephone']")
WebElement phone;
@FindBy (xpath = "//input[@id='input-password']")
WebElement password;
@FindBy(xpath = "//input[@id='input-confirm']")
WebElement confirPassword;
@FindBy (xpath = "//select[@id='input-newsletter']")
WebElement newletter;
@FindBy (xpath = "//select[@id='input-status']")
WebElement stauts;
@FindBy(xpath = "//select[@id='input-safe']")
WebElement safe;
@FindBy(xpath = "//button[@type='submit']")
WebElement submit;
@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
WebElement warningmsg;
    public void cuctumer2() throws InterruptedException {
        custumerbutton2.click();
        Thread.sleep(1000);
        plusbutton.click();
        Thread.sleep(100);
        deaufltselect.sendKeys("Default");
        Thread.sleep(500);
        firstname.sendKeys("abdennour");
        Thread.sleep(100);
        lastname.sendKeys("foughali");
        Thread.sleep(100);
        email.sendKeys("abdelfoughali@gmail.comm");
        Thread.sleep(100);
        phone.sendKeys("3495829258");
        Thread.sleep(100);
        password.sendKeys("Jafafr03#");
        Thread.sleep(100);
        confirPassword.sendKeys("Jafafr03#");
        Select select= new Select(newletter);
        select.selectByVisibleText("Enabled");
        stauts.sendKeys("Enabled");
safe.sendKeys("Yes");
Thread.sleep(1000);
submit.click();

    }
    public String validatemsg(){
        return warningmsg.getText().trim();
    }
public String msgColor(){
        return  warningmsg.getCssValue("color");
}
}
