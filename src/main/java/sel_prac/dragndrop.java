package sel_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class dragndrop {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://jqueryui.com/droppable/");
        WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);

        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDrop(source,drop).perform();
        driver.switchTo().defaultContent();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
