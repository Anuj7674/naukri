package seleniumPrac;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v130.page.model.Screenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public class login {
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

    @DataProvider(name = "data")
    public Object[][] getdata() {

        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", ""}
        };
    }

    @Test(enabled = true, dataProvider = "data")

    public void testlogin(String s, String t) throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.xpath("(//div[@class='login-box']//descendant::input)[1]"));
        user.sendKeys(s);

        WebElement pass = driver.findElement(By.xpath("(//div[@class='login-box']//descendant::input)[2]"));
        pass.sendKeys(t);

        WebElement button = driver.findElement(By.xpath("//input[@value='Login']"));

        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test(enabled = false)
    public void handleDropDown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement drop = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(drop);
        String text = "Option3";
        List<WebElement> elements = select.getOptions();
        for (WebElement e : elements) {
            String match = e.getText();
            if (text.equals(match)) {
                e.click();
                break;
            }


        }
    }

    @Test(enabled = false)
    public void handleCheckBoxes() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement check1 = driver.findElement(By.xpath("(//div[@id='checkbox-example']//descendant::input)[1]"));
        check1.click();
        check1.isSelected();
        WebElement check2 = driver.findElement(By.xpath("(//div[@id='checkbox-example']//descendant::input)[2]"));
        check2.click();
        check2.isSelected();

    }

    @Test(enabled = false)
    public void printAllLink() {

        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement e : links) {
            System.out.println(e.getText());

            if (e.getText().equals("File Downloader")) {
                e.click();
                break;
            }
        }
        Assert.assertEquals(driver.getTitle(), "The Internet");
    }


    @Test(enabled = true)
    public void getRowColoumnCount() {
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));


        List<WebElement> rows = table.findElements(By.xpath(".//tbody//tr"));
        for (WebElement e : rows) {
            List<WebElement> col = e.findElements(By.tagName("td"));
            for (WebElement r : col) {
                System.out.print(r.getText() + " ");
            }

            System.out.println();
        }
    }

    @Test
    void alert() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }

    @Test
    void frame() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        driver.switchTo().frame(frame);
        Assert.assertEquals(driver.getCurrentUrl(), "https://rahulshettyacademy.com/AutomationPractice/");
        driver.switchTo().defaultContent();
        Assert.assertEquals(driver.getTitle(), "Practice Page");

    }

    @Test
    void window() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> list = driver.getWindowHandles();

        for (String a : list) {
            System.out.println(a);
            if (!a.equals(parent)) {
                Thread.sleep(2000);
                driver.switchTo().window(a);
            }

        }
        Assert.assertEquals(driver.getTitle(),"New Window");
    }

    @Test
    public void explicitWait(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Start']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));

    }

    @Test
    void implicitWait(){
        FluentWait<WebDriver> fluent=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']")).click();
       fluent.until( ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Start']"))).click();
        fluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));
       }

       @Test
       void mouseHover() throws InterruptedException {
        driver.get("https://demoqa.com/menu");
        WebElement hover=driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
        WebElement hover2=driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"));
        WebElement hover3= driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 1']"));
           Actions actions=new Actions(driver);

           actions.moveToElement(hover).moveToElement(hover2).moveToElement(hover3).perform();
           actions.contextClick().perform();
           Thread.sleep(5000);
       }
       @Test
       void screenShot() throws IOException {

        driver.get("https://www.google.com/");
//        String path="src/test/java";
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("/Google.png");
           FileUtils.copyFile(src,dest);
       }

       @Test
    void  dynamic() throws InterruptedException {
//        "//a[text()='"+/donate-books+"]
           driver.get("https://mypustak.com/");
           String d="/donate-books";

           driver.findElement(By.xpath("/a[contains(normalize-space(text()),' + d + ')]")).click();
           Thread.sleep(10000);
       }

       @Test
       void shadow() throws InterruptedException {
        driver.get("https://dev.automationtesting.in/shadow-dom");
        SearchContext host=  driver.findElement(By.cssSelector("div#shadow-root")).getShadowRoot();
        String test= host.findElement(By.cssSelector("span#shadow-element")).getText();

        SearchContext host2=host.findElement(By.cssSelector("inner-shadow-dom#inner-shadow-dom"));
        String test2=host2.findElement(By.cssSelector("span#nested-shadow-element")).getText();
           System.out.println(test2);

           System.out.println(test);

        Thread.sleep(5000);
       }
    }

