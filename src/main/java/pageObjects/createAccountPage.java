package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class createAccountPage {

    WebDriver driver;

    public createAccountPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    By firstname = By.id("billing-first-name");

    public WebElement firstname(){

        return driver.findElement(firstname);
    }


   @FindBy(xpath = "//*[@id=\"capture-no-thanks\"]")
    WebElement popup;

    public List<WebElement> getpopupSize(){

     return driver.findElements(By.xpath("//*[@id=\"capture-no-thanks\"]"));

    }


    public WebElement getPopup(){
        return popup;
    }


    By lastname = By.id("billing-last-name");

    public WebElement lastname(){

        return driver.findElement(lastname);
    }


    By emailID = By.xpath("//*[@id=\"email\"]");

    public WebElement emailID(){

        return driver.findElement(emailID);

    }


    By emailIDconfirm = By.name("EmailAddressConfirm");

    public WebElement emailIDconfirm(){

        return driver.findElement(emailIDconfirm);
    }

    By password = By.cssSelector("#password");

    public WebElement password(){

        return driver.findElement(password);
    }

    By passwordConfirm = By.xpath("//input[@id='password-confirm']");

    public WebElement passwordConfirm(){

        return driver.findElement(passwordConfirm);

    }

    By SubmitCreateAccountForm = By.xpath("//input[@value='Create Account']");

    public WebElement SubmitCreateAccountForm(){

        return driver.findElement(SubmitCreateAccountForm);
    }

}
