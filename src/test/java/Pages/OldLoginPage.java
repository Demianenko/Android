package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 25.08.2016.
 */
public class OldLoginPage extends Page {
    String app_package_name = "com.linkedin.android:id/";
    public OldLoginPage(WebDriver driver) {
        super(driver);
    }
    String id = app_package_name + "growth_prereg_fragment_sign_in_button";

    @FindBy(xpath = "//*[@id = \"com.linkedin.android:id/growth_prereg_fragment_sign_in_button\"]")
    public WebElement firstSignInXID;

    @FindBy(xpath = "//android.widget.Button[@resource id=\"com.linkedin.android:id/growth_prereg_fragment_sign_in_button\"]")
    public WebElement firstSignInXFull;

    @FindBy(id = "com.linkedin.android:id/growth_prereg_fragment_sign_in_button")
    public WebElement firstSignIn;

    @FindBy(id = "com.linkedin.android:id/growth_login_join_fragment_email_address")
    public WebElement loginField;

    @FindBy(id = "com.linkedin.android:id/growth_login_join_fragment_password")
    public WebElement passwordField;

    @FindBy(id = "com.linkedin.android:id/growth_login_join_show_hide_password")
    public WebElement showButton;

    @FindBy(id = "com.linkedin.android:id/growth_login_fragment_sign_in")
    public WebElement loginButton;
    @FindBy(id = "com.linkedin.android:id/home_nav_tab_icon")
    public WebElement homeButton;


    public HomePage loginTo(String name, String password) {
        waitForVisibility(firstSignIn);
        firstSignIn.click();
        loginField.clear();
        loginField.sendKeys(name);
        passwordField.clear();
        passwordField.sendKeys(password);
        showButton.click();
        loginButton.click();
        waitForVisibility(homeButton);
        return new HomePage(driver);
    }
}
