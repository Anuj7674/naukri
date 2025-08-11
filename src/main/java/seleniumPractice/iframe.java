package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class iframe {

    public  static void  main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
        List<WebElement> frames= driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());
       driver.switchTo().frame(0);
       driver.findElement(By.xpath("//a[@id='alertInFrame']")).click();
       Thread.sleep(5000);
       driver.switchTo().alert().accept();
       driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
