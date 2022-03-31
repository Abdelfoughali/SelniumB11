package com.tests.orangeHRM.pages;

import Utilis.BrowserUtilis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AdminPage {
    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="btnAdd")
    WebElement AddButton;

    @FindBy(id="systemUser_userType")
    WebElement userRole;
    @FindBy(id="systemUser_employeeName_empName")
    WebElement employeName;
    @FindBy(id="systemUser_userName")
    WebElement userName;
    @FindBy(id="systemUser_status")
    WebElement status;
    @FindBy(name="systemUser[password]")
    WebElement password;
    @FindBy(xpath="//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(className = "addbutton")
    WebElement saveButton;
    @FindBy(xpath = "//tr//a[contains(@href,'saveSystemUser')]")
    List<WebElement> allNames;
@FindBy (xpath = "//select[@id='searchSystemUser_userType']")
WebElement userRoleBox;
@FindBy (xpath = "//input[@id='searchBtn']")
WebElement searxhuserRole;
@FindBy (xpath = "//h3[3]")
List<WebElement> allroletrextAdmin;

    public void sendingAllInformationForEmployee() throws InterruptedException {
        AddButton.click();
        Thread.sleep(1000);
        BrowserUtilis.selectBy(userRole,"Admin","text");
        Thread.sleep(1000);
        employeName.sendKeys("Alice Duval");
        Thread.sleep(1000);
        userName.sendKeys("abdel1111");
        Thread.sleep(1000);
        BrowserUtilis.selectBy(status,"0","value");
        Thread.sleep(1000);
        password.sendKeys("jafar12345");
        confirmPassword.sendKeys("jafar12345");
        Thread.sleep(1000);
        saveButton.click();

    }
    public boolean ValidationTheEmployeeIsCreated(String userName){
        for(WebElement name: allNames){
            if(name.getText().trim().equals(userName)){
                return true;

            }
          //  System.out.println(name);
        }
        return false;
    }
    public void selectUserRole(String rolename,WebDriver driver) {
        Select select = new Select(userRoleBox);
        select.selectByVisibleText(rolename);

      //  BrowserUtilis.selectBy(userRoleBox,rolename,"text");
        BrowserUtilis.ClickWithJS(driver,searxhuserRole);

    }
public  boolean validateRoleText(String roleName){
        for (WebElement role:allroletrextAdmin){
        if (!role.getText().trim().equals(roleName))
        return false;
        }
        return true;
}


}
