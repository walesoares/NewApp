package config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static sun.plugin2.main.client.PluginProxySelector.initialize;

/**
 * Created by Wale on 30/10/2016.
 */
public class DriverFactory {

    //public static  WebDriver driver =null;

    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            try {
                createNewDriverInstance();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    //static final ExtentReports reports = ExtentReports.get(DriverFactory.class) ;


    @BeforeTest
    private void createNewDriverInstance() throws IOException {

        String browser = new PropertyReader().readProperty("browser");

        if (browser.contains("firefox")) {
            driver = new FirefoxDriver();


        } else if (browser.contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\NewApp\\src\\test\\java\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.contains("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Anthony Soares\\Documents\\project framwork\\AutomatedTestSuite\\Projects\\ECommerceTesting\\NewApp\\src\\test\\java\\Browser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }

    @AfterMethod
    public void Teardown() {
        driver.close();
    }

}



