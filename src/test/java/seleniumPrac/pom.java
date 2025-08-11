package seleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {


    WebDriver driver;

    @FindBy(id="user-name")
    WebElement user;

    @FindBy(id="password")
    WebElement pass;

    @FindBy(id="login-button")
    WebElement btn;

    public pom(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String usern,String passw){
        user.sendKeys(usern);
        pass.sendKeys(passw);
        btn.click();
    }
}
