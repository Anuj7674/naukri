package sel_prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class table {

    public static void main(String[] args){

        WebDriver driver =new FirefoxDriver();


        driver.get("https://www.w3schools.com/html/html_tables.asp");

        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println(rows.size());

        List<WebElement> coloumn=rows.get(0).findElements(By.tagName("th"));
        System.out.println(coloumn.size());


        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cells = rows.get(i).findElements(By.xpath(".//th|.//td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println();
        }
driver.quit();
    }

}
