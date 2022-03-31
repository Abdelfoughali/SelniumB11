package com.tests.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

@FindBy(id="menu_admin_viewAdminModule")
    WebElement adminButton;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement PIMPAGE;

    public void clickadminpage(){
        adminButton.click();
    }
    public void clickPIMpage(){
        PIMPAGE.click();

    }

}
