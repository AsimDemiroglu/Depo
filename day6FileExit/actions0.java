package day6FileExit;

import Utulities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class actions0 extends TestBase {
    @Test
    public void test01(){
        Actions actions=new Actions(driver);
        driver.get("https://automationpanda.com/");

        actions.sendKeys(Keys.ARROW_DOWN).perform();
        wait(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        wait(1);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait(1);
        actions.sendKeys(Keys.PAGE_UP).perform();
        wait(1);

//        WebElement erişelecek = null;
//        while (!erişelecek.isDisplayed()){
//
//            actions.sendKeys(Keys.PAGE_DOWN).perform();
//        }
    }
}
