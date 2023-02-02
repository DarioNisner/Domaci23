package Pages;

import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addToCart;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement removeFromCart;


    public void addToCart() {
       // driverWait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        addToCart.click();
    }

    public void removeFromCart() {
//        addToCart();
////        driverWait.until(ExpectedConditions.elementToBeClickable(By.id("remove-sauce-labs-bolt-t-shirt")));
        removeFromCart.click();
    }

}
