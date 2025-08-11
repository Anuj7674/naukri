package sel_prac;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

//Google Auto Suggestion
public class store_Suggestion {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium WebDriver");

        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']"));

        for (WebElement e : list) {
//            if (e.getText().equals("selenium webdriver download")) {
//                e.click();
//                Thread.sleep(5000);
//            }
            System.out.println(e.getText());
            Thread.sleep(5000);

        }
//        System.out.println(driver.getTitle());
        driver.quit();
    }

}
