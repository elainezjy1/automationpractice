package com.test.definition;

import com.test.pages.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class HomeSteps {
    protected static WebDriver driver;
    protected ProductBasePage productPage;
    protected HomeBasePage homePage;
    protected LayerCartBasePage cartPage;


    @Given("^user navigate to \"([^\"]*)\"$")
    public void navigate(String site) {
        this.driver.navigate().to(site);
        homePage = new HomeBasePage(driver);
    }

    @Given("^user click (.*) category$")
    public void clickDresses(String category){
        switch(category) {
            case "Dresses":
                homePage.megaMenu().clickDresses();
                break;
            case "Momen":
                homePage.megaMenu().clickWomen();
                break;
            case "T-shirts":
                homePage.megaMenu().clickTshirts();
                break;
             default:
                System.out.println("The category given does not exist");
        }
        homePage.megaMenu().clickDresses();
    }

    @Given("user click (.*) subcategory")
    public void clickSubCategory(String dress){
        homePage.subCategoryPage().clickSubCategory(dress);
      }
    @Given("^user click (.*) product$")
    public void hoverOnCategory(String dressname){
        productPage = homePage.productPage(dressname);
        productPage.hoverOn();
    }
    @When("^user click 'Add to cart' button$")
    public void addToCart(){
        productPage.addToCart();
    }

    @Then("cart page is displayed")
    public void verifyCartPageDisplayed(){
        cartPage = new LayerCartBasePage(driver);
        cartPage.verifyCartPageDisplayed();
    }

    @Then("^verify product title is (.*)$")
    public void verifyTitle(String expectedValue){
        cartPage.verifyTitle(expectedValue);
    }
    @Then("^verify quantity is (.*)$")
    public void verifyQuantity(String expectedValue){
        cartPage.verifyQuantity(expectedValue);
    }
    @Then("^verify price is (.*)$")
    public void verifyTotal(String expectedValue){
        cartPage.verifyTotal(expectedValue);
    }


    @Before
    public void setup(){
        System.out.println("Initiate test: start web driver");
        String browser = System.getProperty("browser");
        System.out.println("Browser is "+browser);
        if (browser == null) {
            browser = "Chrome";
        }
        switch(browser) {
            case "IE":
                driver = new InternetExplorerDriver();
                break;
            case "Firefox":
                driver =  new FirefoxDriver();
                break;
            case "Chrome":
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Users\\Administrator\\chromedriver_win32\\chromedriver.exe");
                    //System.out.println(System.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        System.out.println("Teardown: close driver");
        driver.close();
    }
}
