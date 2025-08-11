package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

//        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

//        Wait<WebDriver> fluent=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2))
//                .ignoring(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));



    }
}