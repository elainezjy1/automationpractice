package com.test.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LayerCartBasePage extends BasePage {

    @FindBy(id = "layer_cart_product_quantity")
    private WebElement quantity;
    @FindBy(id = "layer_cart_product_price")
    private WebElement total;
    @FindBy(id = "layer_cart_product_title")
    private WebElement productTitle;



    public LayerCartBasePage(WebDriver driver) {
        super(driver);
    }

    public void verifyCartPageDisplayed(){
       WebDriverWait wait = new WebDriverWait(driver, 20);
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@id='layer_cart']"))));
       Assert.assertTrue(element.isDisplayed());
    }

    public void verifyTitle(String expectedValue){
        Assert.assertEquals(expectedValue, this.productTitle.getText());
    }

    public void verifyQuantity(String expectedValue){
        Assert.assertEquals(expectedValue, this.quantity.getText());
    }

    public void verifyTotal(String expectedValue){
        Assert.assertEquals(expectedValue, this.total.getText());
    }

}
