package mystorejbehave_example.test.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductBasePage extends BasePage {

    private String selectedDress;
    private WebElement categoryItem;

    private WebElement addtoCartButton;

    public ProductBasePage(WebDriver driver, String selectedDress){
        super(driver);
        this.selectedDress = selectedDress;
}

    public void hoverOn(){
        this.categoryItem = driver.findElements(By.xpath("//div[@class='product-container' and descendant::a[@title='"+selectedDress+"']]")).get(0);
        this.categoryItem.click();
    }

    public void addToCart(){
        this.addtoCartButton = driver.findElement(By.xpath("//div[@class='product-container' and descendant::a[@title='"+selectedDress+"']]//div[@class='right-block']//div[@class='button-container']//a[contains(@class, 'ajax_add_to_cart_button')]"));
        this.addtoCartButton.click();

    }
}
