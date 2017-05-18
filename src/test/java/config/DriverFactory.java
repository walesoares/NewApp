package config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by Wale on 30/10/2016.
 */
public class DriverFactory {

    //public static  WebDriver driver =null;
    public static RemoteWebDriver driver;
    public static DesiredCapabilities caps = new DesiredCapabilities();
    String browser = new PropertyReader().readProperty("browser");

    //protected static WebDriver driver;

    //public DriverFactory() {
      //  initialize();
   // }


    //public WebDriver initialize() {
      //  if (driver == null)
       //    try {
        //       createNewDriverInstance();
        //   } catch (IOException e) {
       //        e.printStackTrace();
      //     }
    //    return null;
   // }



    public WebDriver createNewDriverInstance()  {


        if (browser.contains("firefox")) {
            driver = new FirefoxDriver();


        } else if (browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\NewApp\\src\\test\\java\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.contains("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\NewApp\\src\\test\\java\\Browser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        }
        //createNewDriverInstance();

        return driver;
    }

   //public WebDriver getDriver()  {
     //  try {
       //     createNewDriverInstance() ;
       //} catch (IOException e) {
        //   e.printStackTrace();
       //}

//       return null;
  // }

  //  public void destroyDriver() {
  //      driver.quit();
 //       driver = null;
 //   }

    @AfterMethod
    public void Teardown() {
        driver.close();
    }

 }




