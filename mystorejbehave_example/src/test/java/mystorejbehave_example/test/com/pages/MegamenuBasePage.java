package mystorejbehave_example.test.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MegamenuBasePage extends BasePage {

    // @FindBy(xpath="//ul[contains(@class,'menu-content')]//a[@title='Dresses' and @class='sf-with-ul']")
    private WebElement dresses;

    @FindBy(xpath="//a[@title='Women']")
    private WebElement women;

    @FindBy(xpath="//a[@title='T-shirts']")
    private WebElement tshirts;

    public MegamenuBasePage(WebDriver driver){
        super(driver);
        this.dresses = driver.findElements(By.xpath("//ul[contains(@class,'menu-content')]//a[@title='Dresses' and @class='sf-with-ul']")).get(1); }

    public void clickDresses(){
        this.dresses.click();
    }

    public void clickWomen(){
        this.women.click();
    }

    public void clickTshirts(){
        this.tshirts.click();
    }
}
