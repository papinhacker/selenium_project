package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.WindowManager;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();

    }

    @BeforeEach
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
