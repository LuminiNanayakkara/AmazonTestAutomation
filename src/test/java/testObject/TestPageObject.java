package testObject;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ProductListPage;
import pageObjects.ProductDetailPage;

import java.util.concurrent.TimeUnit;

public class TestPageObject extends BaseTest{

    HomePage homePage;
    ProductListPage productListPage;
    ProductDetailPage productDetailPage;
    @Test(priority = 1)
    public void verifyHomePage(){
        homePage=new HomePage(driver);
        homePage.clickAllButton();
        homePage.setSearchValue();
        productListPage=homePage.clickSearchButton();

    }
      @Test(priority = 2)
    public void verifyProductListPage() {
        productListPage=homePage.clickSearchButton();
        productListPage.clickFourStarCutomerReviews();
        productListPage.setSelectEnglishAsLauguage();
        String expectedBookName="Intelligent Automation: Rules, Relationships and Robots";
        Assert.assertEquals(expectedBookName,productListPage.getSecondBookName());
        productListPage.setClickOnBook();
    }
    @Test(priority = 3)
    public void verifyProductDetailPage(){
        new ProductDetailPage(driver);
        Assert.assertEquals("$39.99",productDetailPage.getUnitPrice());
        String expecetedItemName="Intelligent Automation: Rules, Relationships and Robots";
        Assert.assertEquals(expecetedItemName,productDetailPage.checkItemName());
        productDetailPage.clickQuantityBar();
        productDetailPage.setQuantityAsTwo();
        productDetailPage.clickAddToCartButton();
        productDetailPage.clickGoToCartButton();
        Assert.assertEquals(expecetedItemName,productDetailPage.getItemName());
        Assert.assertEquals("2",productDetailPage.setQuantityAsTwo());
        Assert.assertEquals("$39.99",productDetailPage.getUnitPrice());
        productDetailPage.clickClearDataButton();
        Assert.assertEquals("$0.00",productDetailPage.getValue());
    }

}
