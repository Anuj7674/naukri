package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import javax.swing.*;
import java.io.File;
import java.util.List;


public class screenShot {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Abcd");
        WebElement ele = driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);
        Thread.sleep(2000);
        Actions ac =new Actions(driver);


        List<WebElement> link =driver.findElements(By.tagName("a"));
        System.out.println(link.size()
        );
        for(WebElement e :link){
            System.out.println(e.getAttribute("href"));
        }


        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(srcFile,new File("src/test/Screenshot.png"));
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}