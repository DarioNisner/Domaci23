package Tests;

import Pages.InventoryPage;
import Pages.LogInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class InventoryTest extends BaseTest {

    private InventoryPage inventoryPage;
    private LogInPage logInPage;
   private WebElement filledCart;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        logInPage = new LogInPage(driver, driverWait);
        inventoryPage=new InventoryPage(driver,driverWait);
    }

    @Test
    public void addToCartTest() {
        logInPage.logInValid();
        inventoryPage.addToCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        filledCart=driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertTrue(filledCart.isDisplayed());
    }

    @Test(dependsOnMethods = "addToCartTest")
    public void removeFromCart() {

        logInPage.logInValid();
        driverWait.until(ExpectedConditions.elementToBeClickable(By.name("remove-sauce-labs-bolt-t-shirt")));
        inventoryPage.removeFromCart();
        driver.navigate().refresh();
       Assert.assertFalse(filledCart.isDisplayed());
    }

}