package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class HomePage {
    private WebDriver driver;
    WebElement clickAllButton;
    WebElement clickSearchBar;
    WebElement clickSearchBtn;

    public HomePage(WebDriver webDriver1) {
        this.driver = webDriver1;

        clickAllButton = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        clickSearchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        clickSearchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public void clickAllButton() {
        clickAllButton.click();
        clickAllButton.sendKeys("Books");
    }

    public void setSearchValue() {
        clickSearchBar.sendKeys("Automation");
    }

    public ProductListPage clickSearchButton() {
        clickSearchBtn.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return new ProductListPage(driver);
    }
}
