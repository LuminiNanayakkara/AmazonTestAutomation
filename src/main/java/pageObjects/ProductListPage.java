package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProductListPage {
    WebDriver driver;
    WebElement clickCustomerReviews;
    WebElement selectEnglishAsLauguage;
    WebElement clickOnBook;
    WebElement secondBookName;

    public ProductListPage(WebDriver webDriver1) {


        driver = webDriver1;

        clickCustomerReviews = driver.findElement(By.xpath("//div[@id='reviewsRefinements']//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
        selectEnglishAsLauguage = driver.findElement(By.xpath("//li[@id='p_n_feature_nine_browse-bin/3291437011']//i[@class='a-icon a-icon-checkbox']"));
        clickOnBook = driver.findElement(By.xpath("//span[normalize-space()='Intelligent Automation: Rules, Relationships and Robots']"));
        secondBookName = driver.findElement(By.xpath("//span[normalize-space()='Intelligent Automation: Rules, Relationships and Robots']"));
    }

    public void clickFourStarCutomerReviews() {
        clickCustomerReviews.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void setSelectEnglishAsLauguage() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        selectEnglishAsLauguage.click();
    }

    public String getSecondBookName() {
        return secondBookName.getText();
    }

    public void setClickOnBook() {
        clickOnBook.click();
    }

}
