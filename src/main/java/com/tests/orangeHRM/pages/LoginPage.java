package com.tests.orangeHRM.pages;

import Utilis.BrowserUtilis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
    public  LoginPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
   @FindBy(id="txtUsername")
    WebElement usereName;
    @FindBy(id="txtPassword")
    WebElement password;
    @FindBy(id="btnLogin")
    WebElement LoginButton;

    @FindBy(id="spanMessage")
    WebElement Errormessage;

    public void login(String userName,String password){
        this.usereName.sendKeys(userName);
        this.password.sendKeys(password);
        this.LoginButton.click();

    }
public String getErrorMessage(){
        return BrowserUtilis.getTextMethod(Errormessage);

}
public String getcolorOfTheErroMsg(){
        return Errormessage.getCssValue("color");
}
}
