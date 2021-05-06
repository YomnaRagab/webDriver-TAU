package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrivePasswordPage {
    private WebDriver driver;
    private By messageField = new By.ById("content");
    public RetrivePasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public String getMessage (){
        return driver.findElement(messageField).getText();
    }

}
