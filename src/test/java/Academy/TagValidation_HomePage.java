package Academy;

import pageObjects.HSNCOM_HomePage;
import resources.base;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TagValidation_HomePage extends base {


    @BeforeMethod
    public void initilize() throws IOException, InterruptedException {
        driver = initializeDriver();

        driver.get(prop.getProperty("url"));

        driver.manage().window().maximize();

        Thread.sleep(2000);
    }


    @Test

    public void tagValid() throws IOException {

        HSNCOM_HomePage hp = new HSNCOM_HomePage(driver);

        Assert.assertTrue(hp.Clearence().isDisplayed());

    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver=null;
    }
}
