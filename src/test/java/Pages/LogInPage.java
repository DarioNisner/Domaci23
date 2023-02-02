package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInputField;
    @FindBy(id = "password")
    private WebElement passwordInputField;
    @FindBy(id = "login-button")
    private WebElement logInBtn;

    public LogInPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void logInValid() {
        usernameInputField.sendKeys("standard_user");
        passwordInputField.sendKeys("secret_sauce");
        logInBtn.click();

    }

    public void logInInvalid() {
        usernameInputField.sendKeys("locked_out_user");
        passwordInputField.sendKeys("secret_sauce");
        logInBtn.click();

    }


}
