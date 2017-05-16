package page;

import config.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 29/10/2016.
 */
public class Homepage extends General{

    WebDriver driver ;

    public Homepage (WebDriver driver) {
        super(driver);
        this.driver = driver ;
    }

    By Log_in = By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3] ") ;
    By Sign_up = By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[2] ") ;

    String url = new PropertyReader().readProperty("url") ;


    public void toclickloginbtn () {
     // driver.findElement(Log_in).click();
     click(Log_in);

    }

    public void newsetup () {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }



}
