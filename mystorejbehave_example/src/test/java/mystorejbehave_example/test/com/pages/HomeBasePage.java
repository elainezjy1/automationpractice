package mystorejbehave_example.test.com.pages;

import org.openqa.selenium.WebDriver;

public class HomeBasePage extends BasePage {
    public HomeBasePage(WebDriver driver) {
        super(driver);
    }

    public MegamenuBasePage megaMenu(){
        MegamenuBasePage page =  new MegamenuBasePage(this.driver);
        return page;
    }

    public SubCategoryBasePage subCategoryPage(){
        SubCategoryBasePage page =  new SubCategoryBasePage(this.driver);
        return page;
    }

    public ProductBasePage productPage(String dress){
        ProductBasePage page =  new ProductBasePage(this.driver, dress);
        return page;
    }
}
