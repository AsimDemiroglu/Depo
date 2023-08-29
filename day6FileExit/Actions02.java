package day6FileExit;

import Utulities.TestBase;
import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions02 extends TestBase {
    @Test
    public void test01(){
        Actions actions=new Actions(driver);
        driver.get("https://www.google.com.tr/?hl=tr");
        WebElement search= driver.findElement(By.id("APjFqb"));
        actions.keyDown(search, Keys.SHIFT).perform();
        actions.sendKeys("iphone 14 plus fiyatları").perform();
        actions.keyUp(search, Keys.SHIFT).perform();

        actions.sendKeys("cok pahalı").perform();

        wait(2);
    }
}
