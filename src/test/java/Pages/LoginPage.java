package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by user on 25.08.2016.
 */
public class LoginPage extends Page {
    String app_package_name = "com.linkedin.android:id/";
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
    String id = app_package_name + "growth_prereg_fragment_sign_in_button";
    @FindBy(xpath = "//*[@id = \"com.linkedin.android:id/growth_prereg_fragment_sign_in_button\"]")
    public WebElement firstSignIn;

    @FindBy(xpath = "//*[@id = \"com.linkedin.android:id/growth_login_join_fragment_email_address\"]")
    public WebElement loginField;

    @FindBy(xpath = "//*[@id = app_package_name + \"growth_login_join_fragment_password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id = app_package_name + \"growth_login_join_show_hide_password\"]")
    public WebElement showButton;
    By signInButton =               By.id("com.linkedin.android:id/growth_prereg_fragment_sign_in_button");
    By signInButton1 = By.xpath(".//*[@id=\"com.linkedin.android:id/growth_prereg_fragment_sign_in_button\"]");
    public void loginTo(String name, String password) {
        System.out.println(driver.findElements(signInButton).size());
        System.out.println(driver.findElements(signInButton).get(0).toString());
        System.out.println(driver.findElements(signInButton1).size());


        wait.until(ExpectedConditions.visibilityOfElementLocated(signInButton));
        driver.findElement(signInButton1).click();
       // wait.until(ExpectedConditions.visibilityOf(firstSignIn));
       // firstSignIn.click();
        loginField.clear();
        loginField.sendKeys(name);
        passwordField.clear();
        passwordField.sendKeys(password);
        showButton.click();
    }
}
