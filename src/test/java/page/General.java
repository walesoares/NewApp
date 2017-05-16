package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Wale on 16/05/2017.
 */
public abstract class General {

    WebDriver driver ;
    public General (WebDriver driver) {
        this.driver = driver ;
    }


    public void click(By element){
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }


}
