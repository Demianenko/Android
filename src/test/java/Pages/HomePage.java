package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 19.09.2016.
 */
public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    By searchBar = By.id(app_package_name + "search_bar_text");
    By feedContainer = By.id(app_package_name + "feed_item_single_update_container");
    By slideUpInfoItem = By.id(app_package_name + "home_app_launcher_item_title");

    public ResultListPage searchFor(String keyword){
        waitForVisibilityOf(searchBar);
        driver.findElement(searchBar).sendKeys(keyword);
        return new ResultListPage(driver);
    }

    public void swipeFromRightToPullMenu(){
        waitForVisibilityOf(feedContainer);
        new HomePage(driver).swipeFromRightToLeft();
        waitForVisibilityOf(slideUpInfoItem);
    }

    public void scrollUponHomePage(){
        waitForVisibilityOf(feedContainer);
        new HomePage(driver).scrollPage();

    }

}
