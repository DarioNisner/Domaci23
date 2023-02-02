package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage extends BasePage {


    public SidebarPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logOutBtn;

    public void LogOut(){
        hamburgerMenu.click();
        driverWait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logOutBtn.click();
    }


}
