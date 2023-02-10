package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductDetailPage {

    WebDriver driver;
    WebElement getUnitPrice;
    WebElement clickQuantity;
    WebElement quantityAsTwo;
    WebElement clickAddToCartBtn;
    WebElement clickGoToCartBtn;
    WebElement clickClearDataBtn;
    WebElement itemName;
    WebElement displayedZeroValue;
    WebElement finalItemName;

    public ProductDetailPage(WebDriver webDriver1) {

        driver = webDriver1;
        getUnitPrice = driver.findElement(By.xpath("//span[@id='price']"));
        clickQuantity = driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
        itemName = driver.findElement(By.xpath("//span[@id='productTitle']"));
        quantityAsTwo = driver.findElement(By.xpath("//a[@id='quantity_1"));
        clickAddToCartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        clickGoToCartBtn = driver.findElement(By.xpath("//a[@href='/gp/cart/view.html?ref_=sw_gtc']"));
        clickClearDataBtn = driver.findElement(By.xpath("//a[@href='/gp/cart/view.html?ref_=sw_gtc']"));
        displayedZeroValue = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
        finalItemName = driver.findElement(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'Workflow Automation with Microsoft Power Automate:')]"));
    }

    public String getUnitPrice() {
        return getUnitPrice.getText();
    }

    public String checkItemName() {
        return itemName.getText();
    }

    public void clickQuantityBar() {
        clickQuantity.click();
    }

    public String setQuantityAsTwo() {
        quantityAsTwo.click();
        return quantityAsTwo.getText();
    }

    public void clickAddToCartButton() {
        clickAddToCartBtn.click();
    }

    public void clickGoToCartButton() {
        clickGoToCartBtn.click();
    }

    public String getItemName() {
        return finalItemName.getText();
    }

    public void clickClearDataButton() {
        clickClearDataBtn.click();
    }

    public String getValue() {
        return displayedZeroValue.getText();

    }

}
