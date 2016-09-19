package Settings;

// For automation
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

// For creating path to APK
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DevicesSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {

        File appDir = new File("D:\\Androida\\apps");
        File app = new File(appDir, "linkedin-4-0-52.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Name of mobile web browser to automate (empty if automating an app)
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        //Mobile OS
        capabilities.setCapability("platformName", "Android");
        //Mobile OS version
        capabilities.setCapability(CapabilityType.VERSION, "4.4");
        //Device name
        capabilities.setCapability("deviceName", "grouper");
        //The absolute local path to the APK
        capabilities.setCapability("app", app.getAbsolutePath());
        //Java package of the tested Android app
        capabilities.setCapability("appPackage", "com.linkedin.android");
        // Activity name for the Android activity to run
        capabilities.setCapability("appActivity", "com.linkedin.android.authenticator.LaunchActivity");
        // Constructor to initialize driver object
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

}
