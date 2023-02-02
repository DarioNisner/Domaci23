package Tests;

import Pages.LogInPage;
import Pages.SidebarPage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

/*
Testirati logout dugme, da li vas na klik vrati na originalni url i kada odete
sa driver.get na https://www.saucedemo.com/inventory.html da li pise poruka:
 “Epic sadface: You can only access '/inventory.html' when you are logged in.”
 */
public class LogOutTest extends  BaseTest{
private SidebarPage sidebarPage;
private LogInPage logInPage;
    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        sidebarPage=new SidebarPage(driver,driverWait);
        logInPage=new LogInPage(driver,driverWait);
    }



    @Test
    public void logOutTest(){
        logInPage.logInValid();
        sidebarPage.LogOut();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/"));
    }
@Test(dependsOnMethods = "logOutTest")
    public void afterLogOut(){
        driver.get("https://www.saucedemo.com/inventory.html");
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")));
        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
        Assert.assertTrue(errorMsg.isDisplayed());
}

}
