package Tests;

import Pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

private LogInPage logInPage;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        logInPage=new LogInPage(driver,driverWait);
    }


    @Test
    public void LogInTest1() {
        logInPage.logInValid();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"));
    }

    @Test
    public void LogInTest2() {
        logInPage.logInInvalid();
        WebElement failedLogIn=driver.findElement(By.className("error-button"));
        Assert.assertTrue(failedLogIn.isDisplayed());
    }

}
