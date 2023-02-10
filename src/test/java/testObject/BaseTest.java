package testObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
//    public WebDriver driver;
public static WebDriver driver;
    @BeforeClass
    public static void navigate(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\UNANALU\\Desktop\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }
}
