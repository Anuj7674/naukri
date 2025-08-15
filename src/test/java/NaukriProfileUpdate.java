import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NaukriProfileUpdate {


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // Run in headless mode
//        options.addArguments("--window-size=1920,1080"); // Optional: set window size

    @Test
    public void noukri() throws InterruptedException {



        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115 Safari/537.36");



        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.naukri.com/");
        Thread.sleep(2000);
        System.out.println(driver.getPageSource());
        driver.findElement(By.cssSelector("#login_Layer")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("anujmaurya7674@gmail.com");
        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Freedom@251");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".view-profile-wrapper > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='widgetHead'])[1]/child::span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn-dark-ot'])[3]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[class='nI-gNb-drawer__bars']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='nI-gNb-list-cta'])[4]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
        driver.quit();


    }
}