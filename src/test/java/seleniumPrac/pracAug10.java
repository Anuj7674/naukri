package seleniumPrac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class pracAug10 {


       WebDriver driver;
        @BeforeClass
        public void setup() {
            FirefoxOptions options=new FirefoxOptions();

            driver = new FirefoxDriver();
        }

        @AfterClass
        public void tear() {
            driver.quit();
        }

        @Test(enabled=false)
    public void tis(){
            driver.get("https://books-pwakit.appspot.com/");

            WebElement host=driver.findElement(By.cssSelector("book-home._page"));

    }
    @Test
    public void untis(){
            driver.get("https://the-internet.herokuapp.com/dynamic_loading");
             driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[text()='Start']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']"))).getText();



    }
    @Test
    public void pachis(){
            driver.get("https://demoqa.com/alerts");

            driver.findElement(By.cssSelector(".btn.btn-primary")).click();
            Alert alert =driver.switchTo().alert();
            alert.dismiss();


    }

    }

