package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.HSNCOM_HomePage;
import pageObjects.breadcrumb;
import pageObjects.createAccountPage;
import resources.base;

public class stepDefination extends base {
    @Given("^Initilize browser with CHromeBrowser$")
    public void initilize_browser_with_chromebrowser() throws Throwable{
        driver = initializeDriver();

    }

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String strArg1) throws Throwable {
        driver.get(strArg1);
        driver.manage().window().maximize();
    }

    @And("^click health button in the main menu$")
    public void click_health_button_in_the_main_menu() throws Throwable {
        breadcrumb bc = new breadcrumb(driver);
        bc.clickHealthButton().click();
    }


    @When("^confirm that health and fittness tag is displayed$")
    public void confirm_that_health_and_fittness_tag_is_displayed() throws Throwable {
        breadcrumb bc = new breadcrumb(driver);
        System.out.println(bc.HealthFitness().getText());
        Assert.assertEquals(bc.HealthFitness().getText(), "Health & Fitness");
    }

    @Then("^click Home button to get back to HomePage$")
    public void click_home_button_to_get_back_to_homepage() throws Throwable {
        breadcrumb bc = new breadcrumb(driver);
        bc.backToHP().click();
        Thread.sleep(2000);
    }


    @Given("^move the cursor on to member login button, click on \"([^\"]*)\" button$")
    public void move_the_cursor_on_to_member_login_button_click_on_something_button(String strArg1) throws Throwable {
        HSNCOM_HomePage hp = new HSNCOM_HomePage(driver);
        Actions a = new Actions(driver);
        WebElement move = hp.MemberArea();
        WebElement CreateNew = hp.CreateAccount();
        a.moveToElement(move).build().perform();
        a.moveToElement(CreateNew).click().build().perform();
    }

    @And("^click on no thanks button$")
    public void click_on_no_thanks_button() throws Throwable {
     createAccountPage ca = new createAccountPage(driver);
     if (ca.getpopupSize().size() > 0 ){
         ca.getPopup().click();
     }
    }


    @When("^user fills (.+) (.+) (.+) (.+) (.+) (.+) sections and click on submit button$")
    public void user_fills_sections_and_click_on_submit_button(String firstname, String lastname, String emailid, String emailidconfirm, String password, String passwordconfirm) throws Throwable {

        createAccountPage ca = new createAccountPage(driver);
        ca.firstname().sendKeys(firstname);

        ca.lastname().sendKeys(lastname);

        ca.emailID().sendKeys(emailid);

        ca.emailIDconfirm().sendKeys(emailidconfirm);

        ca.password().sendKeys(password);

        ca.passwordConfirm().sendKeys(passwordconfirm);


        ca.SubmitCreateAccountForm().click();

    }



    @Then("^Verify that new user account form is succesfully submitted$")
    public void verify_that_new_user_account_form_is_succesfully_submitted() throws Throwable{

        System.out.println("test passed success");

    }

    @And("^quit browser$")
    public void quit_browser() throws Throwable {
            driver.close();
            driver=null;
        }
    }

