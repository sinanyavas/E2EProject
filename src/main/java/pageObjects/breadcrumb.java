package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class breadcrumb {

    WebDriver driver;

    public breadcrumb(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"promo-cell-0\"]/div/ul/li[9]/a")
            WebElement heathButton;
    public WebElement clickHealthButton(){
        return heathButton;
    }


    By healthFitness = By.id("breadcrumb");

    public WebElement HealthFitness(){

        return driver.findElement(healthFitness);
    }

    @FindBy(id = "logo")
    WebElement backToHP;

    public WebElement backToHP(){
        return backToHP;
    }


}
