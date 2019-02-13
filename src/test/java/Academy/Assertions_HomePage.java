package Academy;

import pageObjects.HSNCOM_HomePage;
import resources.base;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.logging.log4j.core.Logger;

import java.io.IOException;

public class Assertions_HomePage extends base {

    private static Logger Log = (Logger) LogManager.getLogger(base.class.getName());


    @BeforeMethod
    public void initilize() throws IOException {
        driver = initializeDriver();
        Log.info("driver initialized");

        driver.get(prop.getProperty("url"));
        Log.info("browser hit the url");

        driver.manage().window().maximize();
    }

    @Test

    public void basepageNavigation() {

        HSNCOM_HomePage hp = new HSNCOM_HomePage(driver);

        WebElement TS = hp.TodaysSpecial();
     //   WebElement CB = hp.Clearence();

        Assert.assertEquals(TS.getText(), "Shark Rocket Zero-M Corded Ultra-Light Vacuum with Accessories");
        Log.info("title validated");
    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver=null;
    }

}
