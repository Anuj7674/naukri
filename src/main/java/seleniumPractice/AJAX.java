package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AJAX {
    public static void main(String[] args){

        WebDriver driver =new ChromeDriver();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
        driver.findElement(By.xpath("//button[@id='loadContent']")).click();
//        driver.findElement(By.xpath("//h2[normalize-space()='AJAX Content Loaded']"));
        WebElement loaded =   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
        System.out.println(loaded.getText());
        driver.quit();
    }
}
