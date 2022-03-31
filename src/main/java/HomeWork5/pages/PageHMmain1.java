package HomeWork5.pages;

import Utilis.BrowserUtilis;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageHMmain1 {
    public PageHMmain1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='audi-link-m' and  contains(text(),'SUVs & Wagons')]")
    WebElement SUVandWagon;

    @FindBy(xpath = "//a//picture//img[@alt='2022 Audi Q5'][1]")
    WebElement audiQ5;
    @FindBy(xpath = "//div[@class='ButtonContainer--wyeeej dtCCnn']//a//span[@class='sc-fznKkj gkZFmA'  and contains(text(),'Build')]")
    WebElement build;
    @FindBy(xpath = "//h2[contains(text(),'2022 Audi Q5')]")
    WebElement headervalidate;

    @FindBy(xpath = "//span[@class='nm-module-trimline-engine-price-tag']")
    List<WebElement> startingPrice;

    public void testCase1(WebDriver driver) throws InterruptedException {
        BrowserUtilis.ScrollWithJS(driver, SUVandWagon);
        SUVandWagon.click();
        BrowserUtilis.ClickWithJS(driver, audiQ5);
        BrowserUtilis.ClickWithJS(driver, build);
        Thread.sleep(1000);
        Assert.assertEquals(headervalidate.getText().trim(),"2022 Audi Q5");
    }


}
