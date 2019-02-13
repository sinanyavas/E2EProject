package resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {

    public static WebDriver driver;

    public Properties prop;

    public WebDriver initializeDriver() throws IOException {


        prop=new Properties();
        FileInputStream fis = new FileInputStream("/Users/sinanyavas/Documents/E2EProject/src/main/java/resources/data.properties");
        prop.load(fis);
        String BrowserName = prop.getProperty("browser");


        if (BrowserName.equals("chrome")) {
            // execute in chromedriver
            System.setProperty("webdriver.chrome.driver", "/Users/sinanyavas/Documents/selenium_downloads/chromedriver");
            driver = new ChromeDriver();

        } else if (BrowserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/sinanyavas/Documents/selenium_downloads/geckodriver");
            driver = new FirefoxDriver();
            //execute in firefox

            //execute in InternetExplorer
        } else {
            driver = new SafariDriver();
            // execute in Safari
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;



    }

    public void getScreenshot(String result) throws IOException{

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File ("/Users/sinanyavas/Documents/E2EProject/screenshots/" +result+ "screenshot.png"));


    }

}
