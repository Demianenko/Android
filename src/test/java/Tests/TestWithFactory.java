package Tests;

import Pages.OldLoginPage;
import Settings.AndroidSetup;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by user on 19.09.2016.
 */
public class TestWithFactory extends AndroidSetup {
    private OldLoginPage oldLoginPage;

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
        oldLoginPage = PageFactory.initElements(driver,OldLoginPage.class);
    }
    @Test
    public void loginTest() {
        oldLoginPage.loginTo(" "," ");
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
}
