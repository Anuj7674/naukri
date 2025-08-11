package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class prac2 {
WebDriver driver;


    @BeforeClass
    public void setup() {
        FirefoxOptions options=new FirefoxOptions();

        driver = new FirefoxDriver();
    }

    @AfterClass
    public void tear() {
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.saucedemo.com/");
        pom p=new pom(driver);
        p.login("standard_user","secret_sauce");
    }
   @Test
    public void test2(){
        driver.get("https://shop.polymer-project.org/");

       WebElement host=driver.findElement(By.cssSelector("shop-app[page='home']"));
               SearchContext q1=host.getShadowRoot();
       WebElement host1=q1.findElement(By.cssSelector("iron-pages[role='main']"));
       SearchContext q2= host1.getShadowRoot();

       WebElement host2=q2.findElement(By.cssSelector("shop-home[name='home']"));
       SearchContext q3=host2.getShadowRoot();

   }

   @Test
    public void test4() throws InterruptedException {
        driver.get("https://www.amazon.in/s?k=apple&crid=3SHSJ6YJ5BQD8&sprefix=apple%2Caps%2C252&ref=nb_sb_noss_2");
        driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']")).click();
        Thread.sleep(10000);
   }
}
