package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HSNCOM_HomePage<move> {

    WebDriver driver;

    public HSNCOM_HomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#promo-cell-0 > div > ul > li:nth-child(17) > a")
    WebElement HealthButton;
    public WebElement HealthButton(){
        return HealthButton;
    }


    @FindBy(xpath= "//*[@id=\"account-menu-container\"]/div[2]")
    WebElement MemberArea;

    public WebElement MemberArea(){

        return MemberArea;

    }


    @FindBy(linkText = "Create Account")
    WebElement CreateAccount;


    public WebElement CreateAccount(){

        return CreateAccount;
    }

    @FindBy (xpath = "//*[@id=\"torso\"]/div/div/div[5]/div/div/div/a/div/div[2]/span[1]")

    WebElement TodaysSpecial;

    public WebElement TodaysSpecial(){

        return TodaysSpecial;
    }

    @FindBy (xpath = "//*[@id=\"promo-cell-0\"]/div/ul/li[12]")
    WebElement ClearenceButton;

    public WebElement Clearence(){
        return ClearenceButton;
    }

}
