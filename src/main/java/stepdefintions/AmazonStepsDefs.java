package stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class AmazonStepsDefs {
    WebDriver driver;
    @When("I navigate to amazon home page")
    public void i_navigate_to_amazon_home_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }
    @And("I search for I phone {int} cases")
    public void i_search_for_i_phone_cases(Integer int1) {
        WebElement amazaonSearchBar= driver.findElement(By.id("twotabsearchtextbox"));
        amazaonSearchBar.sendKeys("i phone 13 cases");
        WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
    }
    @Then("I should get more than {int} results")
    public void i_should_get_more_than_results(Integer ExpectedResult) {
        List<WebElement> allHeaders=driver.findElements(By.tagName("h2"));
        Assert.assertTrue(allHeaders.size()>ExpectedResult);

    }
    @And("I validate the search result number")
    public void i_validate_the_search_result_number() {
        WebElement resrultText=driver.findElement(By.xpath("//span[contains(text(),'1-16 of over 30,000 results for')]"));
        String[] resrultArr=resrultText.getText().trim().split(" ");
        int result=Integer.parseInt(resrultArr[3].replace(",",""));
        Assert.assertEquals(result,30000);

    }




}
