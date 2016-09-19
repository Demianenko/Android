package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 19.09.2016.
 */
public class LoginPage extends Page {
    private String myEmail = " ";
    private String myPassword = " ";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");
    By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
    By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
    By loginButton = By.id(app_package_name + "growth_login_fragment_sign_in");
    By homeButton = By.id(app_package_name + "home_nav_tab_icon");



    public HomePage loginIntoProfile() {
        waitForVisibilityOf(firstSignIn);
        driver.findElement(firstSignIn).click();
        driver.findElement(userEmail).clear();
        driver.findElement(userEmail).sendKeys(myEmail);
        driver.findElement(userPassword).sendKeys(myPassword);
        driver.findElement(loginButton).click();
        waitForVisibilityOf(homeButton);
        return new HomePage(driver);
    }
}
