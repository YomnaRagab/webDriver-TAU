package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    public HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    private By sliderField= new By.ByCssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");


    public void moveTheSlider(int index){
        for(int i=0; i < (index*2) ; i++)
            driver.findElement(sliderField).sendKeys(Keys.ARROW_RIGHT);
    }
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
}
