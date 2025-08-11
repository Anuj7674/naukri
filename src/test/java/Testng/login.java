package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumPractice.Pom;

public class login {

    WebDriver driver;
    Pom pom;
    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        pom = new Pom(driver); // ✅ driver is now initialized
    }
    @Test
    public void log(){

        pom.login("student","Password123");
        Assert.assertEquals(driver.getTitle(),"Logged In Successfully | Practice Test Automation","failed");

    }
}
