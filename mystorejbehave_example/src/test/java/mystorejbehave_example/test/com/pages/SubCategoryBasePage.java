package mystorejbehave_example.test.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubCategoryBasePage extends BasePage {

    private WebElement subcategory;

    public SubCategoryBasePage(WebDriver driver){
        super(driver);

    }

    public void clickSubCategory(String dress){

        this.subcategory = driver.findElement(By.xpath("//a[@title='"+dress+"' and @class='img']"));
        this.subcategory.click();
    }
}
