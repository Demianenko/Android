package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MessagePage;
import Settings.DevicesSetup;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AndroidTest extends DevicesSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }
    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }
    // Test #1
    @Test
    public void loginTest() {
        new LoginPage(driver).loginIntoProfile();
    }
    // Test #2
    @Test
    public void searchTest(){
        new HomePage(driver)
                .searchFor("Misha Somov")
                .selectResultListItem("Misha Somov")
                .clickOnMessageButton();
    }
    // Test #3
    @Test
    public void sendMessageToContact(){
        new MessagePage(driver)
                .createMessage()
                .checkForSending();
    }
    // Test #4
    @Test
    public void testSwipeOnHomePage()  {
        new HomePage(driver).swipeFromRightToPullMenu();
    }
    // Test #5
    @Test
    public  void testScrollUponHomePage(){
        new HomePage(driver).scrollUponHomePage();
    }
}