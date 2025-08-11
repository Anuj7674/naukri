package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class webTablePractice {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String fhandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        String handle =driver.getWindowHandle();
        driver.switchTo().window(fhandle);
        driver.get("https://www.selenium.dev/selenium/web/alerts.html#");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://chromewebstore.google.com/");

        Set<String> hand=driver.getWindowHandles();
        for(String e:hand){

            System.out.println(e);
            driver.switchTo().window(e);
            System.out.println(driver.getTitle());
            driver.close();
        }
    }
}
