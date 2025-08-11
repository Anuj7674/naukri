package seleniumPractice;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class calender {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // First Type
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.xpath("//input[@id='datepicker']"))
                .sendKeys("04/02/2025" + Keys.ENTER);


        //SecondType
        driver.findElement(By.xpath("//input[@id='txtDate']")).click();

        WebElement MonthDropDown = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        WebElement YearDropDown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        List<WebElement> DateSelector = new ArrayList<>();
               DateSelector= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        Select s = new Select(MonthDropDown);
        for (WebElement e : s.getOptions()) {

            if (e.getText().equals("May")) {
                e.click();
            }
            Thread.sleep(2000);
            Select a = new Select(YearDropDown);
            for (WebElement c : a.getOptions()) {
Thread.sleep(2000);
                if (c.getText().equals("2024")) {
                    c.click();
                }
//
             //   Select d = new Select(DateSelector);
                for (WebElement f : DateSelector) {

                    if (f.getText().equals("6")) {
                        f.click();
                    }

                }
                Thread.sleep(5000);


                driver.quit();
            }

        }
    }
}
