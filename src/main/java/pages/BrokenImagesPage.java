package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage {

    private WebDriver driver;
    private By firstImage = By.xpath("//img[contains(@src, 'asdf.jpg')]");
    private By secondImage = By.xpath("");
    private By thirdImage = By.xpath("//img[contains(@src, 'img/avatar-blank.jpg')]");

    public BrokenImagesPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean checkVisibilityOfFirstImage(){
        WebElement firstImageJS =  driver.findElement(firstImage);
        Boolean presenceOfFirstImage = (Boolean) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", firstImageJS);
        return presenceOfFirstImage;
    }

    public boolean checkVisibilityOfThirdImage(){
        WebElement thirdImageJS =  driver.findElement(thirdImage);
        Boolean presenceOfThirdImage = (Boolean) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", thirdImageJS);
        return presenceOfThirdImage;
    }
}
