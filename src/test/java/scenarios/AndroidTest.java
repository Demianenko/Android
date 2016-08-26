package scenarios;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AndroidTest extends AndroidSetup {
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
        loginPage =  new LoginPage(driver);
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();

    }


    @Test(enabled = true)
    public void loginTest() {
        loginPage.loginTo("test@mail.com","password123");
    }

    @Test(enabled = false)
    public void showTest() {
        String app_package_name = "com.linkedin.android:id/";

        By firstSignIn = By.id(app_package_name + "growth_prereg_fragment_sign_in_button");
        By userEmail = By.id(app_package_name + "growth_login_join_fragment_email_address");
        By userPassword = By.id(app_package_name + "growth_login_join_fragment_password");
        By showButton = By.id(app_package_name + "growth_login_join_show_hide_password");
        By loginButton = By.id((app_package_name+"growth_join_fragment_join"));
        waitForVisibilityOf(firstSignIn);

        driver.findElement(firstSignIn).click();

        driver.findElement(userEmail).sendKeys("a");
        driver.findElement(userPassword).sendKeys("a");

        driver.findElement(showButton).click();
        driver.findElement(loginButton).click();



        //Checking if the "SHOW" button works right
        String typedPass = driver.findElement(userPassword).getText();
        Assert.assertEquals(typedPass, "password123");

    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}