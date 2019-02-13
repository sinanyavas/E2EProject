package Academy;

import pageObjects.HSNCOM_HomePage;
import pageObjects.createAccountPage;
import resources.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.io.IOException;

public class DataProdiver_HomePage extends base {


    @BeforeMethod
    public void initilize() throws IOException, InterruptedException {
        driver = initializeDriver();

        driver.get(prop.getProperty("url"));

        driver.manage().window().maximize();

        Thread.sleep(2000);
    }


    @Test(dataProvider = "getData")

    public void basepageNavigation(String firstname, String lastname, String emailID, String emailIDconfirm, String password, String passwordConfirm) throws InterruptedException {

        HSNCOM_HomePage hp = new HSNCOM_HomePage(driver);

        Actions a = new Actions(driver);

        WebElement move = hp.MemberArea();

        WebElement CreateNew = hp.CreateAccount();

        a.moveToElement(move).build().perform();

        a.moveToElement(CreateNew).click().build().perform();


        /*
        Actions action = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.linkText("MainMenu"));
        action.moveToElement(mainMenu).moveToElement(driver.findElement(By.xpath("submenu"))).click().build().perform();
         */
        //a.moveToElement(move).moveToElement(sigin).click().build().perform();

        createAccountPage ca = new createAccountPage(driver);
        ca.firstname().sendKeys(firstname);

        ca.lastname().sendKeys(lastname);

        ca.emailID().sendKeys(emailID);

        ca.emailIDconfirm().sendKeys(emailIDconfirm);

        ca.password().sendKeys(password);

        ca.passwordConfirm().sendKeys(passwordConfirm);


        ca.SubmitCreateAccountForm().click();

        Thread.sleep(2000);

    }


    @DataProvider
    public Object[][]  getData() {

        Object[][] data = new Object[3][6];

        data[0][0] = "michael";
        data[0][1] = "schumaer";
        data[0][2] = "mschumaer@hayda.com";
        data[0][3] = "mschumaer@hayda.com";
        data[0][4] = "abcd12345";
        data[0][5] = "abcd12345";


        data[1][0] = "john";
        data[1][1] = "brown";
        data[1][2] = "johnbrown@hayda.com";
        data[1][3] = "johnbrown@hayda.com";
        data[1][4] = "Fadd123";
        data[1][5] = "Fadd123";

        data[2][0] = "jenny";
        data[2][1] = "johnes";
        data[2][2] = "johnesjenny@hayda.com";
        data[2][3] = "johnesjenny@hayda.com";
        data[2][4] = "pARIsd123";
        data[2][5] = "pARIsd123";

        return data;

    }

    @AfterMethod
    public void teardown(){
        driver.close();
        driver=null;
    }

}
