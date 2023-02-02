package Tests;

import Pages.InventoryPage;
import Pages.LogInPage;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public  abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daca\\ITB\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }



    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}






