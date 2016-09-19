package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Settings.AndroidSetup;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 25.08.2016.
 */
public class Page extends AndroidSetup{
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait =  new WebDriverWait(driver, 60);
    }
    //This is the peace of every locator on the app page
    String app_package_name = "com.linkedin.android:id/";

    //Method that waits for visiability of UI element
    protected void waitForVisibilityOf(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void swipeFromRightToLeft(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.press(750, 570).moveTo(-400, 0).release().perform();

    }

    public void scrollPage() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TouchAction action = new TouchAction((AppiumDriver) driver);
        action.press(350, 900).moveTo(0, -400).release().perform();
    }
}
