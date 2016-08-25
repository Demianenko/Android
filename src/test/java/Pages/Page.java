package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 25.08.2016.
 */
public class Page {
    protected AndroidDriver driver;
    protected WebDriverWait wait;
    public Page(AndroidDriver driver) {
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, 60);
    }
}
