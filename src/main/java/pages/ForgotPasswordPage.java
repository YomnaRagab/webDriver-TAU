package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailFiled = new By.ById("email");
    private By retrievePasswordField = new By.ById("form_submit");
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public RetrivePasswordPage EnterEmail(String email){
        driver.findElement(emailFiled).sendKeys(email);
        driver.findElement(retrievePasswordField).click();
        return new RetrivePasswordPage(driver);
    }
}
