package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class AddRemoveElementsPage {

    private WebDriver driver;
    private By addElementButton = By.xpath("//button[contains(@onclick, 'addElement()')]");
    private By deleteButton = By.xpath("//button[contains(@class, 'added-manually')][1]");

    public AddRemoveElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddElementButton(){
        driver.findElement(addElementButton).click();
    }

    public void clickDeleteButton(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(deleteButton).click();
    }

    public String getAddElementButtonText(){
        return driver.findElement(addElementButton).getText();
    }

    public String getDeleteButtonText(){
        return driver.findElement(deleteButton).getText();
    }
}
