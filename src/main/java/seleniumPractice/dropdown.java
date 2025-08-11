package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        WebElement drop=driver.findElement(By.xpath("//select[@id='searchLanguage']"));

        Select select=new Select(drop);
        List<WebElement> options=select.getOptions();

        select.selectByVisibleText("Español");
        Thread.sleep(2000);
        for(WebElement e:options){
            System.out.println(e.getText());
        }
        driver.quit();
    }

}
