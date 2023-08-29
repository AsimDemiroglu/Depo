package D07_SeWaits;

import Utulities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeWaits extends TestBase {
    @Test
    public void tst() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement asos = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
        System.out.println(asos.getText());
        Assert.assertEquals("Hello World!", asos.getText());

 /*
        https://the-internet.herokuapp.com/dynamic_loading/1
        Start buttonuna tıkla
        Hello World! Yazının sitede oldugunu test et

         */
    }
}
