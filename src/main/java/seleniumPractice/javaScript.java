package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaScript {

    public static void main(String[] args){

        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Abcd");
        WebElement ele= driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);
    }
}
