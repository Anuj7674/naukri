package sel_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {



    public static void main(String[] args){

        WebDriver driver =new FirefoxDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
       WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));

        System.out.println(ele.getText());
}
}
