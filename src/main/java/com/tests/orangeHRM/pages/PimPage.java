package com.tests.orangeHRM.pages;

import Utilis.BrowserUtilis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PimPage {
   /*
   1- click the PIM on the mainpage
   2-click add button under PIM
   3-FILL THE BOXES
   4- click save button
   5- wait for the next direction

    */

    public PimPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }



    @FindBy(id="btnAdd")
    WebElement addButton1;

    @FindBy(id="firstName")
    WebElement firstName1;
    @FindBy(id="lastName")
    WebElement lastName;

    @FindBy(id="employeeId")
    WebElement employeeid;
    @FindBy(id="photofile")
    WebElement photfile;

    @FindBy(id="btnSave")
    WebElement saveButton;

    @FindBy(id="personal_txtEmpFirstName")
    WebElement validationName;
    @FindBy(name="personal[txtEmpLastName]")
    WebElement validationLastName;
    @FindBy(id="personal_txtEmployeeId")
    WebElement idvalidation;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement editbutton;
@FindBy (xpath="//input[@name='personal[optGender]' and @value='1']")
WebElement Gender;
@FindBy( name = "personal[cmbNation]")
WebElement nationalty;
    @FindBy (xpath = "//input[@id='personal_DOB']")
    WebElement DOB;

@FindBy (xpath = "//select[@id='personal_cmbMarital']")
WebElement martialStatue;




    public void addEmployyetoPIM(  String name,String lastname,String employeeid ,String uploadfile) throws InterruptedException {
        addButton1.click();
       this.firstName1.sendKeys(name);
       this.lastName.sendKeys(lastname);
       this.employeeid.sendKeys(employeeid);
       this.photfile.sendKeys(uploadfile);
       Thread.sleep(1000);
       saveButton.click();
    }

public  String validationNameentered(){
        return  validationName.getAttribute("value");
}

public  String validateLastName(){
        return validationLastName.getAttribute("value");

}
public  boolean validatemeployeeId(String employeeid1){
        return idvalidation.getAttribute("value").endsWith(employeeid1);

}

public  void editemployeeDetails(String nation,String dateOFtheBirth,String martialstaut) throws InterruptedException {
     editbutton.click();
    Thread.sleep(1000);
     Gender.click();
    Thread.sleep(1000);
    //BrowserUtilis.selectBy(nationalty,nation,"text");
    Select select= new Select(nationalty);
    select.selectByVisibleText("Algerian");
    Thread.sleep(1000);
    this.DOB.clear();

    this.DOB.sendKeys(dateOFtheBirth);
    Thread.sleep(1000);
   // BrowserUtilis.selectBy(this.martialStatue,martialstaut,"text");
    Select select1= new Select(martialStatue);
    select1.selectByVisibleText("Single");
    Thread.sleep(1000);
    saveButton.click();







}

public  String validationTheNationality() {
    Select select= new Select(nationalty);
    return select.getFirstSelectedOption().getText().trim();

}

}
