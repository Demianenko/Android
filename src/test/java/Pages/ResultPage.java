package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 19.09.2016.
 */
public class ResultPage extends Page {
    public ResultPage(WebDriver driver) {
        super(driver);
    }
    By messageButton = By.id(app_package_name + "profile_view_top_card_primary_button");

    public MessagePage clickOnMessageButton(){
        waitForVisibilityOf(messageButton);
        driver.findElement(messageButton).click();
        return new MessagePage(driver);
    }
}
