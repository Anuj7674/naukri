package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Wait {



    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
//        Wait<WebDriver> fluent = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(2))
//                        .ignoring(NoSuchElementException.class);
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));

        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Abcd");
     //   fluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"))).click();
    //    driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[normalize-space()='Everything Finance As Simple As ABCD']"));
//        FluentWait<WebDriver> wait1=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring
        driver.close();

    }



    
}
