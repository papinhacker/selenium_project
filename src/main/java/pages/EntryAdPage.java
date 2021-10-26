package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class EntryAdPage {

    private WebDriver driver;
    private By closeButton = By.xpath("//div[@class='modal-footer']/p");


    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCloseButton(){
        FluentWait wait = new FluentWait(driver);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeButton)));
        driver.findElement(closeButton).click();
    }


}
